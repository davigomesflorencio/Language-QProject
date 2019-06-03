package br.ufc.comp.qalc.frontend;

import br.ufc.comp.qalc.frontend.token.*;
import br.ufc.comp.qalc.frontend.token.delimiters.*;
import br.ufc.comp.qalc.frontend.token.operators.*;
import br.ufc.comp.qalc.frontend.token.reservedword.*;
import br.ufc.comp.qalc.frontend.token.special.*;
import br.ufc.comp.qalc.frontend.token.types.CHARLToken;
import br.ufc.comp.qalc.frontend.token.types.INTLToken;
import br.ufc.comp.qalc.frontend.token.types.STRLToken;

import java.io.IOException;
import java.util.Arrays;

/**
 * Analisador Léxico da linguagem.
 * <p>
 * Funciona como uma fonte de tokens, de onde o Analisador Sintático
 * deverá ler.
 *
 * @see Source
 */
public class Scanner {

    /**
     * Último token reconhecido.
     */
    protected Token currentToken;
    /**
     * Fonte de caracteres de onde extrair os tokens.
     */
    protected Source source;

    /**
     * Constrói um Analisador Léxico a partir de uma fonte de caracteres.
     *
     * @param sourceStream Fonte a ser utilizada.
     */
    public Scanner(Source sourceStream) {
        // FIXME Lidar corretamente com as exceções.
        this.source = sourceStream;
    }

    /**
     * Consome caracteres da fonte até que eles componham um lexema de
     * um dos tokens da linguagem, coinstrói um objeto representando esse
     * token associado ao lexema lido e o retorna.
     *
     * @return Token reconhecido.
     * @throws IOException Caso haja problema na leitura da fonte.
     */
    public Token getNextToken() throws IOException {
        // TODO Reconhecimento de tokens

        if (source.getCurrentChar() == Source.EOF) {
            return new EOFToken(source.getCurrentLine(), source.getCurrentColumn());
        } else if (Character.isDigit(source.getCurrentChar()) || source.getCurrentChar() == '+'
                || source.getCurrentChar() == '-') {
            // INTL inteiro literal
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                if (source.getCurrentChar() == '+' || source.getCurrentChar() == '-') {
                    lexema.append(source.getCurrentChar());
                    source.advance();
                    if (source.getCurrentChar() == '0') {
                        lexema.append(source.getCurrentChar());
                        source.advance();
                        if (!Character.isDigit(source.getCurrentChar())) {
                            return new INTLToken(currentLine, lexemeStart, lexema.toString());
                        } else {
                            return new ERRORToken(currentLine, lexemeStart, lexema.toString());
                        }
                    } else {
                        lexema.append(source.getCurrentChar());
                        source.advance();
                    }
                } else {
                    lexema.append(source.getCurrentChar());
                    source.advance();
                }
            } while (Character.isDigit(source.getCurrentChar()));
            return new INTLToken(currentLine, lexemeStart, lexema.toString());

        } else if (Character.isLetter(source.getCurrentChar()) || source.getCurrentChar() == '_') {
            // ID ,STDCOUT, STDCIN .STDENDL, reservedword
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (Character.isDigit(source.getCurrentChar()) || Character.isLetter(source.getCurrentChar())
                    || source.getCurrentChar() == '_' || source.getCurrentChar() == ':');
            if (lexema.toString().equals("std::cin")) {
                return new STDCINToken(currentLine, lexemeStart, source.getCurrentColumn());

            } else if (lexema.toString().equals("std::cout")) {
                return new STDCOUTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("std::endl")) {
                return new STDENDLToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("if")) {
                return new IFToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("else")) {
                return new ELSEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("while")) {
                return new WHILEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("break")) {
                return new BREAKToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("return")) {
                return new RETURNToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("struct")) {
                return new STRUCTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("public")) {
                return new PUBLICToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("private")) {
                return new PRIVATEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("static")) {
                return new STATICToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("this")) {
                return new THISToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("true")) {
                return new TRUEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("false")) {
                return new FALSEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("const")) {
                return new CONSTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("void")) {
                return new VOIDToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("int")) {
                return new INTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("char")) {
                return new CHARToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.toString().equals("bool")) {
                return new BOOLToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (!lexema.toString().contains("::")) {
                return new IDToken(currentLine, lexemeStart, lexema.toString());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }

        } else if (source.getCurrentChar() == '\'') {
            //CHARL ,SQUO Char Literal
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while ((int) source.getCurrentChar() < 128);
            if (lexema.length() == 1) {
                return new SQUOToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 3 && lexema.charAt(0) == '\'' && lexema.charAt(lexema.length() - 1) == '\'') {
                return new CHARLToken(currentLine, lexemeStart, lexema.toString());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '\"') {
            //STRL , DQUO , String Literal
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while ((int) source.getCurrentChar() < 128);
            if (lexema.length() == 1) {
                return new DQUOToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.charAt(0) == '\"' && lexema.charAt(lexema.length() - 1) == '\"') {
                return new STRLToken(currentLine, lexemeStart, lexema.toString());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '+') {
            //PLUS e INCR
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '+');
            if (lexema.length() == 1) {
                return new PLUSToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2) {
                return new INCRToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '-') {
            //MINUS , DECR e ARROW
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '-' || source.getCurrentChar() == '>');
            if (lexema.length() == 1) {
                return new MINUSToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '-') {
                return new DECRToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '>') {
                return new ARROWToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '*') {
            //TIMES multiplicação
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new TIMESToken(currentLine, lexemeStart, source.getCurrentColumn());

        } else if (source.getCurrentChar() == '/') {
            //DIV divisão
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '/' || source.getCurrentChar() == '*'
                    || Character.isLetter(source.getCurrentChar()));
            if (lexema.length() == 1) {
                return new DIVToken(currentLine, lexemeStart, source.getCurrentColumn());

            } else if (lexema.length() >= 2 && lexema.substring(0, 2).equals("//")) {
                return new COMToken(currentLine, lexemeStart, lexema.toString());

            } else if (lexema.length() >= 4 && lexema.substring(0, 2).equals("/*")
                    && lexema.substring(lexema.length() - 2).equals("*/")) {
                return new COMToken(currentLine, lexemeStart, lexema.toString());

            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '%') {
            //MOD resto da divisáo
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new MODToken(currentLine, lexemeStart, source.getCurrentColumn());

        } else if (source.getCurrentChar() == '=') {
            //ATRIB e EQ atribuição e igualdade, = , ==
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '=');
            if (lexema.length() == 1) {
                return new ATRIBToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2) {
                return new EQToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '!') {
            //NEQ e NOT , != , !
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '!' || source.getCurrentChar() == '=');
            if (lexema.length() == 1) {
                return new NOTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '=') {
                return new NEQToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '<') {
            //LT ,LEQ e LSHIFT, < , <= , <<
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '=' || source.getCurrentChar() == '<');
            if (lexema.length() == 1) {
                return new LTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '=') {
                return new LEQToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '<') {
                return new LSHIFTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }

        } else if (source.getCurrentChar() == '>') {
            //GT ,GEQ e RSHIFT, > , >= , >>
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '>' || source.getCurrentChar() == '=');
            if (lexema.length() == 1) {
                return new GTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '=') {
                return new GEQToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2 && lexema.charAt(1) == '>') {
                return new RSHIFTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '&') {
            //AND e AMPER , && , &
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '&');
            if (lexema.length() == 1) {
                return new AMPERToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2) {
                return new ANDToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '|') {
            //OR
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '|');
            if (lexema.length() == 2) {
                return new ORToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '.') {
            //DOT
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '.');
            if (lexema.length() == 1) {
                return new DOTToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }

        } else if (source.getCurrentChar() == ':') {
            //DBLCOL, COLON , ::, :
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == ':');
            if (lexema.length() == 1) {
                return new COLONToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else if (lexema.length() == 2) {
                return new DBLCOLToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '(') {
            //LPAREN, (
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new LPARENToken(currentLine, lexemeStart, source.getCurrentColumn());

        } else if (source.getCurrentChar() == ')') {
            //RPAREN, )
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new RPARENToken(currentLine, lexemeStart, source.getCurrentColumn());

        } else if (source.getCurrentChar() == '{') {
            //LBRACE , {
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new LBRACEToken(currentLine, lexemeStart, source.getCurrentColumn());

        } else if (source.getCurrentChar() == '}') {
            //RBRACE, }
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == '}');
            if (lexema.length() == 1) {
                return new RBRACEToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == ',') {
            //COMMA , virgula
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == ',');
            if (lexema.length() == 1) {
                return new COMMAToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == ';') {
            //SEMI, ponto e virgula
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (source.getCurrentChar() == ';');
            if (lexema.length() == 1) {
                return new SEMIToken(currentLine, lexemeStart, source.getCurrentColumn());
            } else {
                return new ERRORToken(currentLine, lexemeStart, lexema.toString());
            }
        } else if (source.getCurrentChar() == '#') {
            //DIR diretivas
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while ((int) source.getCurrentChar() < 128);
            return new DIRTOKEN(currentLine, lexemeStart, lexema.toString());

        } else if (Arrays.asList('\t', '\n', ' ', '\0').contains(source.getCurrentChar())) {
            //WHITE
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            return new WHITEToken(currentLine, lexemeStart, lexema.toString());
        } else {
            StringBuilder lexema = new StringBuilder();
            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();
            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            } while (!Arrays.asList('\t', '\n', ' ', Source.EOF).contains((source.getCurrentChar())));

            return new ERRORToken(currentLine, lexemeStart, lexema.toString());
        }
    }

    /**
     * Obtém o último token reconhecido.
     *
     * @return O último token reconhecido.
     */
    public Token getCurrentToken() {
        return currentToken;
    }
}
