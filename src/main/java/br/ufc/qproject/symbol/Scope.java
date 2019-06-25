package br.ufc.qproject.symbol;

import java.util.*;

public class Scope implements Iterable<Scope> {
    private Map<Symbol, SymbolTypeDefinition> declaredSymbols = new HashMap<>();
    private List<FunctionTypeDefinition> functions = new ArrayList<>();
    private List<StructTypeDefinition> structs = new ArrayList<>();
    private List<Scope> nestedScopes = new ArrayList<>();

    private Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public boolean bind(Symbol s, SymbolTypeDefinition t) {
        return declaredSymbols.putIfAbsent(s, t) == null;
    }

    public boolean contains(Symbol s) {
        return declaredSymbols.containsKey(s);
    }

    public Optional<SymbolTypeDefinition> getBinding(Symbol s) {
        return Optional.ofNullable(declaredSymbols.get(s));
    }

    public Scope createNestedScope() {
        Scope nextScope = new Scope(this);
        nestedScopes.add(nextScope);
        return nextScope;
    }

    public boolean createStruct(StructTypeDefinition st) {
        return structs.add(st);
    }

    public boolean containsStruct(String s) {
        for (StructTypeDefinition std : getStructs()) {
            if (s.equals(std.getNameStruct())) {
                return true;
            }
        }
        return false;
    }

    public boolean createFunction(FunctionTypeDefinition ftd) {
        return functions.add(ftd);
    }

    public boolean containsFunction(String name, List<VariableDefinition> parameters) {
        for (FunctionTypeDefinition f : getFunctions()) {
            if (parameters.equals(f.getList_of_parameters())) {
                return true;
            }
        }
        return false;
    }

    public List<FunctionTypeDefinition> getFunctions() {
        return functions;
    }

    public List<StructTypeDefinition> getStructs() {
        return structs;
    }

    @Override
    public Iterator<Scope> iterator() {
        return nestedScopes.iterator();
    }

    public Scope getParentScope() {
        return parent;
    }
}
