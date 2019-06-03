package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class STATICToken extends Token {

    public STATICToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "static";
    }

    @Override
    public String getTokenIdentifier() {
        return "STATIC";
    }
}
