package br.ufc.qproject.symbol;

import java.util.List;

public class StructTypeDefinition extends SymbolTypeDefinition {

    private String nameStruct = "";
    private StructMember structPublic;
    private StructMember structProtected;

    public StructTypeDefinition(){

    }

    public StructTypeDefinition(String nameStruct, StructMember structPublic, StructMember structProtected) {
        this.nameStruct = nameStruct;
        this.structPublic = structPublic;
        this.structProtected = structProtected;
    }

    public StructTypeDefinition(boolean constante, SymbolType symbolType, boolean referencia, String nameStruct, StructMember structPublic, StructMember structProtected) {
        super(constante, symbolType, referencia);
        this.nameStruct = nameStruct;
        this.structPublic = structPublic;
        this.structProtected = structProtected;
    }

    public String getNameStruct() {
        return nameStruct;
    }

    public void setNameStruct(String nameStruct) {
        this.nameStruct = nameStruct;
    }

    public StructMember getStructPublic() {
        return structPublic;
    }

    public void setStructPublic(StructMember structPublic) {
        this.structPublic = structPublic;
    }

    public StructMember getStructProtected() {
        return structProtected;
    }

    public void setStructProtected(StructMember structProtected) {
        this.structProtected = structProtected;
    }
}
