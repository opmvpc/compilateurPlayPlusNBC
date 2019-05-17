
// Generated from PlayPlusWords.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class PlayPlusWords extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int MAIN = 1, VOID = 2, IF = 3, ELSE = 4, THEN = 5, REPEAT = 6, WHILE = 7, TRUE = 8, FALSE = 9,
            IMPORT = 10, LEFT = 11, RIGHT = 12, UP = 13, DOWN = 14, JUMP = 15, FIGHT = 16, DIG = 17, BOOL = 18,
            INT = 19, CHAR = 20, STRUCT = 21, CONST = 22, ENUM = 23, TYPEDEF = 24, NATUREL = 25, FILE = 26, STRING = 27,
            CHARACTER = 28, PLUS = 29, MINUS = 30, MUL = 31, DIV = 32, MOD = 33, POW = 34, EQUAL = 35, AFFECT = 36,
            NOT = 37, NOTEQUAL = 38, SMALLER = 39, GREATER = 40, EGREATER = 41, ESMALLER = 42, LPAREN = 43, RPAREN = 44,
            LBRACE = 45, RBRACE = 46, LBRACKET = 47, RBRACKET = 48, SINGLEQUOTE = 49, BACKSLASH = 50, SEMICOLON = 51,
            COLON = 52, COMMA = 53, DOT = 54, AND = 55, OR = 56, DOLLAR = 57, COMMENTAIRES = 58, BLOCK_COMMENT = 59,
            LINE_COMMENT = 60, NEWLINE = 61, WS = 62, MAPSTART = 63, HASHTAG = 64, RETURN = 65, MAP = 66, ROBOT = 67,
            TRESOR = 68, PELOUSE = 69, PALMIER = 70, PONT = 71, BUISSON = 72, TONNEAU = 73, PUIT = 74, VIDE = 75,
            SQUELLETTE = 76, ID = 77;
    public static String[] modeNames = { "DEFAULT_MODE" };

    public static final String[] ruleNames = { "MAIN", "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", "FALSE",
            "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", "CHAR", "STRUCT", "CONST",
            "ENUM", "TYPEDEF", "NATUREL", "FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW",
            "EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER", "LPAREN", "RPAREN",
            "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA",
            "DOT", "AND", "OR", "DOLLAR", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", "WS", "MAPSTART",
            "HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", "PALMIER", "PONT", "BUISSON", "TONNEAU", "PUIT",
            "VIDE", "SQUELLETTE", "ID", "DOUBLEQUOTE", "LETTRE", "LOWER", "UPPER", "CHIFFRE" };

    private static final String[] _LITERAL_NAMES = { null, "'main'", "'void'", "'if'", "'else'", "'then'", "'repeat'",
            "'while'", "'true'", "'false'", "'import'", "'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'",
            "'dig'", "'bool'", "'int'", "'char'", "'struct'", "'const'", "'enum'", "'typedef'", null, null, null, null,
            "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'=='", "'='", "'!'", "'!='", "'<'", "'>'", "'>='", "'<='", "'('",
            "')'", "'{'", "'}'", "'['", "']'", "'''", "'\\'", "';'", "':'", "','", "'.'", "'&&'", "'||'", "'$'", null,
            null, null, null, null, null, "'#'", "'return'", null, "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'",
            "'S'", "'_'", "'Q'" };
    private static final String[] _SYMBOLIC_NAMES = { null, "MAIN", "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE",
            "TRUE", "FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "BOOL", "INT", "CHAR",
            "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", "FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL",
            "DIV", "MOD", "POW", "EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", "ESMALLER",
            "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SINGLEQUOTE", "BACKSLASH", "SEMICOLON",
            "COLON", "COMMA", "DOT", "AND", "OR", "DOLLAR", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE",
            "WS", "MAPSTART", "HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", "PALMIER", "PONT", "BUISSON",
            "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", "ID" };
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "PlayPlusWords.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2O\u01f3\b\1\4\2\t"
            + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
            + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
            + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
            + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"
            + "\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"
            + "\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"
            + "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"
            + "\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"
            + "\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"
            + "\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"
            + "\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"
            + "\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"
            + "\31\3\31\3\31\3\31\3\32\6\32\u0129\n\32\r\32\16\32\u012a\3\33\3\33\3\33"
            + "\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\6\34\u0138\n\34\r\34\16\34\u0139"
            + "\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0146\n\35\f\35"
            + "\16\35\u0149\13\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"
            + "#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3"
            + ",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"
            + "\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\5;\u018f"
            + "\n;\3;\3;\3<\3<\3<\7<\u0196\n<\f<\16<\u0199\13<\3<\3<\3<\3<\3<\3=\3=\3"
            + "=\7=\u01a3\n=\f=\16=\u01a6\13=\3=\3=\3>\5>\u01ab\n>\3>\3>\3>\3>\3?\6?"
            + "\u01b2\n?\r?\16?\u01b3\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3B\3B\3B\3"
            + "B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"
            + "L\3L\3M\3M\3N\3N\3N\7N\u01e3\nN\fN\16N\u01e6\13N\3O\3O\3P\3P\5P\u01ec"
            + "\nP\3Q\3Q\3R\3R\3S\3S\3\u0197\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"
            + "\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"
            + "\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"
            + "_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"
            + "D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"
            + "N\u009bO\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\3\2\5\7\2\f\f\17\17$"
            + "$..^^\4\2\f\f\17\17\4\2\13\13\"\"\u01fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"
            + "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"
            + "\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"
            + "\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"
            + "\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"
            + "\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"
            + "A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"
            + "\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"
            + "\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"
            + "g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"
            + "\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"
            + "\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"
            + "\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"
            + "\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"
            + "\2\2\u009b\3\2\2\2\3\u00a7\3\2\2\2\5\u00ac\3\2\2\2\7\u00b1\3\2\2\2\t\u00b4"
            + "\3\2\2\2\13\u00b9\3\2\2\2\r\u00be\3\2\2\2\17\u00c5\3\2\2\2\21\u00cb\3"
            + "\2\2\2\23\u00d0\3\2\2\2\25\u00d6\3\2\2\2\27\u00dd\3\2\2\2\31\u00e2\3\2"
            + "\2\2\33\u00e8\3\2\2\2\35\u00eb\3\2\2\2\37\u00f0\3\2\2\2!\u00f5\3\2\2\2"
            + "#\u00fb\3\2\2\2%\u00ff\3\2\2\2\'\u0104\3\2\2\2)\u0108\3\2\2\2+\u010d\3"
            + "\2\2\2-\u0114\3\2\2\2/\u011a\3\2\2\2\61\u011f\3\2\2\2\63\u0128\3\2\2\2"
            + "\65\u012c\3\2\2\2\67\u0135\3\2\2\29\u013d\3\2\2\2;\u014c\3\2\2\2=\u014e"
            + "\3\2\2\2?\u0150\3\2\2\2A\u0152\3\2\2\2C\u0154\3\2\2\2E\u0156\3\2\2\2G"
            + "\u0158\3\2\2\2I\u015b\3\2\2\2K\u015d\3\2\2\2M\u015f\3\2\2\2O\u0162\3\2"
            + "\2\2Q\u0164\3\2\2\2S\u0166\3\2\2\2U\u0169\3\2\2\2W\u016c\3\2\2\2Y\u016e"
            + "\3\2\2\2[\u0170\3\2\2\2]\u0172\3\2\2\2_\u0174\3\2\2\2a\u0176\3\2\2\2c"
            + "\u0178\3\2\2\2e\u017a\3\2\2\2g\u017c\3\2\2\2i\u017e\3\2\2\2k\u0180\3\2"
            + "\2\2m\u0182\3\2\2\2o\u0184\3\2\2\2q\u0187\3\2\2\2s\u018a\3\2\2\2u\u018e"
            + "\3\2\2\2w\u0192\3\2\2\2y\u019f\3\2\2\2{\u01aa\3\2\2\2}\u01b1\3\2\2\2\177"
            + "\u01b7\3\2\2\2\u0081\u01bd\3\2\2\2\u0083\u01bf\3\2\2\2\u0085\u01c6\3\2"
            + "\2\2\u0087\u01cb\3\2\2\2\u0089\u01cd\3\2\2\2\u008b\u01cf\3\2\2\2\u008d"
            + "\u01d1\3\2\2\2\u008f\u01d3\3\2\2\2\u0091\u01d5\3\2\2\2\u0093\u01d7\3\2"
            + "\2\2\u0095\u01d9\3\2\2\2\u0097\u01db\3\2\2\2\u0099\u01dd\3\2\2\2\u009b"
            + "\u01df\3\2\2\2\u009d\u01e7\3\2\2\2\u009f\u01eb\3\2\2\2\u00a1\u01ed\3\2"
            + "\2\2\u00a3\u01ef\3\2\2\2\u00a5\u01f1\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8"
            + "\u00a9\7c\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\4\3\2\2\2\u00ac"
            + "\u00ad\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2"
            + "\u00b0\6\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\b\3\2\2\2"
            + "\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"
            + "\7g\2\2\u00b8\n\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc"
            + "\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"
            + "\7g\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7c\2\2\u00c3"
            + "\u00c4\7v\2\2\u00c4\16\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7j\2\2\u00c7"
            + "\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\20\3\2\2\2\u00cb"
            + "\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2"
            + "\u00cf\22\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7"
            + "n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\24\3\2\2\2\u00d6\u00d7"
            + "\7k\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7q\2\2\u00da"
            + "\u00db\7t\2\2\u00db\u00dc\7v\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7n\2\2\u00de"
            + "\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7v\2\2\u00e1\30\3\2\2\2\u00e2"
            + "\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6\7j\2\2"
            + "\u00e6\u00e7\7v\2\2\u00e7\32\3\2\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7"
            + "r\2\2\u00ea\34\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee"
            + "\7y\2\2\u00ee\u00ef\7p\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7l\2\2\u00f1\u00f2"
            + "\7w\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7r\2\2\u00f4 \3\2\2\2\u00f5\u00f6"
            + "\7h\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7i\2\2\u00f8\u00f9\7j\2\2\u00f9"
            + "\u00fa\7v\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7k\2\2\u00fd"
            + "\u00fe\7i\2\2\u00fe$\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7q\2\2\u0101"
            + "\u0102\7q\2\2\u0102\u0103\7n\2\2\u0103&\3\2\2\2\u0104\u0105\7k\2\2\u0105"
            + "\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107(\3\2\2\2\u0108\u0109\7e\2\2\u0109"
            + "\u010a\7j\2\2\u010a\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c*\3\2\2\2\u010d"
            + "\u010e\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7w\2\2"
            + "\u0111\u0112\7e\2\2\u0112\u0113\7v\2\2\u0113,\3\2\2\2\u0114\u0115\7e\2"
            + "\2\u0115\u0116\7q\2\2\u0116\u0117\7p\2\2\u0117\u0118\7u\2\2\u0118\u0119"
            + "\7v\2\2\u0119.\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7p\2\2\u011c\u011d"
            + "\7w\2\2\u011d\u011e\7o\2\2\u011e\60\3\2\2\2\u011f\u0120\7v\2\2\u0120\u0121"
            + "\7{\2\2\u0121\u0122\7r\2\2\u0122\u0123\7g\2\2\u0123\u0124\7f\2\2\u0124"
            + "\u0125\7g\2\2\u0125\u0126\7h\2\2\u0126\62\3\2\2\2\u0127\u0129\5\u00a5"
            + "S\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"
            + "\u012b\3\2\2\2\u012b\64\3\2\2\2\u012c\u012d\5\u009dO\2\u012d\u012e\5\u009b"
            + "N\2\u012e\u012f\7\60\2\2\u012f\u0130\7o\2\2\u0130\u0131\7c\2\2\u0131\u0132"
            + "\7r\2\2\u0132\u0133\3\2\2\2\u0133\u0134\5\u009dO\2\u0134\66\3\2\2\2\u0135"
            + "\u0137\5\u009dO\2\u0136\u0138\n\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139"
            + "\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"
            + "\u013c\5\u009dO\2\u013c8\3\2\2\2\u013d\u0147\5c\62\2\u013e\u0146\5\u00a5"
            + "S\2\u013f\u0146\5\u009fP\2\u0140\u0146\5i\65\2\u0141\u0146\5m\67\2\u0142"
            + "\u0146\5A!\2\u0143\u0146\5e\63\2\u0144\u0146\5g\64\2\u0145\u013e\3\2\2"
            + "\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142"
            + "\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"
            + "\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"
            + "\2\2\u014a\u014b\5c\62\2\u014b:\3\2\2\2\u014c\u014d\7-\2\2\u014d<\3\2"
            + "\2\2\u014e\u014f\7/\2\2\u014f>\3\2\2\2\u0150\u0151\7,\2\2\u0151@\3\2\2"
            + "\2\u0152\u0153\7\61\2\2\u0153B\3\2\2\2\u0154\u0155\7\'\2\2\u0155D\3\2"
            + "\2\2\u0156\u0157\7`\2\2\u0157F\3\2\2\2\u0158\u0159\7?\2\2\u0159\u015a"
            + "\7?\2\2\u015aH\3\2\2\2\u015b\u015c\7?\2\2\u015cJ\3\2\2\2\u015d\u015e\7"
            + "#\2\2\u015eL\3\2\2\2\u015f\u0160\7#\2\2\u0160\u0161\7?\2\2\u0161N\3\2"
            + "\2\2\u0162\u0163\7>\2\2\u0163P\3\2\2\2\u0164\u0165\7@\2\2\u0165R\3\2\2"
            + "\2\u0166\u0167\7@\2\2\u0167\u0168\7?\2\2\u0168T\3\2\2\2\u0169\u016a\7"
            + ">\2\2\u016a\u016b\7?\2\2\u016bV\3\2\2\2\u016c\u016d\7*\2\2\u016dX\3\2"
            + "\2\2\u016e\u016f\7+\2\2\u016fZ\3\2\2\2\u0170\u0171\7}\2\2\u0171\\\3\2"
            + "\2\2\u0172\u0173\7\177\2\2\u0173^\3\2\2\2\u0174\u0175\7]\2\2\u0175`\3"
            + "\2\2\2\u0176\u0177\7_\2\2\u0177b\3\2\2\2\u0178\u0179\7)\2\2\u0179d\3\2"
            + "\2\2\u017a\u017b\7^\2\2\u017bf\3\2\2\2\u017c\u017d\7=\2\2\u017dh\3\2\2"
            + "\2\u017e\u017f\7<\2\2\u017fj\3\2\2\2\u0180\u0181\7.\2\2\u0181l\3\2\2\2"
            + "\u0182\u0183\7\60\2\2\u0183n\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0186\7"
            + "(\2\2\u0186p\3\2\2\2\u0187\u0188\7~\2\2\u0188\u0189\7~\2\2\u0189r\3\2"
            + "\2\2\u018a\u018b\7&\2\2\u018bt\3\2\2\2\u018c\u018f\5w<\2\u018d\u018f\5"
            + "y=\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"
            + "\u0191\b;\2\2\u0191v\3\2\2\2\u0192\u0193\5A!\2\u0193\u0197\5? \2\u0194"
            + "\u0196\13\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0198\3"
            + "\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"
            + "\u019b\5? \2\u019b\u019c\5A!\2\u019c\u019d\3\2\2\2\u019d\u019e\b<\2\2"
            + "\u019ex\3\2\2\2\u019f\u01a0\5A!\2\u01a0\u01a4\5A!\2\u01a1\u01a3\n\3\2"
            + "\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5"
            + "\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\b=\2\2\u01a8"
            + "z\3\2\2\2\u01a9\u01ab\7\17\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2"
            + "\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7\f\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"
            + "\b>\3\2\u01af|\3\2\2\2\u01b0\u01b2\t\4\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3"
            + "\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"
            + "\u01b6\b?\3\2\u01b6~\3\2\2\2\u01b7\u01b8\7o\2\2\u01b8\u01b9\7c\2\2\u01b9"
            + "\u01ba\7r\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5i\65\2\u01bc\u0080\3\2"
            + "\2\2\u01bd\u01be\7%\2\2\u01be\u0082\3\2\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1"
            + "\7g\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7t\2\2\u01c4"
            + "\u01c5\7p\2\2\u01c5\u0084\3\2\2\2\u01c6\u01c7\5m\67\2\u01c7\u01c8\7o\2"
            + "\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7r\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cc"
            + "\7B\2\2\u01cc\u0088\3\2\2\2\u01cd\u01ce\7Z\2\2\u01ce\u008a\3\2\2\2\u01cf"
            + "\u01d0\7I\2\2\u01d0\u008c\3\2\2\2\u01d1\u01d2\7R\2\2\u01d2\u008e\3\2\2"
            + "\2\u01d3\u01d4\7C\2\2\u01d4\u0090\3\2\2\2\u01d5\u01d6\7D\2\2\u01d6\u0092"
            + "\3\2\2\2\u01d7\u01d8\7V\2\2\u01d8\u0094\3\2\2\2\u01d9\u01da\7U\2\2\u01da"
            + "\u0096\3\2\2\2\u01db\u01dc\7a\2\2\u01dc\u0098\3\2\2\2\u01dd\u01de\7S\2"
            + "\2\u01de\u009a\3\2\2\2\u01df\u01e4\5\u009fP\2\u01e0\u01e3\5\u00a5S\2\u01e1"
            + "\u01e3\5\u009fP\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6"
            + "\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u009c\3\2\2\2\u01e6"
            + "\u01e4\3\2\2\2\u01e7\u01e8\7$\2\2\u01e8\u009e\3\2\2\2\u01e9\u01ec\5\u00a1"
            + "Q\2\u01ea\u01ec\5\u00a3R\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec"
            + "\u00a0\3\2\2\2\u01ed\u01ee\4c|\2\u01ee\u00a2\3\2\2\2\u01ef\u01f0\4C\\"
            + "\2\u01f0\u00a4\3\2\2\2\u01f1\u01f2\4\62;\2\u01f2\u00a6\3\2\2\2\17\2\u012a"
            + "\u0139\u0145\u0147\u018e\u0197\u01a4\u01aa\u01b3\u01e2\u01e4\u01eb\4\2" + "\3\2\b\2\2";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}