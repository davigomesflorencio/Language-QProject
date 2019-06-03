package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class THISToken extends Token {

    public THISToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "this";
    }

    @Override
    public String getTokenIdentifier() {
        return "THIS";
    }
}
