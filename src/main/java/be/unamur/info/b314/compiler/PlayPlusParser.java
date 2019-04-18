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
		RULE_returnInstr = 17, RULE_affectInstr = 18, RULE_funcDecl = 19, RULE_funcArgs = 20, 
		RULE_funcArg = 21, RULE_funcCall = 22, RULE_constantExpr = 23, RULE_exprD = 24, 
		RULE_exprEnt = 25, RULE_exprBool = 26, RULE_exprG = 27, RULE_conditionalStmt = 28, 
		RULE_repeatStmt = 29, RULE_whileStmt = 30, RULE_actionType = 31, RULE_dig = 32, 
		RULE_mytype = 33, RULE_scalar = 34, RULE_structures = 35, RULE_arrays = 36, 
		RULE_structDecl = 37, RULE_listStructFields = 38, RULE_structField = 39, 
		RULE_fieldDecl = 40, RULE_varDecl = 41, RULE_initVariable = 42, RULE_initArrays = 43, 
		RULE_initStruct = 44, RULE_constDecl = 45, RULE_enumDecl = 46, RULE_typedefDecl = 47;
	public static final String[] ruleNames = {
		"root", "mapfile", "mapsize", "monde", "program", "implDecl", "impKeyWord", 
		"fileDecl", "fileName", "globalDecl", "localDecl", "mainProgram", "mainStart", 
		"mainEnd", "mainRet", "statements", "statement", "returnInstr", "affectInstr", 
		"funcDecl", "funcArgs", "funcArg", "funcCall", "constantExpr", "exprD", 
		"exprEnt", "exprBool", "exprG", "conditionalStmt", "repeatStmt", "whileStmt", 
		"actionType", "dig", "mytype", "scalar", "structures", "arrays", "structDecl", 
		"listStructFields", "structField", "fieldDecl", "varDecl", "initVariable", 
		"initArrays", "initStruct", "constDecl", "enumDecl", "typedefDecl"
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
			setState(100);
			match(MAPSTART);
			setState(101);
			mapsize();
			setState(102);
			monde();
			setState(103);
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
			setState(105);
			match(NATUREL);
			setState(106);
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
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
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
				setState(111); 
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
			setState(113);
			implDecl();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(114);
				globalDecl();
				}
				break;
			}
			setState(117);
			mainProgram();
			setState(118);
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
			setState(120);
			impKeyWord();
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(121);
				match(DOUBLEQUOTE);
				setState(122);
				fileDecl();
				setState(123);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(125);
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
			setState(128);
			match(HASHTAG);
			setState(129);
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
			setState(131);
			fileName();
			setState(132);
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
			setState(134);
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
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(136);
						varDecl();
						}
						break;
					case 2:
						{
						setState(137);
						constDecl();
						}
						break;
					case 3:
						{
						setState(138);
						structDecl();
						}
						break;
					case 4:
						{
						setState(139);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(140);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(141);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(146);
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
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(147);
						varDecl();
						}
						break;
					case 2:
						{
						setState(148);
						constDecl();
						}
						break;
					case 3:
						{
						setState(149);
						structDecl();
						}
						break;
					case 4:
						{
						setState(150);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(151);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(152);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(157);
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
			setState(158);
			mainStart();
			setState(159);
			statements();
			setState(160);
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
			setState(162);
			match(VOID);
			setState(163);
			match(MAIN);
			setState(164);
			match(LPAREN);
			setState(165);
			match(RPAREN);
			setState(166);
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
			setState(168);
			mainRet();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				setState(169);
				statements();
				}
			}

			setState(172);
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
			setState(174);
			returnInstr();
			setState(175);
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
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(177);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				returnInstr();
				setState(183);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				affectInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				exprD();
				setState(187);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				constantExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(190);
				actionType();
				}
				setState(191);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				conditionalStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				repeatStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
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
			setState(198);
			match(RETURN);
			setState(199);
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
			setState(201);
			exprG(0);
			setState(202);
			match(AFFECT);
			setState(203);
			exprD();
			setState(204);
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
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public ReturnInstrContext returnInstr() {
			return getRuleContext(ReturnInstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
			case STRUCT:
				{
				setState(206);
				mytype();
				}
				break;
			case VOID:
				{
				setState(207);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			match(ID);
			setState(211);
			match(LPAREN);
			setState(212);
			funcArgs();
			setState(213);
			match(RPAREN);
			setState(214);
			match(LBRACE);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				localDecl();
				}
				break;
			}
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(218);
				statements();
				}
				break;
			}
			setState(221);
			returnInstr();
			setState(222);
			match(SEMICOLON);
			setState(223);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			funcArg();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				funcArg();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FuncArgContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			mytype();
			setState(234);
			exprG(0);
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
		enterRule(_localctx, 44, RULE_funcCall);
		int _la;
		try {
			int _alt;
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ID);
				setState(237);
				match(LPAREN);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(238);
					exprD();
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(239);
						match(COMMA);
						setState(240);
						exprD();
						}
						}
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(248);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(ID);
				setState(250);
				match(LPAREN);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(251);
					exprD();
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(252);
						match(COMMA);
						setState(253);
						exprD();
						}
						}
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(261);
				match(RPAREN);
				setState(262);
				match(RPAREN);
				notifyErrorListeners("Too many parentheses");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(ID);
				setState(265);
				match(LPAREN);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(266);
					exprD();
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(267);
							match(COMMA);
							setState(268);
							exprD();
							}
							} 
						}
						setState(273);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 46, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			constDecl();
			setState(280);
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
		enterRule(_localctx, 48, RULE_exprD);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				exprG(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				exprEnt(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(291);
				match(MINUS);
				setState(292);
				exprEnt(7);
				}
				break;
			case ID:
				{
				setState(293);
				exprG(0);
				}
				break;
			case NATUREL:
				{
				setState(294);
				match(NATUREL);
				}
				break;
			case LPAREN:
				{
				setState(295);
				match(LPAREN);
				setState(296);
				exprEnt(0);
				setState(297);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(301);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(302);
						match(MOD);
						setState(303);
						exprEnt(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(304);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(305);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(306);
						exprEnt(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(307);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(308);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_exprBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(316);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(317);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(318);
				exprG(0);
				}
				break;
			case 4:
				{
				setState(319);
				exprEnt(0);
				setState(320);
				match(SMALLER);
				setState(321);
				exprEnt(0);
				}
				break;
			case 5:
				{
				setState(323);
				exprEnt(0);
				setState(324);
				match(GREATER);
				setState(325);
				exprEnt(0);
				}
				break;
			case 6:
				{
				setState(327);
				exprEnt(0);
				setState(328);
				match(EGREATER);
				setState(329);
				exprEnt(0);
				}
				break;
			case 7:
				{
				setState(331);
				exprEnt(0);
				setState(332);
				match(ESMALLER);
				setState(333);
				exprEnt(0);
				}
				break;
			case 8:
				{
				setState(335);
				exprEnt(0);
				setState(336);
				match(EQUAL);
				setState(337);
				exprEnt(0);
				}
				break;
			case 9:
				{
				setState(339);
				match(STRING);
				setState(340);
				match(EQUAL);
				setState(341);
				match(STRING);
				}
				break;
			case 10:
				{
				setState(342);
				match(CHARACTER);
				setState(343);
				match(EQUAL);
				setState(344);
				match(CHARACTER);
				}
				break;
			case 11:
				{
				setState(345);
				match(NOT);
				setState(346);
				exprBool(2);
				}
				break;
			case 12:
				{
				setState(347);
				match(LPAREN);
				setState(348);
				exprBool(0);
				setState(349);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(353);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(354);
						match(AND);
						setState(355);
						exprBool(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(356);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(357);
						match(OR);
						setState(358);
						exprBool(4);
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(365);
				funcCall();
				}
				break;
			case 2:
				{
				setState(366);
				match(ID);
				}
				break;
			case 3:
				{
				setState(367);
				match(ID);
				setState(368);
				match(LBRACKET);
				setState(369);
				exprD();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(370);
					match(COMMA);
					setState(371);
					exprD();
					}
				}

				setState(374);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(378);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(379);
					matchWildcard();
					setState(380);
					match(ID);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 56, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IF);
			setState(387);
			match(LPAREN);
			setState(388);
			exprBool(0);
			setState(389);
			match(RPAREN);
			setState(390);
			match(LBRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(391);
				statement();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(RBRACE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(398);
				match(ELSE);
				setState(399);
				match(LBRACE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
					{
					{
					setState(400);
					statement();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
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
		enterRule(_localctx, 58, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(REPEAT);
			setState(410);
			match(LPAREN);
			setState(411);
			exprEnt(0);
			setState(412);
			match(RPAREN);
			setState(413);
			match(LBRACE);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(414);
				statement();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
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
		enterRule(_localctx, 60, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(WHILE);
			setState(423);
			match(LPAREN);
			setState(424);
			exprBool(0);
			setState(425);
			match(RPAREN);
			setState(426);
			match(LBRACE);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << CONST) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(427);
				statement();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 62, RULE_actionType);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(LEFT);
				setState(436);
				match(LPAREN);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(437);
					exprD();
					}
				}

				setState(440);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(RIGHT);
				setState(442);
				match(LPAREN);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(443);
					exprD();
					}
				}

				setState(446);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(UP);
				setState(448);
				match(LPAREN);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(449);
					exprD();
					}
				}

				setState(452);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(DOWN);
				setState(454);
				match(LPAREN);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(455);
					exprD();
					}
				}

				setState(458);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				match(FIGHT);
				setState(460);
				match(LPAREN);
				setState(461);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(JUMP);
				setState(463);
				match(LPAREN);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(464);
					exprEnt(0);
					}
				}

				setState(467);
				match(RPAREN);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
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
		enterRule(_localctx, 64, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(DIG);
			setState(472);
			match(LPAREN);
			setState(473);
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
		enterRule(_localctx, 66, RULE_mytype);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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
		enterRule(_localctx, 68, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		public ListStructFieldsContext listStructFields() {
			return getRuleContext(ListStructFieldsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
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
		enterRule(_localctx, 70, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(STRUCT);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(482);
				match(ID);
				}
			}

			setState(485);
			match(LBRACE);
			setState(486);
			listStructFields();
			setState(487);
			match(RBRACE);
			setState(488);
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
		enterRule(_localctx, 72, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LBRACKET);
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				match(NATUREL);
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATUREL );
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(496);
				match(COMMA);
				{
				setState(498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(497);
					match(NATUREL);
					}
					}
					setState(500); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATUREL );
				}
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
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
		enterRule(_localctx, 74, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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

	public static class ListStructFieldsContext extends ParserRuleContext {
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public ListStructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterListStructFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitListStructFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitListStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStructFieldsContext listStructFields() throws RecognitionException {
		ListStructFieldsContext _localctx = new ListStructFieldsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listStructFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(511);
				structField();
				}
				}
				setState(516);
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

	public static class StructFieldContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			mytype();
			setState(518);
			fieldDecl();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				fieldDecl();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(ID);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(529);
				arrays();
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
		enterRule(_localctx, 82, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			mytype();
			setState(533);
			match(ID);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(534);
				arrays();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(537);
				match(AFFECT);
				setState(538);
				initVariable();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541);
				match(COMMA);
				setState(542);
				match(ID);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(543);
					arrays();
					}
				}

				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFFECT) {
					{
					setState(546);
					match(AFFECT);
					setState(547);
					initVariable();
					}
				}

				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		enterRule(_localctx, 84, RULE_initVariable);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				exprEnt(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				exprBool(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(563);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(564);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				match(LPAREN);
				setState(566);
				initVariable();
				setState(567);
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
		enterRule(_localctx, 86, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(LBRACE);
			{
			setState(572);
			initVariable();
			}
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(573);
					match(COMMA);
					setState(574);
					initVariable();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(580);
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
		enterRule(_localctx, 88, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 90, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(CONST);
			setState(585);
			mytype();
			setState(586);
			match(ID);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(587);
				arrays();
				}
			}

			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(590);
				match(AFFECT);
				setState(591);
				initVariable();
				}
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(594);
				match(COMMA);
				setState(595);
				match(ID);
				{
				setState(596);
				arrays();
				}
				}
			}

			setState(599);
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
		enterRule(_localctx, 92, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ENUM);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(602);
				match(ID);
				}
			}

			setState(605);
			match(LBRACE);
			setState(606);
			match(ID);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(607);
					match(COMMA);
					setState(608);
					match(ID);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(614);
			match(RBRACE);
			setState(615);
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
		enterRule(_localctx, 94, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(TYPEDEF);
			setState(618);
			mytype();
			setState(619);
			match(ID);
			setState(620);
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
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 26:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 27:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u0271\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\5\2e\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5p\n\5\r\5\16\5q\3\6\3\6\5\6v\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0091\n\13\f\13\16\13\u0094\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00ad\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\6\21\u00b5\n\21\r\21\16\21\u00b6\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c7"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00d3\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00db\n\25\3\25\5\25\u00de\n\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00e7\n\26\f\26\16\26\u00ea\13"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00f4\n\30\f\30\16\30"+
		"\u00f7\13\30\5\30\u00f9\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0101"+
		"\n\30\f\30\16\30\u0104\13\30\5\30\u0106\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0110\n\30\f\30\16\30\u0113\13\30\5\30\u0115\n\30"+
		"\3\30\5\30\u0118\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0123\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u012e\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0139\n\33\f\33"+
		"\16\33\u013c\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0162"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u016a\n\34\f\34\16\34\u016d\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0177\n\35\3\35\3\35"+
		"\5\35\u017b\n\35\3\35\3\35\3\35\7\35\u0180\n\35\f\35\16\35\u0183\13\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u018b\n\36\f\36\16\36\u018e\13\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0194\n\36\f\36\16\36\u0197\13\36\3\36\5\36"+
		"\u019a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01a2\n\37\f\37\16\37\u01a5"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u01af\n \f \16 \u01b2\13 \3 \3 "+
		"\3!\3!\3!\5!\u01b9\n!\3!\3!\3!\3!\5!\u01bf\n!\3!\3!\3!\3!\5!\u01c5\n!"+
		"\3!\3!\3!\3!\5!\u01cb\n!\3!\3!\3!\3!\3!\3!\3!\5!\u01d4\n!\3!\3!\5!\u01d8"+
		"\n!\3\"\3\"\3\"\3\"\3#\3#\5#\u01e0\n#\3$\3$\3%\3%\5%\u01e6\n%\3%\3%\3"+
		"%\3%\3%\3&\3&\6&\u01ef\n&\r&\16&\u01f0\3&\3&\6&\u01f5\n&\r&\16&\u01f6"+
		"\7&\u01f9\n&\f&\16&\u01fc\13&\3&\3&\3\'\3\'\3(\7(\u0203\n(\f(\16(\u0206"+
		"\13(\3)\3)\3)\3)\7)\u020c\n)\f)\16)\u020f\13)\3)\3)\3*\3*\5*\u0215\n*"+
		"\3+\3+\3+\5+\u021a\n+\3+\3+\5+\u021e\n+\3+\3+\3+\5+\u0223\n+\3+\3+\5+"+
		"\u0227\n+\7+\u0229\n+\f+\16+\u022c\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u023c\n,\3-\3-\3-\3-\7-\u0242\n-\f-\16-\u0245\13-\3-\3-"+
		"\3.\3.\3/\3/\3/\3/\5/\u024f\n/\3/\3/\5/\u0253\n/\3/\3/\3/\5/\u0258\n/"+
		"\3/\3/\3\60\3\60\5\60\u025e\n\60\3\60\3\60\3\60\3\60\7\60\u0264\n\60\f"+
		"\60\16\60\u0267\13\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\4\u0243"+
		"\u0265\5\64\668\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\7\3\2EN\4\2\4\4OO\3\2!\"\3\2\37 \3\2"+
		"\24\26\u02ac\2d\3\2\2\2\4f\3\2\2\2\6k\3\2\2\2\bo\3\2\2\2\ns\3\2\2\2\f"+
		"z\3\2\2\2\16\u0082\3\2\2\2\20\u0085\3\2\2\2\22\u0088\3\2\2\2\24\u0092"+
		"\3\2\2\2\26\u009d\3\2\2\2\30\u00a0\3\2\2\2\32\u00a4\3\2\2\2\34\u00aa\3"+
		"\2\2\2\36\u00b0\3\2\2\2 \u00b4\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2\2"+
		"&\u00cb\3\2\2\2(\u00d2\3\2\2\2*\u00e3\3\2\2\2,\u00eb\3\2\2\2.\u0117\3"+
		"\2\2\2\60\u0119\3\2\2\2\62\u0122\3\2\2\2\64\u012d\3\2\2\2\66\u0161\3\2"+
		"\2\28\u017a\3\2\2\2:\u0184\3\2\2\2<\u019b\3\2\2\2>\u01a8\3\2\2\2@\u01d7"+
		"\3\2\2\2B\u01d9\3\2\2\2D\u01df\3\2\2\2F\u01e1\3\2\2\2H\u01e3\3\2\2\2J"+
		"\u01ec\3\2\2\2L\u01ff\3\2\2\2N\u0204\3\2\2\2P\u0207\3\2\2\2R\u0212\3\2"+
		"\2\2T\u0216\3\2\2\2V\u023b\3\2\2\2X\u023d\3\2\2\2Z\u0248\3\2\2\2\\\u024a"+
		"\3\2\2\2^\u025b\3\2\2\2`\u026b\3\2\2\2be\5\n\6\2ce\5\4\3\2db\3\2\2\2d"+
		"c\3\2\2\2e\3\3\2\2\2fg\7A\2\2gh\5\6\4\2hi\5\b\5\2ij\7\2\2\3j\5\3\2\2\2"+
		"kl\7\33\2\2lm\7\33\2\2m\7\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2r\t\3\2\2\2su\5\f\7\2tv\5\24\13\2ut\3\2\2\2uv\3\2\2\2vw"+
		"\3\2\2\2wx\5\30\r\2xy\7\2\2\3y\13\3\2\2\2z\u0080\5\16\b\2{|\7P\2\2|}\5"+
		"\20\t\2}~\7P\2\2~\u0081\3\2\2\2\177\u0081\7\34\2\2\u0080{\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\7B\2\2\u0083\u0084\7\f\2\2\u0084"+
		"\17\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7D\2\2\u0087\21\3\2\2\2\u0088"+
		"\u0089\7O\2\2\u0089\23\3\2\2\2\u008a\u0091\5T+\2\u008b\u0091\5\\/\2\u008c"+
		"\u0091\5L\'\2\u008d\u0091\5^\60\2\u008e\u0091\5`\61\2\u008f\u0091\5(\25"+
		"\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u009c\5T+\2\u0096\u009c\5\\/\2\u0097\u009c\5L\'\2\u0098\u009c"+
		"\5^\60\2\u0099\u009c\5`\61\2\u009a\u009c\5(\25\2\u009b\u0095\3\2\2\2\u009b"+
		"\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5\32\16"+
		"\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\5\34\17\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7\4\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\7.\2\2\u00a8"+
		"\u00a9\7/\2\2\u00a9\33\3\2\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00ad\5 \21"+
		"\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\7\60\2\2\u00af\35\3\2\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\65\2\2\u00b2"+
		"\37\3\2\2\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9"+
		"\5$\23\2\u00b9\u00ba\7\65\2\2\u00ba\u00c7\3\2\2\2\u00bb\u00c7\5&\24\2"+
		"\u00bc\u00bd\5\62\32\2\u00bd\u00be\7\65\2\2\u00be\u00c7\3\2\2\2\u00bf"+
		"\u00c7\5\60\31\2\u00c0\u00c1\5@!\2\u00c1\u00c2\7\65\2\2\u00c2\u00c7\3"+
		"\2\2\2\u00c3\u00c7\5:\36\2\u00c4\u00c7\5<\37\2\u00c5\u00c7\5> \2\u00c6"+
		"\u00b8\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00bf\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\t\3\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00cc\58\35\2\u00cc\u00cd\7&\2\2\u00cd\u00ce\5\62\32\2"+
		"\u00ce\u00cf\7\65\2\2\u00cf\'\3\2\2\2\u00d0\u00d3\5D#\2\u00d1\u00d3\7"+
		"\4\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7O\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7.\2"+
		"\2\u00d8\u00da\7/\2\2\u00d9\u00db\5\26\f\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5 \21\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7\65"+
		"\2\2\u00e1\u00e2\7\60\2\2\u00e2)\3\2\2\2\u00e3\u00e8\5,\27\2\u00e4\u00e5"+
		"\7\67\2\2\u00e5\u00e7\5,\27\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00ec\5D#\2\u00ec\u00ed\58\35\2\u00ed-\3\2\2\2\u00ee\u00ef"+
		"\7O\2\2\u00ef\u00f8\7-\2\2\u00f0\u00f5\5\62\32\2\u00f1\u00f2\7\67\2\2"+
		"\u00f2\u00f4\5\62\32\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0118\7."+
		"\2\2\u00fb\u00fc\7O\2\2\u00fc\u0105\7-\2\2\u00fd\u0102\5\62\32\2\u00fe"+
		"\u00ff\7\67\2\2\u00ff\u0101\5\62\32\2\u0100\u00fe\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\7.\2\2\u0108\u0109\7.\2\2\u0109\u0118\b\30\1\2\u010a"+
		"\u010b\7O\2\2\u010b\u0114\7-\2\2\u010c\u0111\5\62\32\2\u010d\u010e\7\67"+
		"\2\2\u010e\u0110\5\62\32\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\b\30\1\2\u0117\u00ee\3\2\2\2\u0117\u00fb\3\2\2\2\u0117\u010a\3"+
		"\2\2\2\u0118/\3\2\2\2\u0119\u011a\5\\/\2\u011a\u011b\7\65\2\2\u011b\61"+
		"\3\2\2\2\u011c\u0123\5.\30\2\u011d\u0123\58\35\2\u011e\u0123\5\64\33\2"+
		"\u011f\u0123\5\66\34\2\u0120\u0123\7\35\2\2\u0121\u0123\7\36\2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\63\3\2\2\2\u0124\u0125"+
		"\b\33\1\2\u0125\u0126\7 \2\2\u0126\u012e\5\64\33\t\u0127\u012e\58\35\2"+
		"\u0128\u012e\7\33\2\2\u0129\u012a\7-\2\2\u012a\u012b\5\64\33\2\u012b\u012c"+
		"\7.\2\2\u012c\u012e\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0127\3\2\2\2\u012d"+
		"\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u013a\3\2\2\2\u012f\u0130\f\6"+
		"\2\2\u0130\u0131\7#\2\2\u0131\u0139\5\64\33\7\u0132\u0133\f\5\2\2\u0133"+
		"\u0134\t\4\2\2\u0134\u0139\5\64\33\6\u0135\u0136\f\4\2\2\u0136\u0137\t"+
		"\5\2\2\u0137\u0139\5\64\33\5\u0138\u012f\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\65\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b\34\1\2\u013e\u0162"+
		"\7\n\2\2\u013f\u0162\7\13\2\2\u0140\u0162\58\35\2\u0141\u0142\5\64\33"+
		"\2\u0142\u0143\7)\2\2\u0143\u0144\5\64\33\2\u0144\u0162\3\2\2\2\u0145"+
		"\u0146\5\64\33\2\u0146\u0147\7*\2\2\u0147\u0148\5\64\33\2\u0148\u0162"+
		"\3\2\2\2\u0149\u014a\5\64\33\2\u014a\u014b\7+\2\2\u014b\u014c\5\64\33"+
		"\2\u014c\u0162\3\2\2\2\u014d\u014e\5\64\33\2\u014e\u014f\7,\2\2\u014f"+
		"\u0150\5\64\33\2\u0150\u0162\3\2\2\2\u0151\u0152\5\64\33\2\u0152\u0153"+
		"\7%\2\2\u0153\u0154\5\64\33\2\u0154\u0162\3\2\2\2\u0155\u0156\7\35\2\2"+
		"\u0156\u0157\7%\2\2\u0157\u0162\7\35\2\2\u0158\u0159\7\36\2\2\u0159\u015a"+
		"\7%\2\2\u015a\u0162\7\36\2\2\u015b\u015c\7\'\2\2\u015c\u0162\5\66\34\4"+
		"\u015d\u015e\7-\2\2\u015e\u015f\5\66\34\2\u015f\u0160\7.\2\2\u0160\u0162"+
		"\3\2\2\2\u0161\u013d\3\2\2\2\u0161\u013f\3\2\2\2\u0161\u0140\3\2\2\2\u0161"+
		"\u0141\3\2\2\2\u0161\u0145\3\2\2\2\u0161\u0149\3\2\2\2\u0161\u014d\3\2"+
		"\2\2\u0161\u0151\3\2\2\2\u0161\u0155\3\2\2\2\u0161\u0158\3\2\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015d\3\2\2\2\u0162\u016b\3\2\2\2\u0163\u0164\f\6"+
		"\2\2\u0164\u0165\79\2\2\u0165\u016a\5\66\34\7\u0166\u0167\f\5\2\2\u0167"+
		"\u0168\7:\2\2\u0168\u016a\5\66\34\6\u0169\u0163\3\2\2\2\u0169\u0166\3"+
		"\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\67\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\b\35\1\2\u016f\u017b\5.\30"+
		"\2\u0170\u017b\7O\2\2\u0171\u0172\7O\2\2\u0172\u0173\7\61\2\2\u0173\u0176"+
		"\5\62\32\2\u0174\u0175\7\67\2\2\u0175\u0177\5\62\32\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\62\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u016e\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0171\3\2"+
		"\2\2\u017b\u0181\3\2\2\2\u017c\u017d\f\3\2\2\u017d\u017e\13\2\2\2\u017e"+
		"\u0180\7O\2\2\u017f\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u01829\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185"+
		"\7\5\2\2\u0185\u0186\7-\2\2\u0186\u0187\5\66\34\2\u0187\u0188\7.\2\2\u0188"+
		"\u018c\7/\2\2\u0189\u018b\5\"\22\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0199\7\60\2\2\u0190\u0191\7\6\2\2\u0191\u0195\7"+
		"/\2\2\u0192\u0194\5\"\22\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019a\7\60\2\2\u0199\u0190\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		";\3\2\2\2\u019b\u019c\7\b\2\2\u019c\u019d\7-\2\2\u019d\u019e\5\64\33\2"+
		"\u019e\u019f\7.\2\2\u019f\u01a3\7/\2\2\u01a0\u01a2\5\"\22\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\60\2\2\u01a7=\3\2\2\2"+
		"\u01a8\u01a9\7\t\2\2\u01a9\u01aa\7-\2\2\u01aa\u01ab\5\66\34\2\u01ab\u01ac"+
		"\7.\2\2\u01ac\u01b0\7/\2\2\u01ad\u01af\5\"\22\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7\60\2\2\u01b4?\3\2\2\2\u01b5\u01b6"+
		"\7\r\2\2\u01b6\u01b8\7-\2\2\u01b7\u01b9\5\62\32\2\u01b8\u01b7\3\2\2\2"+
		"\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01d8\7.\2\2\u01bb\u01bc"+
		"\7\16\2\2\u01bc\u01be\7-\2\2\u01bd\u01bf\5\62\32\2\u01be\u01bd\3\2\2\2"+
		"\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01d8\7.\2\2\u01c1\u01c2"+
		"\7\17\2\2\u01c2\u01c4\7-\2\2\u01c3\u01c5\5\62\32\2\u01c4\u01c3\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01d8\7.\2\2\u01c7\u01c8"+
		"\7\20\2\2\u01c8\u01ca\7-\2\2\u01c9\u01cb\5\62\32\2\u01ca\u01c9\3\2\2\2"+
		"\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d8\7.\2\2\u01cd\u01ce"+
		"\7\22\2\2\u01ce\u01cf\7-\2\2\u01cf\u01d8\7.\2\2\u01d0\u01d1\7\21\2\2\u01d1"+
		"\u01d3\7-\2\2\u01d2\u01d4\5\64\33\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\7.\2\2\u01d6\u01d8\5B\"\2\u01d7"+
		"\u01b5\3\2\2\2\u01d7\u01bb\3\2\2\2\u01d7\u01c1\3\2\2\2\u01d7\u01c7\3\2"+
		"\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"A\3\2\2\2\u01d9\u01da\7\23\2\2\u01da\u01db\7-\2\2\u01db\u01dc\7.\2\2\u01dc"+
		"C\3\2\2\2\u01dd\u01e0\5F$\2\u01de\u01e0\5H%\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0E\3\2\2\2\u01e1\u01e2\t\6\2\2\u01e2G\3\2\2\2\u01e3"+
		"\u01e5\7\27\2\2\u01e4\u01e6\7O\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7/\2\2\u01e8\u01e9\5N(\2\u01e9\u01ea"+
		"\7\60\2\2\u01ea\u01eb\7\65\2\2\u01ebI\3\2\2\2\u01ec\u01ee\7\61\2\2\u01ed"+
		"\u01ef\7\33\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01fa\3\2\2\2\u01f2\u01f4\7\67\2\2\u01f3"+
		"\u01f5\7\33\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\62\2\2\u01feK\3\2\2\2\u01ff\u0200"+
		"\5H%\2\u0200M\3\2\2\2\u0201\u0203\5P)\2\u0202\u0201\3\2\2\2\u0203\u0206"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205O\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u0208\5D#\2\u0208\u020d\5R*\2\u0209\u020a\7\67\2"+
		"\2\u020a\u020c\5R*\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0211\7\65\2\2\u0211Q\3\2\2\2\u0212\u0214\7O\2\2\u0213\u0215\5J&\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215S\3\2\2\2\u0216\u0217\5D#\2\u0217"+
		"\u0219\7O\2\2\u0218\u021a\5J&\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021d\3\2\2\2\u021b\u021c\7&\2\2\u021c\u021e\5V,\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u022a\3\2\2\2\u021f\u0220\7\67\2\2"+
		"\u0220\u0222\7O\2\2\u0221\u0223\5J&\2\u0222\u0221\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0225\7&\2\2\u0225\u0227\5V,\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u021f\3\2"+
		"\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\65\2\2\u022eU\3\2\2\2"+
		"\u022f\u023c\7\n\2\2\u0230\u023c\7\13\2\2\u0231\u023c\7\35\2\2\u0232\u023c"+
		"\7\36\2\2\u0233\u023c\5\64\33\2\u0234\u023c\5\66\34\2\u0235\u023c\5X-"+
		"\2\u0236\u023c\5Z.\2\u0237\u0238\7-\2\2\u0238\u0239\5V,\2\u0239\u023a"+
		"\7.\2\2\u023a\u023c\3\2\2\2\u023b\u022f\3\2\2\2\u023b\u0230\3\2\2\2\u023b"+
		"\u0231\3\2\2\2\u023b\u0232\3\2\2\2\u023b\u0233\3\2\2\2\u023b\u0234\3\2"+
		"\2\2\u023b\u0235\3\2\2\2\u023b\u0236\3\2\2\2\u023b\u0237\3\2\2\2\u023c"+
		"W\3\2\2\2\u023d\u023e\7/\2\2\u023e\u0243\5V,\2\u023f\u0240\7\67\2\2\u0240"+
		"\u0242\5V,\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0244\3\2\2"+
		"\2\u0243\u0241\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247"+
		"\7\60\2\2\u0247Y\3\2\2\2\u0248\u0249\5L\'\2\u0249[\3\2\2\2\u024a\u024b"+
		"\7\30\2\2\u024b\u024c\5D#\2\u024c\u024e\7O\2\2\u024d\u024f\5J&\2\u024e"+
		"\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0251\7&"+
		"\2\2\u0251\u0253\5V,\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0257"+
		"\3\2\2\2\u0254\u0255\7\67\2\2\u0255\u0256\7O\2\2\u0256\u0258\5J&\2\u0257"+
		"\u0254\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7\65"+
		"\2\2\u025a]\3\2\2\2\u025b\u025d\7\31\2\2\u025c\u025e\7O\2\2\u025d\u025c"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7/\2\2\u0260"+
		"\u0265\7O\2\2\u0261\u0262\7\67\2\2\u0262\u0264\7O\2\2\u0263\u0261\3\2"+
		"\2\2\u0264\u0267\3\2\2\2\u0265\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7\60\2\2\u0269\u026a\7"+
		"\65\2\2\u026a_\3\2\2\2\u026b\u026c\7\32\2\2\u026c\u026d\5D#\2\u026d\u026e"+
		"\7O\2\2\u026e\u026f\7\65\2\2\u026fa\3\2\2\2Adqu\u0080\u0090\u0092\u009b"+
		"\u009d\u00ac\u00b6\u00c6\u00d2\u00da\u00dd\u00e8\u00f5\u00f8\u0102\u0105"+
		"\u0111\u0114\u0117\u0122\u012d\u0138\u013a\u0161\u0169\u016b\u0176\u017a"+
		"\u0181\u018c\u0195\u0199\u01a3\u01b0\u01b8\u01be\u01c4\u01ca\u01d3\u01d7"+
		"\u01df\u01e5\u01f0\u01f6\u01fa\u0204\u020d\u0214\u0219\u021d\u0222\u0226"+
		"\u022a\u023b\u0243\u024e\u0252\u0257\u025d\u0265";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}