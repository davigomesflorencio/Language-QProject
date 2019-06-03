package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class BREAKToken extends Token {
    public BREAKToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "break";
    }

    @Override
    public String getTokenIdentifier() {
        return "BREAK";
    }
}
