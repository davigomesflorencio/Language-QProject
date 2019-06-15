package br.ufc.qproject;

import br.ufc.qproject.frontend.SemanticaChecker;
import br.ufc.qproject.frontend.qprojectLexer;
import br.ufc.qproject.frontend.qprojectParser;
import br.ufc.qproject.symbol.SymbolTable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            qprojectLexer lexer = new qprojectLexer(CharStreams.fromStream(System.in));

            qprojectParser parser = new qprojectParser(new CommonTokenStream(lexer));

            qprojectParser.ProgramaContext root = parser.programa();

            SemanticaChecker checker = new SemanticaChecker();

            ParseTreeWalker.DEFAULT.walk(checker, root);

            SymbolTable symbols = checker.getSymbolTable();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
