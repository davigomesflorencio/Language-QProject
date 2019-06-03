package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class CONSTToken extends Token {

    public CONSTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "const";
    }

    @Override
    public String getTokenIdentifier() {
        return "CONST";
    }
}
