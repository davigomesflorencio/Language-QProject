// Generated from /home/davigomes/Downloads/COMPILADORES/qproject-antlr/src/main/java/br/ufc/qproject/antlr4/qproject.g4 by ANTLR 4.7.2
package br.ufc.qproject.frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qprojectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AMPER=1, SEMI=2, COLON=3, COMMA=4, LSHIFT=5, RSHIFT=6, STDCIN=7, STDCOUT=8, 
		STDENDL=9, AND=10, ARROW=11, ATRIB=12, DBLCOL=13, DECR=14, DIV=15, DOT=16, 
		EQ=17, GEQ=18, GT=19, INCR=20, LEQ=21, LT=22, MINUS=23, MOD=24, NEQ=25, 
		NOT=26, OR=27, PLUS=28, TIMES=29, DQUO=30, SQUO=31, LBRACE=32, RBRACE=33, 
		LPAREN=34, RPAREN=35, PUBLIC=36, PROTECTED=37, PRIVATE=38, STATIC=39, 
		STRUCT=40, IF=41, ELSE=42, WHILE=43, BREAK=44, RETURN=45, THIS=46, TRUE=47, 
		FALSE=48, CONST=49, VOID=50, INT=51, CHAR=52, BOOL=53, WHITE=54, DIR=55, 
		COM=56, WS=57, CHARL=58, INTL=59, STRL=60, ID=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AMPER", "SEMI", "COLON", "COMMA", "LSHIFT", "RSHIFT", "STDCIN", "STDCOUT", 
			"STDENDL", "AND", "ARROW", "ATRIB", "DBLCOL", "DECR", "DIV", "DOT", "EQ", 
			"GEQ", "GT", "INCR", "LEQ", "LT", "MINUS", "MOD", "NEQ", "NOT", "OR", 
			"PLUS", "TIMES", "DQUO", "SQUO", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"PUBLIC", "PROTECTED", "PRIVATE", "STATIC", "STRUCT", "IF", "ELSE", "WHILE", 
			"BREAK", "RETURN", "THIS", "TRUE", "FALSE", "CONST", "VOID", "INT", "CHAR", 
			"BOOL", "WHITE", "DIR", "COM", "WS", "CHARL", "INTL", "STRL", "ID", "NONDIGIT", 
			"DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "';'", "':'", "','", "'<<'", "'>>'", "'std::cin'", "'std::cout'", 
			"'std::endl'", "'&&'", "'->'", "'='", "'::'", "'--'", "'/'", "'.'", "'=='", 
			"'>='", "'>'", "'++'", "'<='", "'<'", "'-'", "'%'", "'!='", "'!'", "'||'", 
			"'+'", "'*'", "'\"'", "'''", "'{'", "'}'", "'('", "')'", "'public'", 
			"'protected'", "'private'", "'static'", "'struct'", "'if'", "'else'", 
			"'while'", "'break'", "'return'", "'this'", "'true'", "'false'", "'const'", 
			"'void'", "'int'", "'char'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AMPER", "SEMI", "COLON", "COMMA", "LSHIFT", "RSHIFT", "STDCIN", 
			"STDCOUT", "STDENDL", "AND", "ARROW", "ATRIB", "DBLCOL", "DECR", "DIV", 
			"DOT", "EQ", "GEQ", "GT", "INCR", "LEQ", "LT", "MINUS", "MOD", "NEQ", 
			"NOT", "OR", "PLUS", "TIMES", "DQUO", "SQUO", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "PUBLIC", "PROTECTED", "PRIVATE", "STATIC", "STRUCT", "IF", 
			"ELSE", "WHILE", "BREAK", "RETURN", "THIS", "TRUE", "FALSE", "CONST", 
			"VOID", "INT", "CHAR", "BOOL", "WHITE", "DIR", "COM", "WS", "CHARL", 
			"INTL", "STRL", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public qprojectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "qproject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u0157\n\67\r\67\16"+
		"\67\u0158\3\67\3\67\38\38\78\u015f\n8\f8\168\u0162\138\38\38\39\39\39"+
		"\39\69\u016a\n9\r9\169\u016b\39\39\39\39\79\u0172\n9\f9\169\u0175\139"+
		"\39\39\59\u0179\n9\39\39\3:\6:\u017e\n:\r:\16:\u017f\3:\3:\3;\3;\3;\3"+
		";\3<\5<\u0189\n<\3<\6<\u018c\n<\r<\16<\u018d\3<\7<\u0191\n<\f<\16<\u0194"+
		"\13<\3<\5<\u0197\n<\3=\3=\7=\u019b\n=\f=\16=\u019e\13=\3=\3=\3>\6>\u01a3"+
		"\n>\r>\16>\u01a4\3>\3>\7>\u01a9\n>\f>\16>\u01ac\13>\3?\3?\3@\3@\4\u0160"+
		"\u0173\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}\2\177\2\3\2\n\4\2\13\13\"\"\5\2\13\f\17\17\""+
		"\"\5\2\62;C\\c|\4\2--//\3\2\63;\3\2\62;\3\2\62\62\5\2C\\aac|\2\u01bc\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2"+
		"\2\13\u0089\3\2\2\2\r\u008c\3\2\2\2\17\u008f\3\2\2\2\21\u0098\3\2\2\2"+
		"\23\u00a2\3\2\2\2\25\u00ac\3\2\2\2\27\u00af\3\2\2\2\31\u00b2\3\2\2\2\33"+
		"\u00b4\3\2\2\2\35\u00b7\3\2\2\2\37\u00ba\3\2\2\2!\u00bc\3\2\2\2#\u00be"+
		"\3\2\2\2%\u00c1\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c9\3\2\2\2"+
		"-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d5"+
		"\3\2\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00de\3\2\2\2"+
		"?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00ea\3\2\2\2K\u00f1\3\2\2\2M\u00fb\3\2\2\2O\u0103\3\2\2\2Q\u010a"+
		"\3\2\2\2S\u0111\3\2\2\2U\u0114\3\2\2\2W\u0119\3\2\2\2Y\u011f\3\2\2\2["+
		"\u0125\3\2\2\2]\u012c\3\2\2\2_\u0131\3\2\2\2a\u0136\3\2\2\2c\u013c\3\2"+
		"\2\2e\u0142\3\2\2\2g\u0147\3\2\2\2i\u014b\3\2\2\2k\u0150\3\2\2\2m\u0156"+
		"\3\2\2\2o\u015c\3\2\2\2q\u0178\3\2\2\2s\u017d\3\2\2\2u\u0183\3\2\2\2w"+
		"\u0196\3\2\2\2y\u0198\3\2\2\2{\u01a2\3\2\2\2}\u01ad\3\2\2\2\177\u01af"+
		"\3\2\2\2\u0081\u0082\7(\2\2\u0082\4\3\2\2\2\u0083\u0084\7=\2\2\u0084\6"+
		"\3\2\2\2\u0085\u0086\7<\2\2\u0086\b\3\2\2\2\u0087\u0088\7.\2\2\u0088\n"+
		"\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7>\2\2\u008b\f\3\2\2\2\u008c\u008d"+
		"\7@\2\2\u008d\u008e\7@\2\2\u008e\16\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7f\2\2\u0092\u0093\7<\2\2\u0093\u0094\7<\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\20\3\2\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7f\2\2\u009b\u009c\7<\2\2"+
		"\u009c\u009d\7<\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2\2\u009f\u00a0"+
		"\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\7<\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\24\3\2\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7(\2\2\u00ae\26\3\2\2"+
		"\2\u00af\u00b0\7/\2\2\u00b0\u00b1\7@\2\2\u00b1\30\3\2\2\2\u00b2\u00b3"+
		"\7?\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7<\2\2\u00b6\34"+
		"\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7/\2\2\u00b9\36\3\2\2\2\u00ba"+
		"\u00bb\7\61\2\2\u00bb \3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd\"\3\2\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\u00c0\7?\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5(\3\2\2\2\u00c6\u00c7"+
		"\7-\2\2\u00c7\u00c8\7-\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7"+
		"/\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1\62\3\2\2\2\u00d2\u00d3"+
		"\7#\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\66"+
		"\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9\7~\2\2\u00d98\3\2\2\2\u00da\u00db"+
		"\7-\2\2\u00db:\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd<\3\2\2\2\u00de\u00df\7"+
		"$\2\2\u00df>\3\2\2\2\u00e0\u00e1\7)\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7}"+
		"\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7"+
		"*\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7r"+
		"\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7e\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6"+
		"\u00f7\7e\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7f\2\2"+
		"\u00faL\3\2\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7k\2"+
		"\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7g\2\2\u0102N\3\2\2\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7v\2\2\u0107\u0108\7k\2\2\u0108\u0109\7e\2\2\u0109"+
		"P\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d"+
		"\u010e\7w\2\2\u010e\u010f\7e\2\2\u010f\u0110\7v\2\2\u0110R\3\2\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7h\2\2\u0113T\3\2\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118V\3\2\2\2\u0119"+
		"\u011a\7y\2\2\u011a\u011b\7j\2\2\u011b\u011c\7k\2\2\u011c\u011d\7n\2\2"+
		"\u011d\u011e\7g\2\2\u011eX\3\2\2\2\u011f\u0120\7d\2\2\u0120\u0121\7t\2"+
		"\2\u0121\u0122\7g\2\2\u0122\u0123\7c\2\2\u0123\u0124\7m\2\2\u0124Z\3\2"+
		"\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128\u0129"+
		"\7w\2\2\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012b\\\3\2\2\2\u012c\u012d"+
		"\7v\2\2\u012d\u012e\7j\2\2\u012e\u012f\7k\2\2\u012f\u0130\7u\2\2\u0130"+
		"^\3\2\2\2\u0131\u0132\7v\2\2\u0132\u0133\7t\2\2\u0133\u0134\7w\2\2\u0134"+
		"\u0135\7g\2\2\u0135`\3\2\2\2\u0136\u0137\7h\2\2\u0137\u0138\7c\2\2\u0138"+
		"\u0139\7n\2\2\u0139\u013a\7u\2\2\u013a\u013b\7g\2\2\u013bb\3\2\2\2\u013c"+
		"\u013d\7e\2\2\u013d\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f\u0140\7u\2\2"+
		"\u0140\u0141\7v\2\2\u0141d\3\2\2\2\u0142\u0143\7x\2\2\u0143\u0144\7q\2"+
		"\2\u0144\u0145\7k\2\2\u0145\u0146\7f\2\2\u0146f\3\2\2\2\u0147\u0148\7"+
		"k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2\u014ah\3\2\2\2\u014b\u014c"+
		"\7e\2\2\u014c\u014d\7j\2\2\u014d\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f"+
		"j\3\2\2\2\u0150\u0151\7d\2\2\u0151\u0152\7q\2\2\u0152\u0153\7q\2\2\u0153"+
		"\u0154\7n\2\2\u0154l\3\2\2\2\u0155\u0157\t\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\b\67\2\2\u015bn\3\2\2\2\u015c\u0160\7%\2\2\u015d\u015f"+
		"\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\b8\2\2\u0164p\3\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7\61\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\n\3\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0179\3\2\2\2\u016d"+
		"\u016e\7\61\2\2\u016e\u016f\7,\2\2\u016f\u0173\3\2\2\2\u0170\u0172\13"+
		"\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7,"+
		"\2\2\u0177\u0179\7\61\2\2\u0178\u0165\3\2\2\2\u0178\u016d\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\b9\2\2\u017br\3\2\2\2\u017c\u017e\t\3\2\2\u017d"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b:\2\2\u0182t\3\2\2\2\u0183\u0184"+
		"\7)\2\2\u0184\u0185\t\4\2\2\u0185\u0186\7)\2\2\u0186v\3\2\2\2\u0187\u0189"+
		"\t\5\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u018c\t\6\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0192\3\2\2\2\u018f\u0191\t\7\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0197\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\t\b\2\2\u0196"+
		"\u0188\3\2\2\2\u0196\u0195\3\2\2\2\u0197x\3\2\2\2\u0198\u019c\7$\2\2\u0199"+
		"\u019b\t\4\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a0\7$\2\2\u01a0z\3\2\2\2\u01a1\u01a3\5}?\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2"+
		"\2\2\u01a6\u01a9\5\177@\2\u01a7\u01a9\5}?\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab|\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\t\t\2\2\u01ae~\3\2"+
		"\2\2\u01af\u01b0\t\7\2\2\u01b0\u0080\3\2\2\2\21\2\u0158\u0160\u016b\u0173"+
		"\u0178\u017f\u0188\u018d\u0192\u0196\u019c\u01a4\u01a8\u01aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}