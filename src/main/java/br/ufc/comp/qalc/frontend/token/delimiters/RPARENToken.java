package br.ufc.comp.qalc.frontend.token.delimiters;

import br.ufc.comp.qalc.frontend.token.Token;

public class RPARENToken extends Token {

    public RPARENToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = ")";
    }

    @Override
    public String getTokenIdentifier() {
        return "RPAREN";
    }
}
