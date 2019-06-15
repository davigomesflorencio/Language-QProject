package br.ufc.qproject.frontend;

import br.ufc.qproject.symbol.Symbol;
import br.ufc.qproject.symbol.SymbolTable;
import br.ufc.qproject.symbol.SymbolType;

import java.util.IdentityHashMap;
import java.util.Map;

public class SemanticaChecker extends qprojectBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<qprojectParser.ExpressaoContext, SymbolType> expressionType = new IdentityHashMap<>();

    private Map<String, SymbolType> symbolsFunction = new IdentityHashMap<>();

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

    //TODO Mauricio
    @Override
    public void exitLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx){
        if(ctx.lista_de_definicoes().isEmpty()){
            symbols.leaveBlock();
        }
    }

    //TODO Mauricio
    @Override
    public void enterVariavel(qprojectParser.VariavelContext ctx) {
        Symbol s = new Symbol(ctx.tipo().tipo_nome().ID().toString());
        if(symbols.isDeclared(s)){
            System.out.println("ERRO SEMANTICO -> Ja existe outra variavel com esse nome");
        }
    }
    //TODO Mauricio
    @Override
    public void enterVariavel_atribuicao(qprojectParser.Variavel_atribuicaoContext ctx) {
        Symbol s = new Symbol(ctx.ID().toString());

        if (SymbolType.fromString(ctx.tipo().getText()) == SymbolType.VOID) {
            System.out.println("Erro Semantico -> Nao se pode declarar variaveis do tipo void");
        }
        if (!ctx.tipo().decorador().isEmpty()) {
            if (!symbols.isDeclared(s)) {
                System.out.println("Erro Semantico -> Referencia a memoria nao declarada anteriormente");
            }
        } else {
            if (symbols.isDeclared(s)) {
                System.out.println("Erro Semantico-> Ja existe outra variavel com esse nome");
            }
        }
    }


    @Override
    public void exitExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx) {
        if (expressionType.get(ctx.expressao(0)).TypeIsBoolean() &&
                expressionType.get(ctx.expressao(1)).TypeIsBoolean() &&
                ctx.operador_binario().equals("||")){
            expressionType.put(ctx,SymbolType.BOOLEAN);
        }else{
            expressionType.put(ctx,SymbolType.INVALID);
        }
    }
    //TODO DAVI
    @Override
    public void exitAtribuicao(qprojectParser.AtribuicaoContext ctx) {
        Symbol s = Symbol.getSymbolFor(ctx.nome().ID().getText());


    }
}

