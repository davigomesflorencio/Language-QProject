package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class STRLToken extends Token {


    public STRLToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public String getValueStringLiteral() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            if (stringValue.length() == 3 && stringValue.charAt(0) == '\"' && stringValue.charAt(2) == '\"') {
                stringValue = stringValue.substring(1);
            } else if (stringValue.length() > 3 && stringValue.charAt(0) == '\"'
                    && stringValue.charAt(stringValue.length() - 1) == '\"') {
                stringValue = stringValue.substring(1, stringValue.length() - 2);
            }
        }
    }

    @Override
    public String getTokenIdentifier() {
        return null;
    }
}
