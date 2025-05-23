// Generated from Lenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CADENA=6, NUMERO=7, SEGUN=8, HACER=9, 
		CASO=10, DEFECTO=11, FINSGUN=12, IMPRIMIR=13, SALIR=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "CADENA", "NUMERO", "LETRA", 
			"DIGITO", "SIMBOLO", "SEGUN", "HACER", "CASO", "DEFECTO", "FINSGUN", 
			"IMPRIMIR", "SALIR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'('", "')'", null, null, "'segun'", "'hacer'", 
			"'caso'", "'defecto'", "'finsgun'", "'imprimir'", "'salir'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CADENA", "NUMERO", "SEGUN", "HACER", 
			"CASO", "DEFECTO", "FINSGUN", "IMPRIMIR", "SALIR", "WS"
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


	public LenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

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
		"\u0004\u0000\u000f|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u00054\b\u0005\n\u0005\f\u00057\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0004\u0006<\b\u0006\u000b\u0006\f\u0006"+
		"=\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004"+
		"\u0011w\b\u0011\u000b\u0011\f\u0011x\u0001\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\u0000\u0011\u0000\u0013\u0000\u0015\b\u0017\t\u0019\n\u001b"+
		"\u000b\u001d\f\u001f\r!\u000e#\u000f\u0001\u0000\u0004\u0002\u0000AZa"+
		"z\u0001\u000009\b\u0000!!#&*/:@__~~\u00a1\u00a1\u00bf\u00bf\u0003\u0000"+
		"\t\n\r\r  }\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001"+
		"\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000"+
		"\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r;\u0001"+
		"\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000"+
		"\u0000\u0013C\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017"+
		"K\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bV\u0001"+
		"\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000"+
		"\u0000!o\u0001\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%&\u0005{\u0000"+
		"\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005}\u0000\u0000(\u0004\u0001"+
		"\u0000\u0000\u0000)*\u0005:\u0000\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+,\u0005(\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000"+
		".\n\u0001\u0000\u0000\u0000/5\u0005\"\u0000\u000004\u0003\u000f\u0007"+
		"\u000014\u0003\u0011\b\u000024\u0003\u0013\t\u000030\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\"\u0000\u00009\f"+
		"\u0001\u0000\u0000\u0000:<\u0003\u0011\b\u0000;:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000@\u0010"+
		"\u0001\u0000\u0000\u0000AB\u0007\u0001\u0000\u0000B\u0012\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0002\u0000\u0000D\u0014\u0001\u0000\u0000\u0000"+
		"EF\u0005s\u0000\u0000FG\u0005e\u0000\u0000GH\u0005g\u0000\u0000HI\u0005"+
		"u\u0000\u0000IJ\u0005n\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005"+
		"h\u0000\u0000LM\u0005a\u0000\u0000MN\u0005c\u0000\u0000NO\u0005e\u0000"+
		"\u0000OP\u0005r\u0000\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0005c\u0000"+
		"\u0000RS\u0005a\u0000\u0000ST\u0005s\u0000\u0000TU\u0005o\u0000\u0000"+
		"U\u001a\u0001\u0000\u0000\u0000VW\u0005d\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005f\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005"+
		"t\u0000\u0000\\]\u0005o\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005"+
		"f\u0000\u0000_`\u0005i\u0000\u0000`a\u0005n\u0000\u0000ab\u0005s\u0000"+
		"\u0000bc\u0005g\u0000\u0000cd\u0005u\u0000\u0000de\u0005n\u0000\u0000"+
		"e\u001e\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000gh\u0005m\u0000\u0000"+
		"hi\u0005p\u0000\u0000ij\u0005r\u0000\u0000jk\u0005i\u0000\u0000kl\u0005"+
		"m\u0000\u0000lm\u0005i\u0000\u0000mn\u0005r\u0000\u0000n \u0001\u0000"+
		"\u0000\u0000op\u0005s\u0000\u0000pq\u0005a\u0000\u0000qr\u0005l\u0000"+
		"\u0000rs\u0005i\u0000\u0000st\u0005r\u0000\u0000t\"\u0001\u0000\u0000"+
		"\u0000uw\u0007\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0006\u0011\u0000\u0000{$\u0001\u0000\u0000\u0000"+
		"\u0005\u000035=x\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}