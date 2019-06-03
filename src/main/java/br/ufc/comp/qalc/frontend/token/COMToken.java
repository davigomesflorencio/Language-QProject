package br.ufc.comp.qalc.frontend.token;

public class COMToken extends Token {

    private String comment;

    public COMToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    public String getStringComment() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            comment = stringValue.substring(2, stringValue.length() - 3);
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "COM";
    }
}
