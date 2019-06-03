package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class ORToken extends Token {

    public ORToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "||";
    }

    @Override
    public String getTokenIdentifier() {
        return "OR";
    }
}
