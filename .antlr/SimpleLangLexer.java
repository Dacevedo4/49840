// Generated from c:/Users/HP/OneDrive/Documentos/Mis Proyectos/ssl-antlr-calculator/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, COLON=5, EQ=6, SEMI=7, DOT=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, SWITCH=13, CASE=14, DEFAULT=15, CONSOLE=16, 
		LOG=17, StringLiteral=18, Identifier=19, Number=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COLON", "EQ", "SEMI", "DOT", 
			"PLUS", "MINUS", "MULT", "DIV", "SWITCH", "CASE", "DEFAULT", "CONSOLE", 
			"LOG", "StringLiteral", "Identifier", "Number", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "'='", "';'", "'.'", "'+'", 
			"'-'", "'*'", "'/'", "'switch'", "'case'", "'default'", "'console'", 
			"'log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COLON", "EQ", "SEMI", 
			"DOT", "PLUS", "MINUS", "MULT", "DIV", "SWITCH", "CASE", "DEFAULT", "CONSOLE", 
			"LOG", "StringLiteral", "Identifier", "Number", "WS"
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


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

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
		"\u0004\u0000\u0015\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011h\b\u0011\n\u0011\f\u0011k\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0005\u0012q\b\u0012\n\u0012\f\u0012t\t\u0012"+
		"\u0001\u0013\u0004\u0013w\b\u0013\u000b\u0013\f\u0013x\u0001\u0014\u0004"+
		"\u0014|\b\u0014\u000b\u0014\f\u0014}\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0005\u0002\u0000\"\"\\\\\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-"+
		"\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000"+
		"\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000"+
		"\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011;\u0001"+
		"\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?\u0001\u0000\u0000"+
		"\u0000\u0017A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001b"+
		"J\u0001\u0000\u0000\u0000\u001dO\u0001\u0000\u0000\u0000\u001fW\u0001"+
		"\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000"+
		"%n\u0001\u0000\u0000\u0000\'v\u0001\u0000\u0000\u0000){\u0001\u0000\u0000"+
		"\u0000+,\u0005(\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005)\u0000"+
		"\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005{\u0000\u00000\u0006\u0001"+
		"\u0000\u0000\u000012\u0005}\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005"+
		":\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005=\u0000\u00006\f\u0001"+
		"\u0000\u0000\u000078\u0005;\u0000\u00008\u000e\u0001\u0000\u0000\u0000"+
		"9:\u0005.\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000"+
		"<\u0012\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0014\u0001\u0000"+
		"\u0000\u0000?@\u0005*\u0000\u0000@\u0016\u0001\u0000\u0000\u0000AB\u0005"+
		"/\u0000\u0000B\u0018\u0001\u0000\u0000\u0000CD\u0005s\u0000\u0000DE\u0005"+
		"w\u0000\u0000EF\u0005i\u0000\u0000FG\u0005t\u0000\u0000GH\u0005c\u0000"+
		"\u0000HI\u0005h\u0000\u0000I\u001a\u0001\u0000\u0000\u0000JK\u0005c\u0000"+
		"\u0000KL\u0005a\u0000\u0000LM\u0005s\u0000\u0000MN\u0005e\u0000\u0000"+
		"N\u001c\u0001\u0000\u0000\u0000OP\u0005d\u0000\u0000PQ\u0005e\u0000\u0000"+
		"QR\u0005f\u0000\u0000RS\u0005a\u0000\u0000ST\u0005u\u0000\u0000TU\u0005"+
		"l\u0000\u0000UV\u0005t\u0000\u0000V\u001e\u0001\u0000\u0000\u0000WX\u0005"+
		"c\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005s\u0000"+
		"\u0000[\\\u0005o\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005e\u0000\u0000"+
		"^ \u0001\u0000\u0000\u0000_`\u0005l\u0000\u0000`a\u0005o\u0000\u0000a"+
		"b\u0005g\u0000\u0000b\"\u0001\u0000\u0000\u0000ci\u0005\"\u0000\u0000"+
		"dh\b\u0000\u0000\u0000ef\u0005\\\u0000\u0000fh\t\u0000\u0000\u0000gd\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000m$\u0001\u0000\u0000"+
		"\u0000nr\u0007\u0001\u0000\u0000oq\u0007\u0002\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s&\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uw\u0007\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y(\u0001\u0000"+
		"\u0000\u0000z|\u0007\u0004\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0014\u0000\u0000\u0080"+
		"*\u0001\u0000\u0000\u0000\u0006\u0000girx}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}