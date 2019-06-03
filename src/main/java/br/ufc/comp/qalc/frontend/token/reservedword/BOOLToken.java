package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class BOOLToken extends Token {
    public BOOLToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "bool";
    }

    @Override
    public String getTokenIdentifier() {
        return "BOOL";
    }
}
