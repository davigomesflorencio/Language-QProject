package br.ufc.qproject.symbol;

public enum SymbolType {
    VOID,
    INTL,
    BOOLEAN,
    CHARL,
    STRUCT,
    FUNCTION,
    INVALID;

    /*
        TODO return enum if str contains is value( void,int,char, bool,struct,function)
     */
    public static SymbolType fromString(String str) {
        if (str.contains("void"))
            return VOID;
        if (str.contains("int"))
            return INTL;
        if (str.contains("char"))
            return CHARL;
        if (str.contains("bool"))
            return BOOLEAN;
        if (str.contains("struct"))
            return STRUCT;
        if (str.contains("function"))
            return FUNCTION;

        return INVALID;

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

    public boolean TypesIs_STRUCT() {
        return this == STRUCT;
    }

    public boolean TypesIs_FUNCTION() {
        return this == FUNCTION;
    }
}
