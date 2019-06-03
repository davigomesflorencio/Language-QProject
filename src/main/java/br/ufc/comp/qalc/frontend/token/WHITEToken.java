package br.ufc.comp.qalc.frontend.token;

import java.util.Arrays;

public class WHITEToken extends Token{

    public WHITEToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public String getStringWhiteSpace() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {

        }
    }

    @Override
    public String getTokenIdentifier() {
        return "COM";
    }
}
