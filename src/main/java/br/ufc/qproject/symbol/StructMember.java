package br.ufc.qproject.symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StructMember {
    private Map<Symbol, SymbolTypeDefinition> variables = new HashMap<>();
    private List<FunctionTypeDefinition> functions = new ArrayList<>();
    private Map<Symbol, SymbolTypeDefinition> variableStatic = new HashMap<>();
    private List<FunctionTypeDefinition> functionStatic = new ArrayList<>();

    public StructMember() {

    }

    public Map<Symbol, SymbolTypeDefinition> getVariables() {
        return variables;
    }

    public List<FunctionTypeDefinition> getFunctions() {
        return functions;
    }

    public Map<Symbol, SymbolTypeDefinition> getVariableStatic() {
        return variableStatic;
    }

    public List<FunctionTypeDefinition> getFunctionStatic() {
        return functionStatic;
    }
}
