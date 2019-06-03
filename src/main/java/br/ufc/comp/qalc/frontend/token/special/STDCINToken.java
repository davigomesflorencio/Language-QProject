package br.ufc.comp.qalc.frontend.token.special;

import br.ufc.comp.qalc.frontend.token.Token;

public class STDCINToken extends Token {

    public STDCINToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "std::cin";
    }

    @Override
    public String getTokenIdentifier() {
        return "STDCIN";
    }
}
