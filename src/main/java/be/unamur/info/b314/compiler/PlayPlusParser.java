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
		RULE_root = 0, RULE_mapfile = 1, RULE_mapsize = 2, RULE_world = 3, RULE_coordX = 4, 
		RULE_coordY = 5, RULE_line = 6, RULE_element = 7, RULE_program = 8, RULE_implDecl = 9, 
		RULE_impKeyWord = 10, RULE_fileDecl = 11, RULE_fileName = 12, RULE_globalDecl = 13, 
		RULE_localDecl = 14, RULE_mainDecl = 15, RULE_mainProgram = 16, RULE_mainStart = 17, 
		RULE_mainEnd = 18, RULE_mainRet = 19, RULE_statements = 20, RULE_statement = 21, 
		RULE_returnInstr = 22, RULE_affectInstr = 23, RULE_funcDecl = 24, RULE_funcArgs = 25, 
		RULE_funcArg = 26, RULE_funcCall = 27, RULE_funcCallArgs = 28, RULE_funcCallArg = 29, 
		RULE_constantExpr = 30, RULE_exprD = 31, RULE_exprEnt = 32, RULE_exprBool = 33, 
		RULE_boolVal = 34, RULE_exprG = 35, RULE_structRef = 36, RULE_members = 37, 
		RULE_member = 38, RULE_arrayRef = 39, RULE_conditionalStmt = 40, RULE_repeatStmt = 41, 
		RULE_whileStmt = 42, RULE_actionType = 43, RULE_dig = 44, RULE_mytype = 45, 
		RULE_scalar = 46, RULE_arrays = 47, RULE_arrayIndex = 48, RULE_firstDimension = 49, 
		RULE_secondDimension = 50, RULE_structDecl = 51, RULE_structures = 52, 
		RULE_listStructFields = 53, RULE_structField = 54, RULE_field = 55, RULE_varDecl = 56, 
		RULE_subVarDecl = 57, RULE_initVariable = 58, RULE_initArrays = 59, RULE_initStruct = 60, 
		RULE_constDecl = 61, RULE_enumDecl = 62, RULE_typedefDecl = 63;
	public static final String[] ruleNames = {
		"root", "mapfile", "mapsize", "world", "coordX", "coordY", "line", "element", 
		"program", "implDecl", "impKeyWord", "fileDecl", "fileName", "globalDecl", 
		"localDecl", "mainDecl", "mainProgram", "mainStart", "mainEnd", "mainRet", 
		"statements", "statement", "returnInstr", "affectInstr", "funcDecl", "funcArgs", 
		"funcArg", "funcCall", "funcCallArgs", "funcCallArg", "constantExpr", 
		"exprD", "exprEnt", "exprBool", "boolVal", "exprG", "structRef", "members", 
		"member", "arrayRef", "conditionalStmt", "repeatStmt", "whileStmt", "actionType", 
		"dig", "mytype", "scalar", "arrays", "arrayIndex", "firstDimension", "secondDimension", 
		"structDecl", "structures", "listStructFields", "structField", "field", 
		"varDecl", "subVarDecl", "initVariable", "initArrays", "initStruct", "constDecl", 
		"enumDecl", "typedefDecl"
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		public WorldContext world() {
			return getRuleContext(WorldContext.class,0);
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
			setState(132);
			match(MAPSTART);
			setState(133);
			mapsize();
			setState(134);
			world();
			setState(135);
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
		public CoordXContext coordX() {
			return getRuleContext(CoordXContext.class,0);
		}
		public CoordYContext coordY() {
			return getRuleContext(CoordYContext.class,0);
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
			setState(137);
			coordX();
			setState(138);
			coordY();
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

	public static class WorldContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public WorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_world; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWorld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWorld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorldContext world() throws RecognitionException {
		WorldContext _localctx = new WorldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_world);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				line();
				}
				}
				setState(143); 
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

	public static class CoordXContext extends ParserRuleContext {
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public CoordXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCoordX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCoordX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCoordX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordXContext coordX() throws RecognitionException {
		CoordXContext _localctx = new CoordXContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_coordX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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

	public static class CoordYContext extends ParserRuleContext {
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public CoordYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCoordY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCoordY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCoordY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordYContext coordY() throws RecognitionException {
		CoordYContext _localctx = new CoordYContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coordY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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

	public static class LineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PlayPlusParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PlayPlusParser.NEWLINE, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			element();
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(152);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ROBOT:
					case TRESOR:
					case PELOUSE:
					case PALMIER:
					case PONT:
					case BUISSON:
					case TONNEAU:
					case PUIT:
					case VIDE:
					case SQUELLETTE:
						{
						setState(150);
						element();
						}
						break;
					case NEWLINE:
						{
						setState(151);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ROBOT() { return getToken(PlayPlusParser.ROBOT, 0); }
		public TerminalNode TRESOR() { return getToken(PlayPlusParser.TRESOR, 0); }
		public TerminalNode PELOUSE() { return getToken(PlayPlusParser.PELOUSE, 0); }
		public TerminalNode PALMIER() { return getToken(PlayPlusParser.PALMIER, 0); }
		public TerminalNode PONT() { return getToken(PlayPlusParser.PONT, 0); }
		public TerminalNode BUISSON() { return getToken(PlayPlusParser.BUISSON, 0); }
		public TerminalNode TONNEAU() { return getToken(PlayPlusParser.TONNEAU, 0); }
		public TerminalNode PUIT() { return getToken(PlayPlusParser.PUIT, 0); }
		public TerminalNode VIDE() { return getToken(PlayPlusParser.VIDE, 0); }
		public TerminalNode SQUELLETTE() { return getToken(PlayPlusParser.SQUELLETTE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 16, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			implDecl();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(159);
				globalDecl();
				}
				break;
			}
			setState(162);
			mainProgram();
			setState(163);
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
		enterRule(_localctx, 18, RULE_implDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			impKeyWord();
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(166);
				match(DOUBLEQUOTE);
				setState(167);
				fileDecl();
				setState(168);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(170);
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
		enterRule(_localctx, 20, RULE_impKeyWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(HASHTAG);
			setState(174);
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
		enterRule(_localctx, 22, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			fileName();
			setState(177);
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
		enterRule(_localctx, 24, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 26, RULE_globalDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(181);
						varDecl();
						}
						break;
					case 2:
						{
						setState(182);
						constDecl();
						}
						break;
					case 3:
						{
						setState(183);
						structDecl();
						}
						break;
					case 4:
						{
						setState(184);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(185);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(186);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(191);
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
		enterRule(_localctx, 28, RULE_localDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(192);
						varDecl();
						}
						break;
					case 2:
						{
						setState(193);
						constDecl();
						}
						break;
					case 3:
						{
						setState(194);
						structDecl();
						}
						break;
					case 4:
						{
						setState(195);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(196);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(197);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
		}
		public EnumDeclContext enumDecl() {
			return getRuleContext(EnumDeclContext.class,0);
		}
		public TypedefDeclContext typedefDecl() {
			return getRuleContext(TypedefDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public MainDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclContext mainDecl() throws RecognitionException {
		MainDeclContext _localctx = new MainDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mainDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(203);
				varDecl();
				}
				break;
			case 2:
				{
				setState(204);
				constDecl();
				}
				break;
			case 3:
				{
				setState(205);
				structDecl();
				}
				break;
			case 4:
				{
				setState(206);
				enumDecl();
				}
				break;
			case 5:
				{
				setState(207);
				typedefDecl();
				}
				break;
			case 6:
				{
				setState(208);
				funcDecl();
				}
				break;
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
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
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
		enterRule(_localctx, 32, RULE_mainProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			mainStart();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(212);
				mainDecl();
				}
				break;
			}
			setState(215);
			statements();
			setState(216);
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
		enterRule(_localctx, 34, RULE_mainStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(VOID);
			setState(219);
			match(MAIN);
			setState(220);
			match(LPAREN);
			setState(221);
			match(RPAREN);
			setState(222);
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
		enterRule(_localctx, 36, RULE_mainEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			mainRet();
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(225);
				statements();
				}
				break;
			}
			setState(228);
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
		enterRule(_localctx, 38, RULE_mainRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			returnInstr();
			setState(231);
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
		enterRule(_localctx, 40, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(233);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
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
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				returnInstr();
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				affectInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				exprD();
				setState(243);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				constantExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(246);
				actionType();
				}
				setState(247);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				conditionalStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				repeatStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				whileStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				mainDecl();
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
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_returnInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RETURN);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(256);
				exprG();
				}
				break;
			case 2:
				{
				setState(257);
				match(VOID);
				}
				break;
			case 3:
				{
				setState(258);
				exprD();
				}
				break;
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
		enterRule(_localctx, 46, RULE_affectInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			exprG();
			setState(262);
			match(AFFECT);
			setState(263);
			exprD();
			setState(264);
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
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
			case STRUCT:
				{
				setState(266);
				mytype();
				}
				break;
			case VOID:
				{
				setState(267);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(ID);
			setState(271);
			match(LPAREN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				setState(272);
				funcArgs();
				}
			}

			setState(275);
			match(RPAREN);
			setState(276);
			match(LBRACE);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(277);
				localDecl();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(280);
				statements();
				}
				break;
			}
			setState(283);
			returnInstr();
			setState(284);
			match(SEMICOLON);
			setState(285);
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
		enterRule(_localctx, 50, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			funcArg();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				funcArg();
				}
				}
				setState(294);
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
		enterRule(_localctx, 52, RULE_funcArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			mytype();
			setState(296);
			exprG();
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
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public FuncCallArgsContext funcCallArgs() {
			return getRuleContext(FuncCallArgsContext.class,0);
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
		enterRule(_localctx, 54, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(299);
			match(LPAREN);
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(300);
				funcCallArgs();
				}
				break;
			}
			setState(303);
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

	public static class FuncCallArgsContext extends ParserRuleContext {
		public List<FuncCallArgContext> funcCallArg() {
			return getRuleContexts(FuncCallArgContext.class);
		}
		public FuncCallArgContext funcCallArg(int i) {
			return getRuleContext(FuncCallArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public FuncCallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
		FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcCallArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			funcCallArg();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				funcCallArg();
				}
				}
				setState(312);
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

	public static class FuncCallArgContext extends ParserRuleContext {
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public FuncCallArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFuncCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFuncCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFuncCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgContext funcCallArg() throws RecognitionException {
		FuncCallArgContext _localctx = new FuncCallArgContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funcCallArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			exprD();
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
		enterRule(_localctx, 60, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			constDecl();
			setState(316);
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
		enterRule(_localctx, 62, RULE_exprD);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				exprG();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				exprEnt(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(327);
				match(MINUS);
				setState(328);
				exprEnt(8);
				}
				break;
			case 2:
				{
				setState(329);
				exprG();
				}
				break;
			case 3:
				{
				setState(330);
				funcCall();
				}
				break;
			case 4:
				{
				setState(331);
				match(NATUREL);
				}
				break;
			case 5:
				{
				setState(332);
				match(LPAREN);
				setState(333);
				exprEnt(0);
				setState(334);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(338);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(339);
						match(MOD);
						setState(340);
						exprEnt(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(341);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(342);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						exprEnt(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(344);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(345);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(351);
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
		public List<BoolValContext> boolVal() {
			return getRuleContexts(BoolValContext.class);
		}
		public BoolValContext boolVal(int i) {
			return getRuleContext(BoolValContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayPlusParser.NOTEQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(PlayPlusParser.GREATER, 0); }
		public TerminalNode EGREATER() { return getToken(PlayPlusParser.EGREATER, 0); }
		public TerminalNode ESMALLER() { return getToken(PlayPlusParser.ESMALLER, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(PlayPlusParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(PlayPlusParser.CHARACTER, i);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(PlayPlusParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PlayPlusParser.STRING, i);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(353);
				boolVal();
				}
				break;
			case 3:
				{
				setState(354);
				boolVal();
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				boolVal();
				}
				break;
			case 4:
				{
				setState(358);
				boolVal();
				setState(359);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				exprEnt(0);
				}
				break;
			case 5:
				{
				setState(362);
				exprEnt(0);
				setState(363);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				boolVal();
				}
				break;
			case 6:
				{
				setState(366);
				boolVal();
				setState(367);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				match(CHARACTER);
				}
				break;
			case 7:
				{
				setState(370);
				match(CHARACTER);
				setState(371);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				boolVal();
				}
				break;
			case 8:
				{
				setState(373);
				exprG();
				setState(374);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				match(CHARACTER);
				}
				break;
			case 9:
				{
				setState(377);
				exprEnt(0);
				setState(378);
				match(SMALLER);
				setState(379);
				exprEnt(0);
				}
				break;
			case 10:
				{
				setState(381);
				exprEnt(0);
				setState(382);
				match(GREATER);
				setState(383);
				exprEnt(0);
				}
				break;
			case 11:
				{
				setState(385);
				exprEnt(0);
				setState(386);
				match(EGREATER);
				setState(387);
				exprEnt(0);
				}
				break;
			case 12:
				{
				setState(389);
				exprEnt(0);
				setState(390);
				match(ESMALLER);
				setState(391);
				exprEnt(0);
				}
				break;
			case 13:
				{
				setState(393);
				exprEnt(0);
				setState(394);
				match(EQUAL);
				setState(395);
				exprEnt(0);
				}
				break;
			case 14:
				{
				setState(397);
				exprEnt(0);
				setState(398);
				match(NOTEQUAL);
				setState(399);
				exprEnt(0);
				}
				break;
			case 15:
				{
				setState(401);
				match(STRING);
				setState(402);
				match(EQUAL);
				setState(403);
				match(STRING);
				}
				break;
			case 16:
				{
				setState(404);
				match(STRING);
				setState(405);
				match(NOTEQUAL);
				setState(406);
				match(STRING);
				}
				break;
			case 17:
				{
				setState(407);
				match(CHARACTER);
				setState(408);
				match(EQUAL);
				setState(409);
				match(CHARACTER);
				}
				break;
			case 18:
				{
				setState(410);
				match(CHARACTER);
				setState(411);
				match(NOTEQUAL);
				setState(412);
				match(CHARACTER);
				}
				break;
			case 19:
				{
				setState(413);
				match(NOT);
				setState(414);
				exprBool(2);
				}
				break;
			case 20:
				{
				setState(415);
				match(LPAREN);
				setState(416);
				exprBool(0);
				setState(417);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(421);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(422);
						match(AND);
						setState(423);
						exprBool(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(424);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(425);
						match(EQUAL);
						setState(426);
						exprBool(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(427);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(428);
						match(NOTEQUAL);
						setState(429);
						exprBool(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(430);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(431);
						match(OR);
						setState(432);
						exprBool(4);
						}
						break;
					}
					} 
				}
				setState(437);
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

	public static class BoolValContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolVal);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				exprG();
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

	public static class ExprGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public StructRefContext structRef() {
			return getRuleContext(StructRefContext.class,0);
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
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprG);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				arrayRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				structRef();
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

	public static class StructRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public StructRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructRefContext structRef() throws RecognitionException {
		StructRefContext _localctx = new StructRefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ID);
			setState(450);
			members();
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

	public static class MembersContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_members);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(DOT);
			setState(453);
			member();
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(DOT);
					setState(455);
					member();
					}
					} 
				}
				setState(460);
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
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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

	public static class ArrayRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public FirstDimensionContext firstDimension() {
			return getRuleContext(FirstDimensionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public SecondDimensionContext secondDimension() {
			return getRuleContext(SecondDimensionContext.class,0);
		}
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(ID);
			setState(464);
			match(LBRACKET);
			setState(465);
			firstDimension();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(466);
				match(COMMA);
				setState(467);
				secondDimension();
				}
			}

			setState(470);
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
		enterRule(_localctx, 80, RULE_conditionalStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(IF);
			setState(473);
			match(LPAREN);
			setState(474);
			exprBool(0);
			setState(475);
			match(RPAREN);
			setState(476);
			match(LBRACE);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					statement();
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(483);
			match(RBRACE);
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(484);
				match(ELSE);
				setState(485);
				match(LBRACE);
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(486);
						statement();
						}
						} 
					}
					setState(491);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(492);
				match(RBRACE);
				}
				break;
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
		enterRule(_localctx, 82, RULE_repeatStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(REPEAT);
			setState(496);
			match(LPAREN);
			setState(497);
			exprEnt(0);
			setState(498);
			match(RPAREN);
			setState(499);
			match(LBRACE);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(500);
					statement();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(506);
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
		enterRule(_localctx, 84, RULE_whileStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(WHILE);
			setState(509);
			match(LPAREN);
			setState(510);
			exprBool(0);
			setState(511);
			match(RPAREN);
			setState(512);
			match(LBRACE);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					statement();
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(519);
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
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(PlayPlusParser.RIGHT, 0); }
		public TerminalNode UP() { return getToken(PlayPlusParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(PlayPlusParser.DOWN, 0); }
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode JUMP() { return getToken(PlayPlusParser.JUMP, 0); }
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
		enterRule(_localctx, 86, RULE_actionType);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(LEFT);
				setState(522);
				match(LPAREN);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(523);
					exprEnt(0);
					}
				}

				setState(526);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(RIGHT);
				setState(528);
				match(LPAREN);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(529);
					exprEnt(0);
					}
				}

				setState(532);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(UP);
				setState(534);
				match(LPAREN);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(535);
					exprEnt(0);
					}
				}

				setState(538);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(DOWN);
				setState(540);
				match(LPAREN);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(541);
					exprEnt(0);
					}
				}

				setState(544);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(545);
				match(FIGHT);
				setState(546);
				match(LPAREN);
				setState(547);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(548);
				match(JUMP);
				setState(549);
				match(LPAREN);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(550);
					exprEnt(0);
					}
				}

				setState(553);
				match(RPAREN);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
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
		enterRule(_localctx, 88, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(DIG);
			setState(558);
			match(LPAREN);
			setState(559);
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
		enterRule(_localctx, 90, RULE_mytype);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
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
		enterRule(_localctx, 92, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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

	public static class ArraysContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
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
		enterRule(_localctx, 94, RULE_arrays);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(LBRACKET);
			setState(568);
			arrayIndex();
			setState(569);
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

	public static class ArrayIndexContext extends ParserRuleContext {
		public FirstDimensionContext firstDimension() {
			return getRuleContext(FirstDimensionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public SecondDimensionContext secondDimension() {
			return getRuleContext(SecondDimensionContext.class,0);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			firstDimension();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(572);
				match(COMMA);
				setState(573);
				secondDimension();
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

	public static class FirstDimensionContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public FirstDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFirstDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFirstDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFirstDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstDimensionContext firstDimension() throws RecognitionException {
		FirstDimensionContext _localctx = new FirstDimensionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_firstDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			exprEnt(0);
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

	public static class SecondDimensionContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public SecondDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSecondDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSecondDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSecondDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondDimensionContext secondDimension() throws RecognitionException {
		SecondDimensionContext _localctx = new SecondDimensionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_secondDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			exprEnt(0);
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
		enterRule(_localctx, 102, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
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
		enterRule(_localctx, 104, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(STRUCT);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(583);
				match(ID);
				}
			}

			setState(586);
			match(LBRACE);
			setState(587);
			listStructFields();
			setState(588);
			match(RBRACE);
			setState(589);
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
		enterRule(_localctx, 106, RULE_listStructFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(591);
				structField();
				}
				}
				setState(594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0) );
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
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
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
		enterRule(_localctx, 108, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(596);
				field();
				}
				break;
			case 2:
				{
				setState(597);
				structDecl();
				}
				break;
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

	public static class FieldContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			mytype();
			setState(601);
			match(ID);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(602);
				arrays();
				}
			}

			setState(605);
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

	public static class VarDeclContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public List<SubVarDeclContext> subVarDecl() {
			return getRuleContexts(SubVarDeclContext.class);
		}
		public SubVarDeclContext subVarDecl(int i) {
			return getRuleContext(SubVarDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 112, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			mytype();
			setState(608);
			subVarDecl();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(609);
				match(COMMA);
				setState(610);
				subVarDecl();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
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

	public static class SubVarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public SubVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSubVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSubVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSubVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubVarDeclContext subVarDecl() throws RecognitionException {
		SubVarDeclContext _localctx = new SubVarDeclContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(ID);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(619);
				arrays();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(622);
				match(AFFECT);
				setState(623);
				initVariable();
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
		enterRule(_localctx, 116, RULE_initVariable);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(629);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(630);
				exprEnt(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(631);
				exprBool(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(632);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(633);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(634);
				match(LPAREN);
				setState(635);
				initVariable();
				setState(636);
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
		enterRule(_localctx, 118, RULE_initArrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LBRACE);
			{
			setState(641);
			initVariable();
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				initVariable();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
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
		enterRule(_localctx, 120, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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
		enterRule(_localctx, 122, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(CONST);
			setState(654);
			mytype();
			setState(655);
			match(ID);
			{
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(656);
				arrays();
				}
			}

			}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(659);
				match(AFFECT);
				setState(660);
				initVariable();
				}
				}
			}

			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(663);
				match(COMMA);
				setState(664);
				match(ID);
				{
				setState(665);
				arrays();
				}
				}
			}

			setState(668);
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
		enterRule(_localctx, 124, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ENUM);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(671);
				match(ID);
				}
			}

			setState(674);
			match(LBRACE);
			setState(675);
			match(ID);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(676);
					match(COMMA);
					setState(677);
					match(ID);
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(683);
			match(RBRACE);
			setState(684);
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
		enterRule(_localctx, 126, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(TYPEDEF);
			setState(687);
			mytype();
			setState(688);
			match(ID);
			setState(689);
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
		case 32:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 33:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
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
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u02b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\5\2\u0085\n\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\6\5\u0090\n\5\r\5\16\5\u0091\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\6\b\u009b\n\b\r\b\16\b\u009c\3\t\3\t\3\n\3\n\5\n\u00a3\n\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00be\n\17\f\17\16\17"+
		"\u00c1\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16\20"+
		"\u00cc\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\5"+
		"\22\u00d8\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00e5\n\24\3\24\3\24\3\25\3\25\3\25\3\26\6\26\u00ed\n\26\r\26\16"+
		"\26\u00ee\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0100\n\27\3\30\3\30\3\30\3\30\5\30\u0106\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u010f\n\32\3\32\3\32\3\32\5\32"+
		"\u0114\n\32\3\32\3\32\3\32\5\32\u0119\n\32\3\32\5\32\u011c\n\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\7\33\u0125\n\33\f\33\16\33\u0128\13\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\5\35\u0130\n\35\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u0137\n\36\f\36\16\36\u013a\13\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\5!\u0147\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0153"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u015e\n\"\f\"\16\"\u0161"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u01a6\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01b4\n#\f#\16#\u01b7"+
		"\13#\3$\3$\3$\3$\5$\u01bd\n$\3%\3%\3%\5%\u01c2\n%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\7\'\u01cb\n\'\f\'\16\'\u01ce\13\'\3(\3(\3)\3)\3)\3)\3)\5)\u01d7\n"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\7*\u01e1\n*\f*\16*\u01e4\13*\3*\3*\3*\3*\7*"+
		"\u01ea\n*\f*\16*\u01ed\13*\3*\5*\u01f0\n*\3+\3+\3+\3+\3+\3+\7+\u01f8\n"+
		"+\f+\16+\u01fb\13+\3+\3+\3,\3,\3,\3,\3,\3,\7,\u0205\n,\f,\16,\u0208\13"+
		",\3,\3,\3-\3-\3-\5-\u020f\n-\3-\3-\3-\3-\5-\u0215\n-\3-\3-\3-\3-\5-\u021b"+
		"\n-\3-\3-\3-\3-\5-\u0221\n-\3-\3-\3-\3-\3-\3-\3-\5-\u022a\n-\3-\3-\5-"+
		"\u022e\n-\3.\3.\3.\3.\3/\3/\5/\u0236\n/\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\5\62\u0241\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\5\66\u024b\n\66\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u0253\n\67\r\67\16"+
		"\67\u0254\38\38\58\u0259\n8\39\39\39\59\u025e\n9\39\39\3:\3:\3:\3:\7:"+
		"\u0266\n:\f:\16:\u0269\13:\3:\3:\3;\3;\5;\u026f\n;\3;\3;\5;\u0273\n;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0281\n<\3=\3=\3=\3=\7=\u0287\n"+
		"=\f=\16=\u028a\13=\3=\3=\3>\3>\3?\3?\3?\3?\5?\u0294\n?\3?\3?\5?\u0298"+
		"\n?\3?\3?\3?\5?\u029d\n?\3?\3?\3@\3@\5@\u02a3\n@\3@\3@\3@\3@\7@\u02a9"+
		"\n@\f@\16@\u02ac\13@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3\u02aa\4BDB\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\2\7\3\2EN\3\2!\"\3\2\37 \4\2%%(,\3\2\24\26\u02f1"+
		"\2\u0084\3\2\2\2\4\u0086\3\2\2\2\6\u008b\3\2\2\2\b\u008f\3\2\2\2\n\u0093"+
		"\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3"+
		"\2\2\2\24\u00a7\3\2\2\2\26\u00af\3\2\2\2\30\u00b2\3\2\2\2\32\u00b5\3\2"+
		"\2\2\34\u00bf\3\2\2\2\36\u00ca\3\2\2\2 \u00d3\3\2\2\2\"\u00d5\3\2\2\2"+
		"$\u00dc\3\2\2\2&\u00e2\3\2\2\2(\u00e8\3\2\2\2*\u00ec\3\2\2\2,\u00ff\3"+
		"\2\2\2.\u0101\3\2\2\2\60\u0107\3\2\2\2\62\u010e\3\2\2\2\64\u0121\3\2\2"+
		"\2\66\u0129\3\2\2\28\u012c\3\2\2\2:\u0133\3\2\2\2<\u013b\3\2\2\2>\u013d"+
		"\3\2\2\2@\u0146\3\2\2\2B\u0152\3\2\2\2D\u01a5\3\2\2\2F\u01bc\3\2\2\2H"+
		"\u01c1\3\2\2\2J\u01c3\3\2\2\2L\u01c6\3\2\2\2N\u01cf\3\2\2\2P\u01d1\3\2"+
		"\2\2R\u01da\3\2\2\2T\u01f1\3\2\2\2V\u01fe\3\2\2\2X\u022d\3\2\2\2Z\u022f"+
		"\3\2\2\2\\\u0235\3\2\2\2^\u0237\3\2\2\2`\u0239\3\2\2\2b\u023d\3\2\2\2"+
		"d\u0242\3\2\2\2f\u0244\3\2\2\2h\u0246\3\2\2\2j\u0248\3\2\2\2l\u0252\3"+
		"\2\2\2n\u0258\3\2\2\2p\u025a\3\2\2\2r\u0261\3\2\2\2t\u026c\3\2\2\2v\u0280"+
		"\3\2\2\2x\u0282\3\2\2\2z\u028d\3\2\2\2|\u028f\3\2\2\2~\u02a0\3\2\2\2\u0080"+
		"\u02b0\3\2\2\2\u0082\u0085\5\22\n\2\u0083\u0085\5\4\3\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0083\3\2\2\2\u0085\3\3\2\2\2\u0086\u0087\7A\2\2\u0087\u0088"+
		"\5\6\4\2\u0088\u0089\5\b\5\2\u0089\u008a\7\2\2\3\u008a\5\3\2\2\2\u008b"+
		"\u008c\5\n\6\2\u008c\u008d\5\f\7\2\u008d\7\3\2\2\2\u008e\u0090\5\16\b"+
		"\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\t\3\2\2\2\u0093\u0094\7\33\2\2\u0094\13\3\2\2\2\u0095\u0096"+
		"\7\33\2\2\u0096\r\3\2\2\2\u0097\u009a\5\20\t\2\u0098\u009b\5\20\t\2\u0099"+
		"\u009b\7?\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f"+
		"\t\2\2\2\u009f\21\3\2\2\2\u00a0\u00a2\5\24\13\2\u00a1\u00a3\5\34\17\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\5\"\22\2\u00a5\u00a6\7\2\2\3\u00a6\23\3\2\2\2\u00a7\u00ad\5\26\f\2\u00a8"+
		"\u00a9\7P\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7P\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00ae\7\34\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b0\7B\2\2\u00b0\u00b1\7\f\2\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00b3\5\32\16\2\u00b3\u00b4\7D\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7O\2"+
		"\2\u00b6\33\3\2\2\2\u00b7\u00be\5r:\2\u00b8\u00be\5|?\2\u00b9\u00be\5"+
		"h\65\2\u00ba\u00be\5~@\2\u00bb\u00be\5\u0080A\2\u00bc\u00be\5\62\32\2"+
		"\u00bd\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00bf\3\2\2"+
		"\2\u00c2\u00c9\5r:\2\u00c3\u00c9\5|?\2\u00c4\u00c9\5h\65\2\u00c5\u00c9"+
		"\5~@\2\u00c6\u00c9\5\u0080A\2\u00c7\u00c9\5\62\32\2\u00c8\u00c2\3\2\2"+
		"\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d4\5r:\2"+
		"\u00ce\u00d4\5|?\2\u00cf\u00d4\5h\65\2\u00d0\u00d4\5~@\2\u00d1\u00d4\5"+
		"\u0080A\2\u00d2\u00d4\5\62\32\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2\2"+
		"\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4!\3\2\2\2\u00d5\u00d7\5$\23\2\u00d6\u00d8\5 \21\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5*"+
		"\26\2\u00da\u00db\5&\24\2\u00db#\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd\u00de"+
		"\7\3\2\2\u00de\u00df\7-\2\2\u00df\u00e0\7.\2\2\u00e0\u00e1\7/\2\2\u00e1"+
		"%\3\2\2\2\u00e2\u00e4\5(\25\2\u00e3\u00e5\5*\26\2\u00e4\u00e3\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\'"+
		"\3\2\2\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\7\65\2\2\u00ea)\3\2\2\2\u00eb"+
		"\u00ed\5,\27\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef+\3\2\2\2\u00f0\u00f1\5.\30\2\u00f1\u00f2"+
		"\7\65\2\2\u00f2\u0100\3\2\2\2\u00f3\u0100\5\60\31\2\u00f4\u00f5\5@!\2"+
		"\u00f5\u00f6\7\65\2\2\u00f6\u0100\3\2\2\2\u00f7\u0100\5> \2\u00f8\u00f9"+
		"\5X-\2\u00f9\u00fa\7\65\2\2\u00fa\u0100\3\2\2\2\u00fb\u0100\5R*\2\u00fc"+
		"\u0100\5T+\2\u00fd\u0100\5V,\2\u00fe\u0100\5 \21\2\u00ff\u00f0\3\2\2\2"+
		"\u00ff\u00f3\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8"+
		"\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100-\3\2\2\2\u0101\u0105\7C\2\2\u0102\u0106\5H%\2\u0103"+
		"\u0106\7\4\2\2\u0104\u0106\5@!\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2"+
		"\2\u0105\u0104\3\2\2\2\u0106/\3\2\2\2\u0107\u0108\5H%\2\u0108\u0109\7"+
		"&\2\2\u0109\u010a\5@!\2\u010a\u010b\7\65\2\2\u010b\61\3\2\2\2\u010c\u010f"+
		"\5\\/\2\u010d\u010f\7\4\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\7O\2\2\u0111\u0113\7-\2\2\u0112\u0114\5\64"+
		"\33\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7.\2\2\u0116\u0118\7/\2\2\u0117\u0119\5\36\20\2\u0118\u0117\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5*\26\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5."+
		"\30\2\u011e\u011f\7\65\2\2\u011f\u0120\7\60\2\2\u0120\63\3\2\2\2\u0121"+
		"\u0126\5\66\34\2\u0122\u0123\7\67\2\2\u0123\u0125\5\66\34\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\65\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5\\/\2\u012a\u012b\5H%\2\u012b"+
		"\67\3\2\2\2\u012c\u012d\7O\2\2\u012d\u012f\7-\2\2\u012e\u0130\5:\36\2"+
		"\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\7.\2\2\u01329\3\2\2\2\u0133\u0138\5<\37\2\u0134\u0135\7\67\2\2\u0135"+
		"\u0137\5<\37\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139;\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c"+
		"\5@!\2\u013c=\3\2\2\2\u013d\u013e\5|?\2\u013e\u013f\7\65\2\2\u013f?\3"+
		"\2\2\2\u0140\u0147\58\35\2\u0141\u0147\5H%\2\u0142\u0147\5B\"\2\u0143"+
		"\u0147\5D#\2\u0144\u0147\7\35\2\2\u0145\u0147\7\36\2\2\u0146\u0140\3\2"+
		"\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147A\3\2\2\2\u0148\u0149\b\"\1\2"+
		"\u0149\u014a\7 \2\2\u014a\u0153\5B\"\n\u014b\u0153\5H%\2\u014c\u0153\5"+
		"8\35\2\u014d\u0153\7\33\2\2\u014e\u014f\7-\2\2\u014f\u0150\5B\"\2\u0150"+
		"\u0151\7.\2\2\u0151\u0153\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u014b\3\2"+
		"\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0153"+
		"\u015f\3\2\2\2\u0154\u0155\f\6\2\2\u0155\u0156\7#\2\2\u0156\u015e\5B\""+
		"\7\u0157\u0158\f\5\2\2\u0158\u0159\t\3\2\2\u0159\u015e\5B\"\6\u015a\u015b"+
		"\f\4\2\2\u015b\u015c\t\4\2\2\u015c\u015e\5B\"\5\u015d\u0154\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160C\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u01a6"+
		"\b#\1\2\u0163\u01a6\5F$\2\u0164\u0165\5F$\2\u0165\u0166\t\5\2\2\u0166"+
		"\u0167\5F$\2\u0167\u01a6\3\2\2\2\u0168\u0169\5F$\2\u0169\u016a\t\5\2\2"+
		"\u016a\u016b\5B\"\2\u016b\u01a6\3\2\2\2\u016c\u016d\5B\"\2\u016d\u016e"+
		"\t\5\2\2\u016e\u016f\5F$\2\u016f\u01a6\3\2\2\2\u0170\u0171\5F$\2\u0171"+
		"\u0172\t\5\2\2\u0172\u0173\7\36\2\2\u0173\u01a6\3\2\2\2\u0174\u0175\7"+
		"\36\2\2\u0175\u0176\t\5\2\2\u0176\u01a6\5F$\2\u0177\u0178\5H%\2\u0178"+
		"\u0179\t\5\2\2\u0179\u017a\7\36\2\2\u017a\u01a6\3\2\2\2\u017b\u017c\5"+
		"B\"\2\u017c\u017d\7)\2\2\u017d\u017e\5B\"\2\u017e\u01a6\3\2\2\2\u017f"+
		"\u0180\5B\"\2\u0180\u0181\7*\2\2\u0181\u0182\5B\"\2\u0182\u01a6\3\2\2"+
		"\2\u0183\u0184\5B\"\2\u0184\u0185\7+\2\2\u0185\u0186\5B\"\2\u0186\u01a6"+
		"\3\2\2\2\u0187\u0188\5B\"\2\u0188\u0189\7,\2\2\u0189\u018a\5B\"\2\u018a"+
		"\u01a6\3\2\2\2\u018b\u018c\5B\"\2\u018c\u018d\7%\2\2\u018d\u018e\5B\""+
		"\2\u018e\u01a6\3\2\2\2\u018f\u0190\5B\"\2\u0190\u0191\7(\2\2\u0191\u0192"+
		"\5B\"\2\u0192\u01a6\3\2\2\2\u0193\u0194\7\35\2\2\u0194\u0195\7%\2\2\u0195"+
		"\u01a6\7\35\2\2\u0196\u0197\7\35\2\2\u0197\u0198\7(\2\2\u0198\u01a6\7"+
		"\35\2\2\u0199\u019a\7\36\2\2\u019a\u019b\7%\2\2\u019b\u01a6\7\36\2\2\u019c"+
		"\u019d\7\36\2\2\u019d\u019e\7(\2\2\u019e\u01a6\7\36\2\2\u019f\u01a0\7"+
		"\'\2\2\u01a0\u01a6\5D#\4\u01a1\u01a2\7-\2\2\u01a2\u01a3\5D#\2\u01a3\u01a4"+
		"\7.\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0162\3\2\2\2\u01a5\u0163\3\2\2\2\u01a5"+
		"\u0164\3\2\2\2\u01a5\u0168\3\2\2\2\u01a5\u016c\3\2\2\2\u01a5\u0170\3\2"+
		"\2\2\u01a5\u0174\3\2\2\2\u01a5\u0177\3\2\2\2\u01a5\u017b\3\2\2\2\u01a5"+
		"\u017f\3\2\2\2\u01a5\u0183\3\2\2\2\u01a5\u0187\3\2\2\2\u01a5\u018b\3\2"+
		"\2\2\u01a5\u018f\3\2\2\2\u01a5\u0193\3\2\2\2\u01a5\u0196\3\2\2\2\u01a5"+
		"\u0199\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a1\3\2"+
		"\2\2\u01a6\u01b5\3\2\2\2\u01a7\u01a8\f\b\2\2\u01a8\u01a9\79\2\2\u01a9"+
		"\u01b4\5D#\t\u01aa\u01ab\f\7\2\2\u01ab\u01ac\7%\2\2\u01ac\u01b4\5D#\b"+
		"\u01ad\u01ae\f\6\2\2\u01ae\u01af\7(\2\2\u01af\u01b4\5D#\7\u01b0\u01b1"+
		"\f\5\2\2\u01b1\u01b2\7:\2\2\u01b2\u01b4\5D#\6\u01b3\u01a7\3\2\2\2\u01b3"+
		"\u01aa\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4\u01b7\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6E\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01bd\7\n\2\2\u01b9\u01bd\7\13\2\2\u01ba\u01bd\58\35\2"+
		"\u01bb\u01bd\5H%\2\u01bc\u01b8\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdG\3\2\2\2\u01be\u01c2\7O\2\2\u01bf\u01c2"+
		"\5P)\2\u01c0\u01c2\5J&\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2I\3\2\2\2\u01c3\u01c4\7O\2\2\u01c4\u01c5\5L\'\2\u01c5"+
		"K\3\2\2\2\u01c6\u01c7\78\2\2\u01c7\u01cc\5N(\2\u01c8\u01c9\78\2\2\u01c9"+
		"\u01cb\5N(\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2"+
		"\2\u01cc\u01cd\3\2\2\2\u01cdM\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0"+
		"\7O\2\2\u01d0O\3\2\2\2\u01d1\u01d2\7O\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d6"+
		"\5d\63\2\u01d4\u01d5\7\67\2\2\u01d5\u01d7\5f\64\2\u01d6\u01d4\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\62\2\2\u01d9Q\3"+
		"\2\2\2\u01da\u01db\7\5\2\2\u01db\u01dc\7-\2\2\u01dc\u01dd\5D#\2\u01dd"+
		"\u01de\7.\2\2\u01de\u01e2\7/\2\2\u01df\u01e1\5,\27\2\u01e0\u01df\3\2\2"+
		"\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01ef\7\60\2\2\u01e6\u01e7\7\6\2\2"+
		"\u01e7\u01eb\7/\2\2\u01e8\u01ea\5,\27\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\7\60\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0S\3\2\2\2\u01f1\u01f2\7\b\2\2\u01f2\u01f3\7-\2\2\u01f3\u01f4"+
		"\5B\"\2\u01f4\u01f5\7.\2\2\u01f5\u01f9\7/\2\2\u01f6\u01f8\5,\27\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd"+
		"U\3\2\2\2\u01fe\u01ff\7\t\2\2\u01ff\u0200\7-\2\2\u0200\u0201\5D#\2\u0201"+
		"\u0202\7.\2\2\u0202\u0206\7/\2\2\u0203\u0205\5,\27\2\u0204\u0203\3\2\2"+
		"\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\60\2\2\u020aW\3\2\2\2\u020b"+
		"\u020c\7\r\2\2\u020c\u020e\7-\2\2\u020d\u020f\5B\"\2\u020e\u020d\3\2\2"+
		"\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u022e\7.\2\2\u0211\u0212"+
		"\7\16\2\2\u0212\u0214\7-\2\2\u0213\u0215\5B\"\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u022e\7.\2\2\u0217\u0218\7\17"+
		"\2\2\u0218\u021a\7-\2\2\u0219\u021b\5B\"\2\u021a\u0219\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u022e\7.\2\2\u021d\u021e\7\20\2\2\u021e"+
		"\u0220\7-\2\2\u021f\u0221\5B\"\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u022e\7.\2\2\u0223\u0224\7\22\2\2\u0224\u0225"+
		"\7-\2\2\u0225\u022e\7.\2\2\u0226\u0227\7\21\2\2\u0227\u0229\7-\2\2\u0228"+
		"\u022a\5B\"\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022e\7.\2\2\u022c\u022e\5Z.\2\u022d\u020b\3\2\2\2\u022d\u0211"+
		"\3\2\2\2\u022d\u0217\3\2\2\2\u022d\u021d\3\2\2\2\u022d\u0223\3\2\2\2\u022d"+
		"\u0226\3\2\2\2\u022d\u022c\3\2\2\2\u022eY\3\2\2\2\u022f\u0230\7\23\2\2"+
		"\u0230\u0231\7-\2\2\u0231\u0232\7.\2\2\u0232[\3\2\2\2\u0233\u0236\5^\60"+
		"\2\u0234\u0236\5j\66\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236]"+
		"\3\2\2\2\u0237\u0238\t\6\2\2\u0238_\3\2\2\2\u0239\u023a\7\61\2\2\u023a"+
		"\u023b\5b\62\2\u023b\u023c\7\62\2\2\u023ca\3\2\2\2\u023d\u0240\5d\63\2"+
		"\u023e\u023f\7\67\2\2\u023f\u0241\5f\64\2\u0240\u023e\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241c\3\2\2\2\u0242\u0243\5B\"\2\u0243e\3\2\2\2\u0244\u0245"+
		"\5B\"\2\u0245g\3\2\2\2\u0246\u0247\5j\66\2\u0247i\3\2\2\2\u0248\u024a"+
		"\7\27\2\2\u0249\u024b\7O\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\7/\2\2\u024d\u024e\5l\67\2\u024e\u024f\7\60"+
		"\2\2\u024f\u0250\7\65\2\2\u0250k\3\2\2\2\u0251\u0253\5n8\2\u0252\u0251"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"m\3\2\2\2\u0256\u0259\5p9\2\u0257\u0259\5h\65\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0257\3\2\2\2\u0259o\3\2\2\2\u025a\u025b\5\\/\2\u025b\u025d\7O\2\2\u025c"+
		"\u025e\5`\61\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\7\65\2\2\u0260q\3\2\2\2\u0261\u0262\5\\/\2\u0262\u0267"+
		"\5t;\2\u0263\u0264\7\67\2\2\u0264\u0266\5t;\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7\65\2\2\u026bs\3\2\2\2\u026c\u026e"+
		"\7O\2\2\u026d\u026f\5`\61\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u0271\7&\2\2\u0271\u0273\5v<\2\u0272\u0270\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273u\3\2\2\2\u0274\u0281\7\n\2\2\u0275\u0281"+
		"\7\13\2\2\u0276\u0281\7\35\2\2\u0277\u0281\7\36\2\2\u0278\u0281\5B\"\2"+
		"\u0279\u0281\5D#\2\u027a\u0281\5x=\2\u027b\u0281\5z>\2\u027c\u027d\7-"+
		"\2\2\u027d\u027e\5v<\2\u027e\u027f\7.\2\2\u027f\u0281\3\2\2\2\u0280\u0274"+
		"\3\2\2\2\u0280\u0275\3\2\2\2\u0280\u0276\3\2\2\2\u0280\u0277\3\2\2\2\u0280"+
		"\u0278\3\2\2\2\u0280\u0279\3\2\2\2\u0280\u027a\3\2\2\2\u0280\u027b\3\2"+
		"\2\2\u0280\u027c\3\2\2\2\u0281w\3\2\2\2\u0282\u0283\7/\2\2\u0283\u0288"+
		"\5v<\2\u0284\u0285\7\67\2\2\u0285\u0287\5v<\2\u0286\u0284\3\2\2\2\u0287"+
		"\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7\60\2\2\u028cy\3\2\2\2\u028d\u028e"+
		"\5h\65\2\u028e{\3\2\2\2\u028f\u0290\7\30\2\2\u0290\u0291\5\\/\2\u0291"+
		"\u0293\7O\2\2\u0292\u0294\5`\61\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0297\3\2\2\2\u0295\u0296\7&\2\2\u0296\u0298\5v<\2\u0297\u0295"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029c\3\2\2\2\u0299\u029a\7\67\2\2"+
		"\u029a\u029b\7O\2\2\u029b\u029d\5`\61\2\u029c\u0299\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\65\2\2\u029f}\3\2\2\2\u02a0"+
		"\u02a2\7\31\2\2\u02a1\u02a3\7O\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7/\2\2\u02a5\u02aa\7O\2\2\u02a6\u02a7"+
		"\7\67\2\2\u02a7\u02a9\7O\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02ae\7\60\2\2\u02ae\u02af\7\65\2\2\u02af\177\3\2\2\2\u02b0"+
		"\u02b1\7\32\2\2\u02b1\u02b2\5\\/\2\u02b2\u02b3\7O\2\2\u02b3\u02b4\7\65"+
		"\2\2\u02b4\u0081\3\2\2\2?\u0084\u0091\u009a\u009c\u00a2\u00ad\u00bd\u00bf"+
		"\u00c8\u00ca\u00d3\u00d7\u00e4\u00ee\u00ff\u0105\u010e\u0113\u0118\u011b"+
		"\u0126\u012f\u0138\u0146\u0152\u015d\u015f\u01a5\u01b3\u01b5\u01bc\u01c1"+
		"\u01cc\u01d6\u01e2\u01eb\u01ef\u01f9\u0206\u020e\u0214\u021a\u0220\u0229"+
		"\u022d\u0235\u0240\u024a\u0254\u0258\u025d\u0267\u026e\u0272\u0280\u0288"+
		"\u0293\u0297\u029c\u02a2\u02aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}