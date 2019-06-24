package br.ufc.qproject.symbol;

import java.util.Map;

public class StructMember {
    private Map<Symbol, SymbolTypeDefinition> var;
    private Map<Symbol, FunctionTypeDefinition> function;
    private Map<Symbol, SymbolTypeDefinition> varStatic;
    private Map<Symbol, FunctionTypeDefinition> functionStatic;

    public StructMember() {

    }

    public boolean bindVariavel(Symbol s, SymbolTypeDefinition t) {
        return var.putIfAbsent(s, t) == null;
    }

    public boolean containsVariavel(Symbol s) {
        return var.containsKey(s);
    }

    public boolean bindFunction(Symbol s, FunctionTypeDefinition t) {
        return function.putIfAbsent(s, t) == null;
    }

    public boolean containsFunction(Symbol s) {
        return function.containsKey(s);
    }

    public boolean bindVariavelStatic(Symbol s, SymbolTypeDefinition t) {
        return varStatic.putIfAbsent(s, t) == null;
    }

    public boolean containsVariavelStatic(Symbol s) {
        return varStatic.containsKey(s);
    }

    public boolean bindFunctionStatic(Symbol s, FunctionTypeDefinition t) {
        return functionStatic.putIfAbsent(s, t) == null;
    }

    public boolean containsFunctionStatic(Symbol s) {
        return functionStatic.containsKey(s);
    }
}
