package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class VOIDToken extends Token {

    public VOIDToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "void";
    }

    @Override
    public String getTokenIdentifier() {
        return "VOID";
    }
}
