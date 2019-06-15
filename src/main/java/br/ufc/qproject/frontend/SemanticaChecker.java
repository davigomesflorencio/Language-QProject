package br.ufc.qproject.frontend;

import br.ufc.qproject.symbol.Symbol;
import br.ufc.qproject.symbol.SymbolTable;
import br.ufc.qproject.symbol.SymbolType;

import java.util.IdentityHashMap;
import java.util.Map;

public class SemanticaChecker extends qprojectBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<qprojectParser.ExpressaoContext, SymbolType> expressionType = new IdentityHashMap<>();

    public SymbolTable getSymbolTable() {
        return symbols;
    }

    @Override
    public void enterLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx) {
        if(ctx.lista_de_definicoes().isEmpty()){
            symbols.enterBlock();
        }
    }
    
       @Override
    public void exitLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx){
        if(ctx.lista_de_definicoes().isEmpty()){
            symbols.leaveBlock();
        }
    }


    @Override
    public void enterVariavel(qprojectParser.VariavelContext ctx) {
        Symbol s = new Symbol(ctx.tipo().tipo_nome().ID().toString());
        if(symbols.isDeclared(s)){
            System.out.println("ERRO SEMANTICO -> Ja existe outra variavel com esse nome");
        }
    }

    @Override
    public void enterVariavel_atribuicao(qprojectParser.Variavel_atribuicaoContext ctx) {
        Symbol s = new Symbol(ctx.ID().toString());

        if (SymbolType.fromString(ctx.tipo().getText()) == SymbolType.VOID) {
            System.out.println("Erro Semantico -> Nao se pode declarar variaveis do tipo void");
        }
        if (!ctx.tipo().decorador().isEmpty()) {
            if (!symbols.isDeclared(s)) {
                System.out.println("Erro Semantico -> Referencia a memoria nao declarada anteriormente")
            }
        } else {
            if (symbols.isDeclared(s)) {
                System.out.println("Erro Semantico-> Ja existe outra variavel com esse nome");
            }
        }
    }

    @Override
    public void enterTipo(qprojectParser.TipoContext ctx) {
        if(!(ctx.qualificador().isEmpty() || ctx.decorador().isEmpty())) {
            // TODO ERRO Semantico
        }
    }

    @Override
    public void enterVariavel(qprojectParser.VariavelContext ctx) {
         Symbol s = Symbol.getSymbolFor(ctx.tipo().tipo_nome().ID().getText());
         SymbolType t = SymbolType.fromString(ctx.tipo().getText());
        if (!symbols.tryDeclare(s, t)) {
            // TODO ERRO SEMANTICO
        }
    }

    @Override
    public void exitExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx) {
        if (expressionType.get(ctx.expressao(0)).TypeIsBoolean() &&
                expressionType.get(ctx.expressao(1)).TypeIsBoolean() &&
                ctx.operador_binario().OR().getText().equals("||")){
            expressionType.put(ctx,SymbolType.BOOLEAN);
        }else{
            expressionType.put(ctx,SymbolType.INVALID);
        }
    }

    @Override
    public void exitAtribuicao(qprojectParser.AtribuicaoContext ctx) {
        Symbol s = Symbol.getSymbolFor(ctx.nome().ID().getText());
        if(symbols.getType(s).get().TypeIs_BOOLEAN_QUAL()
                || symbols.getType(s).get().TypeIs_BOOLEAN_QUAL_DECOR()
                || symbols.getType(s).get().TypeIs_INTL_QUAL()
                || symbols.getType(s).get().TypeIs_INTL_QUAL_DECOR()
                || symbols.getType(s).get().TypeIs_CHARL_QUAL()
                || symbols.getType(s).get().TypeIs_CHARL_QUAL_DECOR()
        ){
            //TODO ERRO SEMANTICO
        }
    }
}

