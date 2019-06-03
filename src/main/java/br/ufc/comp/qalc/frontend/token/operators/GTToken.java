package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class GTToken extends Token {
    public GTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = ">";
    }

    @Override
    public String getTokenIdentifier() {
        return "GT";
    }
}
