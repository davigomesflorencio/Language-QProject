package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class IFToken extends Token {

    public IFToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "if";
    }

    @Override
    public String getTokenIdentifier() {
        return "IF";
    }
}
