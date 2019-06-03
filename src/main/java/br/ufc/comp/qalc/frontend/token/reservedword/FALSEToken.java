package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class FALSEToken extends Token {
    public FALSEToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "false";
    }

    @Override
    public String getTokenIdentifier() {
        return "FALSE";
    }
}
