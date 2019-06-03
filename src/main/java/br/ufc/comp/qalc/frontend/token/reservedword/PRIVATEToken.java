package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class PRIVATEToken extends Token {

    public PRIVATEToken(long line, long start, long end) {
        super(line, start, end);
        stringValue="private";
    }

    @Override
    public String getTokenIdentifier() {
        return "PRIVATE";
    }
}
