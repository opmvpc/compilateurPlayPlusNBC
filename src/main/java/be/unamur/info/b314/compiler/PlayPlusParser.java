// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
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
		TONNEAU=72, PUIT=73, VIDE=74, SQUELLETTE=75, ID=76, DOUBLEQUOTE=77, ENTIER=78;
	public static final int
		RULE_root = 0, RULE_fichier = 1, RULE_program = 2, RULE_mapfile = 3, RULE_monde = 4, 
		RULE_minimalProgram = 5, RULE_globalVars = 6, RULE_mainDecl = 7, RULE_mainStart = 8, 
		RULE_mainEND = 9, RULE_mainInst = 10, RULE_mainDig = 11, RULE_mainRet = 12, 
		RULE_implDecl = 13, RULE_impKeyWord = 14, RULE_fileDecl = 15, RULE_fileName = 16, 
		RULE_statements = 17, RULE_returnVoid = 18, RULE_returnInstr = 19, RULE_statement = 20, 
		RULE_affectInstr = 21, RULE_plusMinusExpr = 22, RULE_constantExpr = 23, 
		RULE_variableExpr = 24, RULE_exprD = 25, RULE_exprEnt = 26, RULE_exprBool = 27, 
		RULE_exprG = 28, RULE_conditionalStmt = 29, RULE_repeatStmt = 30, RULE_whileStmt = 31, 
		RULE_digInstr = 32, RULE_actionType = 33, RULE_mytype = 34, RULE_scalar = 35, 
		RULE_structures = 36, RULE_arrays = 37, RULE_structDecl = 38, RULE_listStrucName = 39, 
		RULE_listVarName = 40, RULE_varDecl = 41, RULE_initVariable = 42, RULE_initArrays = 43, 
		RULE_initStruct = 44, RULE_constDecl = 45, RULE_enumDecl = 46, RULE_typedefDecl = 47;
	public static final String[] ruleNames = {
		"root", "fichier", "program", "mapfile", "monde", "minimalProgram", "globalVars", 
		"mainDecl", "mainStart", "mainEND", "mainInst", "mainDig", "mainRet", 
		"implDecl", "impKeyWord", "fileDecl", "fileName", "statements", "returnVoid", 
		"returnInstr", "statement", "affectInstr", "plusMinusExpr", "constantExpr", 
		"variableExpr", "exprD", "exprEnt", "exprBool", "exprG", "conditionalStmt", 
		"repeatStmt", "whileStmt", "digInstr", "actionType", "mytype", "scalar", 
		"structures", "arrays", "structDecl", "listStrucName", "listVarName", 
		"varDecl", "initVariable", "initArrays", "initStruct", "constDecl", "enumDecl", 
		"typedefDecl"
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
		"ID", "DOUBLEQUOTE", "ENTIER"
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

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public FichierContext fichier() {
			return getRuleContext(FichierContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			fichier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FichierContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public MapfileContext mapfile() {
			return getRuleContext(MapfileContext.class,0);
		}
		public FichierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterFichier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitFichier(this);
		}
	}

	public final FichierContext fichier() throws RecognitionException {
		FichierContext _localctx = new FichierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fichier);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				mapfile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ImplDeclContext implDecl() {
			return getRuleContext(ImplDeclContext.class,0);
		}
		public MinimalProgramContext minimalProgram() {
			return getRuleContext(MinimalProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			implDecl();
			setState(103);
			minimalProgram();
			setState(104);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapfileContext extends ParserRuleContext {
		public TerminalNode MAPSTART() { return getToken(PlayPlusParser.MAPSTART, 0); }
		public List<TerminalNode> NATUREL() { return getTokens(PlayPlusParser.NATUREL); }
		public TerminalNode NATUREL(int i) {
			return getToken(PlayPlusParser.NATUREL, i);
		}
		public MondeContext monde() {
			return getRuleContext(MondeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
		public MapfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMapfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMapfile(this);
		}
	}

	public final MapfileContext mapfile() throws RecognitionException {
		MapfileContext _localctx = new MapfileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mapfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAPSTART);
			setState(107);
			match(NATUREL);
			setState(108);
			match(NATUREL);
			setState(109);
			monde();
			setState(110);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MondeContext extends ParserRuleContext {
		public List<TerminalNode> ROBOT() { return getTokens(PlayPlusParser.ROBOT); }
		public TerminalNode ROBOT(int i) {
			return getToken(PlayPlusParser.ROBOT, i);
		}
		public List<TerminalNode> TRESOR() { return getTokens(PlayPlusParser.TRESOR); }
		public TerminalNode TRESOR(int i) {
			return getToken(PlayPlusParser.TRESOR, i);
		}
		public List<TerminalNode> PELOUSE() { return getTokens(PlayPlusParser.PELOUSE); }
		public TerminalNode PELOUSE(int i) {
			return getToken(PlayPlusParser.PELOUSE, i);
		}
		public List<TerminalNode> PALMIER() { return getTokens(PlayPlusParser.PALMIER); }
		public TerminalNode PALMIER(int i) {
			return getToken(PlayPlusParser.PALMIER, i);
		}
		public List<TerminalNode> PONT() { return getTokens(PlayPlusParser.PONT); }
		public TerminalNode PONT(int i) {
			return getToken(PlayPlusParser.PONT, i);
		}
		public List<TerminalNode> BUISSON() { return getTokens(PlayPlusParser.BUISSON); }
		public TerminalNode BUISSON(int i) {
			return getToken(PlayPlusParser.BUISSON, i);
		}
		public List<TerminalNode> TONNEAU() { return getTokens(PlayPlusParser.TONNEAU); }
		public TerminalNode TONNEAU(int i) {
			return getToken(PlayPlusParser.TONNEAU, i);
		}
		public List<TerminalNode> PUIT() { return getTokens(PlayPlusParser.PUIT); }
		public TerminalNode PUIT(int i) {
			return getToken(PlayPlusParser.PUIT, i);
		}
		public List<TerminalNode> VIDE() { return getTokens(PlayPlusParser.VIDE); }
		public TerminalNode VIDE(int i) {
			return getToken(PlayPlusParser.VIDE, i);
		}
		public List<TerminalNode> SQUELLETTE() { return getTokens(PlayPlusParser.SQUELLETTE); }
		public TerminalNode SQUELLETTE(int i) {
			return getToken(PlayPlusParser.SQUELLETTE, i);
		}
		public MondeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMonde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMonde(this);
		}
	}

	public final MondeContext monde() throws RecognitionException {
		MondeContext _localctx = new MondeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_monde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ROBOT - 66)) | (1L << (TRESOR - 66)) | (1L << (PELOUSE - 66)) | (1L << (PALMIER - 66)) | (1L << (PONT - 66)) | (1L << (BUISSON - 66)) | (1L << (TONNEAU - 66)) | (1L << (PUIT - 66)) | (1L << (VIDE - 66)) | (1L << (SQUELLETTE - 66)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ROBOT - 66)) | (1L << (TRESOR - 66)) | (1L << (PELOUSE - 66)) | (1L << (PALMIER - 66)) | (1L << (PONT - 66)) | (1L << (BUISSON - 66)) | (1L << (TONNEAU - 66)) | (1L << (PUIT - 66)) | (1L << (VIDE - 66)) | (1L << (SQUELLETTE - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinimalProgramContext extends ParserRuleContext {
		public GlobalVarsContext globalVars() {
			return getRuleContext(GlobalVarsContext.class,0);
		}
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
		}
		public MinimalProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimalProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMinimalProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMinimalProgram(this);
		}
	}

	public final MinimalProgramContext minimalProgram() throws RecognitionException {
		MinimalProgramContext _localctx = new MinimalProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_minimalProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			globalVars();
			setState(118);
			mainDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalVarsContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public List<TypedefDeclContext> typedefDecl() {
			return getRuleContexts(TypedefDeclContext.class);
		}
		public TypedefDeclContext typedefDecl(int i) {
			return getRuleContext(TypedefDeclContext.class,i);
		}
		public GlobalVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterGlobalVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitGlobalVars(this);
		}
	}

	public final GlobalVarsContext globalVars() throws RecognitionException {
		GlobalVarsContext _localctx = new GlobalVarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_globalVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF))) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(120);
					varDecl();
					}
					break;
				case 2:
					{
					setState(121);
					constDecl();
					}
					break;
				case 3:
					{
					setState(122);
					structDecl();
					}
					break;
				case 4:
					{
					setState(123);
					enumDecl();
					}
					break;
				case 5:
					{
					setState(124);
					typedefDecl();
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclContext extends ParserRuleContext {
		public MainStartContext mainStart() {
			return getRuleContext(MainStartContext.class,0);
		}
		public MainInstContext mainInst() {
			return getRuleContext(MainInstContext.class,0);
		}
		public MainDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainDecl(this);
		}
	}

	public final MainDeclContext mainDecl() throws RecognitionException {
		MainDeclContext _localctx = new MainDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			mainStart();
			}
			{
			setState(131);
			mainInst();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainStartContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public MainStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainStart(this);
		}
	}

	public final MainStartContext mainStart() throws RecognitionException {
		MainStartContext _localctx = new MainStartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(VOID);
			setState(134);
			match(MAIN);
			setState(135);
			match(RPAREN);
			setState(136);
			match(LBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainENDContext extends ParserRuleContext {
		public MainRetContext mainRet() {
			return getRuleContext(MainRetContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<MainDigContext> mainDig() {
			return getRuleContexts(MainDigContext.class);
		}
		public MainDigContext mainDig(int i) {
			return getRuleContext(MainDigContext.class,i);
		}
		public MainENDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainEND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainEND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainEND(this);
		}
	}

	public final MainENDContext mainEND() throws RecognitionException {
		MainENDContext _localctx = new MainENDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mainEND);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIG) {
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					mainDig();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIG );
				}
			}

			setState(145);
			mainRet();
			setState(146);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainInstContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainENDContext mainEND() {
			return getRuleContext(MainENDContext.class,0);
		}
		public MainInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainInst(this);
		}
	}

	public final MainInstContext mainInst() throws RecognitionException {
		MainInstContext _localctx = new MainInstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			statements();
			setState(149);
			mainEND();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID) {
				{
				setState(150);
				statements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDigContext extends ParserRuleContext {
		public DigInstrContext digInstr() {
			return getRuleContext(DigInstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public MainDigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainDig(this);
		}
	}

	public final MainDigContext mainDig() throws RecognitionException {
		MainDigContext _localctx = new MainDigContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainDig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(153);
			digInstr();
			}
			{
			setState(154);
			match(SEMICOLON);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainRetContext extends ParserRuleContext {
		public ReturnInstrContext returnInstr() {
			return getRuleContext(ReturnInstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public MainRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMainRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMainRet(this);
		}
	}

	public final MainRetContext mainRet() throws RecognitionException {
		MainRetContext _localctx = new MainRetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			returnInstr();
			}
			{
			setState(157);
			match(SEMICOLON);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplDeclContext extends ParserRuleContext {
		public ImpKeyWordContext impKeyWord() {
			return getRuleContext(ImpKeyWordContext.class,0);
		}
		public List<TerminalNode> DOUBLEQUOTE() { return getTokens(PlayPlusParser.DOUBLEQUOTE); }
		public TerminalNode DOUBLEQUOTE(int i) {
			return getToken(PlayPlusParser.DOUBLEQUOTE, i);
		}
		public FileDeclContext fileDecl() {
			return getRuleContext(FileDeclContext.class,0);
		}
		public TerminalNode FILE() { return getToken(PlayPlusParser.FILE, 0); }
		public ImplDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterImplDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitImplDecl(this);
		}
	}

	public final ImplDeclContext implDecl() throws RecognitionException {
		ImplDeclContext _localctx = new ImplDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_implDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			impKeyWord();
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(160);
				match(DOUBLEQUOTE);
				setState(161);
				fileDecl();
				setState(162);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(164);
				match(FILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpKeyWordContext extends ParserRuleContext {
		public TerminalNode HASHTAG() { return getToken(PlayPlusParser.HASHTAG, 0); }
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public ImpKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impKeyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterImpKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitImpKeyWord(this);
		}
	}

	public final ImpKeyWordContext impKeyWord() throws RecognitionException {
		ImpKeyWordContext _localctx = new ImpKeyWordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impKeyWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(HASHTAG);
			setState(168);
			match(IMPORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileDeclContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitFileDecl(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			fileName();
			setState(171);
			match(MAP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnVoidContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PlayPlusParser.RETURN, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public ReturnVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitReturnVoid(this);
		}
	}

	public final ReturnVoidContext returnVoid() throws RecognitionException {
		ReturnVoidContext _localctx = new ReturnVoidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			match(RETURN);
			}
			{
			setState(181);
			match(VOID);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnInstrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode RETURN() { return getToken(PlayPlusParser.RETURN, 0); }
		public ReturnInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterReturnInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitReturnInstr(this);
		}
	}

	public final ReturnInstrContext returnInstr() throws RecognitionException {
		ReturnInstrContext _localctx = new ReturnInstrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			match(RETURN);
			}
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ReturnInstrContext returnInstr() {
			return getRuleContext(ReturnInstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public AffectInstrContext affectInstr() {
			return getRuleContext(AffectInstrContext.class,0);
		}
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public DigInstrContext digInstr() {
			return getRuleContext(DigInstrContext.class,0);
		}
		public ConditionalStmtContext conditionalStmt() {
			return getRuleContext(ConditionalStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(186);
				returnInstr();
				}
				{
				setState(187);
				match(SEMICOLON);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				affectInstr();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				constantExpr();
				}
				break;
			case LEFT:
			case RIGHT:
			case UP:
			case DOWN:
			case JUMP:
			case FIGHT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(191);
				actionType();
				}
				{
				setState(192);
				match(SEMICOLON);
				}
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				digInstr();
				{
				setState(195);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(197);
				conditionalStmt();
				}
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(198);
				repeatStmt();
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(199);
				whileStmt();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectInstrContext extends ParserRuleContext {
		public PlusMinusExprContext plusMinusExpr() {
			return getRuleContext(PlusMinusExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public AffectInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitAffectInstr(this);
		}
	}

	public final AffectInstrContext affectInstr() throws RecognitionException {
		AffectInstrContext _localctx = new AffectInstrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_affectInstr);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				plusMinusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(203);
				exprG(0);
				setState(204);
				match(AFFECT);
				setState(205);
				exprD(0);
				}
				setState(207);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusMinusExprContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public PlusMinusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitPlusMinusExpr(this);
		}
	}

	public final PlusMinusExprContext plusMinusExpr() throws RecognitionException {
		PlusMinusExprContext _localctx = new PlusMinusExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plusMinusExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			exprG(0);
			setState(212);
			match(AFFECT);
			setState(213);
			exprEnt();
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			exprEnt();
			}
			setState(217);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExprContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ConstantExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitConstantExpr(this);
		}
	}

	public final ConstantExprContext constantExpr() throws RecognitionException {
		ConstantExprContext _localctx = new ConstantExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			constDecl();
			setState(220);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public VariableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitVariableExpr(this);
		}
	}

	public final VariableExprContext variableExpr() throws RecognitionException {
		VariableExprContext _localctx = new VariableExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprDContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(PlayPlusParser.CHARACTER, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(PlayPlusParser.GREATER, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode EGREATER() { return getToken(PlayPlusParser.EGREATER, 0); }
		public TerminalNode ESMALLER() { return getToken(PlayPlusParser.ESMALLER, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayPlusParser.NOTEQUAL, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(PlayPlusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitExprD(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exprD, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(226);
				exprEnt();
				}
				break;
			case 2:
				{
				setState(227);
				exprBool();
				}
				break;
			case 3:
				{
				setState(228);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(229);
				match(CHARACTER);
				}
				break;
			case 5:
				{
				setState(230);
				exprG(0);
				}
				break;
			case 6:
				{
				setState(231);
				match(NOT);
				setState(232);
				exprD(14);
				}
				break;
			case 7:
				{
				setState(233);
				match(ID);
				setState(234);
				match(LPAREN);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(235);
					exprD(0);
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(236);
						match(COMMA);
						setState(237);
						exprD(0);
						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(245);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(246);
				match(LPAREN);
				setState(247);
				exprD(0);
				setState(248);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(252);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(253);
						match(SMALLER);
						setState(254);
						exprD(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						match(GREATER);
						setState(257);
						exprD(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(258);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(259);
						match(AND);
						setState(260);
						exprD(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(261);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(262);
						match(OR);
						setState(263);
						exprD(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(264);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(265);
						match(EQUAL);
						setState(266);
						exprD(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(267);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(268);
						match(EGREATER);
						setState(269);
						exprD(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(271);
						match(ESMALLER);
						setState(272);
						exprD(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(273);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(274);
						match(NOTEQUAL);
						setState(275);
						exprD(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						match(MOD);
						setState(278);
						exprD(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(280);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						exprD(3);
						}
						break;
					case 11:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(282);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(283);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						exprD(2);
						}
						break;
					}
					}
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprEntContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitExprEnt(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		ExprEntContext _localctx = new ExprEntContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprEnt);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(MINUS);
				setState(291);
				exprEnt();
				}
				break;
			case NATUREL:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(NATUREL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitExprBool(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitExprG(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		return exprG(0);
	}

	private ExprGContext exprG(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprGContext _localctx = new ExprGContext(_ctx, _parentState);
		ExprGContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(298);
				match(ID);
				}
				break;
			case 2:
				{
				setState(299);
				match(ID);
				setState(300);
				match(LBRACKET);
				setState(301);
				exprD(0);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(302);
					match(COMMA);
					setState(303);
					exprD(0);
					}
				}

				setState(306);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(310);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(311);
					matchWildcard();
					setState(312);
					match(ID);
					}
					}
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(PlayPlusParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PlayPlusParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PlayPlusParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PlayPlusParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public ConditionalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterConditionalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitConditionalStmt(this);
		}
	}

	public final ConditionalStmtContext conditionalStmt() throws RecognitionException {
		ConditionalStmtContext _localctx = new ConditionalStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IF);
			setState(319);
			match(LPAREN);
			setState(320);
			exprD(0);
			setState(321);
			match(RPAREN);
			setState(322);
			match(LBRACE);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				statement();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(328);
			match(RBRACE);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(329);
				match(ELSE);
				setState(330);
				match(LBRACE);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID) {
					{
					{
					setState(331);
					statement();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStmtContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PlayPlusParser.REPEAT, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterRepeatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitRepeatStmt(this);
		}
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(REPEAT);
			setState(341);
			match(LPAREN);
			setState(342);
			exprD(0);
			setState(343);
			match(RPAREN);
			setState(344);
			match(LBRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				statement();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(350);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(WHILE);
			setState(353);
			match(LPAREN);
			setState(354);
			exprD(0);
			setState(355);
			match(RPAREN);
			setState(356);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				statement();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(362);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigInstrContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public DigInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterDigInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitDigInstr(this);
		}
	}

	public final DigInstrContext digInstr() throws RecognitionException {
		DigInstrContext _localctx = new DigInstrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_digInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(DIG);
			setState(365);
			match(LPAREN);
			setState(366);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(PlayPlusParser.LEFT, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(PlayPlusParser.RIGHT, 0); }
		public TerminalNode UP() { return getToken(PlayPlusParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(PlayPlusParser.DOWN, 0); }
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode JUMP() { return getToken(PlayPlusParser.JUMP, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitActionType(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_actionType);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(LEFT);
				setState(369);
				match(LPAREN);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(370);
					exprD(0);
					}
				}

				setState(373);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(RIGHT);
				setState(375);
				match(LPAREN);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(376);
					exprD(0);
					}
				}

				setState(379);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(UP);
				setState(381);
				match(LPAREN);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(382);
					exprD(0);
					}
				}

				setState(385);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(DOWN);
				setState(387);
				match(LPAREN);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(388);
					exprD(0);
					}
				}

				setState(391);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(FIGHT);
				setState(393);
				match(LPAREN);
				setState(394);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				match(JUMP);
				setState(396);
				match(LPAREN);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATUREL || _la==MINUS) {
					{
					setState(397);
					exprEnt();
					}
				}

				setState(400);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MytypeContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public MytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterMytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitMytype(this);
		}
	}

	public final MytypeContext mytype() throws RecognitionException {
		MytypeContext _localctx = new MytypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mytype);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				structures();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(PlayPlusParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(PlayPlusParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitScalar(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuresContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(PlayPlusParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ListStrucNameContext listStrucName() {
			return getRuleContext(ListStrucNameContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitStructures(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(STRUCT);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(410);
				match(ID);
				}
			}

			setState(413);
			match(LBRACE);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(414);
				listStrucName();
				}
				break;
			}
			setState(417);
			match(RBRACE);
			setState(418);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraysContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
		public List<TerminalNode> NATUREL() { return getTokens(PlayPlusParser.NATUREL); }
		public TerminalNode NATUREL(int i) {
			return getToken(PlayPlusParser.NATUREL, i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitArrays(this);
		}
	}

	public final ArraysContext arrays() throws RecognitionException {
		ArraysContext _localctx = new ArraysContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LBRACKET);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421);
				match(NATUREL);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATUREL );
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(426);
				match(COMMA);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(427);
					match(NATUREL);
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATUREL );
				}
			}

			setState(434);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclContext extends ParserRuleContext {
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitStructDecl(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			structures();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListStrucNameContext extends ParserRuleContext {
		public List<MytypeContext> mytype() {
			return getRuleContexts(MytypeContext.class);
		}
		public MytypeContext mytype(int i) {
			return getRuleContext(MytypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public List<ArraysContext> arrays() {
			return getRuleContexts(ArraysContext.class);
		}
		public ArraysContext arrays(int i) {
			return getRuleContext(ArraysContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ListStrucNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStrucName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterListStrucName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitListStrucName(this);
		}
	}

	public final ListStrucNameContext listStrucName() throws RecognitionException {
		ListStrucNameContext _localctx = new ListStrucNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listStrucName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(438);
				mytype();
				setState(439);
				match(ID);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(440);
					arrays();
					}
				}

				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					match(ID);
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(445);
						arrays();
						}
					}

					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(SEMICOLON);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListVarNameContext extends ParserRuleContext {
		public List<MytypeContext> mytype() {
			return getRuleContexts(MytypeContext.class);
		}
		public MytypeContext mytype(int i) {
			return getRuleContext(MytypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public List<ArraysContext> arrays() {
			return getRuleContexts(ArraysContext.class);
		}
		public ArraysContext arrays(int i) {
			return getRuleContext(ArraysContext.class,i);
		}
		public ListVarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterListVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitListVarName(this);
		}
	}

	public final ListVarNameContext listVarName() throws RecognitionException {
		ListVarNameContext _localctx = new ListVarNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_listVarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(460);
				mytype();
				setState(461);
				match(ID);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(462);
					arrays();
					}
				}

				{
				setState(465);
				match(COMMA);
				setState(466);
				match(ID);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(467);
					arrays();
					}
				}

				}
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<ArraysContext> arrays() {
			return getRuleContexts(ArraysContext.class);
		}
		public ArraysContext arrays(int i) {
			return getRuleContext(ArraysContext.class,i);
		}
		public List<TerminalNode> AFFECT() { return getTokens(PlayPlusParser.AFFECT); }
		public TerminalNode AFFECT(int i) {
			return getToken(PlayPlusParser.AFFECT, i);
		}
		public List<InitVariableContext> initVariable() {
			return getRuleContexts(InitVariableContext.class);
		}
		public InitVariableContext initVariable(int i) {
			return getRuleContext(InitVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			mytype();
			setState(476);
			match(ID);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(477);
				arrays();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(480);
				match(AFFECT);
				setState(481);
				initVariable();
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(484);
				match(COMMA);
				setState(485);
				match(ID);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(486);
					arrays();
					}
				}

				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFFECT) {
					{
					setState(489);
					match(AFFECT);
					setState(490);
					initVariable();
					}
				}

				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitVariableContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode ENTIER() { return getToken(PlayPlusParser.ENTIER, 0); }
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(PlayPlusParser.CHARACTER, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public InitArraysContext initArrays() {
			return getRuleContext(InitArraysContext.class,0);
		}
		public InitStructContext initStruct() {
			return getRuleContext(InitStructContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public InitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitInitVariable(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initVariable);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(ENTIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				match(CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				exprD(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(506);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(507);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(508);
				match(LPAREN);
				setState(509);
				initVariable();
				setState(510);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitArraysContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<InitVariableContext> initVariable() {
			return getRuleContexts(InitVariableContext.class);
		}
		public InitVariableContext initVariable(int i) {
			return getRuleContext(InitVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public InitArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initArrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterInitArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitInitArrays(this);
		}
	}

	public final InitArraysContext initArrays() throws RecognitionException {
		InitArraysContext _localctx = new InitArraysContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LBRACE);
			{
			setState(515);
			initVariable();
			}
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					initVariable();
					}
					}
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(523);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitStructContext extends ParserRuleContext {
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
		}
		public InitStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterInitStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitInitStruct(this);
		}
	}

	public final InitStructContext initStruct() throws RecognitionException {
		InitStructContext _localctx = new InitStructContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			structDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PlayPlusParser.CONST, 0); }
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public List<ArraysContext> arrays() {
			return getRuleContexts(ArraysContext.class);
		}
		public ArraysContext arrays(int i) {
			return getRuleContext(ArraysContext.class,i);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(CONST);
			setState(528);
			mytype();
			setState(529);
			match(ID);
			{
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(530);
				arrays();
				}
			}

			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(533);
				match(AFFECT);
				setState(534);
				initVariable();
				}
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(537);
				match(COMMA);
				setState(538);
				match(ID);
				{
				setState(539);
				arrays();
				}
				}
			}

			setState(542);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PlayPlusParser.ENUM, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitEnumDecl(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(ENUM);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(545);
				match(ID);
				}
			}

			setState(548);
			match(LBRACE);
			setState(549);
			match(ID);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(550);
					match(COMMA);
					setState(551);
					match(ID);
					}
					}
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(557);
			match(RBRACE);
			setState(558);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefDeclContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(PlayPlusParser.TYPEDEF, 0); }
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TypedefDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).enterTypedefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener) ((PlayPlusListener)listener).exitTypedefDecl(this);
		}
	}

	public final TypedefDeclContext typedefDecl() throws RecognitionException {
		TypedefDeclContext _localctx = new TypedefDeclContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(TYPEDEF);
			setState(561);
			mytype();
			setState(562);
			match(ID);
			setState(563);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		case 28:
			return exprG_sempred((ExprGContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprG_sempred(ExprGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u0238\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\5\3g\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6t\n\6\r\6\16\6u\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083\13\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u008e\n\13\r\13\16\13\u008f\5\13\u0092"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a8\n\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\6\23\u00b3\n\23\r\23\16\23\u00b4\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00cb\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00d4\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u00f1\n\33\f\33\16\33\u00f4\13\33\5\33\u00f6\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00fd\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0120"+
		"\n\33\f\33\16\33\u0123\13\33\3\34\3\34\3\34\5\34\u0128\n\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0133\n\36\3\36\3\36\5\36\u0137"+
		"\n\36\3\36\3\36\3\36\7\36\u013c\n\36\f\36\16\36\u013f\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\6\37\u0147\n\37\r\37\16\37\u0148\3\37\3\37\3\37\3"+
		"\37\7\37\u014f\n\37\f\37\16\37\u0152\13\37\3\37\5\37\u0155\n\37\3 \3 "+
		"\3 \3 \3 \3 \6 \u015d\n \r \16 \u015e\3 \3 \3!\3!\3!\3!\3!\3!\6!\u0169"+
		"\n!\r!\16!\u016a\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0176\n#\3#\3#\3#\3"+
		"#\5#\u017c\n#\3#\3#\3#\3#\5#\u0182\n#\3#\3#\3#\3#\5#\u0188\n#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u0191\n#\3#\5#\u0194\n#\3$\3$\5$\u0198\n$\3%\3%\3&\3"+
		"&\5&\u019e\n&\3&\3&\5&\u01a2\n&\3&\3&\3&\3\'\3\'\6\'\u01a9\n\'\r\'\16"+
		"\'\u01aa\3\'\3\'\6\'\u01af\n\'\r\'\16\'\u01b0\5\'\u01b3\n\'\3\'\3\'\3"+
		"(\3(\3)\3)\3)\5)\u01bc\n)\3)\3)\3)\5)\u01c1\n)\7)\u01c3\n)\f)\16)\u01c6"+
		"\13)\3)\3)\7)\u01ca\n)\f)\16)\u01cd\13)\3*\3*\3*\5*\u01d2\n*\3*\3*\3*"+
		"\5*\u01d7\n*\7*\u01d9\n*\f*\16*\u01dc\13*\3+\3+\3+\5+\u01e1\n+\3+\3+\5"+
		"+\u01e5\n+\3+\3+\3+\5+\u01ea\n+\3+\3+\5+\u01ee\n+\7+\u01f0\n+\f+\16+\u01f3"+
		"\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0203\n,\3-\3-\3-\3"+
		"-\7-\u0209\n-\f-\16-\u020c\13-\3-\3-\3.\3.\3/\3/\3/\3/\5/\u0216\n/\3/"+
		"\3/\5/\u021a\n/\3/\3/\3/\5/\u021f\n/\3/\3/\3\60\3\60\5\60\u0225\n\60\3"+
		"\60\3\60\3\60\3\60\7\60\u022b\n\60\f\60\16\60\u022e\13\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\4\u020a\u022c\4\64:\62\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2"+
		"\b\3\2DM\4\2\3\3NN\3\2\37 \3\2!\"\3\2\n\13\3\2\24\26\u0262\2b\3\2\2\2"+
		"\4f\3\2\2\2\6h\3\2\2\2\bl\3\2\2\2\ns\3\2\2\2\fw\3\2\2\2\16\u0081\3\2\2"+
		"\2\20\u0084\3\2\2\2\22\u0087\3\2\2\2\24\u0091\3\2\2\2\26\u0096\3\2\2\2"+
		"\30\u009b\3\2\2\2\32\u009e\3\2\2\2\34\u00a1\3\2\2\2\36\u00a9\3\2\2\2 "+
		"\u00ac\3\2\2\2\"\u00af\3\2\2\2$\u00b2\3\2\2\2&\u00b6\3\2\2\2(\u00b9\3"+
		"\2\2\2*\u00ca\3\2\2\2,\u00d3\3\2\2\2.\u00d5\3\2\2\2\60\u00dd\3\2\2\2\62"+
		"\u00e0\3\2\2\2\64\u00fc\3\2\2\2\66\u0127\3\2\2\28\u0129\3\2\2\2:\u0136"+
		"\3\2\2\2<\u0140\3\2\2\2>\u0156\3\2\2\2@\u0162\3\2\2\2B\u016e\3\2\2\2D"+
		"\u0193\3\2\2\2F\u0197\3\2\2\2H\u0199\3\2\2\2J\u019b\3\2\2\2L\u01a6\3\2"+
		"\2\2N\u01b6\3\2\2\2P\u01cb\3\2\2\2R\u01da\3\2\2\2T\u01dd\3\2\2\2V\u0202"+
		"\3\2\2\2X\u0204\3\2\2\2Z\u020f\3\2\2\2\\\u0211\3\2\2\2^\u0222\3\2\2\2"+
		"`\u0232\3\2\2\2bc\5\4\3\2c\3\3\2\2\2dg\5\6\4\2eg\5\b\5\2fd\3\2\2\2fe\3"+
		"\2\2\2g\5\3\2\2\2hi\5\34\17\2ij\5\f\7\2jk\7\2\2\3k\7\3\2\2\2lm\7@\2\2"+
		"mn\7\33\2\2no\7\33\2\2op\5\n\6\2pq\7\2\2\3q\t\3\2\2\2rt\t\2\2\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wx\5\16\b\2xy\5\20\t\2y"+
		"\r\3\2\2\2z\u0080\5T+\2{\u0080\5\\/\2|\u0080\5N(\2}\u0080\5^\60\2~\u0080"+
		"\5`\61\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0086\5\26\f\2"+
		"\u0086\21\3\2\2\2\u0087\u0088\7\3\2\2\u0088\u0089\7\4\2\2\u0089\u008a"+
		"\7.\2\2\u008a\u008b\7/\2\2\u008b\23\3\2\2\2\u008c\u008e\5\30\r\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\60\2\2\u0095\25\3\2"+
		"\2\2\u0096\u0097\5$\23\2\u0097\u0099\5\24\13\2\u0098\u009a\5$\23\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b\u009c\5B\"\2"+
		"\u009c\u009d\7\65\2\2\u009d\31\3\2\2\2\u009e\u009f\5(\25\2\u009f\u00a0"+
		"\7\65\2\2\u00a0\33\3\2\2\2\u00a1\u00a7\5\36\20\2\u00a2\u00a3\7O\2\2\u00a3"+
		"\u00a4\5 \21\2\u00a4\u00a5\7O\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\7\34"+
		"\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa"+
		"\7A\2\2\u00aa\u00ab\7\f\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad"+
		"\u00ae\7C\2\2\u00ae!\3\2\2\2\u00af\u00b0\7N\2\2\u00b0#\3\2\2\2\u00b1\u00b3"+
		"\5*\26\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b8\7\3\2\2\u00b8"+
		"\'\3\2\2\2\u00b9\u00ba\7B\2\2\u00ba\u00bb\t\3\2\2\u00bb)\3\2\2\2\u00bc"+
		"\u00bd\5(\25\2\u00bd\u00be\7\65\2\2\u00be\u00cb\3\2\2\2\u00bf\u00cb\5"+
		",\27\2\u00c0\u00cb\5\60\31\2\u00c1\u00c2\5D#\2\u00c2\u00c3\7\65\2\2\u00c3"+
		"\u00cb\3\2\2\2\u00c4\u00c5\5B\"\2\u00c5\u00c6\7\65\2\2\u00c6\u00cb\3\2"+
		"\2\2\u00c7\u00cb\5<\37\2\u00c8\u00cb\5> \2\u00c9\u00cb\5@!\2\u00ca\u00bc"+
		"\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb+\3\2\2\2\u00cc\u00d4\5.\30\2\u00cd\u00ce\5:\36\2\u00ce\u00cf"+
		"\7&\2\2\u00cf\u00d0\5\64\33\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\65\2\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d4-\3"+
		"\2\2\2\u00d5\u00d6\5:\36\2\u00d6\u00d7\7&\2\2\u00d7\u00d8\5\66\34\2\u00d8"+
		"\u00d9\t\4\2\2\u00d9\u00da\5\66\34\2\u00da\u00db\3\2\2\2\u00db\u00dc\7"+
		"\65\2\2\u00dc/\3\2\2\2\u00dd\u00de\5\\/\2\u00de\u00df\7\65\2\2\u00df\61"+
		"\3\2\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7\65\2\2\u00e2\63\3\2\2\2\u00e3"+
		"\u00e4\b\33\1\2\u00e4\u00fd\5\66\34\2\u00e5\u00fd\58\35\2\u00e6\u00fd"+
		"\7\35\2\2\u00e7\u00fd\7\36\2\2\u00e8\u00fd\5:\36\2\u00e9\u00ea\7\'\2\2"+
		"\u00ea\u00fd\5\64\33\20\u00eb\u00ec\7N\2\2\u00ec\u00f5\7-\2\2\u00ed\u00f2"+
		"\5\64\33\2\u00ee\u00ef\7\67\2\2\u00ef\u00f1\5\64\33\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fd\7.\2\2\u00f8\u00f9\7-\2\2\u00f9\u00fa"+
		"\5\64\33\2\u00fa\u00fb\7.\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00e3\3\2\2\2"+
		"\u00fc\u00e5\3\2\2\2\u00fc\u00e6\3\2\2\2\u00fc\u00e7\3\2\2\2\u00fc\u00e8"+
		"\3\2\2\2\u00fc\u00e9\3\2\2\2\u00fc\u00eb\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd"+
		"\u0121\3\2\2\2\u00fe\u00ff\f\17\2\2\u00ff\u0100\7)\2\2\u0100\u0120\5\64"+
		"\33\20\u0101\u0102\f\16\2\2\u0102\u0103\7*\2\2\u0103\u0120\5\64\33\17"+
		"\u0104\u0105\f\13\2\2\u0105\u0106\79\2\2\u0106\u0120\5\64\33\f\u0107\u0108"+
		"\f\n\2\2\u0108\u0109\7:\2\2\u0109\u0120\5\64\33\13\u010a\u010b\f\t\2\2"+
		"\u010b\u010c\7%\2\2\u010c\u0120\5\64\33\n\u010d\u010e\f\b\2\2\u010e\u010f"+
		"\7+\2\2\u010f\u0120\5\64\33\t\u0110\u0111\f\7\2\2\u0111\u0112\7,\2\2\u0112"+
		"\u0120\5\64\33\b\u0113\u0114\f\6\2\2\u0114\u0115\7(\2\2\u0115\u0120\5"+
		"\64\33\7\u0116\u0117\f\5\2\2\u0117\u0118\7#\2\2\u0118\u0120\5\64\33\6"+
		"\u0119\u011a\f\4\2\2\u011a\u011b\t\5\2\2\u011b\u0120\5\64\33\5\u011c\u011d"+
		"\f\3\2\2\u011d\u011e\t\4\2\2\u011e\u0120\5\64\33\4\u011f\u00fe\3\2\2\2"+
		"\u011f\u0101\3\2\2\2\u011f\u0104\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u010a"+
		"\3\2\2\2\u011f\u010d\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0113\3\2\2\2\u011f"+
		"\u0116\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\65\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0125\7 \2\2\u0125\u0128\5\66\34\2\u0126\u0128\7\33\2\2"+
		"\u0127\u0124\3\2\2\2\u0127\u0126\3\2\2\2\u0128\67\3\2\2\2\u0129\u012a"+
		"\t\6\2\2\u012a9\3\2\2\2\u012b\u012c\b\36\1\2\u012c\u0137\7N\2\2\u012d"+
		"\u012e\7N\2\2\u012e\u012f\7\61\2\2\u012f\u0132\5\64\33\2\u0130\u0131\7"+
		"\67\2\2\u0131\u0133\5\64\33\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0135\7\62\2\2\u0135\u0137\3\2\2\2\u0136\u012b"+
		"\3\2\2\2\u0136\u012d\3\2\2\2\u0137\u013d\3\2\2\2\u0138\u0139\f\3\2\2\u0139"+
		"\u013a\13\2\2\2\u013a\u013c\7N\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e;\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0141\7\5\2\2\u0141\u0142\7-\2\2\u0142\u0143\5\64\33\2"+
		"\u0143\u0144\7.\2\2\u0144\u0146\7/\2\2\u0145\u0147\5*\26\2\u0146\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0154\7\60\2\2\u014b\u014c\7\6\2\2\u014c\u0150\7"+
		"/\2\2\u014d\u014f\5*\26\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0155\7\60\2\2\u0154\u014b\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"=\3\2\2\2\u0156\u0157\7\b\2\2\u0157\u0158\7-\2\2\u0158\u0159\5\64\33\2"+
		"\u0159\u015a\7.\2\2\u015a\u015c\7/\2\2\u015b\u015d\5*\26\2\u015c\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7\60\2\2\u0161?\3\2\2\2\u0162\u0163\7\t\2\2"+
		"\u0163\u0164\7-\2\2\u0164\u0165\5\64\33\2\u0165\u0166\7.\2\2\u0166\u0168"+
		"\7/\2\2\u0167\u0169\5*\26\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\60"+
		"\2\2\u016dA\3\2\2\2\u016e\u016f\7\23\2\2\u016f\u0170\7-\2\2\u0170\u0171"+
		"\7.\2\2\u0171C\3\2\2\2\u0172\u0173\7\r\2\2\u0173\u0175\7-\2\2\u0174\u0176"+
		"\5\64\33\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0194\7.\2\2\u0178\u0179\7\16\2\2\u0179\u017b\7-\2\2\u017a\u017c"+
		"\5\64\33\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d\u0194\7.\2\2\u017e\u017f\7\17\2\2\u017f\u0181\7-\2\2\u0180\u0182"+
		"\5\64\33\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0194\7.\2\2\u0184\u0185\7\20\2\2\u0185\u0187\7-\2\2\u0186\u0188"+
		"\5\64\33\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2"+
		"\u0189\u0194\7.\2\2\u018a\u018b\7\22\2\2\u018b\u018c\7-\2\2\u018c\u0194"+
		"\7.\2\2\u018d\u018e\7\21\2\2\u018e\u0190\7-\2\2\u018f\u0191\5\66\34\2"+
		"\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194"+
		"\7.\2\2\u0193\u0172\3\2\2\2\u0193\u0178\3\2\2\2\u0193\u017e\3\2\2\2\u0193"+
		"\u0184\3\2\2\2\u0193\u018a\3\2\2\2\u0193\u018d\3\2\2\2\u0194E\3\2\2\2"+
		"\u0195\u0198\5H%\2\u0196\u0198\5J&\2\u0197\u0195\3\2\2\2\u0197\u0196\3"+
		"\2\2\2\u0198G\3\2\2\2\u0199\u019a\t\7\2\2\u019aI\3\2\2\2\u019b\u019d\7"+
		"\27\2\2\u019c\u019e\7N\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\7/\2\2\u01a0\u01a2\5P)\2\u01a1\u01a0\3\2\2"+
		"\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\60\2\2\u01a4"+
		"\u01a5\7\65\2\2\u01a5K\3\2\2\2\u01a6\u01a8\7\61\2\2\u01a7\u01a9\7\33\2"+
		"\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01b2\3\2\2\2\u01ac\u01ae\7\67\2\2\u01ad\u01af\7\33\2\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\7\62\2\2\u01b5M\3\2\2\2\u01b6\u01b7\5J&\2\u01b7"+
		"O\3\2\2\2\u01b8\u01b9\5F$\2\u01b9\u01bb\7N\2\2\u01ba\u01bc\5L\'\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c4\3\2\2\2\u01bd\u01be\7\67"+
		"\2\2\u01be\u01c0\7N\2\2\u01bf\u01c1\5L\'\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c8\7\65\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01b8\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccQ\3\2\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01ce\u01cf\5F$\2\u01cf\u01d1\7N\2\2\u01d0\u01d2"+
		"\5L\'\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\7\67\2\2\u01d4\u01d6\7N\2\2\u01d5\u01d7\5L\'\2\u01d6\u01d5\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01ce\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbS\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dd\u01de\5F$\2\u01de\u01e0\7N\2\2\u01df\u01e1"+
		"\5L\'\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e3\7&\2\2\u01e3\u01e5\5V,\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2"+
		"\2\u01e5\u01f1\3\2\2\2\u01e6\u01e7\7\67\2\2\u01e7\u01e9\7N\2\2\u01e8\u01ea"+
		"\5L\'\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01ec\7&\2\2\u01ec\u01ee\5V,\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2"+
		"\2\u01ee\u01f0\3\2\2\2\u01ef\u01e6\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\7\65\2\2\u01f5U\3\2\2\2\u01f6\u0203\7\n\2\2\u01f7\u0203\7\13\2"+
		"\2\u01f8\u0203\7P\2\2\u01f9\u0203\7\35\2\2\u01fa\u0203\7\36\2\2\u01fb"+
		"\u0203\5\64\33\2\u01fc\u0203\5X-\2\u01fd\u0203\5Z.\2\u01fe\u01ff\7-\2"+
		"\2\u01ff\u0200\5V,\2\u0200\u0201\7.\2\2\u0201\u0203\3\2\2\2\u0202\u01f6"+
		"\3\2\2\2\u0202\u01f7\3\2\2\2\u0202\u01f8\3\2\2\2\u0202\u01f9\3\2\2\2\u0202"+
		"\u01fa\3\2\2\2\u0202\u01fb\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01fd\3\2"+
		"\2\2\u0202\u01fe\3\2\2\2\u0203W\3\2\2\2\u0204\u0205\7/\2\2\u0205\u020a"+
		"\5V,\2\u0206\u0207\7\67\2\2\u0207\u0209\5V,\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020c\3\2\2\2\u020a\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7\60\2\2\u020eY\3\2\2\2\u020f\u0210"+
		"\5N(\2\u0210[\3\2\2\2\u0211\u0212\7\30\2\2\u0212\u0213\5F$\2\u0213\u0215"+
		"\7N\2\2\u0214\u0216\5L\'\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0218\7&\2\2\u0218\u021a\5V,\2\u0219\u0217\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\u021e\3\2\2\2\u021b\u021c\7\67\2\2\u021c"+
		"\u021d\7N\2\2\u021d\u021f\5L\'\2\u021e\u021b\3\2\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u0220\3\2\2\2\u0220\u0221\7\65\2\2\u0221]\3\2\2\2\u0222\u0224"+
		"\7\31\2\2\u0223\u0225\7N\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\7/\2\2\u0227\u022c\7N\2\2\u0228\u0229\7\67"+
		"\2\2\u0229\u022b\7N\2\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022f\u0230\7\60\2\2\u0230\u0231\7\65\2\2\u0231_\3\2\2\2\u0232\u0233"+
		"\7\32\2\2\u0233\u0234\5F$\2\u0234\u0235\7N\2\2\u0235\u0236\7\65\2\2\u0236"+
		"a\3\2\2\2:fu\177\u0081\u008f\u0091\u0099\u00a7\u00b4\u00ca\u00d3\u00f2"+
		"\u00f5\u00fc\u011f\u0121\u0127\u0132\u0136\u013d\u0148\u0150\u0154\u015e"+
		"\u016a\u0175\u017b\u0181\u0187\u0190\u0193\u0197\u019d\u01a1\u01aa\u01b0"+
		"\u01b2\u01bb\u01c0\u01c4\u01cb\u01d1\u01d6\u01da\u01e0\u01e4\u01e9\u01ed"+
		"\u01f1\u0202\u020a\u0215\u0219\u021e\u0224\u022c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}