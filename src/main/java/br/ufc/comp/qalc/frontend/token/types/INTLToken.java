package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class INTLToken extends Token {

    private int literalinteger;

    public INTLToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public int getValueLiteralInteger() {
        interpretAttributes();
        return literalinteger;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            if (stringValue.charAt(0) == '+') {
                literalinteger = Integer.parseInt(stringValue.substring(1));
            }else if(stringValue.charAt(0) == '-'){
                literalinteger = -Integer.parseInt(stringValue.substring(1));
            }else{
                literalinteger = Integer.parseInt(stringValue);
            }
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "INTL";
    }
}
