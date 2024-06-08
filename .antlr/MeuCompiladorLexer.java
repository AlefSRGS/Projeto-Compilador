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
public class MeuCompiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, INT=19, FLOAT=20, CHAR=21;
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
			"ID", "INT", "FLOAT", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
			"'for'", "'int'", "'float'", "'char'", "'>'", "'<'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT", "FLOAT", "CHAR"
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


	public MeuCompiladorLexer(CharStream input) {
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
		"\u0004\u0000\u0015{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011d\b\u0011\u000b\u0011\f\u0011e\u0001\u0012\u0004\u0012"+
		"i\b\u0012\u000b\u0012\f\u0012j\u0001\u0013\u0004\u0013n\b\u0013\u000b"+
		"\u0013\f\u0013o\u0001\u0013\u0001\u0013\u0004\u0013t\b\u0013\u000b\u0013"+
		"\f\u0013u\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0002\u0002\u0000AZaz\u0001\u000009~\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00072\u0001"+
		"\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000"+
		"\u0000\r8\u0001\u0000\u0000\u0000\u000f:\u0001\u0000\u0000\u0000\u0011"+
		"?\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015I\u0001"+
		"\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000"+
		"\u0000\u001bX\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000\u001f"+
		"\\\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000"+
		"\u0000%h\u0001\u0000\u0000\u0000\'m\u0001\u0000\u0000\u0000)w\u0001\u0000"+
		"\u0000\u0000+,\u0005=\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005"+
		";\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005i\u0000\u000001\u0005"+
		"f\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005(\u0000\u00003\b\u0001"+
		"\u0000\u0000\u000045\u0005)\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005"+
		"{\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005}\u0000\u00009\u000e\u0001"+
		"\u0000\u0000\u0000:;\u0005e\u0000\u0000;<\u0005l\u0000\u0000<=\u0005s"+
		"\u0000\u0000=>\u0005e\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005"+
		"w\u0000\u0000@A\u0005h\u0000\u0000AB\u0005i\u0000\u0000BC\u0005l\u0000"+
		"\u0000CD\u0005e\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005f\u0000"+
		"\u0000FG\u0005o\u0000\u0000GH\u0005r\u0000\u0000H\u0014\u0001\u0000\u0000"+
		"\u0000IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000KL\u0005t\u0000\u0000"+
		"L\u0016\u0001\u0000\u0000\u0000MN\u0005f\u0000\u0000NO\u0005l\u0000\u0000"+
		"OP\u0005o\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005t\u0000\u0000R\u0018"+
		"\u0001\u0000\u0000\u0000ST\u0005c\u0000\u0000TU\u0005h\u0000\u0000UV\u0005"+
		"a\u0000\u0000VW\u0005r\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005"+
		">\u0000\u0000Y\u001c\u0001\u0000\u0000\u0000Z[\u0005<\u0000\u0000[\u001e"+
		"\u0001\u0000\u0000\u0000\\]\u0005=\u0000\u0000]^\u0005=\u0000\u0000^ "+
		"\u0001\u0000\u0000\u0000_`\u0005!\u0000\u0000`a\u0005=\u0000\u0000a\""+
		"\u0001\u0000\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f$\u0001\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k&\u0001\u0000\u0000\u0000ln\u0007\u0001\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005"+
		".\u0000\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v(\u0001\u0000\u0000\u0000wx\u0005\'\u0000\u0000xy\t\u0000\u0000\u0000"+
		"yz\u0005\'\u0000\u0000z*\u0001\u0000\u0000\u0000\u0005\u0000ejou\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}