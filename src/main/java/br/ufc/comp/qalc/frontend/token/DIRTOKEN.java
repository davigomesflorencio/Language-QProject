package br.ufc.comp.qalc.frontend.token;

public class DIRTOKEN extends Token {


    public DIRTOKEN(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public String getStringDirectives() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            stringValue = stringValue.substring(1);
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "DIR";
    }
}
