// Generated from c:/Users/Alef_PC/Documents/repositorio_github/Projeto-Compilador/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, NUM_INT=52, 
		NUM_DEC=53, TEXTO=54, ID=55, WS=56, LINE_COMMENT=57, BLOCK_COMMENT=58;
	public static final int
		RULE_program = 0, RULE_declaracao = 1, RULE_declaracaoVariavel = 2, RULE_declaracaoFuncao = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_bloco = 6, RULE_expressao = 7, 
		RULE_atribuicao = 8, RULE_tipo = 9, RULE_estruturaControle = 10, RULE_caseLista = 11, 
		RULE_caseDecl = 12, RULE_declaracaoEstrutura = 13, RULE_array = 14, RULE_arrayInicializacao = 15, 
		RULE_expressaoLista = 16, RULE_expressaoLogica = 17, RULE_expressaoRelacional = 18, 
		RULE_expressaoAritmetica = 19, RULE_expressaoMultiplicativa = 20, RULE_expressaoUnaria = 21, 
		RULE_expressaoPostfix = 22, RULE_argumentos = 23, RULE_primaria = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaracao", "declaracaoVariavel", "declaracaoFuncao", "parametros", 
			"parametro", "bloco", "expressao", "atribuicao", "tipo", "estruturaControle", 
			"caseLista", "caseDecl", "declaracaoEstrutura", "array", "arrayInicializacao", 
			"expressaoLista", "expressaoLogica", "expressaoRelacional", "expressaoAritmetica", 
			"expressaoMultiplicativa", "expressaoUnaria", "expressaoPostfix", "argumentos", 
			"primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", "'int'", "'float'", 
			"'double'", "'char'", "'boolean'", "'if'", "'else'", "'while'", "'for'", 
			"'switch'", "'break'", "'continue'", "'return'", "'case'", "':'", "'default'", 
			"'struct'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUM_INT", "NUM_DEC", "TEXTO", "ID", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9655156736L) != 0)) {
				{
				{
				setState(50);
				declaracao();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoEstruturaContext declaracaoEstrutura() {
			return getRuleContext(DeclaracaoEstruturaContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declaracaoFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				declaracaoEstrutura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				estruturaControle();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavel);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				tipo();
				setState(65);
				match(ID);
				setState(66);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				tipo();
				setState(69);
				match(ID);
				setState(70);
				match(T__1);
				setState(71);
				expressao();
				setState(72);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			tipo();
			setState(77);
			match(ID);
			setState(78);
			match(T__2);
			setState(79);
			parametros();
			setState(80);
			match(T__3);
			setState(81);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			parametro();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(84);
				match(T__4);
				setState(85);
				parametro();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				tipo();
				setState(92);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				tipo();
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__7);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9655156736L) != 0)) {
				{
				{
				setState(102);
				declaracao();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				expressaoLogica(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ID);
				setState(115);
				match(T__1);
				setState(116);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ID);
				setState(118);
				match(T__9);
				setState(119);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(ID);
				setState(121);
				match(T__10);
				setState(122);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(ID);
				setState(124);
				match(T__11);
				setState(125);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(ID);
				setState(127);
				match(T__12);
				setState(128);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(ID);
				setState(130);
				match(T__13);
				setState(131);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__14);
				setState(134);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				match(ID);
				setState(136);
				match(T__15);
				setState(137);
				expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estruturaControle);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__21);
				setState(143);
				match(T__2);
				setState(144);
				expressao();
				setState(145);
				match(T__3);
				setState(146);
				bloco();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(147);
					match(T__22);
					setState(148);
					bloco();
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__23);
				setState(152);
				match(T__2);
				setState(153);
				expressao();
				setState(154);
				match(T__3);
				setState(155);
				bloco();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__24);
				setState(158);
				match(T__2);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68416080246210568L) != 0)) {
					{
					setState(159);
					expressao();
					}
				}

				setState(162);
				match(T__0);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68416080246210568L) != 0)) {
					{
					setState(163);
					expressao();
					}
				}

				setState(166);
				match(T__0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68416080246210568L) != 0)) {
					{
					setState(167);
					expressao();
					}
				}

				setState(170);
				match(T__3);
				setState(171);
				bloco();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__25);
				setState(173);
				match(T__2);
				setState(174);
				expressao();
				setState(175);
				match(T__3);
				setState(176);
				caseLista();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(T__26);
				setState(179);
				match(T__0);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(T__27);
				setState(181);
				match(T__0);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(T__28);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68416080246210568L) != 0)) {
					{
					setState(183);
					expressao();
					}
				}

				setState(186);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseListaContext extends ParserRuleContext {
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__31) {
				{
				{
				setState(189);
				caseDecl();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseDecl);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__29);
				setState(196);
				expressao();
				setState(197);
				match(T__30);
				setState(198);
				bloco();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__31);
				setState(201);
				match(T__30);
				setState(202);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoEstruturaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public DeclaracaoEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEstrutura; }
	}

	public final DeclaracaoEstruturaContext declaracaoEstrutura() throws RecognitionException {
		DeclaracaoEstruturaContext _localctx = new DeclaracaoEstruturaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracaoEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__32);
			setState(206);
			match(ID);
			setState(207);
			match(T__7);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) {
				{
				{
				setState(208);
				declaracaoVariavel();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__8);
			setState(215);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayInicializacaoContext arrayInicializacao() {
			return getRuleContext(ArrayInicializacaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				setState(218);
				match(T__5);
				setState(219);
				expressao();
				setState(220);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				setState(223);
				match(T__5);
				setState(224);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				arrayInicializacao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInicializacaoContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArrayInicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInicializacao; }
	}

	public final ArrayInicializacaoContext arrayInicializacao() throws RecognitionException {
		ArrayInicializacaoContext _localctx = new ArrayInicializacaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__7);
			setState(229);
			expressaoLista();
			setState(230);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExpressaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLista; }
	}

	public final ExpressaoListaContext expressaoLista() throws RecognitionException {
		ExpressaoListaContext _localctx = new ExpressaoListaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressaoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expressao();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(233);
				match(T__4);
				setState(234);
				expressao();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__43:
			case T__47:
			case T__48:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
			case ID:
				{
				setState(241);
				expressaoRelacional();
				}
				break;
			case T__35:
				{
				setState(242);
				match(T__35);
				setState(243);
				expressaoRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(246);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(247);
						match(T__33);
						setState(248);
						expressaoRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(250);
						match(T__34);
						setState(251);
						expressaoRelacional();
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRelacional);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				expressaoAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				expressaoAritmetica(0);
				setState(259);
				match(T__36);
				setState(260);
				expressaoAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				expressaoAritmetica(0);
				setState(263);
				match(T__37);
				setState(264);
				expressaoAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				expressaoAritmetica(0);
				setState(267);
				match(T__38);
				setState(268);
				expressaoAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				expressaoAritmetica(0);
				setState(271);
				match(T__39);
				setState(272);
				expressaoAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				expressaoAritmetica(0);
				setState(275);
				match(T__40);
				setState(276);
				expressaoAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				expressaoAritmetica(0);
				setState(279);
				match(T__41);
				setState(280);
				expressaoAritmetica(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(287);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(288);
						match(T__42);
						setState(289);
						expressaoMultiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(290);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(291);
						match(T__43);
						setState(292);
						expressaoMultiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoMultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			expressaoUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(301);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(302);
						match(T__44);
						setState(303);
						expressaoUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(304);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(305);
						match(T__45);
						setState(306);
						expressaoUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(307);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(308);
						match(T__46);
						setState(309);
						expressaoUnaria();
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoPostfixContext expressaoPostfix() {
			return getRuleContext(ExpressaoPostfixContext.class,0);
		}
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoUnaria);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expressaoPostfix();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(T__43);
				setState(317);
				expressaoUnaria();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(T__47);
				setState(319);
				expressaoPostfix();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(T__48);
				setState(321);
				expressaoPostfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoPostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressaoPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPostfix; }
	}

	public final ExpressaoPostfixContext expressaoPostfix() throws RecognitionException {
		ExpressaoPostfixContext _localctx = new ExpressaoPostfixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoPostfix);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				primaria();
				setState(326);
				match(T__5);
				setState(327);
				expressao();
				setState(328);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				primaria();
				setState(331);
				match(T__2);
				setState(332);
				argumentos();
				setState(333);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				primaria();
				setState(336);
				match(T__49);
				setState(337);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				primaria();
				setState(340);
				match(T__50);
				setState(341);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentos);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__35:
			case T__43:
			case T__47:
			case T__48:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				expressaoLista();
				}
				break;
			case T__3:
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(gramaticaParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(gramaticaParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(gramaticaParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primaria);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(NUM_INT);
				}
				break;
			case NUM_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(NUM_DEC);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(TEXTO);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(T__2);
				setState(354);
				expressao();
				setState(355);
				match(T__3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		case 19:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 20:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u0168\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"d\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006"+
		"k\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"q\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0096\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00a1\b\n\u0001\n\u0001\n\u0003\n\u00a5\b\n"+
		"\u0001\n\u0001\n\u0003\n\u00a9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00b9\b\n\u0001\n\u0003\n\u00bc\b\n\u0001\u000b\u0005\u000b"+
		"\u00bf\b\u000b\n\u000b\f\u000b\u00c2\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00d2\b\r\n\r\f\r\u00d5\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e3\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00ec\b\u0010\n\u0010\f\u0010\u00ef\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fd"+
		"\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011b\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0126\b\u0013\n\u0013"+
		"\f\u0013\u0129\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0137\b\u0014\n\u0014\f\u0014\u013a"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0143\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0158"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u015c\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0166\b\u0018\u0001\u0018\u0000\u0003\"&(\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u0011\u0015\u0189\u0000"+
		"5\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004J\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000"+
		"\u0000\nc\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008c\u0001"+
		"\u0000\u0000\u0000\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00c0\u0001"+
		"\u0000\u0000\u0000\u0018\u00cb\u0001\u0000\u0000\u0000\u001a\u00cd\u0001"+
		"\u0000\u0000\u0000\u001c\u00e2\u0001\u0000\u0000\u0000\u001e\u00e4\u0001"+
		"\u0000\u0000\u0000 \u00e8\u0001\u0000\u0000\u0000\"\u00f4\u0001\u0000"+
		"\u0000\u0000$\u011a\u0001\u0000\u0000\u0000&\u011c\u0001\u0000\u0000\u0000"+
		"(\u012a\u0001\u0000\u0000\u0000*\u0142\u0001\u0000\u0000\u0000,\u0157"+
		"\u0001\u0000\u0000\u0000.\u015b\u0001\u0000\u0000\u00000\u0165\u0001\u0000"+
		"\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0000\u0000"+
		"\u00019\u0001\u0001\u0000\u0000\u0000:?\u0003\u0004\u0002\u0000;?\u0003"+
		"\u0006\u0003\u0000<?\u0003\u001a\r\u0000=?\u0003\u0014\n\u0000>:\u0001"+
		"\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0003\u0012"+
		"\t\u0000AB\u00057\u0000\u0000BC\u0005\u0001\u0000\u0000CK\u0001\u0000"+
		"\u0000\u0000DE\u0003\u0012\t\u0000EF\u00057\u0000\u0000FG\u0005\u0002"+
		"\u0000\u0000GH\u0003\u000e\u0007\u0000HI\u0005\u0001\u0000\u0000IK\u0001"+
		"\u0000\u0000\u0000J@\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000"+
		"K\u0005\u0001\u0000\u0000\u0000LM\u0003\u0012\t\u0000MN\u00057\u0000\u0000"+
		"NO\u0005\u0003\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\u0004\u0000\u0000"+
		"QR\u0003\f\u0006\u0000R\u0007\u0001\u0000\u0000\u0000SX\u0003\n\u0005"+
		"\u0000TU\u0005\u0005\u0000\u0000UW\u0003\n\u0005\u0000VT\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003"+
		"\u0012\t\u0000\\]\u00057\u0000\u0000]d\u0001\u0000\u0000\u0000^_\u0003"+
		"\u0012\t\u0000_`\u00057\u0000\u0000`a\u0005\u0006\u0000\u0000ab\u0005"+
		"\u0007\u0000\u0000bd\u0001\u0000\u0000\u0000c[\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ei\u0005\b\u0000"+
		"\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\t\u0000\u0000m\r"+
		"\u0001\u0000\u0000\u0000nq\u0003\u0010\b\u0000oq\u0003\"\u0011\u0000p"+
		"n\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u000f\u0001\u0000"+
		"\u0000\u0000rs\u00057\u0000\u0000st\u0005\u0002\u0000\u0000t\u008b\u0003"+
		"\u000e\u0007\u0000uv\u00057\u0000\u0000vw\u0005\n\u0000\u0000w\u008b\u0003"+
		"\u000e\u0007\u0000xy\u00057\u0000\u0000yz\u0005\u000b\u0000\u0000z\u008b"+
		"\u0003\u000e\u0007\u0000{|\u00057\u0000\u0000|}\u0005\f\u0000\u0000}\u008b"+
		"\u0003\u000e\u0007\u0000~\u007f\u00057\u0000\u0000\u007f\u0080\u0005\r"+
		"\u0000\u0000\u0080\u008b\u0003\u000e\u0007\u0000\u0081\u0082\u00057\u0000"+
		"\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u008b\u0003\u000e\u0007"+
		"\u0000\u0084\u0085\u00057\u0000\u0000\u0085\u0086\u0005\u000f\u0000\u0000"+
		"\u0086\u008b\u0003\u000e\u0007\u0000\u0087\u0088\u00057\u0000\u0000\u0088"+
		"\u0089\u0005\u0010\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a"+
		"r\u0001\u0000\u0000\u0000\u008au\u0001\u0000\u0000\u0000\u008ax\u0001"+
		"\u0000\u0000\u0000\u008a{\u0001\u0000\u0000\u0000\u008a~\u0001\u0000\u0000"+
		"\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0007\u0000\u0000\u0000\u008d\u0013\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u0091\u0003\u000e\u0007\u0000\u0091\u0092\u0005\u0004\u0000"+
		"\u0000\u0092\u0095\u0003\f\u0006\u0000\u0093\u0094\u0005\u0017\u0000\u0000"+
		"\u0094\u0096\u0003\f\u0006\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u00bc\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0018\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099"+
		"\u009a\u0003\u000e\u0007\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u009c\u0003\f\u0006\u0000\u009c\u00bc\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0019\u0000\u0000\u009e\u00a0\u0005\u0003\u0000\u0000\u009f\u00a1"+
		"\u0003\u000e\u0007\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0005\u0001\u0000\u0000\u00a3\u00a5\u0003\u000e\u0007\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0001\u0000\u0000\u00a7\u00a9"+
		"\u0003\u000e\u0007\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0004\u0000\u0000\u00ab\u00bc\u0003\f\u0006\u0000\u00ac\u00ad\u0005"+
		"\u001a\u0000\u0000\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00af\u0003"+
		"\u000e\u0007\u0000\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u00b1\u0003"+
		"\u0016\u000b\u0000\u00b1\u00bc\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001b\u0000\u0000\u00b3\u00bc\u0005\u0001\u0000\u0000\u00b4\u00b5\u0005"+
		"\u001c\u0000\u0000\u00b5\u00bc\u0005\u0001\u0000\u0000\u00b6\u00b8\u0005"+
		"\u001d\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bc\u0005\u0001\u0000\u0000\u00bb\u008e\u0001"+
		"\u0000\u0000\u0000\u00bb\u0097\u0001\u0000\u0000\u0000\u00bb\u009d\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003"+
		"\u0018\f\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u0017\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4\u00c5\u0003\u000e"+
		"\u0007\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6\u00c7\u0003\f\u0006"+
		"\u0000\u00c7\u00cc\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000"+
		"\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u00cc\u0003\f\u0006\u0000\u00cb"+
		"\u00c3\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc"+
		"\u0019\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf"+
		"\u00057\u0000\u0000\u00cf\u00d3\u0005\b\u0000\u0000\u00d0\u00d2\u0003"+
		"\u0004\u0002\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u00d8\u0005\u0001"+
		"\u0000\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\u00d9\u00da\u00057\u0000"+
		"\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db\u00dc\u0003\u000e\u0007"+
		"\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00e3\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u00057\u0000\u0000\u00df\u00e0\u0005\u0006\u0000\u0000"+
		"\u00e0\u00e3\u0005\u0007\u0000\u0000\u00e1\u00e3\u0003\u001e\u000f\u0000"+
		"\u00e2\u00d9\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u001d\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005\b\u0000\u0000\u00e5\u00e6\u0003 \u0010\u0000\u00e6"+
		"\u00e7\u0005\t\u0000\u0000\u00e7\u001f\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u0003\u000e\u0007\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea\u00ec"+
		"\u0003\u000e\u0007\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0006\u0011\uffff\uffff\u0000\u00f1\u00f5"+
		"\u0003$\u0012\u0000\u00f2\u00f3\u0005$\u0000\u0000\u00f3\u00f5\u0003$"+
		"\u0012\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00fe\u0001\u0000\u0000\u0000\u00f6\u00f7\n\u0003\u0000"+
		"\u0000\u00f7\u00f8\u0005\"\u0000\u0000\u00f8\u00fd\u0003$\u0012\u0000"+
		"\u00f9\u00fa\n\u0002\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb"+
		"\u00fd\u0003$\u0012\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff#\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u011b\u0003"+
		"&\u0013\u0000\u0102\u0103\u0003&\u0013\u0000\u0103\u0104\u0005%\u0000"+
		"\u0000\u0104\u0105\u0003&\u0013\u0000\u0105\u011b\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0003&\u0013\u0000\u0107\u0108\u0005&\u0000\u0000\u0108\u0109"+
		"\u0003&\u0013\u0000\u0109\u011b\u0001\u0000\u0000\u0000\u010a\u010b\u0003"+
		"&\u0013\u0000\u010b\u010c\u0005\'\u0000\u0000\u010c\u010d\u0003&\u0013"+
		"\u0000\u010d\u011b\u0001\u0000\u0000\u0000\u010e\u010f\u0003&\u0013\u0000"+
		"\u010f\u0110\u0005(\u0000\u0000\u0110\u0111\u0003&\u0013\u0000\u0111\u011b"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0003&\u0013\u0000\u0113\u0114\u0005"+
		")\u0000\u0000\u0114\u0115\u0003&\u0013\u0000\u0115\u011b\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0003&\u0013\u0000\u0117\u0118\u0005*\u0000\u0000\u0118"+
		"\u0119\u0003&\u0013\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0101"+
		"\u0001\u0000\u0000\u0000\u011a\u0102\u0001\u0000\u0000\u0000\u011a\u0106"+
		"\u0001\u0000\u0000\u0000\u011a\u010a\u0001\u0000\u0000\u0000\u011a\u010e"+
		"\u0001\u0000\u0000\u0000\u011a\u0112\u0001\u0000\u0000\u0000\u011a\u0116"+
		"\u0001\u0000\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011d\u0006"+
		"\u0013\uffff\uffff\u0000\u011d\u011e\u0003(\u0014\u0000\u011e\u0127\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\n\u0002\u0000\u0000\u0120\u0121\u0005+"+
		"\u0000\u0000\u0121\u0126\u0003(\u0014\u0000\u0122\u0123\n\u0001\u0000"+
		"\u0000\u0123\u0124\u0005,\u0000\u0000\u0124\u0126\u0003(\u0014\u0000\u0125"+
		"\u011f\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\'\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0006\u0014\uffff\uffff\u0000\u012b"+
		"\u012c\u0003*\u0015\u0000\u012c\u0138\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\n\u0003\u0000\u0000\u012e\u012f\u0005-\u0000\u0000\u012f\u0137\u0003"+
		"*\u0015\u0000\u0130\u0131\n\u0002\u0000\u0000\u0131\u0132\u0005.\u0000"+
		"\u0000\u0132\u0137\u0003*\u0015\u0000\u0133\u0134\n\u0001\u0000\u0000"+
		"\u0134\u0135\u0005/\u0000\u0000\u0135\u0137\u0003*\u0015\u0000\u0136\u012d"+
		"\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000\u0000\u0136\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139)\u0001"+
		"\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u0143\u0003"+
		",\u0016\u0000\u013c\u013d\u0005,\u0000\u0000\u013d\u0143\u0003*\u0015"+
		"\u0000\u013e\u013f\u00050\u0000\u0000\u013f\u0143\u0003,\u0016\u0000\u0140"+
		"\u0141\u00051\u0000\u0000\u0141\u0143\u0003,\u0016\u0000\u0142\u013b\u0001"+
		"\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142\u013e\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143+\u0001\u0000"+
		"\u0000\u0000\u0144\u0158\u00030\u0018\u0000\u0145\u0146\u00030\u0018\u0000"+
		"\u0146\u0147\u0005\u0006\u0000\u0000\u0147\u0148\u0003\u000e\u0007\u0000"+
		"\u0148\u0149\u0005\u0007\u0000\u0000\u0149\u0158\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u00030\u0018\u0000\u014b\u014c\u0005\u0003\u0000\u0000\u014c"+
		"\u014d\u0003.\u0017\u0000\u014d\u014e\u0005\u0004\u0000\u0000\u014e\u0158"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u00030\u0018\u0000\u0150\u0151\u0005"+
		"2\u0000\u0000\u0151\u0152\u00057\u0000\u0000\u0152\u0158\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u00030\u0018\u0000\u0154\u0155\u00053\u0000\u0000\u0155"+
		"\u0156\u00057\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0144"+
		"\u0001\u0000\u0000\u0000\u0157\u0145\u0001\u0000\u0000\u0000\u0157\u014a"+
		"\u0001\u0000\u0000\u0000\u0157\u014f\u0001\u0000\u0000\u0000\u0157\u0153"+
		"\u0001\u0000\u0000\u0000\u0158-\u0001\u0000\u0000\u0000\u0159\u015c\u0003"+
		" \u0010\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c/\u0001\u0000\u0000"+
		"\u0000\u015d\u0166\u00057\u0000\u0000\u015e\u0166\u00054\u0000\u0000\u015f"+
		"\u0166\u00055\u0000\u0000\u0160\u0166\u00056\u0000\u0000\u0161\u0162\u0005"+
		"\u0003\u0000\u0000\u0162\u0163\u0003\u000e\u0007\u0000\u0163\u0164\u0005"+
		"\u0004\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015d\u0001"+
		"\u0000\u0000\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165\u015f\u0001"+
		"\u0000\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0161\u0001"+
		"\u0000\u0000\u0000\u01661\u0001\u0000\u0000\u0000\u001f5>JXcip\u008a\u0095"+
		"\u00a0\u00a4\u00a8\u00b8\u00bb\u00c0\u00cb\u00d3\u00e2\u00ed\u00f4\u00fc"+
		"\u00fe\u011a\u0125\u0127\u0136\u0138\u0142\u0157\u015b\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}