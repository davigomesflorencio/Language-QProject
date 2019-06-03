package br.ufc.comp.qalc.frontend.token.special;

import br.ufc.comp.qalc.frontend.token.Token;

public class AMPERToken extends Token {

    public AMPERToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "&";
    }

    @Override
    public String getTokenIdentifier() {
        return "AMPER";
    }
}
