package br.ufc.qproject.symbol;

public class SymbolTypeDefinition {

    private boolean qual;
    private SymbolType sb;
    private boolean decorado;

    public SymbolTypeDefinition() {

    }

    public SymbolTypeDefinition(boolean qual, SymbolType sb, boolean decorado) {
        this.qual = qual;
        this.sb = sb;
        this.decorado = decorado;
    }

    public boolean isQual() {
        return qual;
    }

    public void setQual(boolean qual) {
        this.qual = qual;
    }

    public SymbolType getSb() {
        return sb;
    }

    public void setSb(SymbolType sb) {
        this.sb = sb;
    }

    public boolean isDecorado() {
        return decorado;
    }

    public void setDecorado(boolean decorado) {
        this.decorado = decorado;
    }
}
