package br.ufc.comp.qalc.frontend.token.special;

import br.ufc.comp.qalc.frontend.token.Token;

public class STDENDLToken extends Token {

    public STDENDLToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "std::endl";
    }

    @Override
    public String getTokenIdentifier() {
        return "STDENDL";
    }
}
