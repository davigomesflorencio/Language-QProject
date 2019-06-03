package br.ufc.comp.qalc.frontend.token.special;

import br.ufc.comp.qalc.frontend.token.Token;

public class STDCOUTToken extends Token {

    public STDCOUTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "std::cout";
    }

    @Override
    public String getTokenIdentifier() {
        return "STDCOUT";
    }
}
