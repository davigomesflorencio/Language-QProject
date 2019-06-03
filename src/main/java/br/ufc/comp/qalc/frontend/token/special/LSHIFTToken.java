package br.ufc.comp.qalc.frontend.token.special;

import br.ufc.comp.qalc.frontend.token.Token;

public class LSHIFTToken extends Token {
    public LSHIFTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "<<";
    }

    @Override
    public String getTokenIdentifier() {
        return "LSHIFT";
    }
}