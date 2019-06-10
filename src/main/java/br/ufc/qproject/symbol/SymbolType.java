package br.ufc.qproject.symbol;

public enum SymbolType {
    VOID,
    INTL,
    INTL_QUAL,
    INTL_DECOR,
    INTL_QUAL_DECOR,
    BOOLEAN,
    BOOLEAN_QUAL,
    BOOLEAN_DECOR,
    BOOLEAN_QUAL_DECOR,
    CHARL,
    CHARL_QUAL,
    CHARL_DECOR,
    CHARL_QUAL_DECOR,
    STRUCT,
    INVALID;

    public static SymbolType fromString(String str) {
        switch (str) {
            case "void":
                return VOID;
            case "int":
                return INTL;
            case "const int":
                return INTL_QUAL;
            case "int &":
                return INTL_DECOR;
            case "const int &":
                return INTL_QUAL_DECOR;

            case "char":
                return CHARL;
            case "const char":
                return CHARL_QUAL;
            case "char &":
                return CHARL_DECOR;
            case "const charl &":
                return CHARL_QUAL_DECOR;

            case "bool":
                return BOOLEAN;
            case "const bool":
                return BOOLEAN_QUAL;
            case "bool &":
                return BOOLEAN_DECOR;
            case "const bool &":
                return BOOLEAN_QUAL_DECOR;

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

    public boolean TypeIsStruct() {
        return this == STRUCT;
    }

    public boolean TypeIsBoolean() {
        return this == BOOLEAN;
    }

    public boolean TypeIs_CHARL() {
        return this == CHARL;
    }
    public boolean TypeIs_VOID() {
        return this == VOID;
    }
    //TODO type int
    public boolean TypeIs_INTL_DECOR(){
        return  this == INTL_DECOR ;
    }
    public boolean TypeIs_INTL_QUAL(){
        return  this == INTL_QUAL ;
    }
    public boolean TypeIs_INTL_QUAL_DECOR(){
        return  this == INTL_QUAL_DECOR ;
    }

    //TODO type char
    public boolean TypeIs_CHARL_DECOR(){
        return this==CHARL_DECOR;
    }
    public boolean TypeIs_CHARL_QUAL(){
        return this==CHARL_QUAL;
    }
    public boolean TypeIs_CHARL_QUAL_DECOR(){
        return this==CHARL_QUAL_DECOR;
    }

    //TODO type boolean
    public boolean TypeIs_BOOLEAN_DECOR(){
        return this==BOOLEAN_DECOR;
    }
    public boolean TypeIs_BOOLEAN_QUAL(){
        return this==BOOLEAN_QUAL;
    }
    public boolean TypeIs_BOOLEAN_QUAL_DECOR(){
        return this==BOOLEAN_QUAL_DECOR;
    }
}
