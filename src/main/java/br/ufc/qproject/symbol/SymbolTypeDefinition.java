package br.ufc.qproject.symbol;

public class SymbolTypeDefinition {

    private boolean constante;
    private SymbolType symbolType;
    private boolean referencia;

    public SymbolTypeDefinition() {

    }

    public SymbolTypeDefinition(boolean constante, SymbolType symbolType, boolean referencia) {
        this.constante = constante;
        this.symbolType = symbolType;
        this.referencia = referencia;
    }

    public boolean isConstante() {
        return constante;
    }

    public void setConstante(boolean constante) {
        this.constante = constante;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

    public boolean isReferencia() {
        return referencia;
    }

    public void setReferencia(boolean referencia) {
        this.referencia = referencia;
    }
}
