package br.ufc.comp.qalc.frontend.token;

import br.ufc.comp.qalc.frontend.token.Token;

import java.util.Arrays;

public class IDToken extends Token {


    public IDToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public String getVariableIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public void interpretAttributes() {
        if(!Arrays.asList("if", "else", "while", "break", "return", "struct", "public", "private", "static",
        "this", "true", "false", "const", "void", "int", "char", "bool").contains(stringValue)){
            System.exit(0);
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "ID";
    }
}
