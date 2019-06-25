package br.ufc.qproject.symbol;

import java.util.Optional;

public class SymbolTable {

    private Scope globalScope = new Scope(null);
    private Scope activeScope = globalScope;

    public boolean isDeclared(Symbol s) {
        for (
                Scope current = activeScope;
                current != null;
                current = current.getParentScope()
        ) {
            if (current.contains(s))
                return true;
        }

        return false;
    }

    public boolean tryDeclare(Symbol s, SymbolTypeDefinition t) {
        return activeScope.bind(s, t);
    }

    public boolean tryDeclareFunction(FunctionTypeDefinition ftd) {
        return activeScope.createFunction(ftd);
    }

    public boolean tryDeclareStruct(StructTypeDefinition std) {
        return activeScope.createStruct(std);
    }


    public boolean isDeclaredFunction(FunctionTypeDefinition ftd) {
        for (FunctionTypeDefinition f : activeScope.getFunctions()) {
            if (f.equals(ftd))
                return true;
        }
        return false;
    }


    public boolean isDeclaredStruct(String s) {
        for (StructTypeDefinition f : activeScope.getStructs()) {
            if (f.getNameStruct().equals(s))
                return true;
        }
        return false;
    }

    public Optional<SymbolType> getType(Symbol s) {
        Optional<SymbolType> type = Optional.empty();
        for (
                Scope current = activeScope;
                current != null;
                current = current.getParentScope()
        ) {
            type = Optional.ofNullable(current.getBinding(s).get().getSymbolType());

            if (type.isPresent())
                break;
        }

        return type;
    }

    public SymbolTypeDefinition getTypeDefinition(Symbol s) {
        return activeScope.getBinding(s).get();
    }

    public void enterBlock() {
        activeScope = activeScope.createNestedScope();
    }

    public void leaveBlock() {
        activeScope = activeScope.getParentScope();
    }

}
