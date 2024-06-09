// Generated from gramatica.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, T__19=20, ID=21, INT=22, BOOL=23, FLOAT=24, DOUBLE=25, 
		WS=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_expressionStatement = 3, 
		RULE_expression = 4, RULE_operatorAritmetic = 5, RULE_operatorLogic = 6, 
		RULE_term = 7, RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "expressionStatement", 
			"expression", "operatorAritmetic", "operatorLogic", "term", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "'*'", "'/'", "'+'", "'-'", "'%'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'('", "')'", "'int'", "'bool'", 
			"'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "INT", "BOOL", 
			"FLOAT", "DOUBLE", "WS"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65044482L) != 0) );
			setState(23);
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				variableDeclaration();
				}
				break;
			case T__14:
			case ID:
			case INT:
			case BOOL:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				expressionStatement();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			type();
			setState(31);
			match(ID);
			setState(32);
			match(T__1);
			setState(33);
			expression();
			setState(34);
			match(T__2);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			expression();
			setState(37);
			match(T__2);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<OperatorLogicContext> operatorLogic() {
			return getRuleContexts(OperatorLogicContext.class);
		}
		public OperatorLogicContext operatorLogic(int i) {
			return getRuleContext(OperatorLogicContext.class,i);
		}
		public List<OperatorAritmeticContext> operatorAritmetic() {
			return getRuleContexts(OperatorAritmeticContext.class);
		}
		public OperatorAritmeticContext operatorAritmetic(int i) {
			return getRuleContext(OperatorAritmeticContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				term();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) {
					{
					{
					setState(41);
					operatorLogic();
					setState(42);
					term();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				term();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
					{
					{
					setState(50);
					operatorAritmetic();
					setState(51);
					term();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class OperatorAritmeticContext extends ParserRuleContext {
		public OperatorAritmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAritmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperatorAritmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperatorAritmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperatorAritmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAritmeticContext operatorAritmetic() throws RecognitionException {
		OperatorAritmeticContext _localctx = new OperatorAritmeticContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operatorAritmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) ) {
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
	public static class OperatorLogicContext extends ParserRuleContext {
		public OperatorLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperatorLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperatorLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperatorLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorLogicContext operatorLogic() throws RecognitionException {
		OperatorLogicContext _localctx = new OperatorLogicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operatorLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(gramaticaParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(BOOL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(ID);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(T__14);
				setState(70);
				expression();
				setState(71);
				match(T__15);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001aN\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004-\b\u0004\n\u0004\f\u0004"+
		"0\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"6\b\u0004\n\u0004\f\u00049\t\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007J\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000\u0004\b\u0001\u0000\t"+
		"\u000e\u0001\u0000\u0011\u0014O\u0000\u0013\u0001\u0000\u0000\u0000\u0002"+
		"\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\f>\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"K\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0003\u0004\u0002\u0000\u001a\u001c"+
		"\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0001\u0000\u0000\u001e\u001f\u0003\u0010\b\u0000\u001f \u0005"+
		"\u0015\u0000\u0000 !\u0005\u0002\u0000\u0000!\"\u0003\b\u0004\u0000\""+
		"#\u0005\u0003\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0003\b\u0004"+
		"\u0000%&\u0005\u0003\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\';\u0003"+
		"\u000e\u0007\u0000(.\u0003\u000e\u0007\u0000)*\u0003\f\u0006\u0000*+\u0003"+
		"\u000e\u0007\u0000+-\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/;\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000017\u0003\u000e"+
		"\u0007\u000023\u0003\n\u0005\u000034\u0003\u000e\u0007\u000046\u0001\u0000"+
		"\u0000\u000052\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:\'\u0001\u0000\u0000\u0000:(\u0001\u0000\u0000"+
		"\u0000:1\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0007\u0000"+
		"\u0000\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000\u0000"+
		"?\r\u0001\u0000\u0000\u0000@J\u0005\u0016\u0000\u0000AJ\u0005\u0017\u0000"+
		"\u0000BJ\u0005\u0018\u0000\u0000CJ\u0005\u0019\u0000\u0000DJ\u0005\u0015"+
		"\u0000\u0000EF\u0005\u000f\u0000\u0000FG\u0003\b\u0004\u0000GH\u0005\u0010"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IA\u0001"+
		"\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000J\u000f\u0001\u0000"+
		"\u0000\u0000KL\u0007\u0002\u0000\u0000L\u0011\u0001\u0000\u0000\u0000"+
		"\u0006\u0015\u001b.7:I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}