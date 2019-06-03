package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class PUBLICToken extends Token {
    public PUBLICToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "public";
    }

    @Override
    public String getTokenIdentifier() {
        return "PUBLIC";
    }
}
