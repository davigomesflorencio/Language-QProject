package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class ELSEToken extends Token {
    public ELSEToken(long line, long start, long end) {
        super(line, start, end);
        stringValue="else";
    }

    @Override
    public String getTokenIdentifier() {
        return "ELSE";
    }
}
