package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class TIMESToken extends Token {
    public TIMESToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "*";
    }

    @Override
    public String getTokenIdentifier() {
        return "TIMES";
    }
}
