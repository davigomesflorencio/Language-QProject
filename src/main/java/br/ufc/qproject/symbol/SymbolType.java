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

    public boolean TypeIs_INT() {
        return this == INTL;
    }

    public boolean TypeEquals(SymbolType t) {
        return this == t || this == INVALID;
    }

    public boolean TypeIsBOOLEAN() {
        return this == BOOLEAN;
    }

    public boolean TypeIs_CHARL() {
        return this == CHARL;
    }
    public boolean TypeIs_VOID() {
        return this == VOID;
    }
    public  boolean TypesIs_STRUCT(){
        return this==STRUCT;
    }
}
