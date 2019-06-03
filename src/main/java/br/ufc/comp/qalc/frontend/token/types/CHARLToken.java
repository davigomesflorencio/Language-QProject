package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class CHARLToken extends Token {

    private char charliteral;

    public CHARLToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public char getValueCharLiteral() {
        interpretAttributes();
        return charliteral;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            if (stringValue.length()==3 && stringValue.charAt(0)=='\'' &&  stringValue.charAt(2)=='\'') {
                charliteral = stringValue.charAt(1);
            }
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "CHARL";
    }
}
