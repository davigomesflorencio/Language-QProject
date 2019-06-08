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
    public void enterTipo(qprojectParser.TipoContext ctx) {
        if(!(ctx.qualificador().isEmpty() || ctx.decorador().isEmpty())) {
            //ERRO Semantico
        }
    }

    @Override
    public void enterVariavel(qprojectParser.VariavelContext ctx) {
        Symbol s = new Symbol(ctx.tipo().tipo_nome().ID().toString());
        if(symbols.isDeclared(s)){
            System.out.println("ERRO SEMANTICO");
        }
    }
}

