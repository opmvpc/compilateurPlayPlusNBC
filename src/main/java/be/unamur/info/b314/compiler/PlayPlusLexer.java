// Generated from tmp\PlayPlus.g4 by ANTLR 4.6
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
		VOID=1, IF=2, ELSE=3, THEN=4, REPEAT=5, WHILE=6, TRUE=7, FALSE=8, IMPORT=9, 
		LEFT=10, RIGHT=11, UP=12, DOWN=13, JUMP=14, FIGHT=15, DIG=16, BOOL=17, 
		INT=18, CHAR=19, STRUCT=20, CONST=21, ENUM=22, TYPEDEF=23, ENTIER=24, 
		FILE=25, STRING=26, CHARACTER=27, PLUS=28, MINUS=29, MUL=30, DIV=31, POW=32, 
		EQUAL=33, AFFECT=34, NOT=35, NOTEQUAL=36, SMALLER=37, GREATER=38, EGREATER=39, 
		ESMALLER=40, LPAREN=41, RPAREN=42, LBRACE=43, RBRACE=44, LBRACKET=45, 
		RBRACKET=46, SINGLEQUOTE=47, BACKSLASH=48, SEMICOLON=49, COLON=50, COMMA=51, 
		DOT=52, AND=53, OR=54, AMPERSAND=55, COMMENTAIRES=56, BLOCK_COMMENT=57, 
		LINE_COMMENT=58, NEWLINE=59, WS=60, HASHTAG=61, MAIN=62, RETURN=63, MAP=64, 
		ID=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", "IMPORT", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", 
		"CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", "FILE", "STRING", 
		"CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", "AFFECT", 
		"NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", "BACKSLASH", 
		"SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", "COMMENTAIRES", 
		"BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "HASHTAG", "MAIN", "RETURN", 
		"MAP", "ID", "DOUBLEQUOTE", "LETTRE", "LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'if'", "'else'", "'then'", "'repeat'", "'while'", "'true'", 
		"'false'", "'import'", "'left'", "'right'", "'up'", "'down'", "'jump'", 
		"'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", "'const'", 
		"'enum'", "'typedef'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", "'>='", "'<='", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", "';'", "':'", "','", 
		"'.'", "'&&'", "'||'", "'&'", null, null, null, null, null, "'#'", null, 
		"'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", 
		"IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", 
		"INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", "FILE", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u010c"+
		"\n\31\3\31\6\31\u010f\n\31\r\31\16\31\u0110\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\6\33\u011e\n\33\r\33\16\33\u011f\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u012d\n\34\f\34\16"+
		"\34\u0130\13\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\59\u0174"+
		"\n9\39\39\3:\3:\3:\7:\u017b\n:\f:\16:\u017e\13:\3:\3:\3:\3:\3:\3;\3;\3"+
		";\7;\u0188\n;\f;\16;\u018b\13;\3;\3;\3<\5<\u0190\n<\3<\3<\3<\3<\3=\6="+
		"\u0197\n=\r=\16=\u0198\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\6?\u01a5\n?\r?\16"+
		"?\u01a6\3?\3?\3?\3?\3?\3?\3?\7?\u01b0\n?\f?\16?\u01b3\13?\3?\3?\3@\3@"+
		"\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\7B\u01c6\nB\fB\16B\u01c9\13B\3"+
		"C\3C\3D\3D\5D\u01cf\nD\3E\3E\3F\3F\3G\3G\3\u017c\2H\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\3\2\5\7\2\f\f"+
		"\17\17$$..^^\4\2\f\f\17\17\4\2\13\13\"\"\u01e5\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u008f\3\2\2\2\5\u0094\3\2\2"+
		"\2\7\u0097\3\2\2\2\t\u009c\3\2\2\2\13\u00a1\3\2\2\2\r\u00a8\3\2\2\2\17"+
		"\u00ae\3\2\2\2\21\u00b3\3\2\2\2\23\u00b9\3\2\2\2\25\u00c0\3\2\2\2\27\u00c5"+
		"\3\2\2\2\31\u00cb\3\2\2\2\33\u00ce\3\2\2\2\35\u00d3\3\2\2\2\37\u00d8\3"+
		"\2\2\2!\u00de\3\2\2\2#\u00e2\3\2\2\2%\u00e7\3\2\2\2\'\u00eb\3\2\2\2)\u00f0"+
		"\3\2\2\2+\u00f7\3\2\2\2-\u00fd\3\2\2\2/\u0102\3\2\2\2\61\u010b\3\2\2\2"+
		"\63\u0112\3\2\2\2\65\u011b\3\2\2\2\67\u0123\3\2\2\29\u0133\3\2\2\2;\u0135"+
		"\3\2\2\2=\u0137\3\2\2\2?\u0139\3\2\2\2A\u013b\3\2\2\2C\u013d\3\2\2\2E"+
		"\u0140\3\2\2\2G\u0142\3\2\2\2I\u0144\3\2\2\2K\u0147\3\2\2\2M\u0149\3\2"+
		"\2\2O\u014b\3\2\2\2Q\u014e\3\2\2\2S\u0151\3\2\2\2U\u0153\3\2\2\2W\u0155"+
		"\3\2\2\2Y\u0157\3\2\2\2[\u0159\3\2\2\2]\u015b\3\2\2\2_\u015d\3\2\2\2a"+
		"\u015f\3\2\2\2c\u0161\3\2\2\2e\u0163\3\2\2\2g\u0165\3\2\2\2i\u0167\3\2"+
		"\2\2k\u0169\3\2\2\2m\u016c\3\2\2\2o\u016f\3\2\2\2q\u0173\3\2\2\2s\u0177"+
		"\3\2\2\2u\u0184\3\2\2\2w\u018f\3\2\2\2y\u0196\3\2\2\2{\u019c\3\2\2\2}"+
		"\u019e\3\2\2\2\177\u01b6\3\2\2\2\u0081\u01bd\3\2\2\2\u0083\u01c2\3\2\2"+
		"\2\u0085\u01ca\3\2\2\2\u0087\u01ce\3\2\2\2\u0089\u01d0\3\2\2\2\u008b\u01d2"+
		"\3\2\2\2\u008d\u01d4\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\4\3\2\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7h\2\2\u0096\6\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\b\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\n\3\2\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\f\3\2\2\2\u00a8\u00a9\7y"+
		"\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1"+
		"\7w\2\2\u00b1\u00b2\7g\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5"+
		"\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\22\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7v\2\2\u00bf\24\3\2\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\26\3\2\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7"+
		"i\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7v\2\2\u00ca\30\3\2\2\2\u00cb\u00cc"+
		"\7w\2\2\u00cc\u00cd\7r\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7p\2\2\u00d2\34\3\2\2\2\u00d3\u00d4"+
		"\7l\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7r\2\2\u00d7"+
		"\36\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7i\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7v\2\2\u00dd \3\2\2\2\u00de\u00df\7f\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7i\2\2\u00e1\"\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7n\2\2\u00e6$\3\2\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea&\3\2\2\2\u00eb"+
		"\u00ec\7e\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7t\2\2"+
		"\u00ef(\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2"+
		"\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7v\2\2\u00f6*\3\2"+
		"\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7u\2\2\u00fb\u00fc\7v\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7o\2\2\u0101.\3\2\2\2\u0102\u0103"+
		"\7v\2\2\u0103\u0104\7{\2\2\u0104\u0105\7r\2\2\u0105\u0106\7g\2\2\u0106"+
		"\u0107\7f\2\2\u0107\u0108\7g\2\2\u0108\u0109\7h\2\2\u0109\60\3\2\2\2\u010a"+
		"\u010c\5;\36\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010f\5\u008dG\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\62\3\2\2\2\u0112\u0113\5\u0085"+
		"C\2\u0113\u0114\5\u0083B\2\u0114\u0115\7\60\2\2\u0115\u0116\7o\2\2\u0116"+
		"\u0117\7c\2\2\u0117\u0118\7r\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5\u0085"+
		"C\2\u011a\64\3\2\2\2\u011b\u011d\5\u0085C\2\u011c\u011e\n\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5\u0085C\2\u0122\66\3\2\2\2\u0123"+
		"\u012e\5_\60\2\u0124\u012d\5\u008dG\2\u0125\u012d\5\u0087D\2\u0126\u012d"+
		"\5e\63\2\u0127\u012d\5i\65\2\u0128\u012d\5o8\2\u0129\u012d\5? \2\u012a"+
		"\u012d\5a\61\2\u012b\u012d\5c\62\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2"+
		"\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\5_\60\2\u01328\3\2\2\2\u0133\u0134\7-\2\2\u0134"+
		":\3\2\2\2\u0135\u0136\7/\2\2\u0136<\3\2\2\2\u0137\u0138\7,\2\2\u0138>"+
		"\3\2\2\2\u0139\u013a\7\61\2\2\u013a@\3\2\2\2\u013b\u013c\7`\2\2\u013c"+
		"B\3\2\2\2\u013d\u013e\7?\2\2\u013e\u013f\7?\2\2\u013fD\3\2\2\2\u0140\u0141"+
		"\7?\2\2\u0141F\3\2\2\2\u0142\u0143\7#\2\2\u0143H\3\2\2\2\u0144\u0145\7"+
		"#\2\2\u0145\u0146\7?\2\2\u0146J\3\2\2\2\u0147\u0148\7>\2\2\u0148L\3\2"+
		"\2\2\u0149\u014a\7@\2\2\u014aN\3\2\2\2\u014b\u014c\7@\2\2\u014c\u014d"+
		"\7?\2\2\u014dP\3\2\2\2\u014e\u014f\7>\2\2\u014f\u0150\7?\2\2\u0150R\3"+
		"\2\2\2\u0151\u0152\7*\2\2\u0152T\3\2\2\2\u0153\u0154\7+\2\2\u0154V\3\2"+
		"\2\2\u0155\u0156\7}\2\2\u0156X\3\2\2\2\u0157\u0158\7\177\2\2\u0158Z\3"+
		"\2\2\2\u0159\u015a\7]\2\2\u015a\\\3\2\2\2\u015b\u015c\7_\2\2\u015c^\3"+
		"\2\2\2\u015d\u015e\7)\2\2\u015e`\3\2\2\2\u015f\u0160\7^\2\2\u0160b\3\2"+
		"\2\2\u0161\u0162\7=\2\2\u0162d\3\2\2\2\u0163\u0164\7<\2\2\u0164f\3\2\2"+
		"\2\u0165\u0166\7.\2\2\u0166h\3\2\2\2\u0167\u0168\7\60\2\2\u0168j\3\2\2"+
		"\2\u0169\u016a\7(\2\2\u016a\u016b\7(\2\2\u016bl\3\2\2\2\u016c\u016d\7"+
		"~\2\2\u016d\u016e\7~\2\2\u016en\3\2\2\2\u016f\u0170\7(\2\2\u0170p\3\2"+
		"\2\2\u0171\u0174\5s:\2\u0172\u0174\5u;\2\u0173\u0171\3\2\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b9\2\2\u0176r\3\2\2\2\u0177\u0178"+
		"\5? \2\u0178\u017c\5=\37\2\u0179\u017b\13\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\5=\37\2\u0180\u0181\5? \2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\b:\2\2\u0183t\3\2\2\2\u0184\u0185\5? \2\u0185\u0189"+
		"\5? \2\u0186\u0188\n\3\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018c\u018d\b;\2\2\u018dv\3\2\2\2\u018e\u0190\7\17\2\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\f\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\b<\3\2\u0194x\3\2\2\2\u0195\u0197\t\4\2\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\b=\3\2\u019bz\3\2\2\2\u019c\u019d"+
		"\7%\2\2\u019d|\3\2\2\2\u019e\u019f\7x\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1"+
		"\7k\2\2\u01a1\u01a2\7f\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5y=\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab"+
		"\7k\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7*\2\2\u01ad\u01b1\3\2\2\2\u01ae"+
		"\u01b0\5y=\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5"+
		"\7+\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7t\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9"+
		"\7v\2\2\u01b9\u01ba\7w\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7p\2\2\u01bc"+
		"\u0080\3\2\2\2\u01bd\u01be\5i\65\2\u01be\u01bf\7o\2\2\u01bf\u01c0\7c\2"+
		"\2\u01c0\u01c1\7r\2\2\u01c1\u0082\3\2\2\2\u01c2\u01c7\5\u0087D\2\u01c3"+
		"\u01c6\5\u008dG\2\u01c4\u01c6\5\u0087D\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u0084\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7$\2\2\u01cb\u0086\3\2"+
		"\2\2\u01cc\u01cf\5\u0089E\2\u01cd\u01cf\5\u008bF\2\u01ce\u01cc\3\2\2\2"+
		"\u01ce\u01cd\3\2\2\2\u01cf\u0088\3\2\2\2\u01d0\u01d1\4c|\2\u01d1\u008a"+
		"\3\2\2\2\u01d2\u01d3\4C\\\2\u01d3\u008c\3\2\2\2\u01d4\u01d5\4\62;\2\u01d5"+
		"\u008e\3\2\2\2\22\2\u010b\u0110\u011f\u012c\u012e\u0173\u017c\u0189\u018f"+
		"\u0198\u01a6\u01b1\u01c5\u01c7\u01ce\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}