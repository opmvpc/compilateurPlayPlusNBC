// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, MAIN=2, IF=3, ELSE=4, THEN=5, REPEAT=6, WHILE=7, TRUE=8, FALSE=9, 
		IMPORT=10, LEFT=11, RIGHT=12, UP=13, DOWN=14, JUMP=15, FIGHT=16, DIG=17, 
		BOOL=18, INT=19, CHAR=20, STRUCT=21, CONST=22, ENUM=23, TYPEDEF=24, NATUREL=25, 
		FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, DIV=32, MOD=33, 
		POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, GREATER=40, 
		EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, 
		LBRACKET=47, RBRACKET=48, SINGLEQUOTE=49, BACKSLASH=50, SEMICOLON=51, 
		COLON=52, COMMA=53, DOT=54, AND=55, OR=56, COMMENTAIRES=57, BLOCK_COMMENT=58, 
		LINE_COMMENT=59, NEWLINE=60, WS=61, MAPSTART=62, HASHTAG=63, RETURN=64, 
		MAP=65, ROBOT=66, TRESOR=67, PELOUSE=68, PALMIER=69, PONT=70, BUISSON=71, 
		TONNEAU=72, PUIT=73, VIDE=74, SQUELLETTE=75, ID=76;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOID", "MAIN", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", 
		"IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", 
		"INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "FILE", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", 
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "COMMENTAIRES", 
		"BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "MAPSTART", "HASHTAG", 
		"RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", "PALMIER", "PONT", "BUISSON", 
		"TONNEAU", "PUIT", "VIDE", "SQUELLETTE", "ID", "DOUBLEQUOTE", "LETTRE", 
		"LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'main('", "'if'", "'else'", "'then'", "'repeat'", "'while'", 
		"'true'", "'false'", "'import'", "'left'", "'right'", "'up'", "'down'", 
		"'jump'", "'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", 
		"'const'", "'enum'", "'typedef'", null, null, null, null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", 
		"'>='", "'<='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", 
		"';'", "':'", "','", "'.'", "'&&'", "'||'", null, null, null, null, null, 
		null, "'#'", "'return'", null, "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", 
		"'T'", "'S'", "'_'", "'Q'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "MAIN", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", 
		"FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"BOOL", "INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", 
		"FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
		"EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", 
		"ESMALLER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", 
		"MAPSTART", "HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", 
		"PALMIER", "PONT", "BUISSON", "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", 
		"ID"
	};
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u01f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u0128\n\32\r\32\16\32\u0129\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\6\34\u0137\n\34\r\34\16\34\u0138"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0145\n\35\f\35"+
		"\16\35\u0148\13\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\5:\u018c\n:"+
		"\3:\3:\3;\3;\3;\7;\u0193\n;\f;\16;\u0196\13;\3;\3;\3;\3;\3;\3<\3<\3<\7"+
		"<\u01a0\n<\f<\16<\u01a3\13<\3<\3<\3=\5=\u01a8\n=\3=\3=\3=\3=\3>\6>\u01af"+
		"\n>\r>\16>\u01b0\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3M\3M\3M\7M\u01e0\nM\fM\16M\u01e3\13M\3N\3N\3O\3O\5O\u01e9\nO\3P"+
		"\3P\3Q\3Q\3R\3R\3\u0194\2S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\3\2\5\7\2\f\f\17\17$$..^^\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\u01fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u00a5\3\2\2\2\5\u00aa"+
		"\3\2\2\2\7\u00b0\3\2\2\2\t\u00b3\3\2\2\2\13\u00b8\3\2\2\2\r\u00bd\3\2"+
		"\2\2\17\u00c4\3\2\2\2\21\u00ca\3\2\2\2\23\u00cf\3\2\2\2\25\u00d5\3\2\2"+
		"\2\27\u00dc\3\2\2\2\31\u00e1\3\2\2\2\33\u00e7\3\2\2\2\35\u00ea\3\2\2\2"+
		"\37\u00ef\3\2\2\2!\u00f4\3\2\2\2#\u00fa\3\2\2\2%\u00fe\3\2\2\2\'\u0103"+
		"\3\2\2\2)\u0107\3\2\2\2+\u010c\3\2\2\2-\u0113\3\2\2\2/\u0119\3\2\2\2\61"+
		"\u011e\3\2\2\2\63\u0127\3\2\2\2\65\u012b\3\2\2\2\67\u0134\3\2\2\29\u013c"+
		"\3\2\2\2;\u014b\3\2\2\2=\u014d\3\2\2\2?\u014f\3\2\2\2A\u0151\3\2\2\2C"+
		"\u0153\3\2\2\2E\u0155\3\2\2\2G\u0157\3\2\2\2I\u015a\3\2\2\2K\u015c\3\2"+
		"\2\2M\u015e\3\2\2\2O\u0161\3\2\2\2Q\u0163\3\2\2\2S\u0165\3\2\2\2U\u0168"+
		"\3\2\2\2W\u016b\3\2\2\2Y\u016d\3\2\2\2[\u016f\3\2\2\2]\u0171\3\2\2\2_"+
		"\u0173\3\2\2\2a\u0175\3\2\2\2c\u0177\3\2\2\2e\u0179\3\2\2\2g\u017b\3\2"+
		"\2\2i\u017d\3\2\2\2k\u017f\3\2\2\2m\u0181\3\2\2\2o\u0183\3\2\2\2q\u0186"+
		"\3\2\2\2s\u018b\3\2\2\2u\u018f\3\2\2\2w\u019c\3\2\2\2y\u01a7\3\2\2\2{"+
		"\u01ae\3\2\2\2}\u01b4\3\2\2\2\177\u01ba\3\2\2\2\u0081\u01bc\3\2\2\2\u0083"+
		"\u01c3\3\2\2\2\u0085\u01c8\3\2\2\2\u0087\u01ca\3\2\2\2\u0089\u01cc\3\2"+
		"\2\2\u008b\u01ce\3\2\2\2\u008d\u01d0\3\2\2\2\u008f\u01d2\3\2\2\2\u0091"+
		"\u01d4\3\2\2\2\u0093\u01d6\3\2\2\2\u0095\u01d8\3\2\2\2\u0097\u01da\3\2"+
		"\2\2\u0099\u01dc\3\2\2\2\u009b\u01e4\3\2\2\2\u009d\u01e8\3\2\2\2\u009f"+
		"\u01ea\3\2\2\2\u00a1\u01ec\3\2\2\2\u00a3\u01ee\3\2\2\2\u00a5\u00a6\7x"+
		"\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7f\2\2\u00a9\4"+
		"\3\2\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7*\2\2\u00af\6\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7h\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\f\3\2\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7c\2\2\u00c2\u00c3\7v\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7"+
		"y\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7g\2\2\u00ce\22\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\24\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7v\2\2\u00db\26\3\2\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\30\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7"+
		"i\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7v\2\2\u00e6\32\3\2\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7r\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee\7p\2\2\u00ee\36\3\2\2\2\u00ef\u00f0"+
		"\7l\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7r\2\2\u00f3"+
		" \3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7i\2\2\u00f7"+
		"\u00f8\7j\2\2\u00f8\u00f9\7v\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7i\2\2\u00fd$\3\2\2\2\u00fe\u00ff\7d\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7q\2\2\u0101\u0102\7n\2\2\u0102&\3\2\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106(\3\2\2\2\u0107"+
		"\u0108\7e\2\2\u0108\u0109\7j\2\2\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2"+
		"\u010b*\3\2\2\2\u010c\u010d\7u\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2"+
		"\2\u010f\u0110\7w\2\2\u0110\u0111\7e\2\2\u0111\u0112\7v\2\2\u0112,\3\2"+
		"\2\2\u0113\u0114\7e\2\2\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116\u0117"+
		"\7u\2\2\u0117\u0118\7v\2\2\u0118.\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7w\2\2\u011c\u011d\7o\2\2\u011d\60\3\2\2\2\u011e\u011f"+
		"\7v\2\2\u011f\u0120\7{\2\2\u0120\u0121\7r\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7h\2\2\u0125\62\3\2\2\2\u0126"+
		"\u0128\5\u00a3R\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\64\3\2\2\2\u012b\u012c\5\u009bN\2\u012c"+
		"\u012d\5\u0099M\2\u012d\u012e\7\60\2\2\u012e\u012f\7o\2\2\u012f\u0130"+
		"\7c\2\2\u0130\u0131\7r\2\2\u0131\u0132\3\2\2\2\u0132\u0133\5\u009bN\2"+
		"\u0133\66\3\2\2\2\u0134\u0136\5\u009bN\2\u0135\u0137\n\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\5\u009bN\2\u013b8\3\2\2\2\u013c\u0146\5c\62"+
		"\2\u013d\u0145\5\u00a3R\2\u013e\u0145\5\u009dO\2\u013f\u0145\5i\65\2\u0140"+
		"\u0145\5m\67\2\u0141\u0145\5A!\2\u0142\u0145\5e\63\2\u0143\u0145\5g\64"+
		"\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140"+
		"\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5c\62\2\u014a:\3\2\2\2\u014b\u014c"+
		"\7-\2\2\u014c<\3\2\2\2\u014d\u014e\7/\2\2\u014e>\3\2\2\2\u014f\u0150\7"+
		",\2\2\u0150@\3\2\2\2\u0151\u0152\7\61\2\2\u0152B\3\2\2\2\u0153\u0154\7"+
		"\'\2\2\u0154D\3\2\2\2\u0155\u0156\7`\2\2\u0156F\3\2\2\2\u0157\u0158\7"+
		"?\2\2\u0158\u0159\7?\2\2\u0159H\3\2\2\2\u015a\u015b\7?\2\2\u015bJ\3\2"+
		"\2\2\u015c\u015d\7#\2\2\u015dL\3\2\2\2\u015e\u015f\7#\2\2\u015f\u0160"+
		"\7?\2\2\u0160N\3\2\2\2\u0161\u0162\7>\2\2\u0162P\3\2\2\2\u0163\u0164\7"+
		"@\2\2\u0164R\3\2\2\2\u0165\u0166\7@\2\2\u0166\u0167\7?\2\2\u0167T\3\2"+
		"\2\2\u0168\u0169\7>\2\2\u0169\u016a\7?\2\2\u016aV\3\2\2\2\u016b\u016c"+
		"\7*\2\2\u016cX\3\2\2\2\u016d\u016e\7+\2\2\u016eZ\3\2\2\2\u016f\u0170\7"+
		"}\2\2\u0170\\\3\2\2\2\u0171\u0172\7\177\2\2\u0172^\3\2\2\2\u0173\u0174"+
		"\7]\2\2\u0174`\3\2\2\2\u0175\u0176\7_\2\2\u0176b\3\2\2\2\u0177\u0178\7"+
		")\2\2\u0178d\3\2\2\2\u0179\u017a\7^\2\2\u017af\3\2\2\2\u017b\u017c\7="+
		"\2\2\u017ch\3\2\2\2\u017d\u017e\7<\2\2\u017ej\3\2\2\2\u017f\u0180\7.\2"+
		"\2\u0180l\3\2\2\2\u0181\u0182\7\60\2\2\u0182n\3\2\2\2\u0183\u0184\7(\2"+
		"\2\u0184\u0185\7(\2\2\u0185p\3\2\2\2\u0186\u0187\7~\2\2\u0187\u0188\7"+
		"~\2\2\u0188r\3\2\2\2\u0189\u018c\5u;\2\u018a\u018c\5w<\2\u018b\u0189\3"+
		"\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b:\2\2\u018e"+
		"t\3\2\2\2\u018f\u0190\5A!\2\u0190\u0194\5? \2\u0191\u0193\13\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5? \2\u0198\u0199"+
		"\5A!\2\u0199\u019a\3\2\2\2\u019a\u019b\b;\2\2\u019bv\3\2\2\2\u019c\u019d"+
		"\5A!\2\u019d\u01a1\5A!\2\u019e\u01a0\n\3\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\b<\2\2\u01a5x\3\2\2\2\u01a6\u01a8"+
		"\7\17\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2"+
		"\u01a9\u01aa\7\f\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b=\3\2\u01acz\3\2"+
		"\2\2\u01ad\u01af\t\4\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b>"+
		"\3\2\u01b3|\3\2\2\2\u01b4\u01b5\7o\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7"+
		"\7r\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\5i\65\2\u01b9~\3\2\2\2\u01ba\u01bb"+
		"\7%\2\2\u01bb\u0080\3\2\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7g\2\2\u01be"+
		"\u01bf\7v\2\2\u01bf\u01c0\7w\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7p\2\2"+
		"\u01c2\u0082\3\2\2\2\u01c3\u01c4\5m\67\2\u01c4\u01c5\7o\2\2\u01c5\u01c6"+
		"\7c\2\2\u01c6\u01c7\7r\2\2\u01c7\u0084\3\2\2\2\u01c8\u01c9\7B\2\2\u01c9"+
		"\u0086\3\2\2\2\u01ca\u01cb\7Z\2\2\u01cb\u0088\3\2\2\2\u01cc\u01cd\7I\2"+
		"\2\u01cd\u008a\3\2\2\2\u01ce\u01cf\7R\2\2\u01cf\u008c\3\2\2\2\u01d0\u01d1"+
		"\7C\2\2\u01d1\u008e\3\2\2\2\u01d2\u01d3\7D\2\2\u01d3\u0090\3\2\2\2\u01d4"+
		"\u01d5\7V\2\2\u01d5\u0092\3\2\2\2\u01d6\u01d7\7U\2\2\u01d7\u0094\3\2\2"+
		"\2\u01d8\u01d9\7a\2\2\u01d9\u0096\3\2\2\2\u01da\u01db\7S\2\2\u01db\u0098"+
		"\3\2\2\2\u01dc\u01e1\5\u009dO\2\u01dd\u01e0\5\u00a3R\2\u01de\u01e0\5\u009d"+
		"O\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u009a\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e5\7$\2\2\u01e5\u009c\3\2\2\2\u01e6\u01e9\5\u009fP\2\u01e7"+
		"\u01e9\5\u00a1Q\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u009e"+
		"\3\2\2\2\u01ea\u01eb\4c|\2\u01eb\u00a0\3\2\2\2\u01ec\u01ed\4C\\\2\u01ed"+
		"\u00a2\3\2\2\2\u01ee\u01ef\4\62;\2\u01ef\u00a4\3\2\2\2\17\2\u0129\u0138"+
		"\u0144\u0146\u018b\u0194\u01a1\u01a7\u01b0\u01df\u01e1\u01e8\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}