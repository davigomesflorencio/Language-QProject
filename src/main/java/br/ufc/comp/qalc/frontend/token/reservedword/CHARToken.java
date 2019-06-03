package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class CHARToken extends Token {
    public CHARToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "char";
    }

    @Override
    public String getTokenIdentifier() {
        return "CHAR";
    }
}
