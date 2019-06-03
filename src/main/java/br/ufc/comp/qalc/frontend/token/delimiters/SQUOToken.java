package br.ufc.comp.qalc.frontend.token.delimiters;

import br.ufc.comp.qalc.frontend.token.Token;

public class SQUOToken extends Token {

    public SQUOToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "\'";
    }

    @Override
    public String getTokenIdentifier() {
        return "SQUO";
    }
}
