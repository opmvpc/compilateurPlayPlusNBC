// Generated from C:/Users/camar/IdeaProjects/1819_IHDCB332_COMPILATEUR_GROUPE12/src/main/antlr4/tmp\PlayPlusWords.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, Commentaires=3, Entier=4, Chiffre=5, String=6, Character=7, 
		Bool=8, Id=9, Lettre=10, Type=11, Scalar=12, Structures=13, Arrays=14, 
		StructDecl=15, ListVarName=16, VarDecl=17, InitVariable=18, InitArrays=19, 
		InitStruct=20, ConstDecl=21, EnumDecl=22, TypedefDecl=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "Commentaires", "Entier", "Chiffre", "String", "Character", 
			"Bool", "Id", "Lettre", "Type", "Scalar", "Structures", "Arrays", "StructDecl", 
			"ListVarName", "VarDecl", "InitVariable", "InitArrays", "InitStruct", 
			"ConstDecl", "EnumDecl", "TypedefDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'(Chiffre | Lettre | : | . | & | { | z z | ;)*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "Commentaires", "Entier", "Chiffre", "String", 
			"Character", "Bool", "Id", "Lettre", "Type", "Scalar", "Structures", 
			"Arrays", "StructDecl", "ListVarName", "VarDecl", "InitVariable", "InitArrays", 
			"InitStruct", "ConstDecl", "EnumDecl", "TypedefDecl"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\5\2\63\n\2\3\2\3\2\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4"+
		"R\13\4\3\4\5\4U\n\4\3\4\5\4X\n\4\3\5\5\5[\n\5\3\5\6\5^\n\5\r\5\16\5_\3"+
		"\6\3\6\3\7\3\7\6\7f\n\7\r\7\16\7g\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a3\n\t\3\n"+
		"\3\n\3\n\6\n\u00a8\n\n\r\n\16\n\u00a9\3\13\3\13\3\f\3\f\5\f\u00b0\n\f"+
		"\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00bf\n\16\3\16\3\16\5\16\u00c3\n\16\3\16\3\16\3\17\3\17\6\17\u00c9\n"+
		"\17\r\17\16\17\u00ca\3\17\3\17\6\17\u00cf\n\17\r\17\16\17\u00d0\5\17\u00d3"+
		"\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00dc\n\21\3\21\3\21\3\21"+
		"\5\21\u00e1\n\21\3\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\3\22"+
		"\3\22\3\22\5\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22\3\22\3\22\3\22\5"+
		"\22\u00f6\n\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u010f\n\23\3\24\3\24\3\24\3\24\7\24\u0115\n\24\f\24\16\24\u0118\13\24"+
		"\5\24\u011a\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0127\n\25\f\25\16\25\u012a\13\25\5\25\u012c\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0139\n\26\3\26\3\26\5\26"+
		"\u013d\n\26\3\26\3\26\3\26\5\26\u0142\n\26\3\26\3\26\3\26\5\26\u0147\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014f\n\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0155\n\27\f\27\16\27\u0158\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5EP\u0156\2\31\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\3\2\6\4\2\13\13\"\"\3\2\62;\6\2\f\f\17\17..^^\4\2"+
		"C\\c|\2\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\62\3\2\2\2\59\3\2\2\2\7W\3\2\2\2\tZ\3\2\2\2\13a\3\2\2"+
		"\2\rc\3\2\2\2\17k\3\2\2\2\21\u00a2\3\2\2\2\23\u00a4\3\2\2\2\25\u00ab\3"+
		"\2\2\2\27\u00af\3\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2\35\u00c6\3\2"+
		"\2\2\37\u00d6\3\2\2\2!\u00e6\3\2\2\2#\u00e9\3\2\2\2%\u010e\3\2\2\2\'\u0110"+
		"\3\2\2\2)\u011d\3\2\2\2+\u012f\3\2\2\2-\u0148\3\2\2\2/\u015b\3\2\2\2\61"+
		"\63\7\17\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\f\2\2\65"+
		"\66\3\2\2\2\66\67\b\2\2\2\67\4\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\3\2\2>\6\3\2\2\2?@\7\61\2\2@A\7,\2\2"+
		"AE\3\2\2\2BD\13\2\2\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FH\3\2\2"+
		"\2GE\3\2\2\2HI\7,\2\2IX\7\61\2\2JK\7\61\2\2KL\7\61\2\2LP\3\2\2\2MO\13"+
		"\2\2\2NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\7"+
		"\17\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\f\2\2W?\3\2\2\2WJ\3\2\2\2X\b"+
		"\3\2\2\2Y[\7/\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\13\6\2]\\\3\2\2\2"+
		"^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\n\3\2\2\2ab\t\3\2\2b\f\3\2\2\2ce\7$\2"+
		"\2df\t\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7$\2"+
		"\2j\16\3\2\2\2kl\7*\2\2lm\7E\2\2mn\7j\2\2no\7k\2\2op\7h\2\2pq\7h\2\2q"+
		"r\7t\2\2rs\7g\2\2st\7\"\2\2tu\7~\2\2uv\7\"\2\2vw\7N\2\2wx\7g\2\2xy\7v"+
		"\2\2yz\7v\2\2z{\7t\2\2{|\7g\2\2|}\7\"\2\2}~\7~\2\2~\177\7\"\2\2\177\u0080"+
		"\7<\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7~\2\2\u0082\u0083\7\"\2\2\u0083"+
		"\u0084\7\60\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7~\2\2\u0086\u0087\7\""+
		"\2\2\u0087\u0088\7(\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7~\2\2\u008a\u008b"+
		"\7\"\2\2\u008b\u008c\7}\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7~\2\2\u008e"+
		"\u008f\7\"\2\2\u008f\u0090\7|\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7|\2"+
		"\2\u0092\u0093\7\"\2\2\u0093\u0094\7~\2\2\u0094\u0095\7\"\2\2\u0095\u0096"+
		"\7=\2\2\u0096\u0097\7+\2\2\u0097\u0098\7,\2\2\u0098\20\3\2\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7w\2\2\u009c\u00a3\7g\2\2\u009d"+
		"\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a3\7g\2\2\u00a2\u0099\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3\22\3"+
		"\2\2\2\u00a4\u00a7\5\25\13\2\u00a5\u00a8\5\13\6\2\u00a6\u00a8\5\25\13"+
		"\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\26\3\2\2\2\u00ad\u00b0\5\31\r\2\u00ae\u00b0\5\33\16\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0\30\3\2\2\2\u00b1\u00b5\5\21\t\2\u00b2\u00b5"+
		"\5\t\5\2\u00b3\u00b5\5\17\b\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7"+
		"v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5\23\n\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7}\2\2\u00c1\u00c3\5!\21"+
		"\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\7\177\2\2\u00c5\34\3\2\2\2\u00c6\u00c8\7]\2\2\u00c7\u00c9\5\13\6\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00d2\3\2\2\2\u00cc\u00ce\7.\2\2\u00cd\u00cf\5\13\6\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\5\33\16"+
		"\2\u00d7 \3\2\2\2\u00d8\u00d9\5\27\f\2\u00d9\u00db\5\23\n\2\u00da\u00dc"+
		"\5\35\17\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\7.\2\2\u00de\u00e0\5\23\n\2\u00df\u00e1\5\35\17\2\u00e0\u00df"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5\27\f\2\u00ea\u00ec\5\23\n\2\u00eb\u00ed\5\35\17\2\u00ec\u00eb\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\7?\2\2\u00ef\u00f1"+
		"\5%\23\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fa\3\2\2\2\u00f2"+
		"\u00f3\7.\2\2\u00f3\u00f5\5\23\n\2\u00f4\u00f6\5\35\17\2\u00f5\u00f4\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8"+
		"\u00f9\5%\23\2\u00f9\u00fb\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff"+
		"\7w\2\2\u00ff\u010f\7g\2\2\u0100\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u010f\7g\2\2\u0105\u010f\5\t\5"+
		"\2\u0106\u010f\5\r\7\2\u0107\u010f\5\17\b\2\u0108\u010f\5\'\24\2\u0109"+
		"\u010f\5)\25\2\u010a\u010b\7*\2\2\u010b\u010c\5%\23\2\u010c\u010d\7+\2"+
		"\2\u010d\u010f\3\2\2\2\u010e\u00fc\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0105"+
		"\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010f&\3\2\2\2\u0110\u0119\7}\2\2\u0111"+
		"\u0116\5%\23\2\u0112\u0113\7.\2\2\u0113\u0115\5%\23\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\177\2\2\u011c(\3\2\2\2\u011d\u012b"+
		"\7}\2\2\u011e\u011f\5\23\n\2\u011f\u0120\7<\2\2\u0120\u0128\5%\23\2\u0121"+
		"\u0122\7.\2\2\u0122\u0123\5\23\n\2\u0123\u0124\7<\2\2\u0124\u0125\5%\23"+
		"\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u011e\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\177"+
		"\2\2\u012e*\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7q\2\2\u0131\u0132"+
		"\7p\2\2\u0132\u0133\7u\2\2\u0133\u0134\7v\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\5\27\f\2\u0136\u0138\5\23\n\2\u0137\u0139\5\35\17\2\u0138\u0137"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u013b\7?\2\2\u013b"+
		"\u013d\5%\23\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0146\3\2"+
		"\2\2\u013e\u013f\7.\2\2\u013f\u0141\5\23\n\2\u0140\u0142\5\35\17\2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7?"+
		"\2\2\u0144\u0145\5%\23\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147,\3\2\2\2\u0148\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a"+
		"\u014b\7w\2\2\u014b\u014c\7o\2\2\u014c\u014e\3\2\2\2\u014d\u014f\5\23"+
		"\n\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7}\2\2\u0151\u0156\5\23\n\2\u0152\u0153\7.\2\2\u0153\u0155\5\23"+
		"\n\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\177"+
		"\2\2\u015a.\3\2\2\2\u015b\u015c\7v\2\2\u015c\u015d\7{\2\2\u015d\u015e"+
		"\7r\2\2\u015e\u015f\7g\2\2\u015f\u0160\7f\2\2\u0160\u0161\7g\2\2\u0161"+
		"\u0162\7h\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5\27\f\2\u0164\u0165\5\23"+
		"\n\2\u0165\60\3\2\2\2(\2\62;EPTWZ_g\u00a2\u00a7\u00a9\u00af\u00b4\u00be"+
		"\u00c2\u00ca\u00d0\u00d2\u00db\u00e0\u00e6\u00ec\u00f0\u00f5\u00fa\u010e"+
		"\u0116\u0119\u0128\u012b\u0138\u013c\u0141\u0146\u014e\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}