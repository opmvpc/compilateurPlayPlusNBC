// Generated from PlayPlus.g4 by ANTLR 4.6

    package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, VOID=2, IF=3, ELSE=4, THEN=5, REPEAT=6, WHILE=7, TRUE=8, FALSE=9, 
		IMPORT=10, LEFT=11, RIGHT=12, UP=13, DOWN=14, JUMP=15, FIGHT=16, DIG=17, 
		BOOL=18, INT=19, CHAR=20, STRUCT=21, CONST=22, ENUM=23, TYPEDEF=24, NATUREL=25, 
		FILE=26, STRING=27, CHARACTER=28, PLUS=29, MINUS=30, MUL=31, DIV=32, MOD=33, 
		POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, GREATER=40, 
		EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, 
		LBRACKET=47, RBRACKET=48, SINGLEQUOTE=49, BACKSLASH=50, SEMICOLON=51, 
		COLON=52, COMMA=53, DOT=54, AND=55, OR=56, DOLLAR=57, COMMENTAIRES=58, 
		BLOCK_COMMENT=59, LINE_COMMENT=60, NEWLINE=61, WS=62, MAPSTART=63, HASHTAG=64, 
		RETURN=65, MAP=66, ROBOT=67, TRESOR=68, PELOUSE=69, PALMIER=70, PONT=71, 
		BUISSON=72, TONNEAU=73, PUIT=74, VIDE=75, SQUELLETTE=76, ID=77, DOUBLEQUOTE=78;
	public static final int
		RULE_root = 0, RULE_mapfile = 1, RULE_mapsize = 2, RULE_monde = 3, RULE_program = 4, 
		RULE_implDecl = 5, RULE_impKeyWord = 6, RULE_fileDecl = 7, RULE_fileName = 8, 
		RULE_globalDecl = 9, RULE_localDecl = 10, RULE_mainProgram = 11, RULE_mainStart = 12, 
		RULE_mainEnd = 13, RULE_mainRet = 14, RULE_statements = 15, RULE_statement = 16, 
		RULE_returnInstr = 17, RULE_affectInstr = 18, RULE_funcDecl = 19, RULE_funcCall = 20, 
		RULE_constantExpr = 21, RULE_exprD = 22, RULE_exprEnt = 23, RULE_exprBool = 24, 
		RULE_exprG = 25, RULE_conditionalStmt = 26, RULE_repeatStmt = 27, RULE_whileStmt = 28, 
		RULE_actionType = 29, RULE_dig = 30, RULE_mytype = 31, RULE_scalar = 32, 
		RULE_structures = 33, RULE_arrays = 34, RULE_structDecl = 35, RULE_listStrucName = 36, 
		RULE_listVarName = 37, RULE_varDecl = 38, RULE_initVariable = 39, RULE_initArrays = 40, 
		RULE_initStruct = 41, RULE_constDecl = 42, RULE_enumDecl = 43, RULE_typedefDecl = 44;
	public static final String[] ruleNames = {
		"root", "mapfile", "mapsize", "monde", "program", "implDecl", "impKeyWord", 
		"fileDecl", "fileName", "globalDecl", "localDecl", "mainProgram", "mainStart", 
		"mainEnd", "mainRet", "statements", "statement", "returnInstr", "affectInstr", 
		"funcDecl", "funcCall", "constantExpr", "exprD", "exprEnt", "exprBool", 
		"exprG", "conditionalStmt", "repeatStmt", "whileStmt", "actionType", "dig", 
		"mytype", "scalar", "structures", "arrays", "structDecl", "listStrucName", 
		"listVarName", "varDecl", "initVariable", "initArrays", "initStruct", 
		"constDecl", "enumDecl", "typedefDecl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'void'", "'if'", "'else'", "'then'", "'repeat'", "'while'", 
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
		null, "MAIN", "VOID", "IF", "ELSE", "THEN", "REPEAT", "WHILE", "TRUE", 
		"FALSE", "IMPORT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"BOOL", "INT", "CHAR", "STRUCT", "CONST", "ENUM", "TYPEDEF", "NATUREL", 
		"FILE", "STRING", "CHARACTER", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
		"EQUAL", "AFFECT", "NOT", "NOTEQUAL", "SMALLER", "GREATER", "EGREATER", 
		"ESMALLER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SINGLEQUOTE", "BACKSLASH", "SEMICOLON", "COLON", "COMMA", "DOT", "AND", 
		"OR", "DOLLAR", "COMMENTAIRES", "BLOCK_COMMENT", "LINE_COMMENT", "NEWLINE", 
		"WS", "MAPSTART", "HASHTAG", "RETURN", "MAP", "ROBOT", "TRESOR", "PELOUSE", 
		"PALMIER", "PONT", "BUISSON", "TONNEAU", "PUIT", "VIDE", "SQUELLETTE", 
		"ID", "DOUBLEQUOTE"
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public MapfileContext mapfile() {
			return getRuleContext(MapfileContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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

	public static class MapfileContext extends ParserRuleContext {
		public TerminalNode MAPSTART() { return getToken(PlayPlusParser.MAPSTART, 0); }
		public MapsizeContext mapsize() {
			return getRuleContext(MapsizeContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapfileContext mapfile() throws RecognitionException {
		MapfileContext _localctx = new MapfileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(MAPSTART);
			setState(95);
			mapsize();
			setState(96);
			monde();
			setState(97);
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

	public static class MapsizeContext extends ParserRuleContext {
		public List<TerminalNode> NATUREL() { return getTokens(PlayPlusParser.NATUREL); }
		public TerminalNode NATUREL(int i) {
			return getToken(PlayPlusParser.NATUREL, i);
		}
		public MapsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapsize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapsizeContext mapsize() throws RecognitionException {
		MapsizeContext _localctx = new MapsizeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(NATUREL);
			setState(100);
			match(NATUREL);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMonde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMonde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMonde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MondeContext monde() throws RecognitionException {
		MondeContext _localctx = new MondeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_monde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ROBOT - 67)) | (1L << (TRESOR - 67)) | (1L << (PELOUSE - 67)) | (1L << (PALMIER - 67)) | (1L << (PONT - 67)) | (1L << (BUISSON - 67)) | (1L << (TONNEAU - 67)) | (1L << (PUIT - 67)) | (1L << (VIDE - 67)) | (1L << (SQUELLETTE - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ROBOT - 67)) | (1L << (TRESOR - 67)) | (1L << (PELOUSE - 67)) | (1L << (PALMIER - 67)) | (1L << (PONT - 67)) | (1L << (BUISSON - 67)) | (1L << (TONNEAU - 67)) | (1L << (PUIT - 67)) | (1L << (VIDE - 67)) | (1L << (SQUELLETTE - 67)))) != 0) );
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
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
		public GlobalDeclContext globalDecl() {
			return getRuleContext(GlobalDeclContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			implDecl();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(108);
				globalDecl();
				}
				break;
			}
			setState(111);
			mainProgram();
			setState(112);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterImplDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitImplDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitImplDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplDeclContext implDecl() throws RecognitionException {
		ImplDeclContext _localctx = new ImplDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_implDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			impKeyWord();
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(115);
				match(DOUBLEQUOTE);
				setState(116);
				fileDecl();
				setState(117);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(119);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterImpKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitImpKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitImpKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpKeyWordContext impKeyWord() throws RecognitionException {
		ImpKeyWordContext _localctx = new ImpKeyWordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impKeyWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(HASHTAG);
			setState(123);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			fileName();
			setState(126);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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

	public static class GlobalDeclContext extends ParserRuleContext {
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
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_globalDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(130);
						varDecl();
						}
						break;
					case 2:
						{
						setState(131);
						constDecl();
						}
						break;
					case 3:
						{
						setState(132);
						structDecl();
						}
						break;
					case 4:
						{
						setState(133);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(134);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(135);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class LocalDeclContext extends ParserRuleContext {
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
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLocalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLocalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(141);
						varDecl();
						}
						break;
					case 2:
						{
						setState(142);
						constDecl();
						}
						break;
					case 3:
						{
						setState(143);
						structDecl();
						}
						break;
					case 4:
						{
						setState(144);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(145);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(146);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class MainProgramContext extends ParserRuleContext {
		public MainStartContext mainStart() {
			return getRuleContext(MainStartContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainEndContext mainEnd() {
			return getRuleContext(MainEndContext.class,0);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			mainStart();
			setState(153);
			statements();
			setState(154);
			mainEnd();
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
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public MainStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStartContext mainStart() throws RecognitionException {
		MainStartContext _localctx = new MainStartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(VOID);
			setState(157);
			match(MAIN);
			setState(158);
			match(LPAREN);
			setState(159);
			match(RPAREN);
			setState(160);
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

	public static class MainEndContext extends ParserRuleContext {
		public MainRetContext mainRet() {
			return getRuleContext(MainRetContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainEndContext mainEnd() throws RecognitionException {
		MainEndContext _localctx = new MainEndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mainEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			mainRet();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				setState(163);
				statements();
				}
			}

			setState(166);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainRetContext mainRet() throws RecognitionException {
		MainRetContext _localctx = new MainRetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			returnInstr();
			setState(169);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				returnInstr();
				setState(177);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				affectInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				exprD();
				setState(181);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				constantExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(184);
				actionType();
				}
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				conditionalStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				repeatStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				whileStmt();
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

	public static class ReturnInstrContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PlayPlusParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public ReturnInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterReturnInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitReturnInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitReturnInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnInstrContext returnInstr() throws RecognitionException {
		ReturnInstrContext _localctx = new ReturnInstrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(RETURN);
			setState(193);
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

	public static class AffectInstrContext extends ParserRuleContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public AffectInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAffectInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAffectInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectInstrContext affectInstr() throws RecognitionException {
		AffectInstrContext _localctx = new AffectInstrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_affectInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			exprG(0);
			setState(196);
			match(AFFECT);
			setState(197);
			exprD();
			setState(198);
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

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public ReturnInstrContext returnInstr() {
			return getRuleContext(ReturnInstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<MytypeContext> mytype() {
			return getRuleContexts(MytypeContext.class);
		}
		public MytypeContext mytype(int i) {
			return getRuleContext(MytypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
			case STRUCT:
				{
				setState(200);
				mytype();
				}
				break;
			case VOID:
				{
				setState(201);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			match(ID);
			setState(205);
			match(LPAREN);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				setState(206);
				mytype();
				setState(207);
				exprG(0);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					mytype();
					setState(210);
					exprG(0);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219);
			match(RPAREN);
			setState(220);
			match(LBRACE);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(221);
				localDecl();
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(224);
				statements();
				}
				break;
			}
			setState(227);
			returnInstr();
			setState(228);
			match(SEMICOLON);
			setState(229);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(PlayPlusParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PlayPlusParser.RPAREN, i);
		}
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
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcCall);
		int _la;
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ID);
				setState(232);
				match(LPAREN);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(233);
					exprD();
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(234);
						match(COMMA);
						setState(235);
						exprD();
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(243);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(ID);
				setState(245);
				match(LPAREN);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(246);
					exprD();
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(247);
						match(COMMA);
						setState(248);
						exprD();
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(256);
				match(RPAREN);
				setState(257);
				match(RPAREN);
				notifyErrorListeners("Too many parentheses");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(ID);
				setState(260);
				match(LPAREN);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(261);
					exprD();
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(262);
							match(COMMA);
							setState(263);
							exprD();
							}
							} 
						}
						setState(268);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					break;
				}
				notifyErrorListeners("Missing closing ')'");
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExprContext constantExpr() throws RecognitionException {
		ConstantExprContext _localctx = new ConstantExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			constDecl();
			setState(275);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(PlayPlusParser.CHARACTER, 0); }
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprD);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				exprG(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				exprEnt(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(CHARACTER);
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
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(PlayPlusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEnt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(286);
				match(MINUS);
				setState(287);
				exprEnt(7);
				}
				break;
			case ID:
				{
				setState(288);
				exprG(0);
				}
				break;
			case NATUREL:
				{
				setState(289);
				match(NATUREL);
				}
				break;
			case LPAREN:
				{
				setState(290);
				match(LPAREN);
				setState(291);
				exprEnt(0);
				setState(292);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(297);
						match(MOD);
						setState(298);
						exprEnt(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(300);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						exprEnt(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(PlayPlusParser.GREATER, 0); }
		public TerminalNode EGREATER() { return getToken(PlayPlusParser.EGREATER, 0); }
		public TerminalNode ESMALLER() { return getToken(PlayPlusParser.ESMALLER, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(PlayPlusParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PlayPlusParser.STRING, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(PlayPlusParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(PlayPlusParser.CHARACTER, i);
		}
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_exprBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(311);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(312);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(313);
				exprG(0);
				}
				break;
			case 4:
				{
				setState(314);
				exprEnt(0);
				setState(315);
				match(SMALLER);
				setState(316);
				exprEnt(0);
				}
				break;
			case 5:
				{
				setState(318);
				exprEnt(0);
				setState(319);
				match(GREATER);
				setState(320);
				exprEnt(0);
				}
				break;
			case 6:
				{
				setState(322);
				exprEnt(0);
				setState(323);
				match(EGREATER);
				setState(324);
				exprEnt(0);
				}
				break;
			case 7:
				{
				setState(326);
				exprEnt(0);
				setState(327);
				match(ESMALLER);
				setState(328);
				exprEnt(0);
				}
				break;
			case 8:
				{
				setState(330);
				exprEnt(0);
				setState(331);
				match(EQUAL);
				setState(332);
				exprEnt(0);
				}
				break;
			case 9:
				{
				setState(334);
				match(STRING);
				setState(335);
				match(EQUAL);
				setState(336);
				match(STRING);
				}
				break;
			case 10:
				{
				setState(337);
				match(CHARACTER);
				setState(338);
				match(EQUAL);
				setState(339);
				match(CHARACTER);
				}
				break;
			case 11:
				{
				setState(340);
				match(NOT);
				setState(341);
				exprBool(2);
				}
				break;
			case 12:
				{
				setState(342);
				match(LPAREN);
				setState(343);
				exprBool(0);
				setState(344);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(354);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(348);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(349);
						match(AND);
						setState(350);
						exprBool(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(351);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(352);
						match(OR);
						setState(353);
						exprBool(4);
						}
						break;
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprG(this);
			else return visitor.visitChildren(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(360);
				funcCall();
				}
				break;
			case 2:
				{
				setState(361);
				match(ID);
				}
				break;
			case 3:
				{
				setState(362);
				match(ID);
				setState(363);
				match(LBRACKET);
				setState(364);
				exprD();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(365);
					match(COMMA);
					setState(366);
					exprD();
					}
				}

				setState(369);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					matchWildcard();
					setState(375);
					match(ID);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConditionalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConditionalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConditionalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStmtContext conditionalStmt() throws RecognitionException {
		ConditionalStmtContext _localctx = new ConditionalStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IF);
			setState(382);
			match(LPAREN);
			setState(383);
			exprBool(0);
			setState(384);
			match(RPAREN);
			setState(385);
			match(LBRACE);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(386);
				statement();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(RBRACE);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(393);
				match(ELSE);
				setState(394);
				match(LBRACE);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
					{
					{
					setState(395);
					statement();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
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
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRepeatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRepeatStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRepeatStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(REPEAT);
			setState(405);
			match(LPAREN);
			setState(406);
			exprEnt(0);
			setState(407);
			match(RPAREN);
			setState(408);
			match(LBRACE);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(409);
				statement();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(WHILE);
			setState(418);
			match(LPAREN);
			setState(419);
			exprBool(0);
			setState(420);
			match(RPAREN);
			setState(421);
			match(LBRACE);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(422);
				statement();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
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
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
		}
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_actionType);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(LEFT);
				setState(431);
				match(LPAREN);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(432);
					exprD();
					}
				}

				setState(435);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(RIGHT);
				setState(437);
				match(LPAREN);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(438);
					exprD();
					}
				}

				setState(441);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(UP);
				setState(443);
				match(LPAREN);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(444);
					exprD();
					}
				}

				setState(447);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(DOWN);
				setState(449);
				match(LPAREN);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(450);
					exprD();
					}
				}

				setState(453);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(FIGHT);
				setState(455);
				match(LPAREN);
				setState(456);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(JUMP);
				setState(458);
				match(LPAREN);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(459);
					exprEnt(0);
					}
				}

				setState(462);
				match(RPAREN);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				dig();
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

	public static class DigContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public DigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitDig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigContext dig() throws RecognitionException {
		DigContext _localctx = new DigContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(DIG);
			setState(467);
			match(LPAREN);
			setState(468);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MytypeContext mytype() throws RecognitionException {
		MytypeContext _localctx = new MytypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mytype);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(STRUCT);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(477);
				match(ID);
				}
			}

			setState(480);
			match(LBRACE);
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(481);
				listStrucName();
				}
				break;
			}
			setState(484);
			match(RBRACE);
			setState(485);
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
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraysContext arrays() throws RecognitionException {
		ArraysContext _localctx = new ArraysContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(LBRACKET);
			setState(489); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(488);
				match(NATUREL);
				}
				}
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATUREL );
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493);
				match(COMMA);
				{
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(494);
					match(NATUREL);
					}
					}
					setState(497); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATUREL );
				}
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterListStrucName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitListStrucName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitListStrucName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStrucNameContext listStrucName() throws RecognitionException {
		ListStrucNameContext _localctx = new ListStrucNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listStrucName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(508);
				mytype();
				setState(509);
				match(ID);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(510);
					arrays();
					}
				}

				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					match(ID);
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(515);
						arrays();
						}
					}

					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(523);
				match(SEMICOLON);
				}
				}
				setState(529);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterListVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitListVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitListVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVarNameContext listVarName() throws RecognitionException {
		ListVarNameContext _localctx = new ListVarNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listVarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(530);
				mytype();
				setState(531);
				match(ID);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(532);
					arrays();
					}
				}

				{
				setState(535);
				match(COMMA);
				setState(536);
				match(ID);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(537);
					arrays();
					}
				}

				}
				}
				}
				setState(544);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			mytype();
			setState(546);
			match(ID);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(547);
				arrays();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(550);
				match(AFFECT);
				setState(551);
				initVariable();
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				match(ID);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(556);
					arrays();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFFECT) {
					{
					setState(559);
					match(AFFECT);
					setState(560);
					initVariable();
					}
				}

				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
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
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(PlayPlusParser.CHARACTER, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initVariable);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				exprEnt(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				exprBool(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(576);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(577);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(578);
				match(LPAREN);
				setState(579);
				initVariable();
				setState(580);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitArraysContext initArrays() throws RecognitionException {
		InitArraysContext _localctx = new InitArraysContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(LBRACE);
			{
			setState(585);
			initVariable();
			}
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(586);
					match(COMMA);
					setState(587);
					initVariable();
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(593);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStructContext initStruct() throws RecognitionException {
		InitStructContext _localctx = new InitStructContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(CONST);
			setState(598);
			mytype();
			setState(599);
			match(ID);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(600);
				arrays();
				}
			}

			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(603);
				match(AFFECT);
				setState(604);
				initVariable();
				}
				}
			}

			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(607);
				match(COMMA);
				setState(608);
				match(ID);
				{
				setState(609);
				arrays();
				}
				}
			}

			setState(612);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(ENUM);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(615);
				match(ID);
				}
			}

			setState(618);
			match(LBRACE);
			setState(619);
			match(ID);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(620);
					match(COMMA);
					setState(621);
					match(ID);
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(627);
			match(RBRACE);
			setState(628);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterTypedefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitTypedefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitTypedefDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclContext typedefDecl() throws RecognitionException {
		TypedefDeclContext _localctx = new TypedefDeclContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(TYPEDEF);
			setState(631);
			mytype();
			setState(632);
			match(ID);
			setState(633);
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
		case 23:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 24:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 25:
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
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprG_sempred(ExprGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u027e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\5\2_\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\6\5j\n\5\r\5\16\5k\3\6\3\6\5\6p\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7{\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\5\17\u00a7\n\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21\u00af"+
		"\n\21\r\21\16\21\u00b0\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\5\25\u00cd\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00d7\n\25\f\25\16\25\u00da\13\25\5\25\u00dc\n\25\3\25\3\25"+
		"\3\25\5\25\u00e1\n\25\3\25\5\25\u00e4\n\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u00ef\n\26\f\26\16\26\u00f2\13\26\5\26\u00f4\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00fc\n\26\f\26\16\26\u00ff\13"+
		"\26\5\26\u0101\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u010b"+
		"\n\26\f\26\16\26\u010e\13\26\5\26\u0110\n\26\3\26\5\26\u0113\n\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011e\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0129\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0134\n\31\f\31\16\31\u0137\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015d\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0165\n\32\f\32\16\32\u0168\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0172\n\33\3\33\3\33\5\33\u0176\n\33\3\33\3\33\3"+
		"\33\7\33\u017b\n\33\f\33\16\33\u017e\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\7\34\u0186\n\34\f\34\16\34\u0189\13\34\3\34\3\34\3\34\3\34\7\34\u018f"+
		"\n\34\f\34\16\34\u0192\13\34\3\34\5\34\u0195\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u019d\n\35\f\35\16\35\u01a0\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01aa\n\36\f\36\16\36\u01ad\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u01b4\n\37\3\37\3\37\3\37\3\37\5\37\u01ba\n\37\3"+
		"\37\3\37\3\37\3\37\5\37\u01c0\n\37\3\37\3\37\3\37\3\37\5\37\u01c6\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01cf\n\37\3\37\3\37\5\37\u01d3"+
		"\n\37\3 \3 \3 \3 \3!\3!\5!\u01db\n!\3\"\3\"\3#\3#\5#\u01e1\n#\3#\3#\5"+
		"#\u01e5\n#\3#\3#\3#\3$\3$\6$\u01ec\n$\r$\16$\u01ed\3$\3$\6$\u01f2\n$\r"+
		"$\16$\u01f3\7$\u01f6\n$\f$\16$\u01f9\13$\3$\3$\3%\3%\3&\3&\3&\5&\u0202"+
		"\n&\3&\3&\3&\5&\u0207\n&\7&\u0209\n&\f&\16&\u020c\13&\3&\3&\7&\u0210\n"+
		"&\f&\16&\u0213\13&\3\'\3\'\3\'\5\'\u0218\n\'\3\'\3\'\3\'\5\'\u021d\n\'"+
		"\7\'\u021f\n\'\f\'\16\'\u0222\13\'\3(\3(\3(\5(\u0227\n(\3(\3(\5(\u022b"+
		"\n(\3(\3(\3(\5(\u0230\n(\3(\3(\5(\u0234\n(\7(\u0236\n(\f(\16(\u0239\13"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0249\n)\3*\3*\3*\3*\7"+
		"*\u024f\n*\f*\16*\u0252\13*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u025c\n,\3,\3,"+
		"\5,\u0260\n,\3,\3,\3,\5,\u0265\n,\3,\3,\3-\3-\5-\u026b\n-\3-\3-\3-\3-"+
		"\7-\u0271\n-\f-\16-\u0274\13-\3-\3-\3-\3.\3.\3.\3.\3.\3.\4\u0250\u0272"+
		"\5\60\62\64/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\2\7\3\2EN\4\2\4\4OO\3\2!\"\3\2\37 \3\2\24\26\u02c2"+
		"\2^\3\2\2\2\4`\3\2\2\2\6e\3\2\2\2\bi\3\2\2\2\nm\3\2\2\2\ft\3\2\2\2\16"+
		"|\3\2\2\2\20\177\3\2\2\2\22\u0082\3\2\2\2\24\u008c\3\2\2\2\26\u0097\3"+
		"\2\2\2\30\u009a\3\2\2\2\32\u009e\3\2\2\2\34\u00a4\3\2\2\2\36\u00aa\3\2"+
		"\2\2 \u00ae\3\2\2\2\"\u00c0\3\2\2\2$\u00c2\3\2\2\2&\u00c5\3\2\2\2(\u00cc"+
		"\3\2\2\2*\u0112\3\2\2\2,\u0114\3\2\2\2.\u011d\3\2\2\2\60\u0128\3\2\2\2"+
		"\62\u015c\3\2\2\2\64\u0175\3\2\2\2\66\u017f\3\2\2\28\u0196\3\2\2\2:\u01a3"+
		"\3\2\2\2<\u01d2\3\2\2\2>\u01d4\3\2\2\2@\u01da\3\2\2\2B\u01dc\3\2\2\2D"+
		"\u01de\3\2\2\2F\u01e9\3\2\2\2H\u01fc\3\2\2\2J\u0211\3\2\2\2L\u0220\3\2"+
		"\2\2N\u0223\3\2\2\2P\u0248\3\2\2\2R\u024a\3\2\2\2T\u0255\3\2\2\2V\u0257"+
		"\3\2\2\2X\u0268\3\2\2\2Z\u0278\3\2\2\2\\_\5\n\6\2]_\5\4\3\2^\\\3\2\2\2"+
		"^]\3\2\2\2_\3\3\2\2\2`a\7A\2\2ab\5\6\4\2bc\5\b\5\2cd\7\2\2\3d\5\3\2\2"+
		"\2ef\7\33\2\2fg\7\33\2\2g\7\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\t\3\2\2\2mo\5\f\7\2np\5\24\13\2on\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\5\30\r\2rs\7\2\2\3s\13\3\2\2\2tz\5\16\b\2uv\7P\2\2vw\5\20"+
		"\t\2wx\7P\2\2x{\3\2\2\2y{\7\34\2\2zu\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|}\7"+
		"B\2\2}~\7\f\2\2~\17\3\2\2\2\177\u0080\5\22\n\2\u0080\u0081\7D\2\2\u0081"+
		"\21\3\2\2\2\u0082\u0083\7O\2\2\u0083\23\3\2\2\2\u0084\u008b\5N(\2\u0085"+
		"\u008b\5V,\2\u0086\u008b\5H%\2\u0087\u008b\5X-\2\u0088\u008b\5Z.\2\u0089"+
		"\u008b\5(\25\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0096\5N(\2\u0090\u0096\5V,\2\u0091\u0096"+
		"\5H%\2\u0092\u0096\5X-\2\u0093\u0096\5Z.\2\u0094\u0096\5(\25\2\u0095\u008f"+
		"\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\5\32\16\2\u009b\u009c\5 \21\2\u009c\u009d\5\34\17\2\u009d\31\3\2\2\2"+
		"\u009e\u009f\7\4\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2"+
		"\7.\2\2\u00a2\u00a3\7/\2\2\u00a3\33\3\2\2\2\u00a4\u00a6\5\36\20\2\u00a5"+
		"\u00a7\5 \21\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\7\60\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\5$\23\2\u00ab\u00ac"+
		"\7\65\2\2\u00ac\37\3\2\2\2\u00ad\u00af\5\"\22\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2"+
		"\u00b2\u00b3\5$\23\2\u00b3\u00b4\7\65\2\2\u00b4\u00c1\3\2\2\2\u00b5\u00c1"+
		"\5&\24\2\u00b6\u00b7\5.\30\2\u00b7\u00b8\7\65\2\2\u00b8\u00c1\3\2\2\2"+
		"\u00b9\u00c1\5,\27\2\u00ba\u00bb\5<\37\2\u00bb\u00bc\7\65\2\2\u00bc\u00c1"+
		"\3\2\2\2\u00bd\u00c1\5\66\34\2\u00be\u00c1\58\35\2\u00bf\u00c1\5:\36\2"+
		"\u00c0\u00b2\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00b9"+
		"\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\t\3\2\2\u00c4"+
		"%\3\2\2\2\u00c5\u00c6\5\64\33\2\u00c6\u00c7\7&\2\2\u00c7\u00c8\5.\30\2"+
		"\u00c8\u00c9\7\65\2\2\u00c9\'\3\2\2\2\u00ca\u00cd\5@!\2\u00cb\u00cd\7"+
		"\4\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\7O\2\2\u00cf\u00db\7-\2\2\u00d0\u00d1\5@!\2\u00d1\u00d8\5\64\33"+
		"\2\u00d2\u00d3\7\67\2\2\u00d3\u00d4\5@!\2\u00d4\u00d5\5\64\33\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00d0\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7."+
		"\2\2\u00de\u00e0\7/\2\2\u00df\u00e1\5\26\f\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5$\23\2\u00e6"+
		"\u00e7\7\65\2\2\u00e7\u00e8\7\60\2\2\u00e8)\3\2\2\2\u00e9\u00ea\7O\2\2"+
		"\u00ea\u00f3\7-\2\2\u00eb\u00f0\5.\30\2\u00ec\u00ed\7\67\2\2\u00ed\u00ef"+
		"\5.\30\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00eb\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0113\7.\2\2\u00f6"+
		"\u00f7\7O\2\2\u00f7\u0100\7-\2\2\u00f8\u00fd\5.\30\2\u00f9\u00fa\7\67"+
		"\2\2\u00fa\u00fc\5.\30\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7.\2\2\u0103\u0104\7.\2\2\u0104\u0113\b\26\1\2\u0105\u0106\7O\2"+
		"\2\u0106\u010f\7-\2\2\u0107\u010c\5.\30\2\u0108\u0109\7\67\2\2\u0109\u010b"+
		"\5.\30\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0107\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\b\26\1\2\u0112"+
		"\u00e9\3\2\2\2\u0112\u00f6\3\2\2\2\u0112\u0105\3\2\2\2\u0113+\3\2\2\2"+
		"\u0114\u0115\5V,\2\u0115\u0116\7\65\2\2\u0116-\3\2\2\2\u0117\u011e\5*"+
		"\26\2\u0118\u011e\5\64\33\2\u0119\u011e\5\60\31\2\u011a\u011e\5\62\32"+
		"\2\u011b\u011e\7\35\2\2\u011c\u011e\7\36\2\2\u011d\u0117\3\2\2\2\u011d"+
		"\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e/\3\2\2\2\u011f\u0120\b\31\1\2\u0120\u0121"+
		"\7 \2\2\u0121\u0129\5\60\31\t\u0122\u0129\5\64\33\2\u0123\u0129\7\33\2"+
		"\2\u0124\u0125\7-\2\2\u0125\u0126\5\60\31\2\u0126\u0127\7.\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0129\u0135\3\2\2\2\u012a\u012b\f\6\2\2\u012b\u012c\7#"+
		"\2\2\u012c\u0134\5\60\31\7\u012d\u012e\f\5\2\2\u012e\u012f\t\4\2\2\u012f"+
		"\u0134\5\60\31\6\u0130\u0131\f\4\2\2\u0131\u0132\t\5\2\2\u0132\u0134\5"+
		"\60\31\5\u0133\u012a\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0130\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\61\3\2\2"+
		"\2\u0137\u0135\3\2\2\2\u0138\u0139\b\32\1\2\u0139\u015d\7\n\2\2\u013a"+
		"\u015d\7\13\2\2\u013b\u015d\5\64\33\2\u013c\u013d\5\60\31\2\u013d\u013e"+
		"\7)\2\2\u013e\u013f\5\60\31\2\u013f\u015d\3\2\2\2\u0140\u0141\5\60\31"+
		"\2\u0141\u0142\7*\2\2\u0142\u0143\5\60\31\2\u0143\u015d\3\2\2\2\u0144"+
		"\u0145\5\60\31\2\u0145\u0146\7+\2\2\u0146\u0147\5\60\31\2\u0147\u015d"+
		"\3\2\2\2\u0148\u0149\5\60\31\2\u0149\u014a\7,\2\2\u014a\u014b\5\60\31"+
		"\2\u014b\u015d\3\2\2\2\u014c\u014d\5\60\31\2\u014d\u014e\7%\2\2\u014e"+
		"\u014f\5\60\31\2\u014f\u015d\3\2\2\2\u0150\u0151\7\35\2\2\u0151\u0152"+
		"\7%\2\2\u0152\u015d\7\35\2\2\u0153\u0154\7\36\2\2\u0154\u0155\7%\2\2\u0155"+
		"\u015d\7\36\2\2\u0156\u0157\7\'\2\2\u0157\u015d\5\62\32\4\u0158\u0159"+
		"\7-\2\2\u0159\u015a\5\62\32\2\u015a\u015b\7.\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0138\3\2\2\2\u015c\u013a\3\2\2\2\u015c\u013b\3\2\2\2\u015c\u013c\3\2"+
		"\2\2\u015c\u0140\3\2\2\2\u015c\u0144\3\2\2\2\u015c\u0148\3\2\2\2\u015c"+
		"\u014c\3\2\2\2\u015c\u0150\3\2\2\2\u015c\u0153\3\2\2\2\u015c\u0156\3\2"+
		"\2\2\u015c\u0158\3\2\2\2\u015d\u0166\3\2\2\2\u015e\u015f\f\6\2\2\u015f"+
		"\u0160\79\2\2\u0160\u0165\5\62\32\7\u0161\u0162\f\5\2\2\u0162\u0163\7"+
		":\2\2\u0163\u0165\5\62\32\6\u0164\u015e\3\2\2\2\u0164\u0161\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\63\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0169\u016a\b\33\1\2\u016a\u0176\5*\26\2\u016b"+
		"\u0176\7O\2\2\u016c\u016d\7O\2\2\u016d\u016e\7\61\2\2\u016e\u0171\5.\30"+
		"\2\u016f\u0170\7\67\2\2\u0170\u0172\5.\30\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\62\2\2\u0174\u0176\3"+
		"\2\2\2\u0175\u0169\3\2\2\2\u0175\u016b\3\2\2\2\u0175\u016c\3\2\2\2\u0176"+
		"\u017c\3\2\2\2\u0177\u0178\f\3\2\2\u0178\u0179\13\2\2\2\u0179\u017b\7"+
		"O\2\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\65\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\5\2"+
		"\2\u0180\u0181\7-\2\2\u0181\u0182\5\62\32\2\u0182\u0183\7.\2\2\u0183\u0187"+
		"\7/\2\2\u0184\u0186\5\"\22\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a\u0194\7\60\2\2\u018b\u018c\7\6\2\2\u018c\u0190\7/\2\2\u018d"+
		"\u018f\5\"\22\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0195\7\60\2\2\u0194\u018b\3\2\2\2\u0194\u0195\3\2\2\2\u0195\67\3\2\2"+
		"\2\u0196\u0197\7\b\2\2\u0197\u0198\7-\2\2\u0198\u0199\5\60\31\2\u0199"+
		"\u019a\7.\2\2\u019a\u019e\7/\2\2\u019b\u019d\5\"\22\2\u019c\u019b\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7\60\2\2\u01a29\3\2\2\2"+
		"\u01a3\u01a4\7\t\2\2\u01a4\u01a5\7-\2\2\u01a5\u01a6\5\62\32\2\u01a6\u01a7"+
		"\7.\2\2\u01a7\u01ab\7/\2\2\u01a8\u01aa\5\"\22\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\60\2\2\u01af;\3\2\2\2\u01b0\u01b1"+
		"\7\r\2\2\u01b1\u01b3\7-\2\2\u01b2\u01b4\5.\30\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01d3\7.\2\2\u01b6\u01b7\7\16"+
		"\2\2\u01b7\u01b9\7-\2\2\u01b8\u01ba\5.\30\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01d3\7.\2\2\u01bc\u01bd\7\17"+
		"\2\2\u01bd\u01bf\7-\2\2\u01be\u01c0\5.\30\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01d3\7.\2\2\u01c2\u01c3\7\20"+
		"\2\2\u01c3\u01c5\7-\2\2\u01c4\u01c6\5.\30\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01d3\7.\2\2\u01c8\u01c9\7\22"+
		"\2\2\u01c9\u01ca\7-\2\2\u01ca\u01d3\7.\2\2\u01cb\u01cc\7\21\2\2\u01cc"+
		"\u01ce\7-\2\2\u01cd\u01cf\5\60\31\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\7.\2\2\u01d1\u01d3\5> \2\u01d2"+
		"\u01b0\3\2\2\2\u01d2\u01b6\3\2\2\2\u01d2\u01bc\3\2\2\2\u01d2\u01c2\3\2"+
		"\2\2\u01d2\u01c8\3\2\2\2\u01d2\u01cb\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"=\3\2\2\2\u01d4\u01d5\7\23\2\2\u01d5\u01d6\7-\2\2\u01d6\u01d7\7.\2\2\u01d7"+
		"?\3\2\2\2\u01d8\u01db\5B\"\2\u01d9\u01db\5D#\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01dbA\3\2\2\2\u01dc\u01dd\t\6\2\2\u01ddC\3\2\2\2\u01de"+
		"\u01e0\7\27\2\2\u01df\u01e1\7O\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\7/\2\2\u01e3\u01e5\5J&\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\60\2\2"+
		"\u01e7\u01e8\7\65\2\2\u01e8E\3\2\2\2\u01e9\u01eb\7\61\2\2\u01ea\u01ec"+
		"\7\33\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2"+
		"\u01ed\u01ee\3\2\2\2\u01ee\u01f7\3\2\2\2\u01ef\u01f1\7\67\2\2\u01f0\u01f2"+
		"\7\33\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2"+
		"\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7\62\2\2\u01fbG\3\2\2\2\u01fc\u01fd\5D#\2\u01fd"+
		"I\3\2\2\2\u01fe\u01ff\5@!\2\u01ff\u0201\7O\2\2\u0200\u0202\5F$\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020a\3\2\2\2\u0203\u0204\7\67"+
		"\2\2\u0204\u0206\7O\2\2\u0205\u0207\5F$\2\u0206\u0205\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0203\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7\65\2\2\u020e\u0210\3\2\2\2\u020f\u01fe\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212K\3\2\2\2"+
		"\u0213\u0211\3\2\2\2\u0214\u0215\5@!\2\u0215\u0217\7O\2\2\u0216\u0218"+
		"\5F$\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\7\67\2\2\u021a\u021c\7O\2\2\u021b\u021d\5F$\2\u021c\u021b\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0214\3\2\2\2\u021f\u0222"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221M\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0224\5@!\2\u0224\u0226\7O\2\2\u0225\u0227\5F$\2"+
		"\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0229"+
		"\7&\2\2\u0229\u022b\5P)\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u0237\3\2\2\2\u022c\u022d\7\67\2\2\u022d\u022f\7O\2\2\u022e\u0230\5F"+
		"$\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u0232\7&\2\2\u0232\u0234\5P)\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2"+
		"\2\u0234\u0236\3\2\2\2\u0235\u022c\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023b\7\65\2\2\u023bO\3\2\2\2\u023c\u0249\7\n\2\2\u023d\u0249\7\13\2"+
		"\2\u023e\u0249\7\35\2\2\u023f\u0249\7\36\2\2\u0240\u0249\5\60\31\2\u0241"+
		"\u0249\5\62\32\2\u0242\u0249\5R*\2\u0243\u0249\5T+\2\u0244\u0245\7-\2"+
		"\2\u0245\u0246\5P)\2\u0246\u0247\7.\2\2\u0247\u0249\3\2\2\2\u0248\u023c"+
		"\3\2\2\2\u0248\u023d\3\2\2\2\u0248\u023e\3\2\2\2\u0248\u023f\3\2\2\2\u0248"+
		"\u0240\3\2\2\2\u0248\u0241\3\2\2\2\u0248\u0242\3\2\2\2\u0248\u0243\3\2"+
		"\2\2\u0248\u0244\3\2\2\2\u0249Q\3\2\2\2\u024a\u024b\7/\2\2\u024b\u0250"+
		"\5P)\2\u024c\u024d\7\67\2\2\u024d\u024f\5P)\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0252\3\2\2\2\u0250\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0253\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7\60\2\2\u0254S\3\2\2\2\u0255\u0256"+
		"\5H%\2\u0256U\3\2\2\2\u0257\u0258\7\30\2\2\u0258\u0259\5@!\2\u0259\u025b"+
		"\7O\2\2\u025a\u025c\5F$\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025e\7&\2\2\u025e\u0260\5P)\2\u025f\u025d\3\2\2"+
		"\2\u025f\u0260\3\2\2\2\u0260\u0264\3\2\2\2\u0261\u0262\7\67\2\2\u0262"+
		"\u0263\7O\2\2\u0263\u0265\5F$\2\u0264\u0261\3\2\2\2\u0264\u0265\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0267\7\65\2\2\u0267W\3\2\2\2\u0268\u026a"+
		"\7\31\2\2\u0269\u026b\7O\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\7/\2\2\u026d\u0272\7O\2\2\u026e\u026f\7\67"+
		"\2\2\u026f\u0271\7O\2\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0276\7\60\2\2\u0276\u0277\7\65\2\2\u0277Y\3\2\2\2\u0278\u0279"+
		"\7\32\2\2\u0279\u027a\5@!\2\u027a\u027b\7O\2\2\u027b\u027c\7\65\2\2\u027c"+
		"[\3\2\2\2G^koz\u008a\u008c\u0095\u0097\u00a6\u00b0\u00c0\u00cc\u00d8\u00db"+
		"\u00e0\u00e3\u00f0\u00f3\u00fd\u0100\u010c\u010f\u0112\u011d\u0128\u0133"+
		"\u0135\u015c\u0164\u0166\u0171\u0175\u017c\u0187\u0190\u0194\u019e\u01ab"+
		"\u01b3\u01b9\u01bf\u01c5\u01ce\u01d2\u01da\u01e0\u01e4\u01ed\u01f3\u01f7"+
		"\u0201\u0206\u020a\u0211\u0217\u021c\u0220\u0226\u022a\u022f\u0233\u0237"+
		"\u0248\u0250\u025b\u025f\u0264\u026a\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}