// Generated from /home/davigomes/Downloads/COMPILADORES/qproject-antlr/src/main/java/br/ufc/qproject/antlr4/qproject.g4 by ANTLR 4.7.2
package br.ufc.qproject.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qprojectParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_lista_de_definicoes = 1, RULE_definicao = 2, RULE_estrutura = 3, 
		RULE_lista_estrutura_corpo = 4, RULE_estrutura_acesso = 5, RULE_lista_estrutura_membros = 6, 
		RULE_membro = 7, RULE_construtor = 8, RULE_variavel = 9, RULE_metodo = 10, 
		RULE_variavel_atribuicao = 11, RULE_funcao = 12, RULE_funcao_cabecalho = 13, 
		RULE_parametros_formais = 14, RULE_lista_parametros_formais = 15, RULE_tipo = 16, 
		RULE_tipo_nome = 17, RULE_qualificador = 18, RULE_decorador = 19, RULE_bloco = 20, 
		RULE_lista_comandos = 21, RULE_comando = 22, RULE_selecao = 23, RULE_selecao_senao = 24, 
		RULE_repeticao = 25, RULE_atribuicao = 26, RULE_retorno = 27, RULE_entrada = 28, 
		RULE_lista_entrada_params = 29, RULE_saida = 30, RULE_lista_saida_params = 31, 
		RULE_lista_declaracoes_locais = 32, RULE_expressao_comando = 33, RULE_expressao = 34, 
		RULE_operador_binario = 35, RULE_operador_unario = 36, RULE_nome = 37, 
		RULE_nome_lista = 38, RULE_nome_one = 39, RULE_parametros_reais = 40, 
		RULE_lista_parametros_reais = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "lista_de_definicoes", "definicao", "estrutura", "lista_estrutura_corpo", 
			"estrutura_acesso", "lista_estrutura_membros", "membro", "construtor", 
			"variavel", "metodo", "variavel_atribuicao", "funcao", "funcao_cabecalho", 
			"parametros_formais", "lista_parametros_formais", "tipo", "tipo_nome", 
			"qualificador", "decorador", "bloco", "lista_comandos", "comando", "selecao", 
			"selecao_senao", "repeticao", "atribuicao", "retorno", "entrada", "lista_entrada_params", 
			"saida", "lista_saida_params", "lista_declaracoes_locais", "expressao_comando", 
			"expressao", "operador_binario", "operador_unario", "nome", "nome_lista", 
			"nome_one", "parametros_reais", "lista_parametros_reais"
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

	@Override
	public String getGrammarFileName() { return "qproject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qprojectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Lista_de_definicoesContext lista_de_definicoes() {
			return getRuleContext(Lista_de_definicoesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(qprojectParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			lista_de_definicoes(0);
			setState(85);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_de_definicoesContext extends ParserRuleContext {
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public Lista_de_definicoesContext lista_de_definicoes() {
			return getRuleContext(Lista_de_definicoesContext.class,0);
		}
		public Lista_de_definicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_definicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_de_definicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_de_definicoes(this);
		}
	}

	public final Lista_de_definicoesContext lista_de_definicoes() throws RecognitionException {
		return lista_de_definicoes(0);
	}

	private Lista_de_definicoesContext lista_de_definicoes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_de_definicoesContext _localctx = new Lista_de_definicoesContext(_ctx, _parentState);
		Lista_de_definicoesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lista_de_definicoes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			definicao();
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_de_definicoesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_de_definicoes);
					setState(90);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(91);
					definicao();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefinicaoContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterDefinicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitDefinicao(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicao);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VOID:
			case INT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				funcao();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				estrutura();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstruturaContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(qprojectParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(qprojectParser.LBRACE, 0); }
		public Lista_estrutura_corpoContext lista_estrutura_corpo() {
			return getRuleContext(Lista_estrutura_corpoContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(qprojectParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitEstrutura(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estrutura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(STRUCT);
			setState(102);
			match(ID);
			setState(103);
			match(LBRACE);
			setState(104);
			lista_estrutura_corpo(0);
			setState(105);
			match(RBRACE);
			setState(106);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_estrutura_corpoContext extends ParserRuleContext {
		public Estrutura_acessoContext estrutura_acesso() {
			return getRuleContext(Estrutura_acessoContext.class,0);
		}
		public Lista_estrutura_corpoContext lista_estrutura_corpo() {
			return getRuleContext(Lista_estrutura_corpoContext.class,0);
		}
		public Lista_estrutura_corpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_estrutura_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_estrutura_corpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_estrutura_corpo(this);
		}
	}

	public final Lista_estrutura_corpoContext lista_estrutura_corpo() throws RecognitionException {
		return lista_estrutura_corpo(0);
	}

	private Lista_estrutura_corpoContext lista_estrutura_corpo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_estrutura_corpoContext _localctx = new Lista_estrutura_corpoContext(_ctx, _parentState);
		Lista_estrutura_corpoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lista_estrutura_corpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			estrutura_acesso();
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_estrutura_corpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_estrutura_corpo);
					setState(111);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(112);
					estrutura_acesso();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Estrutura_acessoContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(qprojectParser.PUBLIC, 0); }
		public TerminalNode COLON() { return getToken(qprojectParser.COLON, 0); }
		public Lista_estrutura_membrosContext lista_estrutura_membros() {
			return getRuleContext(Lista_estrutura_membrosContext.class,0);
		}
		public TerminalNode PROTECTED() { return getToken(qprojectParser.PROTECTED, 0); }
		public Estrutura_acessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_acesso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterEstrutura_acesso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitEstrutura_acesso(this);
		}
	}

	public final Estrutura_acessoContext estrutura_acesso() throws RecognitionException {
		Estrutura_acessoContext _localctx = new Estrutura_acessoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estrutura_acesso);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(PUBLIC);
				setState(119);
				match(COLON);
				setState(120);
				lista_estrutura_membros(0);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(PROTECTED);
				setState(122);
				match(COLON);
				setState(123);
				lista_estrutura_membros(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_estrutura_membrosContext extends ParserRuleContext {
		public MembroContext membro() {
			return getRuleContext(MembroContext.class,0);
		}
		public Lista_estrutura_membrosContext lista_estrutura_membros() {
			return getRuleContext(Lista_estrutura_membrosContext.class,0);
		}
		public Lista_estrutura_membrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_estrutura_membros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_estrutura_membros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_estrutura_membros(this);
		}
	}

	public final Lista_estrutura_membrosContext lista_estrutura_membros() throws RecognitionException {
		return lista_estrutura_membros(0);
	}

	private Lista_estrutura_membrosContext lista_estrutura_membros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_estrutura_membrosContext _localctx = new Lista_estrutura_membrosContext(_ctx, _parentState);
		Lista_estrutura_membrosContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_lista_estrutura_membros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			membro();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_estrutura_membrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_estrutura_membros);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					membro();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MembroContext extends ParserRuleContext {
		public ConstrutorContext construtor() {
			return getRuleContext(ConstrutorContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(qprojectParser.STATIC, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterMembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitMembro(this);
		}
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_membro);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				construtor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				variavel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				metodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(STATIC);
				setState(140);
				variavel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(STATIC);
				setState(142);
				funcao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrutorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ConstrutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterConstrutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitConstrutor(this);
		}
	}

	public final ConstrutorContext construtor() throws RecognitionException {
		ConstrutorContext _localctx = new ConstrutorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_construtor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(LPAREN);
			setState(147);
			parametros_formais();
			setState(148);
			match(RPAREN);
			setState(149);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			tipo();
			setState(152);
			match(ID);
			setState(153);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			funcao_cabecalho();
			setState(156);
			qualificador();
			setState(157);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variavel_atribuicaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(qprojectParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public Variavel_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterVariavel_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitVariavel_atribuicao(this);
		}
	}

	public final Variavel_atribuicaoContext variavel_atribuicao() throws RecognitionException {
		Variavel_atribuicaoContext _localctx = new Variavel_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variavel_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			tipo();
			setState(160);
			match(ID);
			setState(161);
			match(ATRIB);
			setState(162);
			expressao(0);
			setState(163);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			funcao_cabecalho();
			setState(166);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcao_cabecalhoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public Funcao_cabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterFuncao_cabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitFuncao_cabecalho(this);
		}
	}

	public final Funcao_cabecalhoContext funcao_cabecalho() throws RecognitionException {
		Funcao_cabecalhoContext _localctx = new Funcao_cabecalhoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcao_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			tipo();
			setState(169);
			match(ID);
			setState(170);
			match(LPAREN);
			setState(171);
			parametros_formais();
			setState(172);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_formaisContext extends ParserRuleContext {
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public Parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterParametros_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitParametros_formais(this);
		}
	}

	public final Parametros_formaisContext parametros_formais() throws RecognitionException {
		Parametros_formaisContext _localctx = new Parametros_formaisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros_formais);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VOID:
			case INT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				lista_parametros_formais();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_parametros_formaisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(qprojectParser.COMMA, 0); }
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public Lista_parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_parametros_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_parametros_formais(this);
		}
	}

	public final Lista_parametros_formaisContext lista_parametros_formais() throws RecognitionException {
		Lista_parametros_formaisContext _localctx = new Lista_parametros_formaisContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lista_parametros_formais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			tipo();
			setState(179);
			match(ID);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(180);
				match(COMMA);
				setState(181);
				lista_parametros_formais();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(qprojectParser.VOID, 0); }
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode INT() { return getToken(qprojectParser.INT, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(qprojectParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(qprojectParser.BOOL, 0); }
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				qualificador();
				setState(186);
				match(INT);
				setState(187);
				decorador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				qualificador();
				setState(190);
				match(CHAR);
				setState(191);
				decorador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				qualificador();
				setState(194);
				match(BOOL);
				setState(195);
				decorador();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				qualificador();
				setState(198);
				tipo_nome(0);
				setState(199);
				decorador();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_nomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TerminalNode DBLCOL() { return getToken(qprojectParser.DBLCOL, 0); }
		public Tipo_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterTipo_nome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitTipo_nome(this);
		}
	}

	public final Tipo_nomeContext tipo_nome() throws RecognitionException {
		return tipo_nome(0);
	}

	private Tipo_nomeContext tipo_nome(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tipo_nomeContext _localctx = new Tipo_nomeContext(_ctx, _parentState);
		Tipo_nomeContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_tipo_nome, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tipo_nomeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tipo_nome);
					setState(206);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(207);
					match(DBLCOL);
					setState(208);
					match(ID);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QualificadorContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(qprojectParser.CONST, 0); }
		public QualificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterQualificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitQualificador(this);
		}
	}

	public final QualificadorContext qualificador() throws RecognitionException {
		QualificadorContext _localctx = new QualificadorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualificador);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(CONST);
				}
				break;
			case LBRACE:
			case INT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoradorContext extends ParserRuleContext {
		public TerminalNode AMPER() { return getToken(qprojectParser.AMPER, 0); }
		public DecoradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterDecorador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitDecorador(this);
		}
	}

	public final DecoradorContext decorador() throws RecognitionException {
		DecoradorContext _localctx = new DecoradorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decorador);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(AMPER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qprojectParser.LBRACE, 0); }
		public Lista_declaracoes_locaisContext lista_declaracoes_locais() {
			return getRuleContext(Lista_declaracoes_locaisContext.class,0);
		}
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(qprojectParser.RBRACE, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACE);
			setState(223);
			lista_declaracoes_locais();
			setState(224);
			lista_comandos(0);
			setState(225);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_comandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public Lista_comandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_comandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_comandos(this);
		}
	}

	public final Lista_comandosContext lista_comandos() throws RecognitionException {
		return lista_comandos(0);
	}

	private Lista_comandosContext lista_comandos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_comandosContext _localctx = new Lista_comandosContext(_ctx, _parentState);
		Lista_comandosContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_lista_comandos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			comando();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_comandosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_comandos);
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231);
					comando();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(qprojectParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comando);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				selecao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				repeticao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				atribuicao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				retorno();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				entrada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				saida();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				expressao_comando();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				match(BREAK);
				setState(246);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(qprojectParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public Selecao_senaoContext selecao_senao() {
			return getRuleContext(Selecao_senaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF);
			setState(250);
			match(LPAREN);
			setState(251);
			expressao(0);
			setState(252);
			match(RPAREN);
			setState(253);
			lista_comandos(0);
			setState(254);
			selecao_senao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selecao_senaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(qprojectParser.ELSE, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public Selecao_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterSelecao_senao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitSelecao_senao(this);
		}
	}

	public final Selecao_senaoContext selecao_senao() throws RecognitionException {
		Selecao_senaoContext _localctx = new Selecao_senaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selecao_senao);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ELSE);
				setState(257);
				lista_comandos(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(qprojectParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			match(LPAREN);
			setState(263);
			expressao(0);
			setState(264);
			match(RPAREN);
			setState(265);
			lista_comandos(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode ATRIB() { return getToken(qprojectParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			nome();
			setState(268);
			match(ATRIB);
			setState(269);
			expressao(0);
			setState(270);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(qprojectParser.RETURN, 0); }
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(RETURN);
			setState(273);
			expressao_comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode STDCIN() { return getToken(qprojectParser.STDCIN, 0); }
		public Lista_entrada_paramsContext lista_entrada_params() {
			return getRuleContext(Lista_entrada_paramsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(STDCIN);
			setState(276);
			lista_entrada_params(0);
			setState(277);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_entrada_paramsContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode STDENDL() { return getToken(qprojectParser.STDENDL, 0); }
		public Lista_entrada_paramsContext lista_entrada_params() {
			return getRuleContext(Lista_entrada_paramsContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(qprojectParser.RSHIFT, 0); }
		public Lista_entrada_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_entrada_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_entrada_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_entrada_params(this);
		}
	}

	public final Lista_entrada_paramsContext lista_entrada_params() throws RecognitionException {
		return lista_entrada_params(0);
	}

	private Lista_entrada_paramsContext lista_entrada_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_entrada_paramsContext _localctx = new Lista_entrada_paramsContext(_ctx, _parentState);
		Lista_entrada_paramsContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_lista_entrada_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case ID:
				{
				setState(280);
				nome();
				}
				break;
			case STDENDL:
				{
				setState(281);
				match(STDENDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_entrada_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_entrada_params);
					setState(284);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(285);
					match(RSHIFT);
					setState(286);
					nome();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode STDCOUT() { return getToken(qprojectParser.STDCOUT, 0); }
		public Lista_saida_paramsContext lista_saida_params() {
			return getRuleContext(Lista_saida_paramsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(STDCOUT);
			setState(293);
			lista_saida_params(0);
			setState(294);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_saida_paramsContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode STRL() { return getToken(qprojectParser.STRL, 0); }
		public TerminalNode STDENDL() { return getToken(qprojectParser.STDENDL, 0); }
		public Lista_saida_paramsContext lista_saida_params() {
			return getRuleContext(Lista_saida_paramsContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(qprojectParser.LSHIFT, 0); }
		public Lista_saida_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_saida_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_saida_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_saida_params(this);
		}
	}

	public final Lista_saida_paramsContext lista_saida_params() throws RecognitionException {
		return lista_saida_params(0);
	}

	private Lista_saida_paramsContext lista_saida_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_saida_paramsContext _localctx = new Lista_saida_paramsContext(_ctx, _parentState);
		Lista_saida_paramsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_lista_saida_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECR:
			case INCR:
			case MINUS:
			case NOT:
			case LPAREN:
			case THIS:
			case TRUE:
			case FALSE:
			case CHARL:
			case INTL:
			case ID:
				{
				setState(297);
				expressao(0);
				}
				break;
			case STRL:
				{
				setState(298);
				match(STRL);
				}
				break;
			case STDENDL:
				{
				setState(299);
				match(STDENDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_saida_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_saida_params);
					setState(302);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(303);
					match(LSHIFT);
					setState(304);
					expressao(0);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Lista_declaracoes_locaisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Variavel_atribuicaoContext variavel_atribuicao() {
			return getRuleContext(Variavel_atribuicaoContext.class,0);
		}
		public Lista_declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_declaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_declaracoes_locais(this);
		}
	}

	public final Lista_declaracoes_locaisContext lista_declaracoes_locais() throws RecognitionException {
		Lista_declaracoes_locaisContext _localctx = new Lista_declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lista_declaracoes_locais);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				variavel_atribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_comandoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(qprojectParser.SEMI, 0); }
		public Expressao_comandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressao_comando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressao_comando(this);
		}
	}

	public final Expressao_comandoContext expressao_comando() throws RecognitionException {
		Expressao_comandoContext _localctx = new Expressao_comandoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressao_comando);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECR:
			case INCR:
			case MINUS:
			case NOT:
			case LPAREN:
			case THIS:
			case TRUE:
			case FALSE:
			case CHARL:
			case INTL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expressao(0);
				setState(316);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionFalseContext extends ExpressaoContext {
		public TerminalNode FALSE() { return getToken(qprojectParser.FALSE, 0); }
		public ExpressionFalseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionFalse(this);
		}
	}
	public static class ExpressionOperatorBinaryContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public ExpressionOperatorBinaryContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionOperatorBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionOperatorBinary(this);
		}
	}
	public static class ExpressionParameterContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public ExpressionParameterContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionParameter(this);
		}
	}
	public static class ExpressionTrueContext extends ExpressaoContext {
		public TerminalNode TRUE() { return getToken(qprojectParser.TRUE, 0); }
		public ExpressionTrueContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionTrue(this);
		}
	}
	public static class ExpressionOperatorUnaryContext extends ExpressaoContext {
		public Operador_unarioContext operador_unario() {
			return getRuleContext(Operador_unarioContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressionOperatorUnaryContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionOperatorUnary(this);
		}
	}
	public static class ExpressinParenContext extends ExpressaoContext {
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public ExpressinParenContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressinParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressinParen(this);
		}
	}
	public static class ExpressionNomeContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public ExpressionNomeContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionNome(this);
		}
	}
	public static class ExpressionCharlContext extends ExpressaoContext {
		public TerminalNode CHARL() { return getToken(qprojectParser.CHARL, 0); }
		public ExpressionCharlContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionCharl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionCharl(this);
		}
	}
	public static class ExpressionIntContext extends ExpressaoContext {
		public TerminalNode INTL() { return getToken(qprojectParser.INTL, 0); }
		public ExpressionIntContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterExpressionInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitExpressionInt(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressinParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(322);
				match(LPAREN);
				setState(323);
				expressao(0);
				setState(324);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionOperatorUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				operador_unario();
				setState(327);
				expressao(7);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				nome();
				setState(330);
				match(LPAREN);
				setState(331);
				parametros_reais();
				setState(332);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ExpressionNomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				nome();
				}
				break;
			case 5:
				{
				_localctx = new ExpressionIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(INTL);
				}
				break;
			case 6:
				{
				_localctx = new ExpressionCharlContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(CHARL);
				}
				break;
			case 7:
				{
				_localctx = new ExpressionTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new ExpressionFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionOperatorBinaryContext(new ExpressaoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(341);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(342);
					operador_binario();
					setState(343);
					expressao(8);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Operador_binarioContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(qprojectParser.AND, 0); }
		public TerminalNode OR() { return getToken(qprojectParser.OR, 0); }
		public TerminalNode PLUS() { return getToken(qprojectParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(qprojectParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(qprojectParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(qprojectParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(qprojectParser.MOD, 0); }
		public TerminalNode LT() { return getToken(qprojectParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(qprojectParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(qprojectParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(qprojectParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(qprojectParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(qprojectParser.NEQ, 0); }
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterOperador_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitOperador_binario(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << EQ) | (1L << GEQ) | (1L << GT) | (1L << LEQ) | (1L << LT) | (1L << MINUS) | (1L << MOD) | (1L << NEQ) | (1L << OR) | (1L << PLUS) | (1L << TIMES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_unarioContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(qprojectParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(qprojectParser.DECR, 0); }
		public TerminalNode MINUS() { return getToken(qprojectParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(qprojectParser.NOT, 0); }
		public Operador_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterOperador_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitOperador_unario(this);
		}
	}

	public final Operador_unarioContext operador_unario() throws RecognitionException {
		Operador_unarioContext _localctx = new Operador_unarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operador_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECR) | (1L << INCR) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode DBLCOL() { return getToken(qprojectParser.DBLCOL, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public TerminalNode THIS() { return getToken(qprojectParser.THIS, 0); }
		public TerminalNode ARROW() { return getToken(qprojectParser.ARROW, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitNome(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nome);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(ID);
				setState(355);
				match(DBLCOL);
				setState(356);
				nome_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(THIS);
				setState(358);
				match(ARROW);
				setState(359);
				nome_lista();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				nome_lista();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_listaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(qprojectParser.ID, 0); }
		public TerminalNode DOT() { return getToken(qprojectParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public Nome_oneContext nome_one() {
			return getRuleContext(Nome_oneContext.class,0);
		}
		public Nome_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterNome_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitNome_lista(this);
		}
	}

	public final Nome_listaContext nome_lista() throws RecognitionException {
		Nome_listaContext _localctx = new Nome_listaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nome_lista);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ID);
				setState(364);
				match(DOT);
				setState(365);
				nome_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(ID);
				setState(367);
				nome_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_oneContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qprojectParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qprojectParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(qprojectParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public Nome_oneContext nome_one() {
			return getRuleContext(Nome_oneContext.class,0);
		}
		public Nome_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterNome_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitNome_one(this);
		}
	}

	public final Nome_oneContext nome_one() throws RecognitionException {
		Nome_oneContext _localctx = new Nome_oneContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nome_one);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(LPAREN);
				setState(373);
				parametros_reais();
				setState(374);
				match(RPAREN);
				setState(375);
				match(DOT);
				setState(376);
				nome_lista();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(LPAREN);
				setState(379);
				parametros_reais();
				setState(380);
				match(RPAREN);
				setState(381);
				match(DOT);
				setState(382);
				nome_one();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_reaisContext extends ParserRuleContext {
		public Lista_parametros_reaisContext lista_parametros_reais() {
			return getRuleContext(Lista_parametros_reaisContext.class,0);
		}
		public Parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_reais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterParametros_reais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitParametros_reais(this);
		}
	}

	public final Parametros_reaisContext parametros_reais() throws RecognitionException {
		Parametros_reaisContext _localctx = new Parametros_reaisContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parametros_reais);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECR:
			case INCR:
			case MINUS:
			case NOT:
			case LPAREN:
			case THIS:
			case TRUE:
			case FALSE:
			case CHARL:
			case INTL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				lista_parametros_reais(0);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_parametros_reaisContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Lista_parametros_reaisContext lista_parametros_reais() {
			return getRuleContext(Lista_parametros_reaisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(qprojectParser.COMMA, 0); }
		public Lista_parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_reais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).enterLista_parametros_reais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qprojectListener ) ((qprojectListener)listener).exitLista_parametros_reais(this);
		}
	}

	public final Lista_parametros_reaisContext lista_parametros_reais() throws RecognitionException {
		return lista_parametros_reais(0);
	}

	private Lista_parametros_reaisContext lista_parametros_reais(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametros_reaisContext _localctx = new Lista_parametros_reaisContext(_ctx, _parentState);
		Lista_parametros_reaisContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_lista_parametros_reais, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(391);
			expressao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametros_reaisContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_reais);
					setState(393);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(394);
					match(COMMA);
					setState(395);
					expressao(0);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lista_de_definicoes_sempred((Lista_de_definicoesContext)_localctx, predIndex);
		case 4:
			return lista_estrutura_corpo_sempred((Lista_estrutura_corpoContext)_localctx, predIndex);
		case 6:
			return lista_estrutura_membros_sempred((Lista_estrutura_membrosContext)_localctx, predIndex);
		case 17:
			return tipo_nome_sempred((Tipo_nomeContext)_localctx, predIndex);
		case 21:
			return lista_comandos_sempred((Lista_comandosContext)_localctx, predIndex);
		case 29:
			return lista_entrada_params_sempred((Lista_entrada_paramsContext)_localctx, predIndex);
		case 31:
			return lista_saida_params_sempred((Lista_saida_paramsContext)_localctx, predIndex);
		case 34:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 41:
			return lista_parametros_reais_sempred((Lista_parametros_reaisContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lista_de_definicoes_sempred(Lista_de_definicoesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_estrutura_corpo_sempred(Lista_estrutura_corpoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_estrutura_membros_sempred(Lista_estrutura_membrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tipo_nome_sempred(Tipo_nomeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_comandos_sempred(Lista_comandosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_entrada_params_sempred(Lista_entrada_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean lista_saida_params_sempred(Lista_saida_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean lista_parametros_reais_sempred(Lista_parametros_reaisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\4\3\4\5\4f\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f\6\16\6w"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0086"+
		"\n\b\f\b\16\b\u0089\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u00b3\n\20\3\21\3\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7\13"+
		"\23\3\24\3\24\5\24\u00db\n\24\3\25\3\25\5\25\u00df\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00eb\n\27\f\27\16\27\u00ee\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fa\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0106\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u011d\n\37\3\37\3\37\3\37\7\37\u0122"+
		"\n\37\f\37\16\37\u0125\13\37\3 \3 \3 \3 \3!\3!\3!\3!\5!\u012f\n!\3!\3"+
		"!\3!\7!\u0134\n!\f!\16!\u0137\13!\3\"\3\"\3\"\5\"\u013c\n\"\3#\3#\3#\3"+
		"#\5#\u0142\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5"+
		"$\u0156\n$\3$\3$\3$\3$\7$\u015c\n$\f$\16$\u015f\13$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u016c\n\'\3(\3(\3(\3(\3(\3(\5(\u0174\n(\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0183\n)\3*\3*\5*\u0187\n*\3+"+
		"\3+\3+\3+\3+\3+\7+\u018f\n+\f+\16+\u0192\13+\3+\2\13\4\n\16$,<@FT,\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RT\2\4\7\2\f\f\21\21\23\25\27\33\35\37\6\2\20\20\26\26\31\31\34\34\2\u019d"+
		"\2V\3\2\2\2\4Y\3\2\2\2\6e\3\2\2\2\bg\3\2\2\2\nn\3\2\2\2\f~\3\2\2\2\16"+
		"\u0080\3\2\2\2\20\u0091\3\2\2\2\22\u0093\3\2\2\2\24\u0099\3\2\2\2\26\u009d"+
		"\3\2\2\2\30\u00a1\3\2\2\2\32\u00a7\3\2\2\2\34\u00aa\3\2\2\2\36\u00b2\3"+
		"\2\2\2 \u00b4\3\2\2\2\"\u00cb\3\2\2\2$\u00cd\3\2\2\2&\u00da\3\2\2\2(\u00de"+
		"\3\2\2\2*\u00e0\3\2\2\2,\u00e5\3\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u0105\3\2\2\2\64\u0107\3\2\2\2\66\u010d\3\2\2\28\u0112\3\2\2\2:\u0115"+
		"\3\2\2\2<\u011c\3\2\2\2>\u0126\3\2\2\2@\u012e\3\2\2\2B\u013b\3\2\2\2D"+
		"\u0141\3\2\2\2F\u0155\3\2\2\2H\u0160\3\2\2\2J\u0162\3\2\2\2L\u016b\3\2"+
		"\2\2N\u0173\3\2\2\2P\u0182\3\2\2\2R\u0186\3\2\2\2T\u0188\3\2\2\2VW\5\4"+
		"\3\2WX\7\2\2\3X\3\3\2\2\2YZ\b\3\1\2Z[\5\6\4\2[`\3\2\2\2\\]\f\4\2\2]_\5"+
		"\6\4\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2b`\3\2\2\2c"+
		"f\5\32\16\2df\5\b\5\2ec\3\2\2\2ed\3\2\2\2f\7\3\2\2\2gh\7*\2\2hi\7?\2\2"+
		"ij\7\"\2\2jk\5\n\6\2kl\7#\2\2lm\7\4\2\2m\t\3\2\2\2no\b\6\1\2op\5\f\7\2"+
		"pu\3\2\2\2qr\f\4\2\2rt\5\f\7\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\13\3\2\2\2wu\3\2\2\2xy\7&\2\2yz\7\5\2\2z\177\5\16\b\2{|\7\'\2\2|}\7"+
		"\5\2\2}\177\5\16\b\2~x\3\2\2\2~{\3\2\2\2\177\r\3\2\2\2\u0080\u0081\b\b"+
		"\1\2\u0081\u0082\5\20\t\2\u0082\u0087\3\2\2\2\u0083\u0084\f\4\2\2\u0084"+
		"\u0086\5\20\t\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\17\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u0092\5\22\n\2\u008b\u0092\5\24\13\2\u008c\u0092\5\26\f\2\u008d\u008e"+
		"\7)\2\2\u008e\u0092\5\24\13\2\u008f\u0090\7)\2\2\u0090\u0092\5\32\16\2"+
		"\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\u0095\7$\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7%\2\2\u0097\u0098\5*"+
		"\26\2\u0098\23\3\2\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7?\2\2\u009b\u009c"+
		"\7\4\2\2\u009c\25\3\2\2\2\u009d\u009e\5\34\17\2\u009e\u009f\5&\24\2\u009f"+
		"\u00a0\5*\26\2\u00a0\27\3\2\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7?\2"+
		"\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5F$\2\u00a5\u00a6\7\4\2\2\u00a6\31"+
		"\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\5*\26\2\u00a9\33\3\2\2\2\u00aa"+
		"\u00ab\5\"\22\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\5\36"+
		"\20\2\u00ae\u00af\7%\2\2\u00af\35\3\2\2\2\u00b0\u00b3\5 \21\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\37\3\2\2\2\u00b4"+
		"\u00b5\5\"\22\2\u00b5\u00b8\7?\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b9\5 "+
		"\21\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00cc"+
		"\7\64\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7\65\2\2\u00bd\u00be\5(\25\2"+
		"\u00be\u00cc\3\2\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7\66\2\2\u00c1\u00c2"+
		"\5(\25\2\u00c2\u00cc\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\7\67\2\2"+
		"\u00c5\u00c6\5(\25\2\u00c6\u00cc\3\2\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9"+
		"\5$\23\2\u00c9\u00ca\5(\25\2\u00ca\u00cc\3\2\2\2\u00cb\u00ba\3\2\2\2\u00cb"+
		"\u00bb\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c7\3\2"+
		"\2\2\u00cc#\3\2\2\2\u00cd\u00ce\b\23\1\2\u00ce\u00cf\7?\2\2\u00cf\u00d5"+
		"\3\2\2\2\u00d0\u00d1\f\4\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d4\7?\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6%\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\7\63\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\'\3\2\2\2\u00dc"+
		"\u00df\7\3\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df)\3\2\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\5B\"\2\u00e2\u00e3"+
		"\5,\27\2\u00e3\u00e4\7#\2\2\u00e4+\3\2\2\2\u00e5\u00e6\b\27\1\2\u00e6"+
		"\u00e7\5.\30\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9\u00eb\5."+
		"\30\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00fa\5*\26\2"+
		"\u00f0\u00fa\5\60\31\2\u00f1\u00fa\5\64\33\2\u00f2\u00fa\5\66\34\2\u00f3"+
		"\u00fa\58\35\2\u00f4\u00fa\5:\36\2\u00f5\u00fa\5> \2\u00f6\u00fa\5D#\2"+
		"\u00f7\u00f8\7.\2\2\u00f8\u00fa\7\4\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f0"+
		"\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\7$\2\2\u00fd\u00fe"+
		"\5F$\2\u00fe\u00ff\7%\2\2\u00ff\u0100\5,\27\2\u0100\u0101\5\62\32\2\u0101"+
		"\61\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0106\5,\27\2\u0104\u0106\3\2\2\2"+
		"\u0105\u0102\3\2\2\2\u0105\u0104\3\2\2\2\u0106\63\3\2\2\2\u0107\u0108"+
		"\7-\2\2\u0108\u0109\7$\2\2\u0109\u010a\5F$\2\u010a\u010b\7%\2\2\u010b"+
		"\u010c\5,\27\2\u010c\65\3\2\2\2\u010d\u010e\5L\'\2\u010e\u010f\7\16\2"+
		"\2\u010f\u0110\5F$\2\u0110\u0111\7\4\2\2\u0111\67\3\2\2\2\u0112\u0113"+
		"\7/\2\2\u0113\u0114\5D#\2\u01149\3\2\2\2\u0115\u0116\7\t\2\2\u0116\u0117"+
		"\5<\37\2\u0117\u0118\7\4\2\2\u0118;\3\2\2\2\u0119\u011a\b\37\1\2\u011a"+
		"\u011d\5L\'\2\u011b\u011d\7\13\2\2\u011c\u0119\3\2\2\2\u011c\u011b\3\2"+
		"\2\2\u011d\u0123\3\2\2\2\u011e\u011f\f\5\2\2\u011f\u0120\7\b\2\2\u0120"+
		"\u0122\5L\'\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124=\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127"+
		"\7\n\2\2\u0127\u0128\5@!\2\u0128\u0129\7\4\2\2\u0129?\3\2\2\2\u012a\u012b"+
		"\b!\1\2\u012b\u012f\5F$\2\u012c\u012f\7>\2\2\u012d\u012f\7\13\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0135\3\2"+
		"\2\2\u0130\u0131\f\6\2\2\u0131\u0132\7\7\2\2\u0132\u0134\5F$\2\u0133\u0130"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"A\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\5\24\13\2\u0139\u013c\5\30\r"+
		"\2\u013a\u013c\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013cC\3\2\2\2\u013d\u013e\5F$\2\u013e\u013f\7\4\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u0142\7\4\2\2\u0141\u013d\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"E\3\2\2\2\u0143\u0144\b$\1\2\u0144\u0145\7$\2\2\u0145\u0146\5F$\2\u0146"+
		"\u0147\7%\2\2\u0147\u0156\3\2\2\2\u0148\u0149\5J&\2\u0149\u014a\5F$\t"+
		"\u014a\u0156\3\2\2\2\u014b\u014c\5L\'\2\u014c\u014d\7$\2\2\u014d\u014e"+
		"\5R*\2\u014e\u014f\7%\2\2\u014f\u0156\3\2\2\2\u0150\u0156\5L\'\2\u0151"+
		"\u0156\7=\2\2\u0152\u0156\7<\2\2\u0153\u0156\7\61\2\2\u0154\u0156\7\62"+
		"\2\2\u0155\u0143\3\2\2\2\u0155\u0148\3\2\2\2\u0155\u014b\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0154\3\2\2\2\u0156\u015d\3\2\2\2\u0157\u0158\f\n\2\2\u0158"+
		"\u0159\5H%\2\u0159\u015a\5F$\n\u015a\u015c\3\2\2\2\u015b\u0157\3\2\2\2"+
		"\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eG\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\t\2\2\2\u0161I\3\2\2\2\u0162\u0163"+
		"\t\3\2\2\u0163K\3\2\2\2\u0164\u0165\7?\2\2\u0165\u0166\7\17\2\2\u0166"+
		"\u016c\5N(\2\u0167\u0168\7\60\2\2\u0168\u0169\7\r\2\2\u0169\u016c\5N("+
		"\2\u016a\u016c\5N(\2\u016b\u0164\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016cM\3\2\2\2\u016d\u016e\7?\2\2\u016e\u016f\7\22\2\2\u016f"+
		"\u0174\5N(\2\u0170\u0171\7?\2\2\u0171\u0174\5P)\2\u0172\u0174\7?\2\2\u0173"+
		"\u016d\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0172\3\2\2\2\u0174O\3\2\2\2"+
		"\u0175\u0183\3\2\2\2\u0176\u0177\7$\2\2\u0177\u0178\5R*\2\u0178\u0179"+
		"\7%\2\2\u0179\u017a\7\22\2\2\u017a\u017b\5N(\2\u017b\u0183\3\2\2\2\u017c"+
		"\u017d\7$\2\2\u017d\u017e\5R*\2\u017e\u017f\7%\2\2\u017f\u0180\7\22\2"+
		"\2\u0180\u0181\5P)\2\u0181\u0183\3\2\2\2\u0182\u0175\3\2\2\2\u0182\u0176"+
		"\3\2\2\2\u0182\u017c\3\2\2\2\u0183Q\3\2\2\2\u0184\u0187\5T+\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187S\3\2\2\2\u0188"+
		"\u0189\b+\1\2\u0189\u018a\5F$\2\u018a\u0190\3\2\2\2\u018b\u018c\f\4\2"+
		"\2\u018c\u018d\7\6\2\2\u018d\u018f\5F$\2\u018e\u018b\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191U\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\36`eu~\u0087\u0091\u00b2\u00b8\u00cb\u00d5\u00da\u00de"+
		"\u00ec\u00f9\u0105\u011c\u0123\u012e\u0135\u013b\u0141\u0155\u015d\u016b"+
		"\u0173\u0182\u0186\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}