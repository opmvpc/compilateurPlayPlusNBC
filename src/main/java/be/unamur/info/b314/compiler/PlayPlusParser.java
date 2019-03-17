// Generated from tmp\PlayPlus.g4 by ANTLR 4.6
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
		VOID=1, IF=2, ELSE=3, THEN=4, REPEAT=5, WHILE=6, TRUE=7, FALSE=8, IMPORT=9, 
		LEFT=10, RIGHT=11, UP=12, DOWN=13, JUMP=14, FIGHT=15, DIG=16, BOOL=17, 
		INT=18, CHAR=19, STRUCT=20, CONST=21, ENUM=22, TYPEDEF=23, NATUREL=24, 
		ENTIER=25, FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, 
		DIV=32, POW=33, EQUAL=34, AFFECT=35, NOT=36, NOTEQUAL=37, SMALLER=38, 
		GREATER=39, EGREATER=40, ESMALLER=41, LPAREN=42, RPAREN=43, LBRACE=44, 
		RBRACE=45, LBRACKET=46, RBRACKET=47, SINGLEQUOTE=48, BACKSLASH=49, SEMICOLON=50, 
		COLON=51, COMMA=52, DOT=53, AND=54, OR=55, AMPERSAND=56, COMMENTAIRES=57, 
		BLOCK_COMMENT=58, LINE_COMMENT=59, NEWLINE=60, WS=61, HASHTAG=62, MAIN=63, 
		RETURN=64, MAP=65, ID=66, DOUBLEQUOTE=67;
	public static final int
		RULE_root = 0, RULE_minimalProgram = 1, RULE_globalVars = 2, RULE_mainDecl = 3, 
		RULE_mainStart = 4, RULE_mainEND = 5, RULE_mainInst = 6, RULE_mainDig = 7, 
		RULE_mainRet = 8, RULE_implDecl = 9, RULE_impKeyWord = 10, RULE_fileDecl = 11, 
		RULE_fileName = 12, RULE_statements = 13, RULE_returnVoid = 14, RULE_returnInstr = 15, 
		RULE_statement = 16, RULE_affectInstr = 17, RULE_plusMinusExpr = 18, RULE_constantExpr = 19, 
		RULE_variableExpr = 20, RULE_exprD = 21, RULE_exprEnt = 22, RULE_exprBool = 23, 
		RULE_exprG = 24, RULE_conditionalStmt = 25, RULE_repeatStmt = 26, RULE_whileStmt = 27, 
		RULE_digInstr = 28, RULE_actionType = 29, RULE_mytype = 30, RULE_scalar = 31, 
		RULE_structures = 32, RULE_arrays = 33, RULE_structDecl = 34, RULE_listVarName = 35, 
		RULE_varDecl = 36, RULE_initVariable = 37, RULE_initArrays = 38, RULE_initStruct = 39, 
		RULE_constDecl = 40, RULE_enumDecl = 41, RULE_typedefDecl = 42;
	public static final String[] ruleNames = {
		"root", "minimalProgram", "globalVars", "mainDecl", "mainStart", "mainEND", 
		"mainInst", "mainDig", "mainRet", "implDecl", "impKeyWord", "fileDecl", 
		"fileName", "statements", "returnVoid", "returnInstr", "statement", "affectInstr", 
		"plusMinusExpr", "constantExpr", "variableExpr", "exprD", "exprEnt", "exprBool", 
		"exprG", "conditionalStmt", "repeatStmt", "whileStmt", "digInstr", "actionType", 
		"mytype", "scalar", "structures", "arrays", "structDecl", "listVarName", 
		"varDecl", "initVariable", "initArrays", "initStruct", "constDecl", "enumDecl", 
		"typedefDecl"
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
		"MAIN", "RETURN", "MAP", "ID", "DOUBLEQUOTE"
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
		public ImplDeclContext implDecl() {
			return getRuleContext(ImplDeclContext.class,0);
		}
		public MinimalProgramContext minimalProgram() {
			return getRuleContext(MinimalProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
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
			setState(86);
			implDecl();
			setState(87);
			minimalProgram();
			setState(88);
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
		enterRule(_localctx, 2, RULE_minimalProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			globalVars();
			setState(91);
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
		enterRule(_localctx, 4, RULE_globalVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(93);
					varDecl();
					}
					break;
				case 2:
					{
					setState(94);
					constDecl();
					}
					break;
				case 3:
					{
					setState(95);
					structDecl();
					}
					break;
				case 4:
					{
					setState(96);
					enumDecl();
					}
					break;
				case 5:
					{
					setState(97);
					typedefDecl();
					}
					break;
				}
				}
				setState(102);
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
		enterRule(_localctx, 6, RULE_mainDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			mainStart();
			}
			{
			setState(104);
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
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
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
		enterRule(_localctx, 8, RULE_mainStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAIN);
			setState(107);
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
		public MainDigContext mainDig() {
			return getRuleContext(MainDigContext.class,0);
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
		enterRule(_localctx, 10, RULE_mainEND);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIG) {
				{
				setState(109);
				mainDig();
				}
			}

			setState(112);
			mainRet();
			setState(113);
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
		public MainENDContext mainEND() {
			return getRuleContext(MainENDContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		enterRule(_localctx, 12, RULE_mainInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(115);
				statements();
				}
				break;
			}
			setState(118);
			mainEND();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID) {
				{
				setState(119);
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
		enterRule(_localctx, 14, RULE_mainDig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			digInstr();
			}
			{
			setState(123);
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
		enterRule(_localctx, 16, RULE_mainRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			returnInstr();
			}
			{
			setState(126);
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
		enterRule(_localctx, 18, RULE_implDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			impKeyWord();
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(129);
				match(DOUBLEQUOTE);
				setState(130);
				fileDecl();
				setState(131);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(133);
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
		enterRule(_localctx, 20, RULE_impKeyWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(HASHTAG);
			setState(137);
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
		enterRule(_localctx, 22, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			fileName();
			setState(140);
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
		enterRule(_localctx, 24, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 26, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 28, RULE_returnVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149);
			match(RETURN);
			}
			{
			setState(150);
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
		enterRule(_localctx, 30, RULE_returnInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			match(RETURN);
			}
			setState(153);
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
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(155);
				returnInstr();
				}
				{
				setState(156);
				match(SEMICOLON);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				affectInstr();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				constantExpr();
				}
				break;
			case LEFT:
			case RIGHT:
			case UP:
			case DOWN:
			case FIGHT:
			case DIG:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(160);
				actionType();
				}
				{
				setState(161);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(163);
				conditionalStmt();
				}
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(164);
				repeatStmt();
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(165);
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
		enterRule(_localctx, 34, RULE_affectInstr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				plusMinusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(169);
				exprG(0);
				setState(170);
				match(AFFECT);
				setState(171);
				exprD();
				}
				setState(173);
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
		enterRule(_localctx, 36, RULE_plusMinusExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			exprG(0);
			setState(178);
			match(AFFECT);
			setState(179);
			exprEnt(0);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			exprEnt(0);
			}
			setState(183);
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
		enterRule(_localctx, 38, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			constDecl();
			setState(186);
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
		enterRule(_localctx, 40, RULE_variableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
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
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprD);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				exprEnt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				exprBool(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				exprG(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(ID);
				setState(197);
				match(LPAREN);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (TRUE - 7)) | (1L << (FALSE - 7)) | (1L << (NATUREL - 7)) | (1L << (ENTIER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)) | (1L << (MINUS - 7)) | (1L << (NOT - 7)) | (1L << (LPAREN - 7)) | (1L << (ID - 7)))) != 0)) {
					{
					setState(198);
					exprD();
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(199);
						match(COMMA);
						setState(200);
						exprD();
						}
						}
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(208);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(LPAREN);
				setState(210);
				exprD();
				setState(211);
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

	public static class ExprEntContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(PlayPlusParser.ENTIER, 0); }
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public TerminalNode MUL() { return getToken(PlayPlusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
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
		return exprEnt(0);
	}

	private ExprEntContext exprEnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprEntContext _localctx = new ExprEntContext(_ctx, _parentState);
		ExprEntContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(216);
				match(MINUS);
				setState(217);
				exprEnt(5);
				}
				break;
			case ENTIER:
				{
				setState(218);
				match(ENTIER);
				}
				break;
			case NATUREL:
				{
				setState(219);
				match(NATUREL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						exprEnt(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						exprEnt(4);
						}
						break;
					}
					}
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(PlayPlusParser.GREATER, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode EGREATER() { return getToken(PlayPlusParser.EGREATER, 0); }
		public TerminalNode ESMALLER() { return getToken(PlayPlusParser.ESMALLER, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayPlusParser.NOTEQUAL, 0); }
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
		return exprBool(0);
	}

	private ExprBoolContext exprBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, _parentState);
		ExprBoolContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_exprBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(234);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(235);
				match(FALSE);
				}
				break;
			case NOT:
				{
				setState(236);
				match(NOT);
				setState(237);
				exprBool(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(240);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(241);
						match(AND);
						setState(242);
						exprBool(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(243);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(244);
						match(OR);
						setState(245);
						exprBool(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(246);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(247);
						match(SMALLER);
						setState(248);
						exprBool(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						match(GREATER);
						setState(251);
						exprBool(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253);
						match(EQUAL);
						setState(254);
						exprBool(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(255);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(256);
						match(EGREATER);
						setState(257);
						exprBool(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(259);
						match(ESMALLER);
						setState(260);
						exprBool(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(261);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(262);
						match(NOTEQUAL);
						setState(263);
						exprBool(2);
						}
						break;
					}
					}
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(270);
				match(ID);
				}
				break;
			case 2:
				{
				setState(271);
				match(ID);
				setState(272);
				match(LBRACKET);
				setState(273);
				exprD();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(274);
					match(COMMA);
					setState(275);
					exprD();
					}
				}

				setState(278);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(282);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(283);
					matchWildcard();
					setState(284);
					match(ID);
					}
					}
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 50, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IF);
			setState(291);
			match(LPAREN);
			setState(292);
			exprD();
			setState(293);
			match(RPAREN);
			setState(294);
			match(LBRACE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				statement();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(300);
			match(RBRACE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(301);
				match(ELSE);
				setState(302);
				match(LBRACE);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID) {
					{
					{
					setState(303);
					statement();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
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
		enterRule(_localctx, 52, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(REPEAT);
			setState(313);
			match(LPAREN);
			setState(314);
			exprD();
			setState(315);
			match(RPAREN);
			setState(316);
			match(LBRACE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				statement();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(322);
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
		enterRule(_localctx, 54, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			match(LPAREN);
			setState(326);
			exprD();
			setState(327);
			match(RPAREN);
			setState(328);
			match(LBRACE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				statement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << FIGHT) | (1L << DIG) | (1L << CONST))) != 0) || _la==RETURN || _la==ID );
			setState(334);
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
		enterRule(_localctx, 56, RULE_digInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(DIG);
			setState(337);
			match(LPAREN);
			setState(338);
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
		public DigInstrContext digInstr() {
			return getRuleContext(DigInstrContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_actionType);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				digInstr();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(LEFT);
				setState(342);
				match(LPAREN);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (TRUE - 7)) | (1L << (FALSE - 7)) | (1L << (NATUREL - 7)) | (1L << (ENTIER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)) | (1L << (MINUS - 7)) | (1L << (NOT - 7)) | (1L << (LPAREN - 7)) | (1L << (ID - 7)))) != 0)) {
					{
					setState(343);
					exprD();
					}
				}

				setState(346);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(RIGHT);
				setState(348);
				match(LPAREN);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (TRUE - 7)) | (1L << (FALSE - 7)) | (1L << (NATUREL - 7)) | (1L << (ENTIER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)) | (1L << (MINUS - 7)) | (1L << (NOT - 7)) | (1L << (LPAREN - 7)) | (1L << (ID - 7)))) != 0)) {
					{
					setState(349);
					exprD();
					}
				}

				setState(352);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				match(UP);
				setState(354);
				match(LPAREN);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (TRUE - 7)) | (1L << (FALSE - 7)) | (1L << (NATUREL - 7)) | (1L << (ENTIER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)) | (1L << (MINUS - 7)) | (1L << (NOT - 7)) | (1L << (LPAREN - 7)) | (1L << (ID - 7)))) != 0)) {
					{
					setState(355);
					exprD();
					}
				}

				setState(358);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(DOWN);
				setState(360);
				match(LPAREN);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (TRUE - 7)) | (1L << (FALSE - 7)) | (1L << (NATUREL - 7)) | (1L << (ENTIER - 7)) | (1L << (STRING - 7)) | (1L << (CHARACTER - 7)) | (1L << (MINUS - 7)) | (1L << (NOT - 7)) | (1L << (LPAREN - 7)) | (1L << (ID - 7)))) != 0)) {
					{
					setState(361);
					exprD();
					}
				}

				setState(364);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				match(FIGHT);
				setState(366);
				match(LPAREN);
				setState(367);
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
		enterRule(_localctx, 60, RULE_mytype);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
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
		enterRule(_localctx, 62, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ListVarNameContext listVarName() {
			return getRuleContext(ListVarNameContext.class,0);
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
		enterRule(_localctx, 64, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(STRUCT);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(377);
				match(ID);
				}
			}

			setState(380);
			match(LBRACE);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(381);
				listVarName();
				}
				break;
			}
			setState(384);
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
		enterRule(_localctx, 66, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LBRACKET);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				match(NATUREL);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATUREL );
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(392);
				match(COMMA);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(393);
					match(NATUREL);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATUREL );
				}
			}

			setState(400);
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
		enterRule(_localctx, 68, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
		enterRule(_localctx, 70, RULE_listVarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(404);
				mytype();
				setState(405);
				match(ID);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(406);
					arrays();
					}
				}

				{
				setState(409);
				match(COMMA);
				setState(410);
				match(ID);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(411);
					arrays();
					}
				}

				}
				}
				}
				setState(418);
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
		enterRule(_localctx, 72, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			mytype();
			setState(420);
			match(ID);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(421);
				arrays();
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(424);
				match(AFFECT);
				setState(425);
				initVariable();
				}
			}

			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				match(ID);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(430);
					arrays();
					}
				}

				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFFECT) {
					{
					setState(433);
					match(AFFECT);
					setState(434);
					initVariable();
					}
				}

				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
		enterRule(_localctx, 74, RULE_initVariable);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(ENTIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				exprD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(452);
				match(LPAREN);
				setState(453);
				initVariable();
				setState(454);
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
		enterRule(_localctx, 76, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACE);
			{
			setState(459);
			initVariable();
			}
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(460);
					match(COMMA);
					setState(461);
					initVariable();
					}
					}
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(467);
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
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(PlayPlusParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PlayPlusParser.COLON, i);
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
		enterRule(_localctx, 78, RULE_initStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(LBRACE);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(470);
				match(ID);
				setState(471);
				match(COLON);
				setState(472);
				initVariable();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(473);
					match(COMMA);
					setState(474);
					match(ID);
					setState(475);
					match(COLON);
					setState(476);
					initVariable();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(484);
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
		enterRule(_localctx, 80, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(CONST);
			setState(487);
			mytype();
			setState(488);
			match(ID);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(489);
				arrays();
				}
			}

			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(492);
				match(AFFECT);
				setState(493);
				initVariable();
				}
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(496);
				match(COMMA);
				setState(497);
				match(ID);
				{
				setState(498);
				arrays();
				}
				}
			}

			setState(501);
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
		enterRule(_localctx, 82, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(ENUM);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(504);
				match(ID);
				}
			}

			setState(507);
			match(LBRACE);
			setState(508);
			match(ID);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(509);
					match(COMMA);
					setState(510);
					match(ID);
					}
					}
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(516);
			match(RBRACE);
			setState(517);
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
		enterRule(_localctx, 84, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(TYPEDEF);
			setState(520);
			mytype();
			setState(521);
			match(ID);
			setState(522);
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
		case 22:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 23:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 24:
			return exprG_sempred((ExprGContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprG_sempred(ExprGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u020f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4e\n\4\f\4\16\4"+
		"h\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\5\7q\n\7\3\7\3\7\3\7\3\b\5\bw\n\b\3"+
		"\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0089\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\6\17\u0094\n\17"+
		"\r\17\16\17\u0095\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00cc\n\27\f\27\16\27\u00cf\13\27\5\27\u00d1\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00df"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e7\n\30\f\30\16\30\u00ea\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u00f1\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u010b\n\31\f\31\16\31\u010e\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0117\n\32\3\32\3\32\5\32\u011b\n"+
		"\32\3\32\3\32\3\32\7\32\u0120\n\32\f\32\16\32\u0123\13\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\6\33\u012b\n\33\r\33\16\33\u012c\3\33\3\33\3\33\3\33"+
		"\7\33\u0133\n\33\f\33\16\33\u0136\13\33\3\33\5\33\u0139\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\6\34\u0141\n\34\r\34\16\34\u0142\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\6\35\u014d\n\35\r\35\16\35\u014e\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u015b\n\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0161\n\37\3\37\3\37\3\37\3\37\5\37\u0167\n\37\3\37\3\37\3\37\3"+
		"\37\5\37\u016d\n\37\3\37\3\37\3\37\3\37\5\37\u0173\n\37\3 \3 \5 \u0177"+
		"\n \3!\3!\3\"\3\"\5\"\u017d\n\"\3\"\3\"\5\"\u0181\n\"\3\"\3\"\3#\3#\6"+
		"#\u0187\n#\r#\16#\u0188\3#\3#\6#\u018d\n#\r#\16#\u018e\5#\u0191\n#\3#"+
		"\3#\3$\3$\3%\3%\3%\5%\u019a\n%\3%\3%\3%\5%\u019f\n%\7%\u01a1\n%\f%\16"+
		"%\u01a4\13%\3&\3&\3&\5&\u01a9\n&\3&\3&\5&\u01ad\n&\3&\3&\3&\5&\u01b2\n"+
		"&\3&\3&\5&\u01b6\n&\7&\u01b8\n&\f&\16&\u01bb\13&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01cb\n\'\3(\3(\3(\3(\7(\u01d1\n"+
		"(\f(\16(\u01d4\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\7)\u01e0\n)\f)\16)\u01e3"+
		"\13)\5)\u01e5\n)\3)\3)\3*\3*\3*\3*\5*\u01ed\n*\3*\3*\5*\u01f1\n*\3*\3"+
		"*\3*\5*\u01f6\n*\3*\3*\3+\3+\5+\u01fc\n+\3+\3+\3+\3+\7+\u0202\n+\f+\16"+
		"+\u0205\13+\3+\3+\3+\3,\3,\3,\3,\3,\3,\4\u01d2\u0203\5.\60\62-\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2"+
		"\6\4\2\3\3DD\3\2\37 \3\2!\"\3\2\23\25\u0239\2X\3\2\2\2\4\\\3\2\2\2\6f"+
		"\3\2\2\2\bi\3\2\2\2\nl\3\2\2\2\fp\3\2\2\2\16v\3\2\2\2\20|\3\2\2\2\22\177"+
		"\3\2\2\2\24\u0082\3\2\2\2\26\u008a\3\2\2\2\30\u008d\3\2\2\2\32\u0090\3"+
		"\2\2\2\34\u0093\3\2\2\2\36\u0097\3\2\2\2 \u009a\3\2\2\2\"\u00a8\3\2\2"+
		"\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00bb\3\2\2\2*\u00be\3\2\2\2,\u00d7"+
		"\3\2\2\2.\u00de\3\2\2\2\60\u00f0\3\2\2\2\62\u011a\3\2\2\2\64\u0124\3\2"+
		"\2\2\66\u013a\3\2\2\28\u0146\3\2\2\2:\u0152\3\2\2\2<\u0172\3\2\2\2>\u0176"+
		"\3\2\2\2@\u0178\3\2\2\2B\u017a\3\2\2\2D\u0184\3\2\2\2F\u0194\3\2\2\2H"+
		"\u01a2\3\2\2\2J\u01a5\3\2\2\2L\u01ca\3\2\2\2N\u01cc\3\2\2\2P\u01d7\3\2"+
		"\2\2R\u01e8\3\2\2\2T\u01f9\3\2\2\2V\u0209\3\2\2\2XY\5\24\13\2YZ\5\4\3"+
		"\2Z[\7\2\2\3[\3\3\2\2\2\\]\5\6\4\2]^\5\b\5\2^\5\3\2\2\2_e\5J&\2`e\5R*"+
		"\2ae\5F$\2be\5T+\2ce\5V,\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hf\3\2\2\2ij\5\n\6\2jk"+
		"\5\16\b\2k\t\3\2\2\2lm\7A\2\2mn\7.\2\2n\13\3\2\2\2oq\5\20\t\2po\3\2\2"+
		"\2pq\3\2\2\2qr\3\2\2\2rs\5\22\n\2st\7/\2\2t\r\3\2\2\2uw\5\34\17\2vu\3"+
		"\2\2\2vw\3\2\2\2wx\3\2\2\2xz\5\f\7\2y{\5\34\17\2zy\3\2\2\2z{\3\2\2\2{"+
		"\17\3\2\2\2|}\5:\36\2}~\7\64\2\2~\21\3\2\2\2\177\u0080\5 \21\2\u0080\u0081"+
		"\7\64\2\2\u0081\23\3\2\2\2\u0082\u0088\5\26\f\2\u0083\u0084\7E\2\2\u0084"+
		"\u0085\5\30\r\2\u0085\u0086\7E\2\2\u0086\u0089\3\2\2\2\u0087\u0089\7\34"+
		"\2\2\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089\25\3\2\2\2\u008a\u008b"+
		"\7@\2\2\u008b\u008c\7\13\2\2\u008c\27\3\2\2\2\u008d\u008e\5\32\16\2\u008e"+
		"\u008f\7C\2\2\u008f\31\3\2\2\2\u0090\u0091\7D\2\2\u0091\33\3\2\2\2\u0092"+
		"\u0094\5\"\22\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\35\3\2\2\2\u0097\u0098\7B\2\2\u0098\u0099"+
		"\7\3\2\2\u0099\37\3\2\2\2\u009a\u009b\7B\2\2\u009b\u009c\t\2\2\2\u009c"+
		"!\3\2\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\64\2\2\u009f\u00a9\3\2\2\2"+
		"\u00a0\u00a9\5$\23\2\u00a1\u00a9\5(\25\2\u00a2\u00a3\5<\37\2\u00a3\u00a4"+
		"\7\64\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a9\5\64\33\2\u00a6\u00a9\5\66\34"+
		"\2\u00a7\u00a9\58\35\2\u00a8\u009d\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1"+
		"\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9#\3\2\2\2\u00aa\u00b2\5&\24\2\u00ab\u00ac\5\62\32"+
		"\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\7\64\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2"+
		"\u00b2%\3\2\2\2\u00b3\u00b4\5\62\32\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\5"+
		".\30\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7\64\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\5R*\2\u00bc\u00bd\7\64\2\2"+
		"\u00bd)\3\2\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0\7\64\2\2\u00c0+\3\2\2\2"+
		"\u00c1\u00d8\5.\30\2\u00c2\u00d8\5\60\31\2\u00c3\u00d8\7\35\2\2\u00c4"+
		"\u00d8\7\36\2\2\u00c5\u00d8\5\62\32\2\u00c6\u00c7\7D\2\2\u00c7\u00d0\7"+
		",\2\2\u00c8\u00cd\5,\27\2\u00c9\u00ca\7\66\2\2\u00ca\u00cc\5,\27\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d8\7-\2\2\u00d3\u00d4\7,\2"+
		"\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\7-\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c1"+
		"\3\2\2\2\u00d7\u00c2\3\2\2\2\u00d7\u00c3\3\2\2\2\u00d7\u00c4\3\2\2\2\u00d7"+
		"\u00c5\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8-\3\2\2\2"+
		"\u00d9\u00da\b\30\1\2\u00da\u00db\7 \2\2\u00db\u00df\5.\30\7\u00dc\u00df"+
		"\7\33\2\2\u00dd\u00df\7\32\2\2\u00de\u00d9\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0\u00e1\f\6\2\2\u00e1\u00e2"+
		"\t\4\2\2\u00e2\u00e7\5.\30\7\u00e3\u00e4\f\5\2\2\u00e4\u00e5\t\3\2\2\u00e5"+
		"\u00e7\5.\30\6\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\b\31\1\2\u00ec\u00f1\7\t\2\2\u00ed\u00f1\7\n\2\2"+
		"\u00ee\u00ef\7&\2\2\u00ef\u00f1\5\60\31\t\u00f0\u00eb\3\2\2\2\u00f0\u00ed"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u010c\3\2\2\2\u00f2\u00f3\f\13\2\2"+
		"\u00f3\u00f4\78\2\2\u00f4\u010b\5\60\31\f\u00f5\u00f6\f\n\2\2\u00f6\u00f7"+
		"\79\2\2\u00f7\u010b\5\60\31\13\u00f8\u00f9\f\b\2\2\u00f9\u00fa\7(\2\2"+
		"\u00fa\u010b\5\60\31\t\u00fb\u00fc\f\7\2\2\u00fc\u00fd\7)\2\2\u00fd\u010b"+
		"\5\60\31\b\u00fe\u00ff\f\6\2\2\u00ff\u0100\7$\2\2\u0100\u010b\5\60\31"+
		"\7\u0101\u0102\f\5\2\2\u0102\u0103\7*\2\2\u0103\u010b\5\60\31\6\u0104"+
		"\u0105\f\4\2\2\u0105\u0106\7+\2\2\u0106\u010b\5\60\31\5\u0107\u0108\f"+
		"\3\2\2\u0108\u0109\7\'\2\2\u0109\u010b\5\60\31\4\u010a\u00f2\3\2\2\2\u010a"+
		"\u00f5\3\2\2\2\u010a\u00f8\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u00fe\3\2"+
		"\2\2\u010a\u0101\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\61\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010f\u0110\b\32\1\2\u0110\u011b\7D\2\2\u0111\u0112"+
		"\7D\2\2\u0112\u0113\7\60\2\2\u0113\u0116\5,\27\2\u0114\u0115\7\66\2\2"+
		"\u0115\u0117\5,\27\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011b\3\2\2\2\u011a\u010f\3\2\2\2"+
		"\u011a\u0111\3\2\2\2\u011b\u0121\3\2\2\2\u011c\u011d\f\3\2\2\u011d\u011e"+
		"\13\2\2\2\u011e\u0120\7D\2\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\63\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0124\u0125\7\4\2\2\u0125\u0126\7,\2\2\u0126\u0127\5,\27\2\u0127\u0128"+
		"\7-\2\2\u0128\u012a\7.\2\2\u0129\u012b\5\"\22\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0138\7/\2\2\u012f\u0130\7\5\2\2\u0130\u0134\7.\2\2\u0131\u0133"+
		"\5\"\22\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139"+
		"\7/\2\2\u0138\u012f\3\2\2\2\u0138\u0139\3\2\2\2\u0139\65\3\2\2\2\u013a"+
		"\u013b\7\7\2\2\u013b\u013c\7,\2\2\u013c\u013d\5,\27\2\u013d\u013e\7-\2"+
		"\2\u013e\u0140\7.\2\2\u013f\u0141\5\"\22\2\u0140\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7/\2\2\u0145\67\3\2\2\2\u0146\u0147\7\b\2\2\u0147\u0148\7,\2\2"+
		"\u0148\u0149\5,\27\2\u0149\u014a\7-\2\2\u014a\u014c\7.\2\2\u014b\u014d"+
		"\5\"\22\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7/\2\2\u01519\3\2"+
		"\2\2\u0152\u0153\7\22\2\2\u0153\u0154\7,\2\2\u0154\u0155\7-\2\2\u0155"+
		";\3\2\2\2\u0156\u0173\5:\36\2\u0157\u0158\7\f\2\2\u0158\u015a\7,\2\2\u0159"+
		"\u015b\5,\27\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u0173\7-\2\2\u015d\u015e\7\r\2\2\u015e\u0160\7,\2\2\u015f\u0161"+
		"\5,\27\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0173\7-\2\2\u0163\u0164\7\16\2\2\u0164\u0166\7,\2\2\u0165\u0167\5,\27"+
		"\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0173"+
		"\7-\2\2\u0169\u016a\7\17\2\2\u016a\u016c\7,\2\2\u016b\u016d\5,\27\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0173\7-"+
		"\2\2\u016f\u0170\7\21\2\2\u0170\u0171\7,\2\2\u0171\u0173\7-\2\2\u0172"+
		"\u0156\3\2\2\2\u0172\u0157\3\2\2\2\u0172\u015d\3\2\2\2\u0172\u0163\3\2"+
		"\2\2\u0172\u0169\3\2\2\2\u0172\u016f\3\2\2\2\u0173=\3\2\2\2\u0174\u0177"+
		"\5@!\2\u0175\u0177\5B\"\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177"+
		"?\3\2\2\2\u0178\u0179\t\5\2\2\u0179A\3\2\2\2\u017a\u017c\7\26\2\2\u017b"+
		"\u017d\7D\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0180\7.\2\2\u017f\u0181\5H%\2\u0180\u017f\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7/\2\2\u0183C\3\2\2\2\u0184\u0186"+
		"\7\60\2\2\u0185\u0187\7\32\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0190\3\2\2\2\u018a\u018c"+
		"\7\66\2\2\u018b\u018d\7\32\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018a"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\61\2\2"+
		"\u0193E\3\2\2\2\u0194\u0195\5B\"\2\u0195G\3\2\2\2\u0196\u0197\5> \2\u0197"+
		"\u0199\7D\2\2\u0198\u019a\5D#\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u019c\7\66\2\2\u019c\u019e\7D\2\2\u019d\u019f"+
		"\5D#\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u0196\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3I\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\5> \2\u01a6\u01a8"+
		"\7D\2\2\u01a7\u01a9\5D#\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01ab\7%\2\2\u01ab\u01ad\5L\'\2\u01ac\u01aa\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01b9\3\2\2\2\u01ae\u01af\7\66\2\2\u01af"+
		"\u01b1\7D\2\2\u01b0\u01b2\5D#\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2"+
		"\2\u01b2\u01b5\3\2\2\2\u01b3\u01b4\7%\2\2\u01b4\u01b6\5L\'\2\u01b5\u01b3"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7\64\2\2\u01bdK\3\2\2\2\u01be\u01cb"+
		"\7\t\2\2\u01bf\u01cb\7\n\2\2\u01c0\u01cb\7\33\2\2\u01c1\u01cb\7\35\2\2"+
		"\u01c2\u01cb\7\36\2\2\u01c3\u01cb\5,\27\2\u01c4\u01cb\5N(\2\u01c5\u01cb"+
		"\5P)\2\u01c6\u01c7\7,\2\2\u01c7\u01c8\5L\'\2\u01c8\u01c9\7-\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01be\3\2\2\2\u01ca\u01bf\3\2\2\2\u01ca\u01c0\3\2"+
		"\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca"+
		"\u01c4\3\2\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cbM\3\2\2\2"+
		"\u01cc\u01cd\7.\2\2\u01cd\u01d2\5L\'\2\u01ce\u01cf\7\66\2\2\u01cf\u01d1"+
		"\5L\'\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7/"+
		"\2\2\u01d6O\3\2\2\2\u01d7\u01e4\7.\2\2\u01d8\u01d9\7D\2\2\u01d9\u01da"+
		"\7\65\2\2\u01da\u01e1\5L\'\2\u01db\u01dc\7\66\2\2\u01dc\u01dd\7D\2\2\u01dd"+
		"\u01de\7\65\2\2\u01de\u01e0\5L\'\2\u01df\u01db\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01d8\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\7/\2\2\u01e7Q\3\2\2\2\u01e8\u01e9\7\27\2\2\u01e9\u01ea"+
		"\5> \2\u01ea\u01ec\7D\2\2\u01eb\u01ed\5D#\2\u01ec\u01eb\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef\7%\2\2\u01ef\u01f1\5L\'"+
		"\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f5\3\2\2\2\u01f2\u01f3"+
		"\7\66\2\2\u01f3\u01f4\7D\2\2\u01f4\u01f6\5D#\2\u01f5\u01f2\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\64\2\2\u01f8S\3\2\2\2"+
		"\u01f9\u01fb\7\30\2\2\u01fa\u01fc\7D\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7.\2\2\u01fe\u0203\7D\2\2\u01ff"+
		"\u0200\7\66\2\2\u0200\u0202\7D\2\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u0207\7/\2\2\u0207\u0208\7\64\2\2\u0208U\3\2\2\2"+
		"\u0209\u020a\7\31\2\2\u020a\u020b\5> \2\u020b\u020c\7D\2\2\u020c\u020d"+
		"\7\64\2\2\u020dW\3\2\2\28dfpvz\u0088\u0095\u00a8\u00b1\u00cd\u00d0\u00d7"+
		"\u00de\u00e6\u00e8\u00f0\u010a\u010c\u0116\u011a\u0121\u012c\u0134\u0138"+
		"\u0142\u014e\u015a\u0160\u0166\u016c\u0172\u0176\u017c\u0180\u0188\u018e"+
		"\u0190\u0199\u019e\u01a2\u01a8\u01ac\u01b1\u01b5\u01b9\u01ca\u01d2\u01e1"+
		"\u01e4\u01ec\u01f0\u01f5\u01fb\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}