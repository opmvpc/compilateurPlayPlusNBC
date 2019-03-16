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
		T__0=1, T__1=2, T__2=3, VOID=4, IF=5, ELSE=6, THEN=7, REPEAT=8, WHILE=9, 
		TRUE=10, FALSE=11, IMPORT=12, LEFT=13, RIGHT=14, UP=15, DOWN=16, JUMP=17, 
		FIGHT=18, DIG=19, BOOL=20, INT=21, CHAR=22, STRUCT=23, CONST=24, ENUM=25, 
		TYPEDEF=26, ENTIER=27, STRING=28, CHARACTER=29, PLUS=30, MINUS=31, MUL=32, 
		DIV=33, POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, 
		GREATER=40, EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, 
		RBRACE=46, LBRACKET=47, RBRACKET=48, DOUBLEQUOTE=49, SINGLEQUOTE=50, BACKSLASH=51, 
		SEMICOLON=52, COLON=53, COMMA=54, DOT=55, AND=56, OR=57, AMPERSAND=58, 
		COMMENTAIRES=59, BLOCK_COMMENT=60, LINE_COMMENT=61, NEWLINE=62, WS=63, 
		ID=64;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", 
		"TRUE", "FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "BOOL", "INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "AMPERSAND", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", 
		"WS", "ID", "LETTRE", "LOWER", "UPPER", "CHIFFRE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void main()'", "'return void;'", "'.map'", "'void'", "'if'", "'else'", 
		"'then'", "'repeat'", "'while'", "'true'", "'false'", "'#import'", "'left'", 
		"'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", "'bool'", "'int'", 
		"'char'", "'struct'", "'const'", "'enum'", "'typedef'", null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", 
		"'>'", "'>='", "'<='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", 
		"'''", "'\\'", "';'", "':'", "','", "'.'", "'&&'", "'||'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", 
		"TRUE", "FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "BOOL", "INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "ENTIER", 
		"STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "POW", "EQUAL", 
		"AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "AMPERSAND", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", 
		"WS", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\5\34\u0127\n\34\3\34"+
		"\6\34\u012a\n\34\r\34\16\34\u012b\3\35\3\35\6\35\u0130\n\35\r\35\16\35"+
		"\u0131\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u013f"+
		"\n\36\f\36\16\36\u0142\13\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\5<\u0188\n<\3<\3<\3=\3=\3=\7=\u018f\n=\f=\16=\u0192\13=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\7>\u019c\n>\f>\16>\u019f\13>\3>\3>\3?\5?\u01a4\n?\3?\3?\3?"+
		"\3?\3@\6@\u01ab\n@\r@\16@\u01ac\3@\3@\3A\3A\3A\7A\u01b4\nA\fA\16A\u01b7"+
		"\13A\3B\3B\5B\u01bb\nB\3C\3C\3D\3D\3E\3E\3\u0190\2F\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083\2\u0085\2\u0087\2\u0089\2\3\2\5\6\2\f\f\17\17..^^\4\2\f"+
		"\f\17\17\4\2\13\13\"\"\u01d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\3\u008b\3\2\2\2\5\u0097\3\2\2\2\7\u00a4\3\2\2\2\t\u00a9\3\2\2"+
		"\2\13\u00ae\3\2\2\2\r\u00b1\3\2\2\2\17\u00b6\3\2\2\2\21\u00bb\3\2\2\2"+
		"\23\u00c2\3\2\2\2\25\u00c8\3\2\2\2\27\u00cd\3\2\2\2\31\u00d3\3\2\2\2\33"+
		"\u00db\3\2\2\2\35\u00e0\3\2\2\2\37\u00e6\3\2\2\2!\u00e9\3\2\2\2#\u00ee"+
		"\3\2\2\2%\u00f3\3\2\2\2\'\u00f9\3\2\2\2)\u00fd\3\2\2\2+\u0102\3\2\2\2"+
		"-\u0106\3\2\2\2/\u010b\3\2\2\2\61\u0112\3\2\2\2\63\u0118\3\2\2\2\65\u011d"+
		"\3\2\2\2\67\u0126\3\2\2\29\u012d\3\2\2\2;\u0135\3\2\2\2=\u0145\3\2\2\2"+
		"?\u0147\3\2\2\2A\u0149\3\2\2\2C\u014b\3\2\2\2E\u014d\3\2\2\2G\u014f\3"+
		"\2\2\2I\u0152\3\2\2\2K\u0154\3\2\2\2M\u0156\3\2\2\2O\u0159\3\2\2\2Q\u015b"+
		"\3\2\2\2S\u015d\3\2\2\2U\u0160\3\2\2\2W\u0163\3\2\2\2Y\u0165\3\2\2\2["+
		"\u0167\3\2\2\2]\u0169\3\2\2\2_\u016b\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2"+
		"\2\2e\u0171\3\2\2\2g\u0173\3\2\2\2i\u0175\3\2\2\2k\u0177\3\2\2\2m\u0179"+
		"\3\2\2\2o\u017b\3\2\2\2q\u017d\3\2\2\2s\u0180\3\2\2\2u\u0183\3\2\2\2w"+
		"\u0187\3\2\2\2y\u018b\3\2\2\2{\u0198\3\2\2\2}\u01a3\3\2\2\2\177\u01aa"+
		"\3\2\2\2\u0081\u01b0\3\2\2\2\u0083\u01ba\3\2\2\2\u0085\u01bc\3\2\2\2\u0087"+
		"\u01be\3\2\2\2\u0089\u01c0\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d\7q\2"+
		"\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2\u008f\u0090\7\"\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7*\2\2\u0095\u0096\7+\2\2\u0096\4\3\2\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7x\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7=\2\2\u00a3"+
		"\6\3\2\2\2\u00a4\u00a5\7\60\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7c\2\2"+
		"\u00a7\u00a8\7r\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7q"+
		"\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7f\2\2\u00ad\n\3\2\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7h\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\16\3\2\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\20\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7r\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\22\3\2\2\2\u00c2"+
		"\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7"+
		"t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\26\3\2\2\2\u00cd\u00ce"+
		"\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\30\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7o\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\32\3\2\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7"+
		"g\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7v\2\2\u00df\34\3\2\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7j\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7r\2\2\u00e8"+
		" \3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7y\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7l\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7o\2\2\u00f1\u00f2\7r\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7v\2\2"+
		"\u00f8&\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7i\2"+
		"\2\u00fc(\3\2\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7"+
		"q\2\2\u0100\u0101\7n\2\2\u0101*\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7v\2\2\u0105,\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108"+
		"\7j\2\2\u0108\u0109\7c\2\2\u0109\u010a\7t\2\2\u010a.\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7e\2\2\u0110\u0111\7v\2\2\u0111\60\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2"+
		"\u0117\62\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b\7"+
		"w\2\2\u011b\u011c\7o\2\2\u011c\64\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7{\2\2\u011f\u0120\7r\2\2\u0120\u0121\7g\2\2\u0121\u0122\7f\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7h\2\2\u0124\66\3\2\2\2\u0125\u0127\5? \2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5\u0089"+
		"E\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c8\3\2\2\2\u012d\u012f\5c\62\2\u012e\u0130\n\2\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\5c\62\2\u0134:\3\2\2\2\u0135"+
		"\u0140\5e\63\2\u0136\u013f\5\u0089E\2\u0137\u013f\5\u0083B\2\u0138\u013f"+
		"\5k\66\2\u0139\u013f\5o8\2\u013a\u013f\5u;\2\u013b\u013f\5C\"\2\u013c"+
		"\u013f\5g\64\2\u013d\u013f\5i\65\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2"+
		"\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\5e\63\2\u0144<\3\2\2\2\u0145\u0146\7-\2\2\u0146"+
		">\3\2\2\2\u0147\u0148\7/\2\2\u0148@\3\2\2\2\u0149\u014a\7,\2\2\u014aB"+
		"\3\2\2\2\u014b\u014c\7\61\2\2\u014cD\3\2\2\2\u014d\u014e\7`\2\2\u014e"+
		"F\3\2\2\2\u014f\u0150\7?\2\2\u0150\u0151\7?\2\2\u0151H\3\2\2\2\u0152\u0153"+
		"\7?\2\2\u0153J\3\2\2\2\u0154\u0155\7#\2\2\u0155L\3\2\2\2\u0156\u0157\7"+
		"#\2\2\u0157\u0158\7?\2\2\u0158N\3\2\2\2\u0159\u015a\7>\2\2\u015aP\3\2"+
		"\2\2\u015b\u015c\7@\2\2\u015cR\3\2\2\2\u015d\u015e\7@\2\2\u015e\u015f"+
		"\7?\2\2\u015fT\3\2\2\2\u0160\u0161\7>\2\2\u0161\u0162\7?\2\2\u0162V\3"+
		"\2\2\2\u0163\u0164\7*\2\2\u0164X\3\2\2\2\u0165\u0166\7+\2\2\u0166Z\3\2"+
		"\2\2\u0167\u0168\7}\2\2\u0168\\\3\2\2\2\u0169\u016a\7\177\2\2\u016a^\3"+
		"\2\2\2\u016b\u016c\7]\2\2\u016c`\3\2\2\2\u016d\u016e\7_\2\2\u016eb\3\2"+
		"\2\2\u016f\u0170\7$\2\2\u0170d\3\2\2\2\u0171\u0172\7)\2\2\u0172f\3\2\2"+
		"\2\u0173\u0174\7^\2\2\u0174h\3\2\2\2\u0175\u0176\7=\2\2\u0176j\3\2\2\2"+
		"\u0177\u0178\7<\2\2\u0178l\3\2\2\2\u0179\u017a\7.\2\2\u017an\3\2\2\2\u017b"+
		"\u017c\7\60\2\2\u017cp\3\2\2\2\u017d\u017e\7(\2\2\u017e\u017f\7(\2\2\u017f"+
		"r\3\2\2\2\u0180\u0181\7~\2\2\u0181\u0182\7~\2\2\u0182t\3\2\2\2\u0183\u0184"+
		"\7(\2\2\u0184v\3\2\2\2\u0185\u0188\5y=\2\u0186\u0188\5{>\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b<\2\2\u018a"+
		"x\3\2\2\2\u018b\u018c\5C\"\2\u018c\u0190\5A!\2\u018d\u018f\13\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\5A!\2\u0194\u0195"+
		"\5C\"\2\u0195\u0196\3\2\2\2\u0196\u0197\b=\2\2\u0197z\3\2\2\2\u0198\u0199"+
		"\5C\"\2\u0199\u019d\5C\"\2\u019a\u019c\n\3\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\b>\2\2\u01a1|\3\2\2\2\u01a2\u01a4"+
		"\7\17\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2"+
		"\u01a5\u01a6\7\f\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b?\3\2\u01a8~\3\2"+
		"\2\2\u01a9\u01ab\t\4\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b@"+
		"\3\2\u01af\u0080\3\2\2\2\u01b0\u01b5\5\u0083B\2\u01b1\u01b4\5\u0089E\2"+
		"\u01b2\u01b4\5\u0083B\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u0082\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\5\u0085C\2\u01b9\u01bb\5\u0087D\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u0084\3\2\2\2\u01bc\u01bd"+
		"\4c|\2\u01bd\u0086\3\2\2\2\u01be\u01bf\4C\\\2\u01bf\u0088\3\2\2\2\u01c0"+
		"\u01c1\4\62;\2\u01c1\u008a\3\2\2\2\20\2\u0126\u012b\u0131\u013e\u0140"+
		"\u0187\u0190\u019d\u01a3\u01ac\u01b3\u01b5\u01ba\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}