package br.ufc.qproject.symbol;

public class VariableDefinition extends SymbolTypeDefinition {

    private String name;
    private String value;

    public VariableDefinition(String name) {
        this.name = name;
    }

    public VariableDefinition(boolean constante, SymbolType symbolType, boolean referencia, String name) {
        super(constante, symbolType, referencia);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof VariableDefinition) {
            if (name.equals(((VariableDefinition) o).getName()) && this.getSymbolType().TypeEquals(((VariableDefinition) o).getSymbolType())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + name + " ,Value: " + value + " ,Tipo: " + getSymbolType().toString() + " ;";
    }
}
