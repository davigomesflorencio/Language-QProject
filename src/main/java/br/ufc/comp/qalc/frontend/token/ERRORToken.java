package br.ufc.comp.qalc.frontend.token;

public class ERRORToken extends Token{

    public ERRORToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "ERROR";
    }
}
