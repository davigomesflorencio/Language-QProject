package br.ufc.qproject.symbol;

import java.util.List;

public class FunctionTypeDefinition extends SymbolTypeDefinition {
        private List<SymbolTypeDefinition> list_of_parameters;
        private String namefunction;

        public FunctionTypeDefinition(){

        }

        public FunctionTypeDefinition(boolean constante, SymbolType symbolType, boolean referencia, List<SymbolTypeDefinition> list_of_parameters, String namefunction) {
                super(constante, symbolType, referencia);
                this.list_of_parameters = list_of_parameters;
                this.namefunction = namefunction;
        }

        public List<SymbolTypeDefinition> getList_of_parameters() {
                return list_of_parameters;
        }

        public void setList_of_parameters(List<SymbolTypeDefinition> list_of_parameters) {
                this.list_of_parameters = list_of_parameters;
        }

        public String getNamefunction() {
                return namefunction;
        }

        public void setNamefunction(String namefunction) {
                this.namefunction = namefunction;
        }
}
