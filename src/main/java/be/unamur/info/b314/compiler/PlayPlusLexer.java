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
		INT=18, CHAR=19, STRUCT=20, CONST=21, ENUM=22, TYPEDEF=23, NATUREL=24, 
		ENTIER=25, FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, 
		DIV=32, MOD=33, POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, 
		GREATER=40, EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, 
		RBRACE=46, LBRACKET=47, RBRACKET=48, SINGLEQUOTE=49, BACKSLASH=50, SEMICOLON=51, 
		COLON=52, COMMA=53, DOT=54, AND=55, OR=56, AMPERSAND=57, COMMENTAIRES=58, 
		BLOCK_COMMENT=59, LINE_COMMENT=60, NEWLINE=61, WS=62, MAPSTART=63, HASHTAG=64, 
		MAIN=65, RETURN=66, MAP=67, ROBOT=68, TRESOR=69, PELOUSE=70, PALMIER=71, 
		PONT=72, BUISSON=73, TONNEAU=74, PUIT=75, VIDE=76, SQUELLETTE=77, ID=78;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", "IMPORT", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", 
		"CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "ENTIER", "FILE", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", 
		"BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", "OR", "AMPERSAND", 
		"COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "MAPSTART", 
		"HASHTAG", "MAIN", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", "PALMIER", 
		"PONT", "BUISSON", "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", "ID", "DOUBLEQUOTE", 
		"LETTRE", "LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'if'", "'else'", "'then'", "'repeat'", "'while'", "'true'", 
		"'false'", "'import'", "'left'", "'right'", "'up'", "'down'", "'jump'", 
		"'fight'", "'dig'", "'bool'", "'int'", "'char'", "'struct'", "'const'", 
		"'enum'", "'typedef'", null, null, null, null, null, "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", "'>='", 
		"'<='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", "';'", 
		"':'", "','", "'.'", "'&&'", "'||'", "'&'", null, null, null, null, null, 
		null, "'#'", null, "'return'", null, "'@'", "'X'", "'G'", "'P'", "'A'", 
		"'B'", "'T'", "'S'", "'_'", "'Q'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE", 
		"IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", 
		"INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "ENTIER", 
		"FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
		"EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", 
		"ESMALLER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "AMPERSAND", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", 
		"WS", "MAPSTART", "HASHTAG", "MAIN", "RETURN", "MAP", "ROBOT", "TRESOR", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0208\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\6\31\u0126\n\31\r\31\16\31\u0127\3\32\5\32\u012b\n\32\3\32\6\32\u012e"+
		"\n\32\r\32\16\32\u012f\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\6\34\u013d\n\34\r\34\16\34\u013e\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u014c\n\35\f\35\16\35\u014f\13\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\5;\u0195\n;\3;\3;\3<\3<\3<\7"+
		"<\u019c\n<\f<\16<\u019f\13<\3<\3<\3<\3<\3<\3=\3=\3=\7=\u01a9\n=\f=\16"+
		"=\u01ac\13=\3=\3=\3>\5>\u01b1\n>\3>\3>\3>\3>\3?\6?\u01b8\n?\r?\16?\u01b9"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\7B\u01ce\nB\fB"+
		"\16B\u01d1\13B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\7O\u01f8\nO\f"+
		"O\16O\u01fb\13O\3P\3P\3Q\3Q\5Q\u0201\nQ\3R\3R\3S\3S\3T\3T\3\u019d\2U\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\u00a1\2\u00a3"+
		"\2\u00a5\2\u00a7\2\3\2\5\7\2\f\f\17\17$$..^^\4\2\f\f\17\17\4\2\13\13\""+
		"\"\u0217\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u00a9\3\2\2\2\5\u00ae\3\2\2\2\7\u00b1\3\2\2\2\t\u00b6\3\2\2\2\13"+
		"\u00bb\3\2\2\2\r\u00c2\3\2\2\2\17\u00c8\3\2\2\2\21\u00cd\3\2\2\2\23\u00d3"+
		"\3\2\2\2\25\u00da\3\2\2\2\27\u00df\3\2\2\2\31\u00e5\3\2\2\2\33\u00e8\3"+
		"\2\2\2\35\u00ed\3\2\2\2\37\u00f2\3\2\2\2!\u00f8\3\2\2\2#\u00fc\3\2\2\2"+
		"%\u0101\3\2\2\2\'\u0105\3\2\2\2)\u010a\3\2\2\2+\u0111\3\2\2\2-\u0117\3"+
		"\2\2\2/\u011c\3\2\2\2\61\u0125\3\2\2\2\63\u012a\3\2\2\2\65\u0131\3\2\2"+
		"\2\67\u013a\3\2\2\29\u0142\3\2\2\2;\u0152\3\2\2\2=\u0154\3\2\2\2?\u0156"+
		"\3\2\2\2A\u0158\3\2\2\2C\u015a\3\2\2\2E\u015c\3\2\2\2G\u015e\3\2\2\2I"+
		"\u0161\3\2\2\2K\u0163\3\2\2\2M\u0165\3\2\2\2O\u0168\3\2\2\2Q\u016a\3\2"+
		"\2\2S\u016c\3\2\2\2U\u016f\3\2\2\2W\u0172\3\2\2\2Y\u0174\3\2\2\2[\u0176"+
		"\3\2\2\2]\u0178\3\2\2\2_\u017a\3\2\2\2a\u017c\3\2\2\2c\u017e\3\2\2\2e"+
		"\u0180\3\2\2\2g\u0182\3\2\2\2i\u0184\3\2\2\2k\u0186\3\2\2\2m\u0188\3\2"+
		"\2\2o\u018a\3\2\2\2q\u018d\3\2\2\2s\u0190\3\2\2\2u\u0194\3\2\2\2w\u0198"+
		"\3\2\2\2y\u01a5\3\2\2\2{\u01b0\3\2\2\2}\u01b7\3\2\2\2\177\u01bd\3\2\2"+
		"\2\u0081\u01c3\3\2\2\2\u0083\u01c5\3\2\2\2\u0085\u01d4\3\2\2\2\u0087\u01db"+
		"\3\2\2\2\u0089\u01e0\3\2\2\2\u008b\u01e2\3\2\2\2\u008d\u01e4\3\2\2\2\u008f"+
		"\u01e6\3\2\2\2\u0091\u01e8\3\2\2\2\u0093\u01ea\3\2\2\2\u0095\u01ec\3\2"+
		"\2\2\u0097\u01ee\3\2\2\2\u0099\u01f0\3\2\2\2\u009b\u01f2\3\2\2\2\u009d"+
		"\u01f4\3\2\2\2\u009f\u01fc\3\2\2\2\u00a1\u0200\3\2\2\2\u00a3\u0202\3\2"+
		"\2\2\u00a5\u0204\3\2\2\2\u00a7\u0206\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7f\2\2\u00ad\4\3\2\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\b\3\2\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\n\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7r"+
		"\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\f"+
		"\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\20\3\2\2\2\u00cd"+
		"\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\22\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7"+
		"o\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\24\3\2\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7h\2\2\u00dd\u00de\7v\2\2\u00de\26\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7j\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\30\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7r\2\2\u00e7\32\3\2\2\2\u00e8"+
		"\u00e9\7f\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7p\2\2"+
		"\u00ec\34\3\2\2\2\u00ed\u00ee\7l\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7"+
		"o\2\2\u00f0\u00f1\7r\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7i\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		" \3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7i\2\2\u00fb"+
		"\"\3\2\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7n\2\2\u0100$\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7v\2\2\u0104&\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7j\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0109\7t\2\2\u0109(\3\2\2\2\u010a\u010b\7u\2\2\u010b"+
		"\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e\u010f\7e\2\2"+
		"\u010f\u0110\7v\2\2\u0110*\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7q\2"+
		"\2\u0113\u0114\7p\2\2\u0114\u0115\7u\2\2\u0115\u0116\7v\2\2\u0116,\3\2"+
		"\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a\7w\2\2\u011a\u011b"+
		"\7o\2\2\u011b.\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7{\2\2\u011e\u011f"+
		"\7r\2\2\u011f\u0120\7g\2\2\u0120\u0121\7f\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7h\2\2\u0123\60\3\2\2\2\u0124\u0126\5\u00a7T\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\62\3\2\2\2\u0129\u012b\5=\37\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u012d\3\2\2\2\u012c\u012e\5\u00a7T\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\64\3\2\2"+
		"\2\u0131\u0132\5\u009fP\2\u0132\u0133\5\u009dO\2\u0133\u0134\7\60\2\2"+
		"\u0134\u0135\7o\2\2\u0135\u0136\7c\2\2\u0136\u0137\7r\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\5\u009fP\2\u0139\66\3\2\2\2\u013a\u013c\5\u009fP"+
		"\2\u013b\u013d\n\2\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\5\u009fP"+
		"\2\u01418\3\2\2\2\u0142\u014d\5c\62\2\u0143\u014c\5\u00a7T\2\u0144\u014c"+
		"\5\u00a1Q\2\u0145\u014c\5i\65\2\u0146\u014c\5m\67\2\u0147\u014c\5s:\2"+
		"\u0148\u014c\5A!\2\u0149\u014c\5e\63\2\u014a\u014c\5g\64\2\u014b\u0143"+
		"\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b"+
		"\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5c\62\2\u0151:\3\2\2\2"+
		"\u0152\u0153\7-\2\2\u0153<\3\2\2\2\u0154\u0155\7/\2\2\u0155>\3\2\2\2\u0156"+
		"\u0157\7,\2\2\u0157@\3\2\2\2\u0158\u0159\7\61\2\2\u0159B\3\2\2\2\u015a"+
		"\u015b\7\'\2\2\u015bD\3\2\2\2\u015c\u015d\7`\2\2\u015dF\3\2\2\2\u015e"+
		"\u015f\7?\2\2\u015f\u0160\7?\2\2\u0160H\3\2\2\2\u0161\u0162\7?\2\2\u0162"+
		"J\3\2\2\2\u0163\u0164\7#\2\2\u0164L\3\2\2\2\u0165\u0166\7#\2\2\u0166\u0167"+
		"\7?\2\2\u0167N\3\2\2\2\u0168\u0169\7>\2\2\u0169P\3\2\2\2\u016a\u016b\7"+
		"@\2\2\u016bR\3\2\2\2\u016c\u016d\7@\2\2\u016d\u016e\7?\2\2\u016eT\3\2"+
		"\2\2\u016f\u0170\7>\2\2\u0170\u0171\7?\2\2\u0171V\3\2\2\2\u0172\u0173"+
		"\7*\2\2\u0173X\3\2\2\2\u0174\u0175\7+\2\2\u0175Z\3\2\2\2\u0176\u0177\7"+
		"}\2\2\u0177\\\3\2\2\2\u0178\u0179\7\177\2\2\u0179^\3\2\2\2\u017a\u017b"+
		"\7]\2\2\u017b`\3\2\2\2\u017c\u017d\7_\2\2\u017db\3\2\2\2\u017e\u017f\7"+
		")\2\2\u017fd\3\2\2\2\u0180\u0181\7^\2\2\u0181f\3\2\2\2\u0182\u0183\7="+
		"\2\2\u0183h\3\2\2\2\u0184\u0185\7<\2\2\u0185j\3\2\2\2\u0186\u0187\7.\2"+
		"\2\u0187l\3\2\2\2\u0188\u0189\7\60\2\2\u0189n\3\2\2\2\u018a\u018b\7(\2"+
		"\2\u018b\u018c\7(\2\2\u018cp\3\2\2\2\u018d\u018e\7~\2\2\u018e\u018f\7"+
		"~\2\2\u018fr\3\2\2\2\u0190\u0191\7(\2\2\u0191t\3\2\2\2\u0192\u0195\5w"+
		"<\2\u0193\u0195\5y=\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\b;\2\2\u0197v\3\2\2\2\u0198\u0199\5A!\2\u0199\u019d"+
		"\5? \2\u019a\u019c\13\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a1\5? \2\u01a1\u01a2\5A!\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\b<\2\2\u01a4x\3\2\2\2\u01a5\u01a6\5A!\2\u01a6\u01aa\5A!\2\u01a7\u01a9"+
		"\n\3\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\b="+
		"\2\2\u01aez\3\2\2\2\u01af\u01b1\7\17\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\f\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\b>\3\2\u01b5|\3\2\2\2\u01b6\u01b8\t\4\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\b?\3\2\u01bc~\3\2\2\2\u01bd\u01be\7o\2\2\u01be\u01bf"+
		"\7c\2\2\u01bf\u01c0\7r\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5i\65\2\u01c2"+
		"\u0080\3\2\2\2\u01c3\u01c4\7%\2\2\u01c4\u0082\3\2\2\2\u01c5\u01c6\5\3"+
		"\2\2\u01c6\u01c7\7o\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca"+
		"\7p\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\5W,\2\u01cc\u01ce\5}?\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7+\2\2\u01d3"+
		"\u0084\3\2\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7v\2"+
		"\2\u01d7\u01d8\7w\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7p\2\2\u01da\u0086"+
		"\3\2\2\2\u01db\u01dc\5m\67\2\u01dc\u01dd\7o\2\2\u01dd\u01de\7c\2\2\u01de"+
		"\u01df\7r\2\2\u01df\u0088\3\2\2\2\u01e0\u01e1\7B\2\2\u01e1\u008a\3\2\2"+
		"\2\u01e2\u01e3\7Z\2\2\u01e3\u008c\3\2\2\2\u01e4\u01e5\7I\2\2\u01e5\u008e"+
		"\3\2\2\2\u01e6\u01e7\7R\2\2\u01e7\u0090\3\2\2\2\u01e8\u01e9\7C\2\2\u01e9"+
		"\u0092\3\2\2\2\u01ea\u01eb\7D\2\2\u01eb\u0094\3\2\2\2\u01ec\u01ed\7V\2"+
		"\2\u01ed\u0096\3\2\2\2\u01ee\u01ef\7U\2\2\u01ef\u0098\3\2\2\2\u01f0\u01f1"+
		"\7a\2\2\u01f1\u009a\3\2\2\2\u01f2\u01f3\7S\2\2\u01f3\u009c\3\2\2\2\u01f4"+
		"\u01f9\5\u00a1Q\2\u01f5\u01f8\5\u00a7T\2\u01f6\u01f8\5\u00a1Q\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u009e\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc"+
		"\u01fd\7$\2\2\u01fd\u00a0\3\2\2\2\u01fe\u0201\5\u00a3R\2\u01ff\u0201\5"+
		"\u00a5S\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u00a2\3\2\2\2"+
		"\u0202\u0203\4c|\2\u0203\u00a4\3\2\2\2\u0204\u0205\4C\\\2\u0205\u00a6"+
		"\3\2\2\2\u0206\u0207\4\62;\2\u0207\u00a8\3\2\2\2\22\2\u0127\u012a\u012f"+
		"\u013e\u014b\u014d\u0194\u019d\u01aa\u01b0\u01b9\u01cf\u01f7\u01f9\u0200"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}