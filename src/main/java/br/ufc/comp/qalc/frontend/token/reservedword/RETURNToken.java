package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class RETURNToken extends Token {
    public RETURNToken(long line, long start, long end) {
        super(line, start, end);
        stringValue="return";
    }

    @Override
    public String getTokenIdentifier() {
        return "RETURN";
    }
}
