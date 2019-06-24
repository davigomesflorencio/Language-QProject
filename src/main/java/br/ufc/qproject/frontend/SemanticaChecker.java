package br.ufc.qproject.frontend;

import br.ufc.qproject.symbol.Symbol;
import br.ufc.qproject.symbol.SymbolTable;
import br.ufc.qproject.symbol.SymbolType;
import br.ufc.qproject.symbol.SymbolTypeDefinition;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class SemanticaChecker extends qprojectBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<qprojectParser.ExpressaoContext, SymbolTypeDefinition> expressionType = new IdentityHashMap<>();

    public SymbolTable getSymbolTable() {
        return symbols;
    }

    //TODO Função principal
    @Override
    public void exitPrograma(qprojectParser.ProgramaContext ctx) {
        Symbol s = new Symbol("main");
        if (symbols.isDeclared(s)) {
            if (symbols.getTypeDefinition(s).getSymbolType().TypeEquals(SymbolType.INTL)) {

            }
        }
    }

    @Override
    public void enterLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx) {
        if (!ctx.lista_de_definicoes().isEmpty()) {
            symbols.enterBlock();
        }
    }

    @Override
    public void exitLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx) {
        if (ctx.lista_de_definicoes().isEmpty()) {
            symbols.leaveBlock();
        }
    }

    //TODO TIPOS
    @Override
    public void exitVariavel(qprojectParser.VariavelContext ctx) {
        Symbol s = new Symbol(ctx.ID().toString());

        if (symbols.isDeclared(s) == true) {
            System.out.println("ERRO SEMANTICO -> Ja existe outra variavel com esse nome");
        } else {
            SymbolTypeDefinition std = new SymbolTypeDefinition();
            if (ctx.tipo().decorador().getText().equals("&")) {
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
            System.out.println("Erro Semantico -> Nao se pode declarar variaveis do tipo void");
        }
        if (!(ctx.tipo().decorador().isEmpty()
                || expressionType.get(ctx.expressao()).getSymbolType().TypeEquals(symbols.getTypeDefinition(s).getSymbolType()))) {
            System.out.println("Erro Semantico -> Referencia a memoria nao declarada anteriormente");
        }
        if (symbols.isDeclared(s) == true) {
            System.out.println("Erro Semantico-> Ja existe outra variavel com esse nome");
        }

    }

    //TODO ATRIBUIÇÂO , Compatibilidade de tipos
    @Override
    public void exitAtribuicao(qprojectParser.AtribuicaoContext ctx) {
        Symbol s = Symbol.getSymbolFor(ctx.nome().getText());
        if (!symbols.isDeclared(s)) {
            System.out.println("Erro Semantico-> Variavel ainda não declarada");
        } else {
            if ((symbols.getTypeDefinition(s).isConstante() == false)) {
                if (!expressionType.get(ctx.expressao()).getSymbolType().TypeEquals(symbols.getType(s).get()))
                    System.out.println("Erro Semantico-> Atribuição Invalida , Tipos incompativeis");

            } else {
                if (!expressionType.get(ctx.expressao()).isConstante())
                    System.out.println("Erro Semantico-> Atribuição Invalida , Variavel de origem não Qualificada");
            }
        }
    }

    //TODO EXPRESSOES
    @Override
    public void exitExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx) {
        SymbolTypeDefinition std = new SymbolTypeDefinition();

        if (expressionType.get(ctx.expressao(0)).getSymbolType().TypeIsBOOLEAN() &&
                expressionType.get(ctx.expressao(1)).getSymbolType().TypeIsBOOLEAN() &&
                (Arrays.asList("||","&&","!").contains(ctx.operador_binario().getText()))) {

            std.setSymbolType(SymbolType.BOOLEAN);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        } else if (expressionType.get(ctx.expressao(0)).getSymbolType().TypeIs_INT() &&
                expressionType.get(ctx.expressao(1)).getSymbolType().TypeIs_INT() &&
                (Arrays.asList("+","*","-","/","==","<=",">=","<",">").contains(ctx.operador_binario().getText()))) {

            std.setSymbolType(SymbolType.INTL);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }else if(ctx.equals(qprojectLexer.INT)){
            std.setSymbolType(SymbolType.INTL);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }else{
            std.setSymbolType(SymbolType.INVALID);
            std.setConstante(false);
            std.setReferencia(false);
            expressionType.put(ctx, std);
        }
    }
    //

    //TODO RETORNO

    //TODO SOBRECARGA

    //TODO FUNCAO PRINCIPAL

}

