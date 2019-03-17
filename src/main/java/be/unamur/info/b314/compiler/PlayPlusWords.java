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
		INT=18, CHAR=19, STRUCT=20, CONST=21, ENUM=22, TYPEDEF=23, ENTIER=24, 
		STRING=25, CHARACTER=26, PLUS=27, MINUS=28, MUL=29, DIV=30, POW=31, EQUAL=32, 
		AFFECT=33, NOT=34, NOTEQUAL=35, SMALLER=36, GREATER=37, EGREATER=38, ESMALLER=39, 
		LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, LBRACKET=44, RBRACKET=45, 
		DOUBLEQUOTE=46, SINGLEQUOTE=47, BACKSLASH=48, SEMICOLON=49, COLON=50, 
		COMMA=51, DOT=52, AND=53, OR=54, AMPERSAND=55, COMMENTAIRES=56, BLOCK_COMMENT=57, 
		LINE_COMMENT=58, NEWLINE=59, WS=60, CONSTID=61, ID=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", "IMPORT", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", 
		"CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", "STRING", "CHARACTER", 
		"PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", "AFFECT", "NOT", "NOTEQUAL", 
		"SMALLER", "GREATER", "EGREATER", "ESMALLER", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", "SINGLEQUOTE", "BACKSLASH", 
		"SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", "COMMENTAIRES", 
		"BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "CONSTID", "ID", "LETTRE", 
		"LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'if'", "'else'", "'then'", "'repeat'", "'while'", "'true'", 
		"'false'", "'#import'", "'left'", "'right'", "'up'", "'down'", "'jump'", 
		"'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", "'const'", 
		"'enum'", "'typedef'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'=='", "'='", "'!'", "'!='", "'<'", "'>'", "'>='", "'<='", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'\"'", "'''", "'\\'", "';'", "':'", "','", 
		"'.'", "'&&'", "'||'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", 
		"IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", 
		"INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", "STRING", 
		"CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", "AFFECT", 
		"NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", "SINGLEQUOTE", 
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", 
		"COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "CONSTID", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u0105\n\31\3\31\6\31"+
		"\u0108\n\31\r\31\16\31\u0109\3\32\3\32\6\32\u010e\n\32\r\32\16\32\u010f"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u011d\n\33"+
		"\f\33\16\33\u0120\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\39\39\59\u0166\n9\39\39\3:\3:\3:\7:\u016d\n:\f:\16:\u0170\13:\3:\3:"+
		"\3:\3:\3:\3;\3;\3;\7;\u017a\n;\f;\16;\u017d\13;\3;\3;\3<\5<\u0182\n<\3"+
		"<\3<\3<\3<\3=\6=\u0189\n=\r=\16=\u018a\3=\3=\3>\3>\3>\7>\u0192\n>\f>\16"+
		">\u0195\13>\3?\3?\3?\7?\u019a\n?\f?\16?\u019d\13?\3@\3@\5@\u01a1\n@\3"+
		"A\3A\3B\3B\3C\3C\3\u016e\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085"+
		"\2\3\2\5\6\2\f\f\17\17..^^\4\2\f\f\17\17\4\2\13\13\"\"\u01b8\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\3\u0087\3\2\2\2\5\u008c\3\2\2\2\7\u008f\3\2\2\2\t\u0094\3\2"+
		"\2\2\13\u0099\3\2\2\2\r\u00a0\3\2\2\2\17\u00a6\3\2\2\2\21\u00ab\3\2\2"+
		"\2\23\u00b1\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2\2\31\u00c4\3\2\2\2"+
		"\33\u00c7\3\2\2\2\35\u00cc\3\2\2\2\37\u00d1\3\2\2\2!\u00d7\3\2\2\2#\u00db"+
		"\3\2\2\2%\u00e0\3\2\2\2\'\u00e4\3\2\2\2)\u00e9\3\2\2\2+\u00f0\3\2\2\2"+
		"-\u00f6\3\2\2\2/\u00fb\3\2\2\2\61\u0104\3\2\2\2\63\u010b\3\2\2\2\65\u0113"+
		"\3\2\2\2\67\u0123\3\2\2\29\u0125\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2"+
		"?\u012b\3\2\2\2A\u012d\3\2\2\2C\u0130\3\2\2\2E\u0132\3\2\2\2G\u0134\3"+
		"\2\2\2I\u0137\3\2\2\2K\u0139\3\2\2\2M\u013b\3\2\2\2O\u013e\3\2\2\2Q\u0141"+
		"\3\2\2\2S\u0143\3\2\2\2U\u0145\3\2\2\2W\u0147\3\2\2\2Y\u0149\3\2\2\2["+
		"\u014b\3\2\2\2]\u014d\3\2\2\2_\u014f\3\2\2\2a\u0151\3\2\2\2c\u0153\3\2"+
		"\2\2e\u0155\3\2\2\2g\u0157\3\2\2\2i\u0159\3\2\2\2k\u015b\3\2\2\2m\u015e"+
		"\3\2\2\2o\u0161\3\2\2\2q\u0165\3\2\2\2s\u0169\3\2\2\2u\u0176\3\2\2\2w"+
		"\u0181\3\2\2\2y\u0188\3\2\2\2{\u018e\3\2\2\2}\u0196\3\2\2\2\177\u01a0"+
		"\3\2\2\2\u0081\u01a2\3\2\2\2\u0083\u01a4\3\2\2\2\u0085\u01a6\3\2\2\2\u0087"+
		"\u0088\7x\2\2\u0088\u0089\7q\2\2\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2"+
		"\u008b\4\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e\6\3\2\2\2"+
		"\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7g\2\2\u0093\b\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7j\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7p\2\2\u0098\n\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7r\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7v\2\2\u009f\f\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\16\3\2\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\20\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7"+
		"n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0\22\3\2\2\2\u00b1\u00b2"+
		"\7%\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7v\2\2\u00b8\24\3\2\2\2\u00b9"+
		"\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\26\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7"+
		"i\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7v\2\2\u00c3\30\3\2\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00c6\7r\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7p\2\2\u00cb\34\3\2\2\2\u00cc\u00cd"+
		"\7l\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7r\2\2\u00d0"+
		"\36\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7i\2\2\u00d4"+
		"\u00d5\7j\2\2\u00d5\u00d6\7v\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7f\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7i\2\2\u00da\"\3\2\2\2\u00db\u00dc\7d\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7n\2\2\u00df$\3\2\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7v\2\2\u00e3&\3\2\2\2\u00e4"+
		"\u00e5\7e\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2\2"+
		"\u00e8(\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7t\2"+
		"\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7v\2\2\u00ef*\3\2"+
		"\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7v\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7o\2\2\u00fa.\3\2\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7{\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7f\2\2\u0100\u0101\7g\2\2\u0101\u0102\7h\2\2\u0102\60\3\2\2\2\u0103"+
		"\u0105\59\35\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0108\5\u0085C\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\62\3\2\2\2\u010b\u010d\5]/\2"+
		"\u010c\u010e\n\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5]/\2\u0112"+
		"\64\3\2\2\2\u0113\u011e\5_\60\2\u0114\u011d\5\u0085C\2\u0115\u011d\5\177"+
		"@\2\u0116\u011d\5e\63\2\u0117\u011d\5i\65\2\u0118\u011d\5o8\2\u0119\u011d"+
		"\5=\37\2\u011a\u011d\5a\61\2\u011b\u011d\5c\62\2\u011c\u0114\3\2\2\2\u011c"+
		"\u0115\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2"+
		"\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5_\60\2\u0122\66\3\2\2\2\u0123\u0124"+
		"\7-\2\2\u01248\3\2\2\2\u0125\u0126\7/\2\2\u0126:\3\2\2\2\u0127\u0128\7"+
		",\2\2\u0128<\3\2\2\2\u0129\u012a\7\61\2\2\u012a>\3\2\2\2\u012b\u012c\7"+
		"`\2\2\u012c@\3\2\2\2\u012d\u012e\7?\2\2\u012e\u012f\7?\2\2\u012fB\3\2"+
		"\2\2\u0130\u0131\7?\2\2\u0131D\3\2\2\2\u0132\u0133\7#\2\2\u0133F\3\2\2"+
		"\2\u0134\u0135\7#\2\2\u0135\u0136\7?\2\2\u0136H\3\2\2\2\u0137\u0138\7"+
		">\2\2\u0138J\3\2\2\2\u0139\u013a\7@\2\2\u013aL\3\2\2\2\u013b\u013c\7@"+
		"\2\2\u013c\u013d\7?\2\2\u013dN\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140"+
		"\7?\2\2\u0140P\3\2\2\2\u0141\u0142\7*\2\2\u0142R\3\2\2\2\u0143\u0144\7"+
		"+\2\2\u0144T\3\2\2\2\u0145\u0146\7}\2\2\u0146V\3\2\2\2\u0147\u0148\7\177"+
		"\2\2\u0148X\3\2\2\2\u0149\u014a\7]\2\2\u014aZ\3\2\2\2\u014b\u014c\7_\2"+
		"\2\u014c\\\3\2\2\2\u014d\u014e\7$\2\2\u014e^\3\2\2\2\u014f\u0150\7)\2"+
		"\2\u0150`\3\2\2\2\u0151\u0152\7^\2\2\u0152b\3\2\2\2\u0153\u0154\7=\2\2"+
		"\u0154d\3\2\2\2\u0155\u0156\7<\2\2\u0156f\3\2\2\2\u0157\u0158\7.\2\2\u0158"+
		"h\3\2\2\2\u0159\u015a\7\60\2\2\u015aj\3\2\2\2\u015b\u015c\7(\2\2\u015c"+
		"\u015d\7(\2\2\u015dl\3\2\2\2\u015e\u015f\7~\2\2\u015f\u0160\7~\2\2\u0160"+
		"n\3\2\2\2\u0161\u0162\7(\2\2\u0162p\3\2\2\2\u0163\u0166\5s:\2\u0164\u0166"+
		"\5u;\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b9\2\2\u0168r\3\2\2\2\u0169\u016a\5=\37\2\u016a\u016e\5;\36\2\u016b"+
		"\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0172\5;\36\2\u0172\u0173\5=\37\2\u0173\u0174\3\2\2\2\u0174\u0175\b:"+
		"\2\2\u0175t\3\2\2\2\u0176\u0177\5=\37\2\u0177\u017b\5=\37\2\u0178\u017a"+
		"\n\3\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\b;"+
		"\2\2\u017fv\3\2\2\2\u0180\u0182\7\17\2\2\u0181\u0180\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\f\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\b<\3\2\u0186x\3\2\2\2\u0187\u0189\t\4\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\b=\3\2\u018dz\3\2\2\2\u018e\u0193\5\u0083B\2\u018f\u0192"+
		"\5\u0085C\2\u0190\u0192\5\u0083B\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"|\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019b\5\177@\2\u0197\u019a\5\u0085"+
		"C\2\u0198\u019a\5\177@\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c~\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019e\u01a1\5\u0081A\2\u019f\u01a1\5\u0083B\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u0080\3\2\2\2\u01a2\u01a3\4c"+
		"|\2\u01a3\u0082\3\2\2\2\u01a4\u01a5\4C\\\2\u01a5\u0084\3\2\2\2\u01a6\u01a7"+
		"\4\62;\2\u01a7\u0086\3\2\2\2\22\2\u0104\u0109\u010f\u011c\u011e\u0165"+
		"\u016e\u017b\u0181\u018a\u0191\u0193\u0199\u019b\u01a0\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}