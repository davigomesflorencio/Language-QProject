package br.ufc.qproject.symbol;

import java.util.ArrayList;
import java.util.List;

public class FunctionTypeDefinition extends SymbolTypeDefinition {
    private List<VariableDefinition> list_of_parameters = new ArrayList<>();
    private String namefunction = "";
    private SymbolType retorno;

    public FunctionTypeDefinition() {

    }

    public FunctionTypeDefinition(List<VariableDefinition> list_of_parameters, String namefunction) {
        this.list_of_parameters = list_of_parameters;
        this.namefunction = namefunction;
    }

    public FunctionTypeDefinition(boolean constante, SymbolType symbolType, boolean referencia, List<VariableDefinition> list_of_parameters, String namefunction) {
        super(constante, symbolType, referencia);
        this.list_of_parameters = list_of_parameters;
        this.namefunction = namefunction;
    }

    public List<VariableDefinition> getList_of_parameters() {
        return list_of_parameters;
    }

    public void setList_of_parameters(List<VariableDefinition> list_of_parameters) {
        this.list_of_parameters = list_of_parameters;
    }

    public String getNamefunction() {
        return namefunction;
    }

    public void setNamefunction(String namefunction) {
        this.namefunction = namefunction;
    }

    public SymbolType getRetorno() {
        return retorno;
    }

    public void setRetorno(SymbolType retorno) {
        this.retorno = retorno;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof FunctionTypeDefinition) {
            if (namefunction == ((FunctionTypeDefinition) o).namefunction && list_of_parameters == ((FunctionTypeDefinition) o).list_of_parameters) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return  "NomeFuncao: " + namefunction + " ,Parametros: " + list_of_parameters.toString() + " ,Tipo: " +getSymbolType().toString() + " ;" ;
    }
}
