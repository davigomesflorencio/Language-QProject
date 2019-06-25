package br.ufc.qproject.frontend;

import br.ufc.qproject.symbol.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import java.util.*;

public class SemanticaChecker extends qprojectBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<qprojectParser.ExpressaoContext, SymbolTypeDefinition> expressionType = new IdentityHashMap<>();

    public SymbolTable getSymbolTable() {
        return symbols;
    }

    //TODO ESCOPOS

    @Override
    public void enterDefinicao(qprojectParser.DefinicaoContext ctx) {
        symbols.enterBlock();
    }

    @Override
    public void exitDefinicao(qprojectParser.DefinicaoContext ctx) {
        symbols.leaveBlock();
    }

    @Override
    public void enterBloco(qprojectParser.BlocoContext ctx) {
        symbols.enterBlock();
    }

    @Override
    public void exitBloco(qprojectParser.BlocoContext ctx) {
        symbols.leaveBlock();
    }

    //TODO TIPOS
    @Override
    public void exitVariavel(qprojectParser.VariavelContext ctx) {
        Symbol s = new Symbol(ctx.ID().toString());

        if (symbols.isDeclared(s)) {
            System.out.println("ERRO SEMANTICO-> Ja existe outra variavel com esse nome");
        } else if (SymbolType.fromString(ctx.tipo().getText()) == SymbolType.VOID) {
            System.out.println("ERRO SEMANTICO-> Nao se pode declarar variaveis do tipo void");
        } else {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            if (ctx.tipo().decorador() != null) {
                std.setReferencia(true);
            } else {
                std.setReferencia(false);
            }
            if (ctx.tipo().qualificador().getText().equals("const")) {
                std.setConstante(true);
            } else {
                std.setConstante(false);
            }
            std.setSymbolType(SymbolType.fromString(ctx.tipo().getText()));
            symbols.tryDeclare(s, std);
        }

    }

    //TODO DECLARACAO
    @Override
    public void exitVariavel_atribuicao(qprojectParser.Variavel_atribuicaoContext ctx) {
        Symbol s = new Symbol(ctx.ID().toString());

        if (SymbolType.fromString(ctx.tipo().getText()) == SymbolType.VOID) {
            System.out.println("ERRO SEMANTICO-> Nao se pode declarar variaveis do tipo void");
        }
        if (ctx.tipo().decorador() != null
                && expressionType.get(ctx.expressao()).getSymbolType().TypeEquals(SymbolType.fromString(ctx.tipo().getText()))) {
            System.out.println("ERRO SEMANTICO-> Referencia a memoria nao declarada anteriormente");
        }
        if (symbols.isDeclared(s)) {
            System.out.println("ERRO SEMANTICO-> Ja existe outra variavel com esse nome");
        }

    }

    //TODO ATRIBUIÇÂO , Compatibilidade de tipos
    @Override
    public void exitAtribuicao(qprojectParser.AtribuicaoContext ctx) {
        Symbol s = Symbol.getSymbolFor(ctx.nome().getText());
        if (!symbols.isDeclared(s)) {
            System.out.println("ERRO SEMANTICO-> Variavel ainda não declarada");
        } else {
            if ((!symbols.getTypeDefinition(s).isConstante())) {
                if (!expressionType.get(ctx.expressao()).getSymbolType().TypeEquals(symbols.getType(s).get()))
                    System.out.println("ERRO SEMANTICO-> Atribuição Invalida , Tipos incompativeis");

            } else {
                if (!expressionType.get(ctx.expressao()).isConstante())
                    System.out.println("ERRO SEMANTICO-> Atribuição Invalida , Variavel de origem não Qualificada");
            }
        }
    }

    //TODO EXPRESSOES
    @Override
    public void exitExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx) {
        SymbolTypeDefinition std = new SymbolTypeDefinition();

        if (expressionType.get(ctx.expressao(0)).getSymbolType().TypeIsBOOLEAN() &&
                expressionType.get(ctx.expressao(1)).getSymbolType().TypeIsBOOLEAN() &&
                (Arrays.asList("||", "&&", "!").contains(ctx.operador_binario().getText()))) {

            std.setSymbolType(SymbolType.BOOLEAN);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        } else if (expressionType.get(ctx.expressao(0)).getSymbolType().TypeIs_INT() &&
                expressionType.get(ctx.expressao(1)).getSymbolType().TypeIs_INT() &&
                (Arrays.asList("+", "*", "-", "/", "<=", ">=", "<", ">").contains(ctx.operador_binario().getText()))) {

            std.setSymbolType(SymbolType.INTL);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        } else if (expressionType.get(ctx.expressao(0)).getSymbolType().TypeEquals(expressionType.get(ctx.expressao(1)).getSymbolType())
                && ctx.operador_binario().getText().equals("==")) {
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        } else {
            std.setSymbolType(SymbolType.INVALID);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
            System.out.println("ERRO SEMANTICO-> Expressão invalida");
        }
    }

    //TODO Expressao int
    @Override
    public void exitExpressionInt(qprojectParser.ExpressionIntContext ctx) {
        if (SymbolType.fromString(ctx.getText()).TypeIs_INT()) {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            std.setSymbolType(SymbolType.INTL);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }
    }

    //TODO Expressao Char
    @Override
    public void exitExpressionCharl(qprojectParser.ExpressionCharlContext ctx) {
        if ((SymbolType.fromString(ctx.getText()).TypeIs_CHARL())) {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            std.setSymbolType(SymbolType.CHARL);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }
    }

    //TODO Expressão Boolean
    @Override
    public void exitExpressionFalse(qprojectParser.ExpressionFalseContext ctx) {
        if ((SymbolType.fromString(ctx.getText()).TypeIsBOOLEAN())) {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            std.setSymbolType(SymbolType.BOOLEAN);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }
    }

    //TODO Expressão Boolean
    @Override
    public void exitExpressionTrue(qprojectParser.ExpressionTrueContext ctx) {
        if ((SymbolType.fromString(ctx.getText()).TypeIsBOOLEAN())) {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            std.setSymbolType(SymbolType.BOOLEAN);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }
    }

    //TODO Create Functions
    @Override
    public void exitFuncao_cabecalho(qprojectParser.Funcao_cabecalhoContext ctx) {
        FunctionTypeDefinition f = createFunction(ctx);
        //Verifica se a funcao ja foi declarada
        if (symbols.isDeclaredFunction(f)) {
            System.out.println("ERRO SEMANTICO-> Função já declarada");
        } else {
            symbols.tryDeclareFunction(f);
        }

    }

    //TODO RETORNO


    //TODO SOBRECARGA


    //TODO FUNCAO PRINCIPAL

    @Override
    public void enterPrograma(qprojectParser.ProgramaContext ctx) {
        symbols.enterBlock();
        System.out.println("Enter program");
    }

    @Override
    public void exitPrograma(qprojectParser.ProgramaContext ctx) {
        symbols.leaveBlock();
        FunctionTypeDefinition f = new FunctionTypeDefinition(false, SymbolType.FUNCTION, false, new ArrayList<VariableDefinition>(), "main");
        f.setRetorno(SymbolType.INTL);
        Symbol s = new Symbol("main");
        if (!symbols.isDeclaredFunction(f)) {
            System.out.println("ERRO SEMANTICO-> Função Main faltando");
        }
        System.out.println("Exit program");
    }

    /*
        TODO  create object FunctionTypeDefinition
     */
    public FunctionTypeDefinition createFunction(qprojectParser.Funcao_cabecalhoContext fc) {
        FunctionTypeDefinition ftd = new FunctionTypeDefinition();

        ftd.setNamefunction(fc.ID().getText());
        ftd.setConstante(fc.tipo().qualificador() != null);
        ftd.setReferencia(fc.tipo().decorador() != null);
        ftd.setSymbolType(SymbolType.FUNCTION);

        List<VariableDefinition> list_of_parameters = new ArrayList<>();

        //Criando Parametros
        qprojectParser.Lista_parametros_formaisContext aux = fc.parametros_formais().lista_parametros_formais();
        while (aux != null) {
            VariableDefinition std;
            std = createParameter(fc.tipo(), aux.ID().getText());

            list_of_parameters.add(std);

            aux = aux.lista_parametros_formais();
        }

        ftd.setList_of_parameters(list_of_parameters);
        System.out.println(ftd);
        return ftd;
    }

    /*
       TODO  create object SymbolTypeDefinition
    */
    public VariableDefinition createParameter(qprojectParser.TipoContext tc, String name) {
        VariableDefinition var = new VariableDefinition(name);
        var.setConstante(false);
        var.setReferencia(false);
        var.setSymbolType(SymbolType.fromString(tc.getText()));
        return var;
    }
}

