package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class DIVToken extends Token {

    public DIVToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "/";
    }

    @Override
    public String getTokenIdentifier() {
        return "DIV";
    }
}
