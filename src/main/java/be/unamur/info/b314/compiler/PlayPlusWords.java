// Generated from tmp/PlayPlusWords.g4 by ANTLR 4.6
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
		VOID=1, MAIN=2, IF=3, ELSE=4, THEN=5, REPEAT=6, WHILE=7, TRUE=8, FALSE=9, 
		IMPORT=10, LEFT=11, RIGHT=12, UP=13, DOWN=14, JUMP=15, FIGHT=16, DIG=17, 
		BOOL=18, INT=19, CHAR=20, STRUCT=21, CONST=22, ENUM=23, TYPEDEF=24, NATUREL=25, 
		FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, DIV=32, MOD=33, 
		POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, GREATER=40, 
		EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, 
		LBRACKET=47, RBRACKET=48, SINGLEQUOTE=49, BACKSLASH=50, SEMICOLON=51, 
		COLON=52, COMMA=53, DOT=54, AND=55, OR=56, USELESSTOKEN=57, COMMENTAIRES=58, 
		BLOCK_COMMENT=59, LINE_COMMENT=60, NEWLINE=61, WS=62, MAPSTART=63, HASHTAG=64, 
		RETURN=65, MAP=66, ROBOT=67, TRESOR=68, PELOUSE=69, PALMIER=70, PONT=71, 
		BUISSON=72, TONNEAU=73, PUIT=74, VIDE=75, SQUELLETTE=76, ID=77;
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
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "USELESSTOKEN", 
		"COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "MAPSTART", 
		"HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", "PALMIER", "PONT", 
		"BUISSON", "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", "ID", "DOUBLEQUOTE", 
		"LETTRE", "LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'main('", "'if'", "'else'", "'then'", "'repeat'", "'while'", 
		"'true'", "'false'", "'import'", "'left'", "'right'", "'up'", "'down'", 
		"'jump'", "'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", 
		"'const'", "'enum'", "'typedef'", null, null, null, null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", 
		"'>='", "'<='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", 
		"';'", "':'", "','", "'.'", "'&&'", "'||'", "'$'", null, null, null, null, 
		null, null, "'#'", "'return'", null, "'@'", "'X'", "'G'", "'P'", "'A'", 
		"'B'", "'T'", "'S'", "'_'", "'Q'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "MAIN", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", 
		"FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"BOOL", "INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", 
		"FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
		"EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", 
		"ESMALLER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "USELESSTOKEN", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", 
		"NEWLINE", "WS", "MAPSTART", "HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", 
		"PELOUSE", "PALMIER", "PONT", "BUISSON", "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2O\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\6\32\u012a\n\32\r\32\16\32\u012b\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\6\34\u0139\n\34\r\34\16\34"+
		"\u013a\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0147\n"+
		"\35\f\35\16\35\u014a\13\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3"+
		";\5;\u0190\n;\3;\3;\3<\3<\3<\7<\u0197\n<\f<\16<\u019a\13<\3<\3<\3<\3<"+
		"\3<\3=\3=\3=\7=\u01a4\n=\f=\16=\u01a7\13=\3=\3=\3>\5>\u01ac\n>\3>\3>\3"+
		">\3>\3?\6?\u01b3\n?\r?\16?\u01b4\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3K\3K\3L\3L\3M\3M\3N\3N\3N\7N\u01e4\nN\fN\16N\u01e7\13N\3O\3O\3P\3P"+
		"\5P\u01ed\nP\3Q\3Q\3R\3R\3S\3S\3\u0198\2T\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\3\2\5\7"+
		"\2\f\f\17\17$$..^^\4\2\f\f\17\17\4\2\13\13\"\"\u01ff\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\3\u00a7\3\2\2\2\5\u00ac\3\2\2\2\7\u00b2\3\2\2"+
		"\2\t\u00b5\3\2\2\2\13\u00ba\3\2\2\2\r\u00bf\3\2\2\2\17\u00c6\3\2\2\2\21"+
		"\u00cc\3\2\2\2\23\u00d1\3\2\2\2\25\u00d7\3\2\2\2\27\u00de\3\2\2\2\31\u00e3"+
		"\3\2\2\2\33\u00e9\3\2\2\2\35\u00ec\3\2\2\2\37\u00f1\3\2\2\2!\u00f6\3\2"+
		"\2\2#\u00fc\3\2\2\2%\u0100\3\2\2\2\'\u0105\3\2\2\2)\u0109\3\2\2\2+\u010e"+
		"\3\2\2\2-\u0115\3\2\2\2/\u011b\3\2\2\2\61\u0120\3\2\2\2\63\u0129\3\2\2"+
		"\2\65\u012d\3\2\2\2\67\u0136\3\2\2\29\u013e\3\2\2\2;\u014d\3\2\2\2=\u014f"+
		"\3\2\2\2?\u0151\3\2\2\2A\u0153\3\2\2\2C\u0155\3\2\2\2E\u0157\3\2\2\2G"+
		"\u0159\3\2\2\2I\u015c\3\2\2\2K\u015e\3\2\2\2M\u0160\3\2\2\2O\u0163\3\2"+
		"\2\2Q\u0165\3\2\2\2S\u0167\3\2\2\2U\u016a\3\2\2\2W\u016d\3\2\2\2Y\u016f"+
		"\3\2\2\2[\u0171\3\2\2\2]\u0173\3\2\2\2_\u0175\3\2\2\2a\u0177\3\2\2\2c"+
		"\u0179\3\2\2\2e\u017b\3\2\2\2g\u017d\3\2\2\2i\u017f\3\2\2\2k\u0181\3\2"+
		"\2\2m\u0183\3\2\2\2o\u0185\3\2\2\2q\u0188\3\2\2\2s\u018b\3\2\2\2u\u018f"+
		"\3\2\2\2w\u0193\3\2\2\2y\u01a0\3\2\2\2{\u01ab\3\2\2\2}\u01b2\3\2\2\2\177"+
		"\u01b8\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c0\3\2\2\2\u0085\u01c7\3\2"+
		"\2\2\u0087\u01cc\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u01d0\3\2\2\2\u008d"+
		"\u01d2\3\2\2\2\u008f\u01d4\3\2\2\2\u0091\u01d6\3\2\2\2\u0093\u01d8\3\2"+
		"\2\2\u0095\u01da\3\2\2\2\u0097\u01dc\3\2\2\2\u0099\u01de\3\2\2\2\u009b"+
		"\u01e0\3\2\2\2\u009d\u01e8\3\2\2\2\u009f\u01ec\3\2\2\2\u00a1\u01ee\3\2"+
		"\2\2\u00a3\u01f0\3\2\2\2\u00a5\u01f2\3\2\2\2\u00a7\u00a8\7x\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7f\2\2\u00ab\4\3\2\2\2\u00ac"+
		"\u00ad\7o\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7*\2\2\u00b1\6\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h"+
		"\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\n\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc"+
		"\7j\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\f\3\2\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7v\2\2\u00c5\16\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\20\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7"+
		"w\2\2\u00cf\u00d0\7g\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\24\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7r\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7v\2\2\u00dd\26\3\2\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\30\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7"+
		"i\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7v\2\2\u00e8\32\3\2\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\7r\2\2\u00eb\34\3\2\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7p\2\2\u00f0\36\3\2\2\2\u00f1\u00f2"+
		"\7l\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7r\2\2\u00f5"+
		" \3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7i\2\2\u00f9"+
		"\u00fa\7j\2\2\u00fa\u00fb\7v\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"\u00fe\7k\2\2\u00fe\u00ff\7i\2\2\u00ff$\3\2\2\2\u0100\u0101\7d\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7q\2\2\u0103\u0104\7n\2\2\u0104&\3\2\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108(\3\2\2\2\u0109"+
		"\u010a\7e\2\2\u010a\u010b\7j\2\2\u010b\u010c\7c\2\2\u010c\u010d\7t\2\2"+
		"\u010d*\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2"+
		"\2\u0111\u0112\7w\2\2\u0112\u0113\7e\2\2\u0113\u0114\7v\2\2\u0114,\3\2"+
		"\2\2\u0115\u0116\7e\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7u\2\2\u0119\u011a\7v\2\2\u011a.\3\2\2\2\u011b\u011c\7g\2\2\u011c\u011d"+
		"\7p\2\2\u011d\u011e\7w\2\2\u011e\u011f\7o\2\2\u011f\60\3\2\2\2\u0120\u0121"+
		"\7v\2\2\u0121\u0122\7{\2\2\u0122\u0123\7r\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7f\2\2\u0125\u0126\7g\2\2\u0126\u0127\7h\2\2\u0127\62\3\2\2\2\u0128"+
		"\u012a\5\u00a5S\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\64\3\2\2\2\u012d\u012e\5\u009dO\2\u012e"+
		"\u012f\5\u009bN\2\u012f\u0130\7\60\2\2\u0130\u0131\7o\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7r\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5\u009dO\2"+
		"\u0135\66\3\2\2\2\u0136\u0138\5\u009dO\2\u0137\u0139\n\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\5\u009dO\2\u013d8\3\2\2\2\u013e\u0148\5c\62"+
		"\2\u013f\u0147\5\u00a5S\2\u0140\u0147\5\u009fP\2\u0141\u0147\5i\65\2\u0142"+
		"\u0147\5m\67\2\u0143\u0147\5A!\2\u0144\u0147\5e\63\2\u0145\u0147\5g\64"+
		"\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142"+
		"\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5c\62\2\u014c:\3\2\2\2\u014d\u014e"+
		"\7-\2\2\u014e<\3\2\2\2\u014f\u0150\7/\2\2\u0150>\3\2\2\2\u0151\u0152\7"+
		",\2\2\u0152@\3\2\2\2\u0153\u0154\7\61\2\2\u0154B\3\2\2\2\u0155\u0156\7"+
		"\'\2\2\u0156D\3\2\2\2\u0157\u0158\7`\2\2\u0158F\3\2\2\2\u0159\u015a\7"+
		"?\2\2\u015a\u015b\7?\2\2\u015bH\3\2\2\2\u015c\u015d\7?\2\2\u015dJ\3\2"+
		"\2\2\u015e\u015f\7#\2\2\u015fL\3\2\2\2\u0160\u0161\7#\2\2\u0161\u0162"+
		"\7?\2\2\u0162N\3\2\2\2\u0163\u0164\7>\2\2\u0164P\3\2\2\2\u0165\u0166\7"+
		"@\2\2\u0166R\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169\7?\2\2\u0169T\3\2"+
		"\2\2\u016a\u016b\7>\2\2\u016b\u016c\7?\2\2\u016cV\3\2\2\2\u016d\u016e"+
		"\7*\2\2\u016eX\3\2\2\2\u016f\u0170\7+\2\2\u0170Z\3\2\2\2\u0171\u0172\7"+
		"}\2\2\u0172\\\3\2\2\2\u0173\u0174\7\177\2\2\u0174^\3\2\2\2\u0175\u0176"+
		"\7]\2\2\u0176`\3\2\2\2\u0177\u0178\7_\2\2\u0178b\3\2\2\2\u0179\u017a\7"+
		")\2\2\u017ad\3\2\2\2\u017b\u017c\7^\2\2\u017cf\3\2\2\2\u017d\u017e\7="+
		"\2\2\u017eh\3\2\2\2\u017f\u0180\7<\2\2\u0180j\3\2\2\2\u0181\u0182\7.\2"+
		"\2\u0182l\3\2\2\2\u0183\u0184\7\60\2\2\u0184n\3\2\2\2\u0185\u0186\7(\2"+
		"\2\u0186\u0187\7(\2\2\u0187p\3\2\2\2\u0188\u0189\7~\2\2\u0189\u018a\7"+
		"~\2\2\u018ar\3\2\2\2\u018b\u018c\7&\2\2\u018ct\3\2\2\2\u018d\u0190\5w"+
		"<\2\u018e\u0190\5y=\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\b;\2\2\u0192v\3\2\2\2\u0193\u0194\5A!\2\u0194\u0198"+
		"\5? \2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u019c\5? \2\u019c\u019d\5A!\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\b<\2\2\u019fx\3\2\2\2\u01a0\u01a1\5A!\2\u01a1\u01a5\5A!\2\u01a2\u01a4"+
		"\n\3\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\b="+
		"\2\2\u01a9z\3\2\2\2\u01aa\u01ac\7\17\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\f\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\b>\3\2\u01b0|\3\2\2\2\u01b1\u01b3\t\4\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\b?\3\2\u01b7~\3\2\2\2\u01b8\u01b9\7o\2\2\u01b9\u01ba"+
		"\7c\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5i\65\2\u01bd"+
		"\u0080\3\2\2\2\u01be\u01bf\7%\2\2\u01bf\u0082\3\2\2\2\u01c0\u01c1\7t\2"+
		"\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5"+
		"\7t\2\2\u01c5\u01c6\7p\2\2\u01c6\u0084\3\2\2\2\u01c7\u01c8\5m\67\2\u01c8"+
		"\u01c9\7o\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7r\2\2\u01cb\u0086\3\2\2"+
		"\2\u01cc\u01cd\7B\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf\7Z\2\2\u01cf\u008a"+
		"\3\2\2\2\u01d0\u01d1\7I\2\2\u01d1\u008c\3\2\2\2\u01d2\u01d3\7R\2\2\u01d3"+
		"\u008e\3\2\2\2\u01d4\u01d5\7C\2\2\u01d5\u0090\3\2\2\2\u01d6\u01d7\7D\2"+
		"\2\u01d7\u0092\3\2\2\2\u01d8\u01d9\7V\2\2\u01d9\u0094\3\2\2\2\u01da\u01db"+
		"\7U\2\2\u01db\u0096\3\2\2\2\u01dc\u01dd\7a\2\2\u01dd\u0098\3\2\2\2\u01de"+
		"\u01df\7S\2\2\u01df\u009a\3\2\2\2\u01e0\u01e5\5\u009fP\2\u01e1\u01e4\5"+
		"\u00a5S\2\u01e2\u01e4\5\u009fP\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u009c"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7$\2\2\u01e9\u009e\3\2\2\2\u01ea"+
		"\u01ed\5\u00a1Q\2\u01eb\u01ed\5\u00a3R\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u00a0\3\2\2\2\u01ee\u01ef\4c|\2\u01ef\u00a2\3\2\2\2\u01f0"+
		"\u01f1\4C\\\2\u01f1\u00a4\3\2\2\2\u01f2\u01f3\4\62;\2\u01f3\u00a6\3\2"+
		"\2\2\17\2\u012b\u013a\u0146\u0148\u018f\u0198\u01a5\u01ab\u01b4\u01e3"+
		"\u01e5\u01ec\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}