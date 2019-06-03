package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class TRUEToken extends Token {
    public TRUEToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "true";
    }

    @Override
    public String getTokenIdentifier() {
        return "TRUE";
    }
}
