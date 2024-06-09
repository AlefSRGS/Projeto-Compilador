// Generated from c:/Users/Alef_PC/Documents/repositorio_github/Projeto-Compilador/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ID=21, INT=22, BOOL=23, FLOAT=24, DOUBLE=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "ID", "INT", "BOOL", "FLOAT", "DOUBLE", "WS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\u0004\u0000\u001a\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014s\b\u0014\u000b\u0014\f\u0014t\u0001\u0015\u0004\u0015"+
		"x\b\u0015\u000b\u0015\f\u0015y\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0085\b\u0016\u0001\u0017\u0004\u0017\u0088\b\u0017\u000b\u0017"+
		"\f\u0017\u0089\u0001\u0017\u0001\u0017\u0004\u0017\u008e\b\u0017\u000b"+
		"\u0017\f\u0017\u008f\u0001\u0018\u0004\u0018\u0093\b\u0018\u000b\u0018"+
		"\f\u0018\u0094\u0001\u0018\u0001\u0018\u0004\u0018\u0099\b\u0018\u000b"+
		"\u0018\f\u0018\u009a\u0003\u0018\u009d\b\u0018\u0001\u0019\u0004\u0019"+
		"\u00a0\b\u0019\u000b\u0019\f\u0019\u00a1\u0001\u0019\u0001\u0019\u0000"+
		"\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a\u0001\u0000\u0003\u0003\u000009AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000"+
		"\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007"+
		"=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000"+
		"\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000"+
		"\u0011G\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015M"+
		"\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000"+
		"\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000"+
		"\u001fY\u0001\u0000\u0000\u0000![\u0001\u0000\u0000\u0000#_\u0001\u0000"+
		"\u0000\u0000%d\u0001\u0000\u0000\u0000\'j\u0001\u0000\u0000\u0000)r\u0001"+
		"\u0000\u0000\u0000+w\u0001\u0000\u0000\u0000-\u0084\u0001\u0000\u0000"+
		"\u0000/\u0087\u0001\u0000\u0000\u00001\u0092\u0001\u0000\u0000\u00003"+
		"\u009f\u0001\u0000\u0000\u000056\u0005v\u0000\u000067\u0005a\u0000\u0000"+
		"78\u0005r\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005=\u0000\u0000"+
		":\u0004\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005*\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005/"+
		"\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005+\u0000\u0000B\f\u0001"+
		"\u0000\u0000\u0000CD\u0005-\u0000\u0000D\u000e\u0001\u0000\u0000\u0000"+
		"EF\u0005%\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005=\u0000\u0000"+
		"HI\u0005=\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005!\u0000\u0000"+
		"KL\u0005=\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005<\u0000\u0000"+
		"N\u0016\u0001\u0000\u0000\u0000OP\u0005>\u0000\u0000P\u0018\u0001\u0000"+
		"\u0000\u0000QR\u0005<\u0000\u0000RS\u0005=\u0000\u0000S\u001a\u0001\u0000"+
		"\u0000\u0000TU\u0005>\u0000\u0000UV\u0005=\u0000\u0000V\u001c\u0001\u0000"+
		"\u0000\u0000WX\u0005(\u0000\u0000X\u001e\u0001\u0000\u0000\u0000YZ\u0005"+
		")\u0000\u0000Z \u0001\u0000\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005"+
		"n\u0000\u0000]^\u0005t\u0000\u0000^\"\u0001\u0000\u0000\u0000_`\u0005"+
		"b\u0000\u0000`a\u0005o\u0000\u0000ab\u0005o\u0000\u0000bc\u0005l\u0000"+
		"\u0000c$\u0001\u0000\u0000\u0000de\u0005f\u0000\u0000ef\u0005l\u0000\u0000"+
		"fg\u0005o\u0000\u0000gh\u0005a\u0000\u0000hi\u0005t\u0000\u0000i&\u0001"+
		"\u0000\u0000\u0000jk\u0005d\u0000\u0000kl\u0005o\u0000\u0000lm\u0005u"+
		"\u0000\u0000mn\u0005b\u0000\u0000no\u0005l\u0000\u0000op\u0005e\u0000"+
		"\u0000p(\u0001\u0000\u0000\u0000qs\u0007\u0000\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u*\u0001\u0000\u0000\u0000vx\u0007\u0001\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z,\u0001\u0000\u0000\u0000{|\u0005t\u0000"+
		"\u0000|}\u0005r\u0000\u0000}~\u0005u\u0000\u0000~\u0085\u0005e\u0000\u0000"+
		"\u007f\u0080\u0005f\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0082"+
		"\u0005l\u0000\u0000\u0082\u0083\u0005s\u0000\u0000\u0083\u0085\u0005e"+
		"\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000"+
		"\u0000\u0085.\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0001\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0005.\u0000\u0000\u008c"+
		"\u008e\u0007\u0001\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u00900\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0007\u0001\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u009c\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0005.\u0000\u0000\u0097\u0099\u0007\u0001\u0000\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d2\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0002"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0019"+
		"\u0000\u0000\u00a44\u0001\u0000\u0000\u0000\n\u0000ty\u0084\u0089\u008f"+
		"\u0094\u009a\u009c\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}