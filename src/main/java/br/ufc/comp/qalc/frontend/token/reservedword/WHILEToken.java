package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class WHILEToken extends Token {
    public WHILEToken(long line, long start, long end) {
        super(line, start, end);
    }

    @Override
    public String getTokenIdentifier() {
        return "WHILE";
    }
}
