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
		RULE_constantExpr = 30, RULE_exprD = 31, RULE_operateurEntier = 32, RULE_exprEnt = 33, 
		RULE_naturel = 34, RULE_exprBool = 35, RULE_boolVal = 36, RULE_boolLiteral = 37, 
		RULE_charVal = 38, RULE_exprG = 39, RULE_structRef = 40, RULE_members = 41, 
		RULE_member = 42, RULE_arrayRef = 43, RULE_conditionalStmt = 44, RULE_repeatStmt = 45, 
		RULE_whileStmt = 46, RULE_ifStmt = 47, RULE_elseStmt = 48, RULE_loops = 49, 
		RULE_boolCondition = 50, RULE_repeatCondition = 51, RULE_actionType = 52, 
		RULE_dig = 53, RULE_mytype = 54, RULE_scalar = 55, RULE_arrays = 56, RULE_arrayIndex = 57, 
		RULE_firstDimension = 58, RULE_secondDimension = 59, RULE_structDecl = 60, 
		RULE_structures = 61, RULE_listStructFields = 62, RULE_structField = 63, 
		RULE_field = 64, RULE_varDecl = 65, RULE_subVarDecl = 66, RULE_initVariable = 67, 
		RULE_initArrays = 68, RULE_initStruct = 69, RULE_constDecl = 70, RULE_enumDecl = 71, 
		RULE_typedefDecl = 72;
	public static final String[] ruleNames = {
		"root", "mapfile", "mapsize", "world", "coordX", "coordY", "line", "element", 
		"program", "implDecl", "impKeyWord", "fileDecl", "fileName", "globalDecl", 
		"localDecl", "mainDecl", "mainProgram", "mainStart", "mainEnd", "mainRet", 
		"statements", "statement", "returnInstr", "affectInstr", "funcDecl", "funcArgs", 
		"funcArg", "funcCall", "funcCallArgs", "funcCallArg", "constantExpr", 
		"exprD", "operateurEntier", "exprEnt", "naturel", "exprBool", "boolVal", 
		"boolLiteral", "charVal", "exprG", "structRef", "members", "member", "arrayRef", 
		"conditionalStmt", "repeatStmt", "whileStmt", "ifStmt", "elseStmt", "loops", 
		"boolCondition", "repeatCondition", "actionType", "dig", "mytype", "scalar", 
		"arrays", "arrayIndex", "firstDimension", "secondDimension", "structDecl", 
		"structures", "listStructFields", "structField", "field", "varDecl", "subVarDecl", 
		"initVariable", "initArrays", "initStruct", "constDecl", "enumDecl", "typedefDecl"
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
			setState(150);
			match(MAPSTART);
			setState(151);
			mapsize();
			setState(152);
			world();
			setState(153);
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
			setState(155);
			coordX();
			setState(156);
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
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				line();
				}
				}
				setState(161); 
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
			setState(163);
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
			setState(165);
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
			setState(167);
			element();
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(170);
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
						setState(168);
						element();
						}
						break;
					case NEWLINE:
						{
						setState(169);
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
				setState(172); 
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
			setState(174);
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
			setState(176);
			implDecl();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(177);
				globalDecl();
				}
				break;
			}
			setState(180);
			mainProgram();
			setState(181);
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
			setState(183);
			impKeyWord();
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(184);
				match(DOUBLEQUOTE);
				setState(185);
				fileDecl();
				setState(186);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(188);
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
			setState(191);
			match(HASHTAG);
			setState(192);
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
			setState(194);
			fileName();
			setState(195);
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
			setState(197);
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
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(199);
						varDecl();
						}
						break;
					case 2:
						{
						setState(200);
						constDecl();
						}
						break;
					case 3:
						{
						setState(201);
						structDecl();
						}
						break;
					case 4:
						{
						setState(202);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(203);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(204);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(209);
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
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(210);
						varDecl();
						}
						break;
					case 2:
						{
						setState(211);
						constDecl();
						}
						break;
					case 3:
						{
						setState(212);
						structDecl();
						}
						break;
					case 4:
						{
						setState(213);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(214);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(215);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(220);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(221);
				varDecl();
				}
				break;
			case 2:
				{
				setState(222);
				constDecl();
				}
				break;
			case 3:
				{
				setState(223);
				structDecl();
				}
				break;
			case 4:
				{
				setState(224);
				enumDecl();
				}
				break;
			case 5:
				{
				setState(225);
				typedefDecl();
				}
				break;
			case 6:
				{
				setState(226);
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
			setState(229);
			mainStart();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(230);
				mainDecl();
				}
				break;
			}
			setState(233);
			statements();
			setState(234);
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
			setState(236);
			match(VOID);
			setState(237);
			match(MAIN);
			setState(238);
			match(LPAREN);
			setState(239);
			match(RPAREN);
			setState(240);
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
			setState(242);
			mainRet();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(243);
				statements();
				}
				break;
			}
			setState(246);
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
			setState(248);
			returnInstr();
			setState(249);
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
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
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
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				returnInstr();
				setState(257);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				affectInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				exprD();
				setState(261);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				constantExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(264);
				actionType();
				}
				setState(265);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				conditionalStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				repeatStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				whileStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
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
			setState(273);
			match(RETURN);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(274);
				exprG();
				}
				break;
			case 2:
				{
				setState(275);
				match(VOID);
				}
				break;
			case 3:
				{
				setState(276);
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
			setState(279);
			exprG();
			setState(280);
			match(AFFECT);
			setState(281);
			exprD();
			setState(282);
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
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
			case STRUCT:
				{
				setState(284);
				mytype();
				}
				break;
			case VOID:
				{
				setState(285);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(288);
			match(ID);
			setState(289);
			match(LPAREN);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				setState(290);
				funcArgs();
				}
			}

			setState(293);
			match(RPAREN);
			setState(294);
			match(LBRACE);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(295);
				localDecl();
				}
				break;
			}
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(298);
				statements();
				}
				break;
			}
			setState(301);
			returnInstr();
			setState(302);
			match(SEMICOLON);
			setState(303);
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
			setState(305);
			funcArg();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				funcArg();
				}
				}
				setState(312);
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
			setState(313);
			mytype();
			setState(314);
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
			setState(316);
			match(ID);
			setState(317);
			match(LPAREN);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(318);
				funcCallArgs();
				}
				break;
			}
			setState(321);
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
			setState(323);
			funcCallArg();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				funcCallArg();
				}
				}
				setState(330);
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
			setState(331);
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
			setState(333);
			constDecl();
			setState(334);
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
		public CharValContext charVal() {
			return getRuleContext(CharValContext.class,0);
		}
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
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				exprG();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				exprEnt(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				charVal();
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

	public static class OperateurEntierContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(PlayPlusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public TerminalNode POW() { return getToken(PlayPlusParser.POW, 0); }
		public OperateurEntierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateurEntier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterOperateurEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitOperateurEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitOperateurEntier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateurEntierContext operateurEntier() throws RecognitionException {
		OperateurEntierContext _localctx = new OperateurEntierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operateurEntier);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(MOD);
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(POW);
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
		public NaturelContext naturel() {
			return getRuleContext(NaturelContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public OperateurEntierContext operateurEntier() {
			return getRuleContext(OperateurEntierContext.class,0);
		}
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_exprEnt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(351);
				match(MINUS);
				setState(352);
				exprEnt(6);
				}
				break;
			case 2:
				{
				setState(353);
				exprG();
				}
				break;
			case 3:
				{
				setState(354);
				funcCall();
				}
				break;
			case 4:
				{
				setState(355);
				naturel();
				}
				break;
			case 5:
				{
				setState(356);
				match(LPAREN);
				setState(357);
				exprEnt(0);
				setState(358);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprEntContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
					setState(362);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(363);
					operateurEntier();
					setState(364);
					exprEnt(3);
					}
					} 
				}
				setState(370);
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

	public static class NaturelContext extends ParserRuleContext {
		public TerminalNode NATUREL() { return getToken(PlayPlusParser.NATUREL, 0); }
		public NaturelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNaturel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNaturel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNaturel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturelContext naturel() throws RecognitionException {
		NaturelContext _localctx = new NaturelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_naturel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
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
		public List<CharValContext> charVal() {
			return getRuleContexts(CharValContext.class);
		}
		public CharValContext charVal(int i) {
			return getRuleContext(CharValContext.class,i);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(PlayPlusParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PlayPlusParser.STRING, i);
		}
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(374);
				match(NOT);
				setState(375);
				exprBool(23);
				}
				break;
			case 3:
				{
				setState(376);
				match(LPAREN);
				setState(377);
				exprBool(0);
				setState(378);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(380);
				boolVal();
				}
				break;
			case 5:
				{
				setState(381);
				boolVal();
				setState(382);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				boolVal();
				}
				break;
			case 6:
				{
				setState(385);
				boolVal();
				setState(386);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				exprEnt(0);
				}
				break;
			case 7:
				{
				setState(389);
				exprEnt(0);
				setState(390);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				boolVal();
				}
				break;
			case 8:
				{
				setState(393);
				boolVal();
				setState(394);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(395);
				charVal();
				}
				break;
			case 9:
				{
				setState(397);
				charVal();
				setState(398);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				boolVal();
				}
				break;
			case 10:
				{
				setState(401);
				exprG();
				setState(402);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(403);
				charVal();
				}
				break;
			case 11:
				{
				setState(405);
				exprEnt(0);
				setState(406);
				match(SMALLER);
				setState(407);
				exprEnt(0);
				}
				break;
			case 12:
				{
				setState(409);
				exprEnt(0);
				setState(410);
				match(GREATER);
				setState(411);
				exprEnt(0);
				}
				break;
			case 13:
				{
				setState(413);
				exprEnt(0);
				setState(414);
				match(EGREATER);
				setState(415);
				exprEnt(0);
				}
				break;
			case 14:
				{
				setState(417);
				exprEnt(0);
				setState(418);
				match(ESMALLER);
				setState(419);
				exprEnt(0);
				}
				break;
			case 15:
				{
				setState(421);
				exprEnt(0);
				setState(422);
				match(EQUAL);
				setState(423);
				exprEnt(0);
				}
				break;
			case 16:
				{
				setState(425);
				exprEnt(0);
				setState(426);
				match(NOTEQUAL);
				setState(427);
				exprEnt(0);
				}
				break;
			case 17:
				{
				setState(429);
				match(STRING);
				setState(430);
				match(EQUAL);
				setState(431);
				match(STRING);
				}
				break;
			case 18:
				{
				setState(432);
				match(STRING);
				setState(433);
				match(NOTEQUAL);
				setState(434);
				match(STRING);
				}
				break;
			case 19:
				{
				setState(435);
				charVal();
				setState(436);
				match(EQUAL);
				setState(437);
				charVal();
				}
				break;
			case 20:
				{
				setState(439);
				charVal();
				setState(440);
				match(NOTEQUAL);
				setState(441);
				charVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(445);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(446);
						match(AND);
						setState(447);
						exprBool(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(448);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(449);
						match(EQUAL);
						setState(450);
						exprBool(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(451);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(452);
						match(NOTEQUAL);
						setState(453);
						exprBool(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(454);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(455);
						match(OR);
						setState(456);
						exprBool(2);
						}
						break;
					}
					} 
				}
				setState(461);
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
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_boolVal);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				boolLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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

	public static class CharValContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(PlayPlusParser.CHARACTER, 0); }
		public CharValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCharVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCharVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCharVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharValContext charVal() throws RecognitionException {
		CharValContext _localctx = new CharValContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_charVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(CHARACTER);
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
		enterRule(_localctx, 78, RULE_exprG);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				arrayRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
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
		enterRule(_localctx, 80, RULE_structRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(ID);
			setState(477);
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
		enterRule(_localctx, 82, RULE_members);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(DOT);
			setState(480);
			member();
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(DOT);
					setState(482);
					member();
					}
					} 
				}
				setState(487);
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
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(ID);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(489);
				arrays();
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
		enterRule(_localctx, 86, RULE_arrayRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ID);
			setState(493);
			match(LBRACKET);
			setState(494);
			firstDimension();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(495);
				match(COMMA);
				setState(496);
				secondDimension();
				}
			}

			setState(499);
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
		public BoolConditionContext boolCondition() {
			return getRuleContext(BoolConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(PlayPlusParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PlayPlusParser.LBRACE, i);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PlayPlusParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PlayPlusParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_conditionalStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(IF);
			setState(502);
			match(LPAREN);
			setState(503);
			boolCondition();
			setState(504);
			match(RPAREN);
			setState(505);
			match(LBRACE);
			setState(506);
			ifStmt();
			setState(507);
			match(RBRACE);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(508);
				match(ELSE);
				setState(509);
				match(LBRACE);
				setState(510);
				elseStmt();
				setState(511);
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
		public RepeatConditionContext repeatCondition() {
			return getRuleContext(RepeatConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
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
		enterRule(_localctx, 90, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(REPEAT);
			setState(516);
			match(LPAREN);
			setState(517);
			repeatCondition();
			setState(518);
			match(RPAREN);
			setState(519);
			match(LBRACE);
			setState(520);
			loops();
			setState(521);
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
		public StatementContext labelloop;
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public BoolConditionContext boolCondition() {
			return getRuleContext(BoolConditionContext.class,0);
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
		enterRule(_localctx, 92, RULE_whileStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(WHILE);
			setState(524);
			match(LPAREN);
			setState(525);
			boolCondition();
			setState(526);
			match(RPAREN);
			setState(527);
			match(LBRACE);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(528);
					((WhileStmtContext)_localctx).labelloop = statement();
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(534);
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

	public static class IfStmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					statement();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elseStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(542);
					statement();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class LoopsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_loops);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					statement();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class BoolConditionContext extends ParserRuleContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public BoolConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBoolCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBoolCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBoolCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConditionContext boolCondition() throws RecognitionException {
		BoolConditionContext _localctx = new BoolConditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_boolCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			exprBool(0);
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

	public static class RepeatConditionContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public RepeatConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRepeatCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRepeatCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRepeatCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatConditionContext repeatCondition() throws RecognitionException {
		RepeatConditionContext _localctx = new RepeatConditionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_repeatCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		enterRule(_localctx, 104, RULE_actionType);
		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(LEFT);
				setState(559);
				match(LPAREN);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(560);
					exprEnt(0);
					}
				}

				setState(563);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(RIGHT);
				setState(565);
				match(LPAREN);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(566);
					exprEnt(0);
					}
				}

				setState(569);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(UP);
				setState(571);
				match(LPAREN);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(572);
					exprEnt(0);
					}
				}

				setState(575);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				match(DOWN);
				setState(577);
				match(LPAREN);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(578);
					exprEnt(0);
					}
				}

				setState(581);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(FIGHT);
				setState(583);
				match(LPAREN);
				setState(584);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
				match(JUMP);
				setState(586);
				match(LPAREN);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(587);
					exprEnt(0);
					}
				}

				setState(590);
				match(RPAREN);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(591);
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
		enterRule(_localctx, 106, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(DIG);
			setState(595);
			match(LPAREN);
			setState(596);
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
		enterRule(_localctx, 108, RULE_mytype);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
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
		enterRule(_localctx, 110, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		enterRule(_localctx, 112, RULE_arrays);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(LBRACKET);
			setState(605);
			arrayIndex();
			setState(606);
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
		enterRule(_localctx, 114, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			firstDimension();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(609);
				match(COMMA);
				setState(610);
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
		enterRule(_localctx, 116, RULE_firstDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
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
		enterRule(_localctx, 118, RULE_secondDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
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
		enterRule(_localctx, 120, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
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
		enterRule(_localctx, 122, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(STRUCT);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(620);
				match(ID);
				}
			}

			setState(623);
			match(LBRACE);
			setState(624);
			listStructFields();
			setState(625);
			match(RBRACE);
			setState(626);
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
		enterRule(_localctx, 124, RULE_listStructFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(628);
				structField();
				}
				}
				setState(631); 
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
		enterRule(_localctx, 126, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(633);
				field();
				}
				break;
			case 2:
				{
				setState(634);
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
		enterRule(_localctx, 128, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			mytype();
			setState(638);
			match(ID);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(639);
				arrays();
				}
			}

			setState(642);
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
		enterRule(_localctx, 130, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			mytype();
			setState(645);
			subVarDecl();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646);
				match(COMMA);
				setState(647);
				subVarDecl();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
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
		enterRule(_localctx, 132, RULE_subVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(ID);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(656);
				arrays();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(659);
				match(AFFECT);
				setState(660);
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
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public CharValContext charVal() {
			return getRuleContext(CharValContext.class,0);
		}
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
		enterRule(_localctx, 134, RULE_initVariable);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				boolLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				charVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				exprEnt(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(667);
				exprBool(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(668);
				initArrays();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(669);
				initStruct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(670);
				match(LPAREN);
				setState(671);
				initVariable();
				setState(672);
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
		enterRule(_localctx, 136, RULE_initArrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(LBRACE);
			{
			setState(677);
			initVariable();
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(678);
				match(COMMA);
				setState(679);
				initVariable();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
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
		enterRule(_localctx, 138, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		enterRule(_localctx, 140, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(CONST);
			setState(690);
			mytype();
			setState(691);
			match(ID);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(692);
				arrays();
				}
			}

			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(695);
				match(AFFECT);
				setState(696);
				initVariable();
				}
				}
			}

			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(699);
				match(COMMA);
				setState(700);
				match(ID);
				{
				setState(701);
				arrays();
				}
				}
			}

			setState(704);
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
		enterRule(_localctx, 142, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(ENUM);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(707);
				match(ID);
				}
			}

			setState(710);
			match(LBRACE);
			setState(711);
			match(ID);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(712);
					match(COMMA);
					setState(713);
					match(ID);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(719);
			match(RBRACE);
			setState(720);
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
		enterRule(_localctx, 144, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(TYPEDEF);
			setState(723);
			mytype();
			setState(724);
			match(ID);
			setState(725);
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
		case 33:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 35:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u02da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\5\2\u0097\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6"+
		"\5\u00a2\n\5\r\5\16\5\u00a3\3\6\3\6\3\7\3\7\3\b\3\b\3\b\6\b\u00ad\n\b"+
		"\r\b\16\b\u00ae\3\t\3\t\3\n\3\n\5\n\u00b5\n\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00db\n\20\f\20\16\20\u00de\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\5\22\u00ea\n\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00f7\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\6\26\u00ff\n\26\r\26\16\26\u0100\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0112\n\27\3\30\3\30\3\30\3\30\5\30\u0118\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\5\32\u0121\n\32\3\32\3\32\3\32\5\32\u0126\n\32\3\32\3"+
		"\32\3\32\5\32\u012b\n\32\3\32\5\32\u012e\n\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u0137\n\33\f\33\16\33\u013a\13\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u0142\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0149\n\36\f"+
		"\36\16\36\u014c\13\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0159\n"+
		"!\3\"\3\"\3\"\3\"\5\"\u015f\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u016b"+
		"\n#\3#\3#\3#\3#\7#\u0171\n#\f#\16#\u0174\13#\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01be\n%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01cc\n%\f%\16%\u01cf\13%\3&\3&\3&"+
		"\5&\u01d4\n&\3\'\3\'\3(\3(\3)\3)\3)\5)\u01dd\n)\3*\3*\3*\3+\3+\3+\3+\7"+
		"+\u01e6\n+\f+\16+\u01e9\13+\3,\3,\5,\u01ed\n,\3-\3-\3-\3-\3-\5-\u01f4"+
		"\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0204\n.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0214\n\60\f\60\16\60"+
		"\u0217\13\60\3\60\3\60\3\61\7\61\u021c\n\61\f\61\16\61\u021f\13\61\3\62"+
		"\7\62\u0222\n\62\f\62\16\62\u0225\13\62\3\63\7\63\u0228\n\63\f\63\16\63"+
		"\u022b\13\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\5\66\u0234\n\66\3\66\3"+
		"\66\3\66\3\66\5\66\u023a\n\66\3\66\3\66\3\66\3\66\5\66\u0240\n\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0246\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u024f\n\66\3\66\3\66\5\66\u0253\n\66\3\67\3\67\3\67\3\67\38\38\58\u025b"+
		"\n8\39\39\3:\3:\3:\3:\3;\3;\3;\5;\u0266\n;\3<\3<\3=\3=\3>\3>\3?\3?\5?"+
		"\u0270\n?\3?\3?\3?\3?\3?\3@\6@\u0278\n@\r@\16@\u0279\3A\3A\5A\u027e\n"+
		"A\3B\3B\3B\5B\u0283\nB\3B\3B\3C\3C\3C\3C\7C\u028b\nC\fC\16C\u028e\13C"+
		"\3C\3C\3D\3D\5D\u0294\nD\3D\3D\5D\u0298\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\5E\u02a5\nE\3F\3F\3F\3F\7F\u02ab\nF\fF\16F\u02ae\13F\3F\3F\3G\3"+
		"G\3H\3H\3H\3H\5H\u02b8\nH\3H\3H\5H\u02bc\nH\3H\3H\3H\5H\u02c1\nH\3H\3"+
		"H\3I\3I\5I\u02c7\nI\3I\3I\3I\3I\7I\u02cd\nI\fI\16I\u02d0\13I\3I\3I\3I"+
		"\3J\3J\3J\3J\3J\3J\3\u02ce\4DHK\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2\b\3\2EN\3\2\37 \3\2"+
		"!\"\4\2%%(,\3\2\n\13\3\2\24\26\u030c\2\u0096\3\2\2\2\4\u0098\3\2\2\2\6"+
		"\u009d\3\2\2\2\b\u00a1\3\2\2\2\n\u00a5\3\2\2\2\f\u00a7\3\2\2\2\16\u00a9"+
		"\3\2\2\2\20\u00b0\3\2\2\2\22\u00b2\3\2\2\2\24\u00b9\3\2\2\2\26\u00c1\3"+
		"\2\2\2\30\u00c4\3\2\2\2\32\u00c7\3\2\2\2\34\u00d1\3\2\2\2\36\u00dc\3\2"+
		"\2\2 \u00e5\3\2\2\2\"\u00e7\3\2\2\2$\u00ee\3\2\2\2&\u00f4\3\2\2\2(\u00fa"+
		"\3\2\2\2*\u00fe\3\2\2\2,\u0111\3\2\2\2.\u0113\3\2\2\2\60\u0119\3\2\2\2"+
		"\62\u0120\3\2\2\2\64\u0133\3\2\2\2\66\u013b\3\2\2\28\u013e\3\2\2\2:\u0145"+
		"\3\2\2\2<\u014d\3\2\2\2>\u014f\3\2\2\2@\u0158\3\2\2\2B\u015e\3\2\2\2D"+
		"\u016a\3\2\2\2F\u0175\3\2\2\2H\u01bd\3\2\2\2J\u01d3\3\2\2\2L\u01d5\3\2"+
		"\2\2N\u01d7\3\2\2\2P\u01dc\3\2\2\2R\u01de\3\2\2\2T\u01e1\3\2\2\2V\u01ea"+
		"\3\2\2\2X\u01ee\3\2\2\2Z\u01f7\3\2\2\2\\\u0205\3\2\2\2^\u020d\3\2\2\2"+
		"`\u021d\3\2\2\2b\u0223\3\2\2\2d\u0229\3\2\2\2f\u022c\3\2\2\2h\u022e\3"+
		"\2\2\2j\u0252\3\2\2\2l\u0254\3\2\2\2n\u025a\3\2\2\2p\u025c\3\2\2\2r\u025e"+
		"\3\2\2\2t\u0262\3\2\2\2v\u0267\3\2\2\2x\u0269\3\2\2\2z\u026b\3\2\2\2|"+
		"\u026d\3\2\2\2~\u0277\3\2\2\2\u0080\u027d\3\2\2\2\u0082\u027f\3\2\2\2"+
		"\u0084\u0286\3\2\2\2\u0086\u0291\3\2\2\2\u0088\u02a4\3\2\2\2\u008a\u02a6"+
		"\3\2\2\2\u008c\u02b1\3\2\2\2\u008e\u02b3\3\2\2\2\u0090\u02c4\3\2\2\2\u0092"+
		"\u02d4\3\2\2\2\u0094\u0097\5\22\n\2\u0095\u0097\5\4\3\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\3\3\2\2\2\u0098\u0099\7A\2\2\u0099\u009a"+
		"\5\6\4\2\u009a\u009b\5\b\5\2\u009b\u009c\7\2\2\3\u009c\5\3\2\2\2\u009d"+
		"\u009e\5\n\6\2\u009e\u009f\5\f\7\2\u009f\7\3\2\2\2\u00a0\u00a2\5\16\b"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a6\7\33\2\2\u00a6\13\3\2\2\2\u00a7\u00a8"+
		"\7\33\2\2\u00a8\r\3\2\2\2\u00a9\u00ac\5\20\t\2\u00aa\u00ad\5\20\t\2\u00ab"+
		"\u00ad\7?\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00b1"+
		"\t\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00b5\5\34\17\2"+
		"\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\5\"\22\2\u00b7\u00b8\7\2\2\3\u00b8\23\3\2\2\2\u00b9\u00bf\5\26\f\2\u00ba"+
		"\u00bb\7P\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7P\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00c0\7\34\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\25\3\2\2\2\u00c1\u00c2\7B\2\2\u00c2\u00c3\7\f\2\2\u00c3\27\3\2\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00c6\7D\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7O\2"+
		"\2\u00c8\33\3\2\2\2\u00c9\u00d0\5\u0084C\2\u00ca\u00d0\5\u008eH\2\u00cb"+
		"\u00d0\5z>\2\u00cc\u00d0\5\u0090I\2\u00cd\u00d0\5\u0092J\2\u00ce\u00d0"+
		"\5\62\32\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2"+
		"\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\35\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00db\5\u0084C\2\u00d5\u00db\5\u008eH\2\u00d6\u00db"+
		"\5z>\2\u00d7\u00db\5\u0090I\2\u00d8\u00db\5\u0092J\2\u00d9\u00db\5\62"+
		"\32\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\37\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e6\5\u0084C\2\u00e0\u00e6\5\u008eH\2\u00e1\u00e6\5z"+
		">\2\u00e2\u00e6\5\u0090I\2\u00e3\u00e6\5\u0092J\2\u00e4\u00e6\5\62\32"+
		"\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6!\3\2\2\2\u00e7"+
		"\u00e9\5$\23\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\5&\24\2\u00ed"+
		"#\3\2\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\7-\2\2\u00f1"+
		"\u00f2\7.\2\2\u00f2\u00f3\7/\2\2\u00f3%\3\2\2\2\u00f4\u00f6\5(\25\2\u00f5"+
		"\u00f7\5*\26\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\7\60\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc"+
		"\7\65\2\2\u00fc)\3\2\2\2\u00fd\u00ff\5,\27\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101+\3\2\2\2"+
		"\u0102\u0103\5.\30\2\u0103\u0104\7\65\2\2\u0104\u0112\3\2\2\2\u0105\u0112"+
		"\5\60\31\2\u0106\u0107\5@!\2\u0107\u0108\7\65\2\2\u0108\u0112\3\2\2\2"+
		"\u0109\u0112\5> \2\u010a\u010b\5j\66\2\u010b\u010c\7\65\2\2\u010c\u0112"+
		"\3\2\2\2\u010d\u0112\5Z.\2\u010e\u0112\5\\/\2\u010f\u0112\5^\60\2\u0110"+
		"\u0112\5 \21\2\u0111\u0102\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u0106\3\2"+
		"\2\2\u0111\u0109\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112-\3\2\2\2"+
		"\u0113\u0117\7C\2\2\u0114\u0118\5P)\2\u0115\u0118\7\4\2\2\u0116\u0118"+
		"\5@!\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"/\3\2\2\2\u0119\u011a\5P)\2\u011a\u011b\7&\2\2\u011b\u011c\5@!\2\u011c"+
		"\u011d\7\65\2\2\u011d\61\3\2\2\2\u011e\u0121\5n8\2\u011f\u0121\7\4\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123"+
		"\7O\2\2\u0123\u0125\7-\2\2\u0124\u0126\5\64\33\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7.\2\2\u0128\u012a\7/\2"+
		"\2\u0129\u012b\5\36\20\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012e\5*\26\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5.\30\2\u0130\u0131\7\65\2\2\u0131"+
		"\u0132\7\60\2\2\u0132\63\3\2\2\2\u0133\u0138\5\66\34\2\u0134\u0135\7\67"+
		"\2\2\u0135\u0137\5\66\34\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\65\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013b\u013c\5n8\2\u013c\u013d\5P)\2\u013d\67\3\2\2\2\u013e\u013f\7"+
		"O\2\2\u013f\u0141\7-\2\2\u0140\u0142\5:\36\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7.\2\2\u01449\3\2\2\2\u0145"+
		"\u014a\5<\37\2\u0146\u0147\7\67\2\2\u0147\u0149\5<\37\2\u0148\u0146\3"+
		"\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		";\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5@!\2\u014e=\3\2\2\2\u014f\u0150"+
		"\5\u008eH\2\u0150\u0151\7\65\2\2\u0151?\3\2\2\2\u0152\u0159\58\35\2\u0153"+
		"\u0159\5P)\2\u0154\u0159\5D#\2\u0155\u0159\5H%\2\u0156\u0159\7\35\2\2"+
		"\u0157\u0159\5N(\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154"+
		"\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"A\3\2\2\2\u015a\u015f\t\3\2\2\u015b\u015f\t\4\2\2\u015c\u015f\7#\2\2\u015d"+
		"\u015f\7$\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015d\3\2\2\2\u015fC\3\2\2\2\u0160\u0161\b#\1\2\u0161\u0162"+
		"\7 \2\2\u0162\u016b\5D#\b\u0163\u016b\5P)\2\u0164\u016b\58\35\2\u0165"+
		"\u016b\5F$\2\u0166\u0167\7-\2\2\u0167\u0168\5D#\2\u0168\u0169\7.\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2"+
		"\2\2\u016a\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u0172\3\2\2\2\u016c"+
		"\u016d\f\4\2\2\u016d\u016e\5B\"\2\u016e\u016f\5D#\5\u016f\u0171\3\2\2"+
		"\2\u0170\u016c\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173E\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\33\2\2\u0176"+
		"G\3\2\2\2\u0177\u01be\b%\1\2\u0178\u0179\7\'\2\2\u0179\u01be\5H%\31\u017a"+
		"\u017b\7-\2\2\u017b\u017c\5H%\2\u017c\u017d\7.\2\2\u017d\u01be\3\2\2\2"+
		"\u017e\u01be\5J&\2\u017f\u0180\5J&\2\u0180\u0181\t\5\2\2\u0181\u0182\5"+
		"J&\2\u0182\u01be\3\2\2\2\u0183\u0184\5J&\2\u0184\u0185\t\5\2\2\u0185\u0186"+
		"\5D#\2\u0186\u01be\3\2\2\2\u0187\u0188\5D#\2\u0188\u0189\t\5\2\2\u0189"+
		"\u018a\5J&\2\u018a\u01be\3\2\2\2\u018b\u018c\5J&\2\u018c\u018d\t\5\2\2"+
		"\u018d\u018e\5N(\2\u018e\u01be\3\2\2\2\u018f\u0190\5N(\2\u0190\u0191\t"+
		"\5\2\2\u0191\u0192\5J&\2\u0192\u01be\3\2\2\2\u0193\u0194\5P)\2\u0194\u0195"+
		"\t\5\2\2\u0195\u0196\5N(\2\u0196\u01be\3\2\2\2\u0197\u0198\5D#\2\u0198"+
		"\u0199\7)\2\2\u0199\u019a\5D#\2\u019a\u01be\3\2\2\2\u019b\u019c\5D#\2"+
		"\u019c\u019d\7*\2\2\u019d\u019e\5D#\2\u019e\u01be\3\2\2\2\u019f\u01a0"+
		"\5D#\2\u01a0\u01a1\7+\2\2\u01a1\u01a2\5D#\2\u01a2\u01be\3\2\2\2\u01a3"+
		"\u01a4\5D#\2\u01a4\u01a5\7,\2\2\u01a5\u01a6\5D#\2\u01a6\u01be\3\2\2\2"+
		"\u01a7\u01a8\5D#\2\u01a8\u01a9\7%\2\2\u01a9\u01aa\5D#\2\u01aa\u01be\3"+
		"\2\2\2\u01ab\u01ac\5D#\2\u01ac\u01ad\7(\2\2\u01ad\u01ae\5D#\2\u01ae\u01be"+
		"\3\2\2\2\u01af\u01b0\7\35\2\2\u01b0\u01b1\7%\2\2\u01b1\u01be\7\35\2\2"+
		"\u01b2\u01b3\7\35\2\2\u01b3\u01b4\7(\2\2\u01b4\u01be\7\35\2\2\u01b5\u01b6"+
		"\5N(\2\u01b6\u01b7\7%\2\2\u01b7\u01b8\5N(\2\u01b8\u01be\3\2\2\2\u01b9"+
		"\u01ba\5N(\2\u01ba\u01bb\7(\2\2\u01bb\u01bc\5N(\2\u01bc\u01be\3\2\2\2"+
		"\u01bd\u0177\3\2\2\2\u01bd\u0178\3\2\2\2\u01bd\u017a\3\2\2\2\u01bd\u017e"+
		"\3\2\2\2\u01bd\u017f\3\2\2\2\u01bd\u0183\3\2\2\2\u01bd\u0187\3\2\2\2\u01bd"+
		"\u018b\3\2\2\2\u01bd\u018f\3\2\2\2\u01bd\u0193\3\2\2\2\u01bd\u0197\3\2"+
		"\2\2\u01bd\u019b\3\2\2\2\u01bd\u019f\3\2\2\2\u01bd\u01a3\3\2\2\2\u01bd"+
		"\u01a7\3\2\2\2\u01bd\u01ab\3\2\2\2\u01bd\u01af\3\2\2\2\u01bd\u01b2\3\2"+
		"\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01cd\3\2\2\2\u01bf"+
		"\u01c0\f\6\2\2\u01c0\u01c1\79\2\2\u01c1\u01cc\5H%\7\u01c2\u01c3\f\5\2"+
		"\2\u01c3\u01c4\7%\2\2\u01c4\u01cc\5H%\6\u01c5\u01c6\f\4\2\2\u01c6\u01c7"+
		"\7(\2\2\u01c7\u01cc\5H%\5\u01c8\u01c9\f\3\2\2\u01c9\u01ca\7:\2\2\u01ca"+
		"\u01cc\5H%\4\u01cb\u01bf\3\2\2\2\u01cb\u01c2\3\2\2\2\u01cb\u01c5\3\2\2"+
		"\2\u01cb\u01c8\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ceI\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d4\5L\'\2\u01d1\u01d4"+
		"\58\35\2\u01d2\u01d4\5P)\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4K\3\2\2\2\u01d5\u01d6\t\6\2\2\u01d6M\3\2\2\2\u01d7"+
		"\u01d8\7\36\2\2\u01d8O\3\2\2\2\u01d9\u01dd\7O\2\2\u01da\u01dd\5X-\2\u01db"+
		"\u01dd\5R*\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2"+
		"\2\u01ddQ\3\2\2\2\u01de\u01df\7O\2\2\u01df\u01e0\5T+\2\u01e0S\3\2\2\2"+
		"\u01e1\u01e2\78\2\2\u01e2\u01e7\5V,\2\u01e3\u01e4\78\2\2\u01e4\u01e6\5"+
		"V,\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8U\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\7O\2\2\u01eb"+
		"\u01ed\5r:\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edW\3\2\2\2\u01ee"+
		"\u01ef\7O\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f3\5v<\2\u01f1\u01f2\7\67"+
		"\2\2\u01f2\u01f4\5x=\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f6\7\62\2\2\u01f6Y\3\2\2\2\u01f7\u01f8\7\5\2\2\u01f8"+
		"\u01f9\7-\2\2\u01f9\u01fa\5f\64\2\u01fa\u01fb\7.\2\2\u01fb\u01fc\7/\2"+
		"\2\u01fc\u01fd\5`\61\2\u01fd\u0203\7\60\2\2\u01fe\u01ff\7\6\2\2\u01ff"+
		"\u0200\7/\2\2\u0200\u0201\5b\62\2\u0201\u0202\7\60\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u01fe\3\2\2\2\u0203\u0204\3\2\2\2\u0204[\3\2\2\2\u0205\u0206"+
		"\7\b\2\2\u0206\u0207\7-\2\2\u0207\u0208\5h\65\2\u0208\u0209\7.\2\2\u0209"+
		"\u020a\7/\2\2\u020a\u020b\5d\63\2\u020b\u020c\7\60\2\2\u020c]\3\2\2\2"+
		"\u020d\u020e\7\t\2\2\u020e\u020f\7-\2\2\u020f\u0210\5f\64\2\u0210\u0211"+
		"\7.\2\2\u0211\u0215\7/\2\2\u0212\u0214\5,\27\2\u0213\u0212\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7\60\2\2\u0219_\3\2\2\2\u021a\u021c"+
		"\5,\27\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021ea\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5,\27\2"+
		"\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224c\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\5,\27\2\u0227"+
		"\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022ae\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\5H%\2\u022dg\3\2\2"+
		"\2\u022e\u022f\5D#\2\u022fi\3\2\2\2\u0230\u0231\7\r\2\2\u0231\u0233\7"+
		"-\2\2\u0232\u0234\5D#\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0253\7.\2\2\u0236\u0237\7\16\2\2\u0237\u0239\7-"+
		"\2\2\u0238\u023a\5D#\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u0253\7.\2\2\u023c\u023d\7\17\2\2\u023d\u023f\7-\2\2\u023e"+
		"\u0240\5D#\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2"+
		"\2\u0241\u0253\7.\2\2\u0242\u0243\7\20\2\2\u0243\u0245\7-\2\2\u0244\u0246"+
		"\5D#\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0253\7.\2\2\u0248\u0249\7\22\2\2\u0249\u024a\7-\2\2\u024a\u0253\7.\2"+
		"\2\u024b\u024c\7\21\2\2\u024c\u024e\7-\2\2\u024d\u024f\5D#\2\u024e\u024d"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0253\7.\2\2\u0251"+
		"\u0253\5l\67\2\u0252\u0230\3\2\2\2\u0252\u0236\3\2\2\2\u0252\u023c\3\2"+
		"\2\2\u0252\u0242\3\2\2\2\u0252\u0248\3\2\2\2\u0252\u024b\3\2\2\2\u0252"+
		"\u0251\3\2\2\2\u0253k\3\2\2\2\u0254\u0255\7\23\2\2\u0255\u0256\7-\2\2"+
		"\u0256\u0257\7.\2\2\u0257m\3\2\2\2\u0258\u025b\5p9\2\u0259\u025b\5|?\2"+
		"\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025bo\3\2\2\2\u025c\u025d\t"+
		"\7\2\2\u025dq\3\2\2\2\u025e\u025f\7\61\2\2\u025f\u0260\5t;\2\u0260\u0261"+
		"\7\62\2\2\u0261s\3\2\2\2\u0262\u0265\5v<\2\u0263\u0264\7\67\2\2\u0264"+
		"\u0266\5x=\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266u\3\2\2\2\u0267"+
		"\u0268\5D#\2\u0268w\3\2\2\2\u0269\u026a\5D#\2\u026ay\3\2\2\2\u026b\u026c"+
		"\5|?\2\u026c{\3\2\2\2\u026d\u026f\7\27\2\2\u026e\u0270\7O\2\2\u026f\u026e"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7/\2\2\u0272"+
		"\u0273\5~@\2\u0273\u0274\7\60\2\2\u0274\u0275\7\65\2\2\u0275}\3\2\2\2"+
		"\u0276\u0278\5\u0080A\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\177\3\2\2\2\u027b\u027e\5\u0082"+
		"B\2\u027c\u027e\5z>\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u0081"+
		"\3\2\2\2\u027f\u0280\5n8\2\u0280\u0282\7O\2\2\u0281\u0283\5r:\2\u0282"+
		"\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\7\65"+
		"\2\2\u0285\u0083\3\2\2\2\u0286\u0287\5n8\2\u0287\u028c\5\u0086D\2\u0288"+
		"\u0289\7\67\2\2\u0289\u028b\5\u0086D\2\u028a\u0288\3\2\2\2\u028b\u028e"+
		"\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0290\7\65\2\2\u0290\u0085\3\2\2\2\u0291\u0293\7"+
		"O\2\2\u0292\u0294\5r:\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0296\7&\2\2\u0296\u0298\5\u0088E\2\u0297\u0295\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\u0087\3\2\2\2\u0299\u02a5\5L\'\2\u029a"+
		"\u02a5\7\35\2\2\u029b\u02a5\5N(\2\u029c\u02a5\5D#\2\u029d\u02a5\5H%\2"+
		"\u029e\u02a5\5\u008aF\2\u029f\u02a5\5\u008cG\2\u02a0\u02a1\7-\2\2\u02a1"+
		"\u02a2\5\u0088E\2\u02a2\u02a3\7.\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0299\3"+
		"\2\2\2\u02a4\u029a\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4"+
		"\u029d\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a0\3\2"+
		"\2\2\u02a5\u0089\3\2\2\2\u02a6\u02a7\7/\2\2\u02a7\u02ac\5\u0088E\2\u02a8"+
		"\u02a9\7\67\2\2\u02a9\u02ab\5\u0088E\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\7\60\2\2\u02b0\u008b\3\2\2\2\u02b1\u02b2\5"+
		"z>\2\u02b2\u008d\3\2\2\2\u02b3\u02b4\7\30\2\2\u02b4\u02b5\5n8\2\u02b5"+
		"\u02b7\7O\2\2\u02b6\u02b8\5r:\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2"+
		"\2\u02b8\u02bb\3\2\2\2\u02b9\u02ba\7&\2\2\u02ba\u02bc\5\u0088E\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c0\3\2\2\2\u02bd\u02be\7\67"+
		"\2\2\u02be\u02bf\7O\2\2\u02bf\u02c1\5r:\2\u02c0\u02bd\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\7\65\2\2\u02c3\u008f\3\2\2\2"+
		"\u02c4\u02c6\7\31\2\2\u02c5\u02c7\7O\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7/\2\2\u02c9\u02ce\7O\2\2\u02ca"+
		"\u02cb\7\67\2\2\u02cb\u02cd\7O\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1\u02d2\7\60\2\2\u02d2\u02d3\7\65\2\2\u02d3\u0091\3"+
		"\2\2\2\u02d4\u02d5\7\32\2\2\u02d5\u02d6\5n8\2\u02d6\u02d7\7O\2\2\u02d7"+
		"\u02d8\7\65\2\2\u02d8\u0093\3\2\2\2@\u0096\u00a3\u00ac\u00ae\u00b4\u00bf"+
		"\u00cf\u00d1\u00da\u00dc\u00e5\u00e9\u00f6\u0100\u0111\u0117\u0120\u0125"+
		"\u012a\u012d\u0138\u0141\u014a\u0158\u015e\u016a\u0172\u01bd\u01cb\u01cd"+
		"\u01d3\u01dc\u01e7\u01ec\u01f3\u0203\u0215\u021d\u0223\u0229\u0233\u0239"+
		"\u023f\u0245\u024e\u0252\u025a\u0265\u026f\u0279\u027d\u0282\u028c\u0293"+
		"\u0297\u02a4\u02ac\u02b7\u02bb\u02c0\u02c6\u02ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}