package br.ufc.qproject.symbol;

public enum SymbolType {
    VOID,
    INTL,
    BOOLEAN,
    CHARL,
    STRUCT,
    INVALID;

    public static SymbolType fromString(String str) {
        switch (str) {
            case "void":
                return VOID;
            case "int":
                return INTL;
            case "char":
                return CHARL;
            case "bool":
                return BOOLEAN;
            case "struct":
                return STRUCT;
            default:
                return INVALID;
        }
    }

    public boolean TypeInt() {
        return this == INTL;
    }

    public boolean TypeEquals(SymbolType t) {
        return this == t || this == INVALID;
    }

    public boolean TypeIsDefined() {
        return this == STRUCT;
    }

    public boolean TypeIsBoolean() {
        return this == BOOLEAN;
    }

    public boolean TypeIschar() {
        return this == CHARL;
    }
    public boolean TypeIsvoid(){
        return this==VOID;
    }
}
