package br.ufc.qproject.symbol;

import java.util.*;

public class Scope implements Iterable<Scope> {
    private Map<Symbol, SymbolTypeDefinition> declaredSymbols = new HashMap<>();
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

    @Override
    public Iterator<Scope> iterator() {
        return nestedScopes.iterator();
    }

    public Scope getParentScope() {
        return parent;
    }
}
