// Generated from tmp\PlayPlusWords.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, IF=2, ELSE=3, THEN=4, REPEAT=5, WHILE=6, TRUE=7, FALSE=8, IMPORT=9, 
		LEFT=10, RIGHT=11, UP=12, DOWN=13, JUMP=14, FIGHT=15, DIG=16, BOOL=17, 
		INT=18, CHAR=19, STRUCT=20, CONST=21, ENUM=22, TYPEDEF=23, NATUREL=24, 
		ENTIER=25, FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, 
		DIV=32, POW=33, EQUAL=34, AFFECT=35, NOT=36, NOTEQUAL=37, SMALLER=38, 
		GREATER=39, EGREATER=40, ESMALLER=41, LPAREN=42, RPAREN=43, LBRACE=44, 
		RBRACE=45, LBRACKET=46, RBRACKET=47, SINGLEQUOTE=48, BACKSLASH=49, SEMICOLON=50, 
		COLON=51, COMMA=52, DOT=53, AND=54, OR=55, AMPERSAND=56, COMMENTAIRES=57, 
		BLOCK_COMMENT=58, LINE_COMMENT=59, NEWLINE=60, WS=61, HASHTAG=62, MAIN=63, 
		RETURN=64, MAP=65, ID=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", "IMPORT", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", 
		"CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "ENTIER", "FILE", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", 
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", 
		"COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "HASHTAG", 
		"MAIN", "RETURN", "MAP", "ID", "DOUBLEQUOTE", "LETTRE", "LOWER", "UPPER", 
		"CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'if'", "'else'", "'then'", "'repeat'", "'while'", "'true'", 
		"'false'", "'import'", "'left'", "'right'", "'up'", "'down'", "'jump'", 
		"'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", "'const'", 
		"'enum'", "'typedef'", null, null, null, null, null, "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", "'>='", "'<='", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", "';'", "':'", 
		"','", "'.'", "'&&'", "'||'", "'&'", null, null, null, null, null, "'#'", 
		null, "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", 
		"IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", 
		"INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "ENTIER", 
		"FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", 
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", 
		"COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "HASHTAG", 
		"MAIN", "RETURN", "MAP", "ID"
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


	public PlayPlusWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlusWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\6\31\u010e\n\31\r\31\16\31\u010f\3\32\5\32\u0113\n\32\3\32\6\32\u0116"+
		"\n\32\r\32\16\32\u0117\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\6\34\u0125\n\34\r\34\16\34\u0126\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0134\n\35\f\35\16\35\u0137\13\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\38\39\39\3:\3:\5:\u017b\n:\3:\3:\3;\3;\3;\7;\u0182"+
		"\n;\f;\16;\u0185\13;\3;\3;\3;\3;\3;\3<\3<\3<\7<\u018f\n<\f<\16<\u0192"+
		"\13<\3<\3<\3=\5=\u0197\n=\3=\3=\3=\3=\3>\6>\u019e\n>\r>\16>\u019f\3>\3"+
		">\3?\3?\3@\3@\3@\3@\3@\3@\6@\u01ac\n@\r@\16@\u01ad\3@\3@\3@\3@\3@\3@\3"+
		"@\7@\u01b7\n@\f@\16@\u01ba\13@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\3B\3C\3C\3C\7C\u01cd\nC\fC\16C\u01d0\13C\3D\3D\3E\3E\5E\u01d6\nE\3F\3"+
		"F\3G\3G\3H\3H\3\u0183\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\3\2\5\7\2\f\f\17\17$$..^^\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\u01ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
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
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0091\3\2\2\2\5\u0096\3\2\2\2\7\u0099"+
		"\3\2\2\2\t\u009e\3\2\2\2\13\u00a3\3\2\2\2\r\u00aa\3\2\2\2\17\u00b0\3\2"+
		"\2\2\21\u00b5\3\2\2\2\23\u00bb\3\2\2\2\25\u00c2\3\2\2\2\27\u00c7\3\2\2"+
		"\2\31\u00cd\3\2\2\2\33\u00d0\3\2\2\2\35\u00d5\3\2\2\2\37\u00da\3\2\2\2"+
		"!\u00e0\3\2\2\2#\u00e4\3\2\2\2%\u00e9\3\2\2\2\'\u00ed\3\2\2\2)\u00f2\3"+
		"\2\2\2+\u00f9\3\2\2\2-\u00ff\3\2\2\2/\u0104\3\2\2\2\61\u010d\3\2\2\2\63"+
		"\u0112\3\2\2\2\65\u0119\3\2\2\2\67\u0122\3\2\2\29\u012a\3\2\2\2;\u013a"+
		"\3\2\2\2=\u013c\3\2\2\2?\u013e\3\2\2\2A\u0140\3\2\2\2C\u0142\3\2\2\2E"+
		"\u0144\3\2\2\2G\u0147\3\2\2\2I\u0149\3\2\2\2K\u014b\3\2\2\2M\u014e\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0155\3\2\2\2U\u0158\3\2\2\2W\u015a"+
		"\3\2\2\2Y\u015c\3\2\2\2[\u015e\3\2\2\2]\u0160\3\2\2\2_\u0162\3\2\2\2a"+
		"\u0164\3\2\2\2c\u0166\3\2\2\2e\u0168\3\2\2\2g\u016a\3\2\2\2i\u016c\3\2"+
		"\2\2k\u016e\3\2\2\2m\u0170\3\2\2\2o\u0173\3\2\2\2q\u0176\3\2\2\2s\u017a"+
		"\3\2\2\2u\u017e\3\2\2\2w\u018b\3\2\2\2y\u0196\3\2\2\2{\u019d\3\2\2\2}"+
		"\u01a3\3\2\2\2\177\u01a5\3\2\2\2\u0081\u01bd\3\2\2\2\u0083\u01c4\3\2\2"+
		"\2\u0085\u01c9\3\2\2\2\u0087\u01d1\3\2\2\2\u0089\u01d5\3\2\2\2\u008b\u01d7"+
		"\3\2\2\2\u008d\u01d9\3\2\2\2\u008f\u01db\3\2\2\2\u0091\u0092\7x\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7k\2\2\u0094\u0095\7f\2\2\u0095\4\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\6\3\2\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\b\3\2\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p\2\2"+
		"\u00a2\n\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7r"+
		"\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\f"+
		"\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7g\2\2\u00b4\20\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7"+
		"o\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7v\2\2\u00c6\26\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\30\3\2\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7r\2\2\u00cf\32\3\2\2\2\u00d0"+
		"\u00d1\7f\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7p\2\2"+
		"\u00d4\34\3\2\2\2\u00d5\u00d6\7l\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7"+
		"o\2\2\u00d8\u00d9\7r\2\2\u00d9\36\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7v\2\2\u00df"+
		" \3\2\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7i\2\2\u00e3"+
		"\"\3\2\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7j\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7t\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7e\2\2"+
		"\u00f7\u00f8\7v\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7q\2"+
		"\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2\u00fe,\3\2"+
		"\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7w\2\2\u0102\u0103"+
		"\7o\2\2\u0103.\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7{\2\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7g\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7h\2\2\u010b\60\3\2\2\2\u010c\u010e\5\u008fH\2\u010d\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\62\3\2\2\2\u0111\u0113\5=\37\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u0115\3\2\2\2\u0114\u0116\5\u008fH\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\64\3\2\2"+
		"\2\u0119\u011a\5\u0087D\2\u011a\u011b\5\u0085C\2\u011b\u011c\7\60\2\2"+
		"\u011c\u011d\7o\2\2\u011d\u011e\7c\2\2\u011e\u011f\7r\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\5\u0087D\2\u0121\66\3\2\2\2\u0122\u0124\5\u0087D"+
		"\2\u0123\u0125\n\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\u0087D"+
		"\2\u01298\3\2\2\2\u012a\u0135\5a\61\2\u012b\u0134\5\u008fH\2\u012c\u0134"+
		"\5\u0089E\2\u012d\u0134\5g\64\2\u012e\u0134\5k\66\2\u012f\u0134\5q9\2"+
		"\u0130\u0134\5A!\2\u0131\u0134\5c\62\2\u0132\u0134\5e\63\2\u0133\u012b"+
		"\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5a\61\2\u0139:\3\2\2\2"+
		"\u013a\u013b\7-\2\2\u013b<\3\2\2\2\u013c\u013d\7/\2\2\u013d>\3\2\2\2\u013e"+
		"\u013f\7,\2\2\u013f@\3\2\2\2\u0140\u0141\7\61\2\2\u0141B\3\2\2\2\u0142"+
		"\u0143\7`\2\2\u0143D\3\2\2\2\u0144\u0145\7?\2\2\u0145\u0146\7?\2\2\u0146"+
		"F\3\2\2\2\u0147\u0148\7?\2\2\u0148H\3\2\2\2\u0149\u014a\7#\2\2\u014aJ"+
		"\3\2\2\2\u014b\u014c\7#\2\2\u014c\u014d\7?\2\2\u014dL\3\2\2\2\u014e\u014f"+
		"\7>\2\2\u014fN\3\2\2\2\u0150\u0151\7@\2\2\u0151P\3\2\2\2\u0152\u0153\7"+
		"@\2\2\u0153\u0154\7?\2\2\u0154R\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157"+
		"\7?\2\2\u0157T\3\2\2\2\u0158\u0159\7*\2\2\u0159V\3\2\2\2\u015a\u015b\7"+
		"+\2\2\u015bX\3\2\2\2\u015c\u015d\7}\2\2\u015dZ\3\2\2\2\u015e\u015f\7\177"+
		"\2\2\u015f\\\3\2\2\2\u0160\u0161\7]\2\2\u0161^\3\2\2\2\u0162\u0163\7_"+
		"\2\2\u0163`\3\2\2\2\u0164\u0165\7)\2\2\u0165b\3\2\2\2\u0166\u0167\7^\2"+
		"\2\u0167d\3\2\2\2\u0168\u0169\7=\2\2\u0169f\3\2\2\2\u016a\u016b\7<\2\2"+
		"\u016bh\3\2\2\2\u016c\u016d\7.\2\2\u016dj\3\2\2\2\u016e\u016f\7\60\2\2"+
		"\u016fl\3\2\2\2\u0170\u0171\7(\2\2\u0171\u0172\7(\2\2\u0172n\3\2\2\2\u0173"+
		"\u0174\7~\2\2\u0174\u0175\7~\2\2\u0175p\3\2\2\2\u0176\u0177\7(\2\2\u0177"+
		"r\3\2\2\2\u0178\u017b\5u;\2\u0179\u017b\5w<\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b:\2\2\u017dt\3\2\2\2\u017e"+
		"\u017f\5A!\2\u017f\u0183\5? \2\u0180\u0182\13\2\2\2\u0181\u0180\3\2\2"+
		"\2\u0182\u0185\3\2\2\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5? \2\u0187\u0188\5A!\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\b;\2\2\u018av\3\2\2\2\u018b\u018c\5A!\2\u018c"+
		"\u0190\5A!\2\u018d\u018f\n\3\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0194\b<\2\2\u0194x\3\2\2\2\u0195\u0197\7\17\2\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\f"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\b=\3\2\u019bz\3\2\2\2\u019c\u019e"+
		"\t\4\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b>\3\2\u01a2|\3\2\2\2\u01a3"+
		"\u01a4\7%\2\2\u01a4~\3\2\2\2\u01a5\u01a6\7x\2\2\u01a6\u01a7\7q\2\2\u01a7"+
		"\u01a8\7k\2\2\u01a8\u01a9\7f\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5{>\2"+
		"\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7o\2\2\u01b0\u01b1\7c\2\2\u01b1"+
		"\u01b2\7k\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7*\2\2\u01b4\u01b8\3\2\2"+
		"\2\u01b5\u01b7\5{>\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bc\7+\2\2\u01bc\u0080\3\2\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7g\2"+
		"\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7w\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3"+
		"\7p\2\2\u01c3\u0082\3\2\2\2\u01c4\u01c5\5k\66\2\u01c5\u01c6\7o\2\2\u01c6"+
		"\u01c7\7c\2\2\u01c7\u01c8\7r\2\2\u01c8\u0084\3\2\2\2\u01c9\u01ce\5\u0089"+
		"E\2\u01ca\u01cd\5\u008fH\2\u01cb\u01cd\5\u0089E\2\u01cc\u01ca\3\2\2\2"+
		"\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u0086\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7$\2\2\u01d2"+
		"\u0088\3\2\2\2\u01d3\u01d6\5\u008bF\2\u01d4\u01d6\5\u008dG\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u008a\3\2\2\2\u01d7\u01d8\4c|\2\u01d8"+
		"\u008c\3\2\2\2\u01d9\u01da\4C\\\2\u01da\u008e\3\2\2\2\u01db\u01dc\4\62"+
		";\2\u01dc\u0090\3\2\2\2\23\2\u010f\u0112\u0117\u0126\u0133\u0135\u017a"+
		"\u0183\u0190\u0196\u019f\u01ad\u01b8\u01cc\u01ce\u01d5\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}