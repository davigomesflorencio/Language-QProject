package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class INTToken extends Token {
    public INTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "int";
    }

    @Override
    public String getTokenIdentifier() {
        return "INT";
    }
}
