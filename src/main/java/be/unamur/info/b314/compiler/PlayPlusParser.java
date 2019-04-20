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
		RULE_funcArg = 26, RULE_funcCall = 27, RULE_constantExpr = 28, RULE_exprD = 29, 
		RULE_exprEnt = 30, RULE_exprBool = 31, RULE_exprG = 32, RULE_conditionalStmt = 33, 
		RULE_repeatStmt = 34, RULE_whileStmt = 35, RULE_actionType = 36, RULE_dig = 37, 
		RULE_structRef = 38, RULE_member = 39, RULE_mytype = 40, RULE_scalar = 41, 
		RULE_structures = 42, RULE_arrays = 43, RULE_structDecl = 44, RULE_listStructFields = 45, 
		RULE_structField = 46, RULE_fieldDecl = 47, RULE_varDecl = 48, RULE_arrayDecl = 49, 
		RULE_subVarDecl = 50, RULE_subArrayDecl = 51, RULE_initVariable = 52, 
		RULE_initArrays = 53, RULE_initStruct = 54, RULE_constDecl = 55, RULE_enumDecl = 56, 
		RULE_typedefDecl = 57;
	public static final String[] ruleNames = {
		"root", "mapfile", "mapsize", "world", "coordX", "coordY", "line", "element", 
		"program", "implDecl", "impKeyWord", "fileDecl", "fileName", "globalDecl", 
		"localDecl", "mainDecl", "mainProgram", "mainStart", "mainEnd", "mainRet", 
		"statements", "statement", "returnInstr", "affectInstr", "funcDecl", "funcArgs", 
		"funcArg", "funcCall", "constantExpr", "exprD", "exprEnt", "exprBool", 
		"exprG", "conditionalStmt", "repeatStmt", "whileStmt", "actionType", "dig", 
		"structRef", "member", "mytype", "scalar", "structures", "arrays", "structDecl", 
		"listStructFields", "structField", "fieldDecl", "varDecl", "arrayDecl", 
		"subVarDecl", "subArrayDecl", "initVariable", "initArrays", "initStruct", 
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				program();
				}
				break;
			case MAPSTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
			setState(120);
			match(MAPSTART);
			setState(121);
			mapsize();
			setState(122);
			world();
			setState(123);
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
			setState(125);
			coordX();
			setState(126);
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
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				line();
				}
				}
				setState(131); 
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
			setState(133);
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
			setState(135);
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
			setState(137);
			element();
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(140);
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
						setState(138);
						element();
						}
						break;
					case NEWLINE:
						{
						setState(139);
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
				setState(142); 
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
			setState(144);
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
			setState(146);
			implDecl();
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(147);
				globalDecl();
				}
				break;
			}
			setState(150);
			mainProgram();
			setState(151);
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
			setState(153);
			impKeyWord();
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLEQUOTE:
				{
				setState(154);
				match(DOUBLEQUOTE);
				setState(155);
				fileDecl();
				setState(156);
				match(DOUBLEQUOTE);
				}
				break;
			case FILE:
				{
				setState(158);
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
			setState(161);
			match(HASHTAG);
			setState(162);
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
			setState(164);
			fileName();
			setState(165);
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
			setState(167);
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
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(169);
						varDecl();
						}
						break;
					case 2:
						{
						setState(170);
						constDecl();
						}
						break;
					case 3:
						{
						setState(171);
						structDecl();
						}
						break;
					case 4:
						{
						setState(172);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(173);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(174);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(179);
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
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(180);
						varDecl();
						}
						break;
					case 2:
						{
						setState(181);
						constDecl();
						}
						break;
					case 3:
						{
						setState(182);
						structDecl();
						}
						break;
					case 4:
						{
						setState(183);
						enumDecl();
						}
						break;
					case 5:
						{
						setState(184);
						typedefDecl();
						}
						break;
					case 6:
						{
						setState(185);
						funcDecl();
						}
						break;
					}
					} 
				}
				setState(190);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(191);
				varDecl();
				}
				break;
			case 2:
				{
				setState(192);
				constDecl();
				}
				break;
			case 3:
				{
				setState(193);
				structDecl();
				}
				break;
			case 4:
				{
				setState(194);
				enumDecl();
				}
				break;
			case 5:
				{
				setState(195);
				typedefDecl();
				}
				break;
			case 6:
				{
				setState(196);
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
			setState(199);
			mainStart();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(200);
				mainDecl();
				}
				break;
			}
			setState(203);
			statements();
			setState(204);
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
			setState(206);
			match(VOID);
			setState(207);
			match(MAIN);
			setState(208);
			match(LPAREN);
			setState(209);
			match(RPAREN);
			setState(210);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			mainRet();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				setState(213);
				statements();
				}
			}

			setState(216);
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
			setState(218);
			returnInstr();
			setState(219);
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
			setState(222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); 
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				returnInstr();
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				affectInstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				exprD();
				setState(231);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				constantExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(234);
				actionType();
				}
				setState(235);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				conditionalStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				repeatStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				whileStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
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
			setState(243);
			match(RETURN);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(244);
				exprG(0);
				}
				break;
			case 2:
				{
				setState(245);
				match(VOID);
				}
				break;
			case 3:
				{
				setState(246);
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
			setState(249);
			exprG(0);
			setState(250);
			match(AFFECT);
			setState(251);
			exprD();
			setState(252);
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
			case STRUCT:
				{
				setState(254);
				mytype();
				}
				break;
			case VOID:
				{
				setState(255);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			match(ID);
			setState(259);
			match(LPAREN);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				setState(260);
				funcArgs();
				}
			}

			setState(263);
			match(RPAREN);
			setState(264);
			match(LBRACE);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(265);
				localDecl();
				}
				break;
			}
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(268);
				statements();
				}
				break;
			}
			setState(271);
			returnInstr();
			setState(272);
			match(SEMICOLON);
			setState(273);
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
			setState(275);
			funcArg();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				funcArg();
				}
				}
				setState(282);
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
			setState(283);
			mytype();
			setState(284);
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
		enterRule(_localctx, 54, RULE_funcCall);
		int _la;
		try {
			int _alt;
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(ID);
				setState(287);
				match(LPAREN);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(288);
					exprD();
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(289);
						match(COMMA);
						setState(290);
						exprD();
						}
						}
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(298);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(ID);
				setState(300);
				match(LPAREN);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(301);
					exprD();
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(302);
						match(COMMA);
						setState(303);
						exprD();
						}
						}
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(311);
				match(RPAREN);
				setState(312);
				match(RPAREN);
				notifyErrorListeners("Too many parentheses");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(ID);
				setState(315);
				match(LPAREN);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(316);
					exprD();
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(317);
							match(COMMA);
							setState(318);
							exprD();
							}
							} 
						}
						setState(323);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 56, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			constDecl();
			setState(330);
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
		enterRule(_localctx, 58, RULE_exprD);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				exprG(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				exprEnt(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(341);
				match(MINUS);
				setState(342);
				exprEnt(7);
				}
				break;
			case ID:
				{
				setState(343);
				exprG(0);
				}
				break;
			case NATUREL:
				{
				setState(344);
				match(NATUREL);
				}
				break;
			case LPAREN:
				{
				setState(345);
				match(LPAREN);
				setState(346);
				exprEnt(0);
				setState(347);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(351);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(352);
						match(MOD);
						setState(353);
						exprEnt(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(354);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(355);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
						exprEnt(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(357);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(358);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(364);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayPlusParser.NOTEQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(PlayPlusParser.GREATER, 0); }
		public TerminalNode EGREATER() { return getToken(PlayPlusParser.EGREATER, 0); }
		public TerminalNode ESMALLER() { return getToken(PlayPlusParser.ESMALLER, 0); }
		public List<TerminalNode> CHARACTER() { return getTokens(PlayPlusParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(PlayPlusParser.CHARACTER, i);
		}
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(366);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(367);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(368);
				exprG(0);
				}
				break;
			case 4:
				{
				setState(369);
				exprG(0);
				setState(370);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << SMALLER) | (1L << GREATER) | (1L << EGREATER) | (1L << ESMALLER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				exprG(0);
				}
				break;
			case 5:
				{
				setState(373);
				exprG(0);
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
			case 6:
				{
				setState(377);
				exprEnt(0);
				setState(378);
				match(SMALLER);
				setState(379);
				exprEnt(0);
				}
				break;
			case 7:
				{
				setState(381);
				exprEnt(0);
				setState(382);
				match(GREATER);
				setState(383);
				exprEnt(0);
				}
				break;
			case 8:
				{
				setState(385);
				exprEnt(0);
				setState(386);
				match(EGREATER);
				setState(387);
				exprEnt(0);
				}
				break;
			case 9:
				{
				setState(389);
				exprEnt(0);
				setState(390);
				match(ESMALLER);
				setState(391);
				exprEnt(0);
				}
				break;
			case 10:
				{
				setState(393);
				exprEnt(0);
				setState(394);
				match(EQUAL);
				setState(395);
				exprEnt(0);
				}
				break;
			case 11:
				{
				setState(397);
				exprEnt(0);
				setState(398);
				match(NOTEQUAL);
				setState(399);
				exprEnt(0);
				}
				break;
			case 12:
				{
				setState(401);
				match(STRING);
				setState(402);
				match(EQUAL);
				setState(403);
				match(STRING);
				}
				break;
			case 13:
				{
				setState(404);
				match(STRING);
				setState(405);
				match(NOTEQUAL);
				setState(406);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(407);
				match(CHARACTER);
				setState(408);
				match(EQUAL);
				setState(409);
				match(CHARACTER);
				}
				break;
			case 15:
				{
				setState(410);
				match(CHARACTER);
				setState(411);
				match(NOTEQUAL);
				setState(412);
				match(CHARACTER);
				}
				break;
			case 16:
				{
				setState(413);
				match(NOT);
				setState(414);
				exprBool(2);
				}
				break;
			case 17:
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
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public StructRefContext structRef() {
			return getRuleContext(StructRefContext.class,0);
		}
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(439);
				funcCall();
				}
				break;
			case 2:
				{
				setState(440);
				match(ID);
				}
				break;
			case 3:
				{
				setState(441);
				match(ID);
				setState(442);
				match(LBRACKET);
				setState(443);
				exprD();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(444);
					match(COMMA);
					setState(445);
					exprD();
					}
				}

				setState(448);
				match(RBRACKET);
				}
				break;
			case 4:
				{
				setState(450);
				structRef();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(453);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(454);
					matchWildcard();
					setState(455);
					match(ID);
					}
					} 
				}
				setState(460);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(PlayPlusParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PlayPlusParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PlayPlusParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PlayPlusParser.RBRACE, i);
		}
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
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
		enterRule(_localctx, 66, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IF);
			setState(462);
			match(LPAREN);
			setState(464); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(463);
				exprBool(0);
				}
				}
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID );
			setState(468);
			match(RPAREN);
			setState(469);
			match(LBRACE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(470);
				statement();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(RBRACE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(477);
				match(ELSE);
				setState(478);
				match(LBRACE);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
					{
					{
					setState(479);
					statement();
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
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
		enterRule(_localctx, 68, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(REPEAT);
			setState(489);
			match(LPAREN);
			setState(490);
			exprEnt(0);
			setState(491);
			match(RPAREN);
			setState(492);
			match(LBRACE);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(493);
				statement();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
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
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
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
		enterRule(_localctx, 70, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(WHILE);
			setState(502);
			match(LPAREN);
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				exprBool(0);
				}
				}
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID );
			setState(508);
			match(RPAREN);
			setState(509);
			match(LBRACE);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==RETURN || _la==ID) {
				{
				{
				setState(510);
				statement();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
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
		enterRule(_localctx, 72, RULE_actionType);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(LEFT);
				setState(519);
				match(LPAREN);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(520);
					exprD();
					}
				}

				setState(523);
				match(RPAREN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(RIGHT);
				setState(525);
				match(LPAREN);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(526);
					exprD();
					}
				}

				setState(529);
				match(RPAREN);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(UP);
				setState(531);
				match(LPAREN);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(532);
					exprD();
					}
				}

				setState(535);
				match(RPAREN);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				match(DOWN);
				setState(537);
				match(LPAREN);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NATUREL) | (1L << STRING) | (1L << CHARACTER) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN))) != 0) || _la==ID) {
					{
					setState(538);
					exprD();
					}
				}

				setState(541);
				match(RPAREN);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				match(FIGHT);
				setState(543);
				match(LPAREN);
				setState(544);
				match(RPAREN);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				match(JUMP);
				setState(546);
				match(LPAREN);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NATUREL - 25)) | (1L << (MINUS - 25)) | (1L << (LPAREN - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(547);
					exprEnt(0);
					}
				}

				setState(550);
				match(RPAREN);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
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
		enterRule(_localctx, 74, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DIG);
			setState(555);
			match(LPAREN);
			setState(556);
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

	public static class StructRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
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
		enterRule(_localctx, 76, RULE_structRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(ID);
			setState(560); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(559);
					member();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(562); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 78, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			matchWildcard();
			setState(565);
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
		enterRule(_localctx, 80, RULE_mytype);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
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
		enterRule(_localctx, 82, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 84, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(STRUCT);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(574);
				match(ID);
				}
			}

			setState(577);
			match(LBRACE);
			setState(578);
			listStructFields();
			setState(579);
			match(RBRACE);
			setState(580);
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
		enterRule(_localctx, 86, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(LBRACKET);
			setState(584); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(583);
				match(NATUREL);
				}
				}
				setState(586); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NATUREL );
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588);
				match(COMMA);
				{
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(589);
					match(NATUREL);
					}
					}
					setState(592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATUREL );
				}
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
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
		enterRule(_localctx, 88, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
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
		enterRule(_localctx, 90, RULE_listStructFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(603);
				structField();
				}
				}
				setState(608);
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
		enterRule(_localctx, 92, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			mytype();
			setState(610);
			fieldDecl();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611);
				match(COMMA);
				setState(612);
				fieldDecl();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
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
		enterRule(_localctx, 94, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ID);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(621);
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
		enterRule(_localctx, 96, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			mytype();
			setState(625);
			subVarDecl();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(626);
				match(COMMA);
				setState(627);
				subVarDecl();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public MytypeContext mytype() {
			return getRuleContext(MytypeContext.class,0);
		}
		public List<SubArrayDeclContext> subArrayDecl() {
			return getRuleContexts(SubArrayDeclContext.class);
		}
		public SubArrayDeclContext subArrayDecl(int i) {
			return getRuleContext(SubArrayDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			mytype();
			setState(636);
			subArrayDecl();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				subArrayDecl();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
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
		enterRule(_localctx, 100, RULE_subVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(ID);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(647);
				match(AFFECT);
				setState(648);
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

	public static class SubArrayDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public InitArraysContext initArrays() {
			return getRuleContext(InitArraysContext.class,0);
		}
		public SubArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subArrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSubArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSubArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSubArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubArrayDeclContext subArrayDecl() throws RecognitionException {
		SubArrayDeclContext _localctx = new SubArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subArrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(ID);
			{
			setState(652);
			arrays();
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(653);
				match(AFFECT);
				setState(654);
				initArrays();
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
		enterRule(_localctx, 104, RULE_initVariable);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(660);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(661);
				exprEnt(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(662);
				exprBool(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(663);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(664);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(665);
				match(LPAREN);
				setState(666);
				initVariable();
				setState(667);
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
		enterRule(_localctx, 106, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(LBRACE);
			{
			setState(672);
			initVariable();
			}
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(673);
					match(COMMA);
					setState(674);
					initVariable();
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(680);
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
		enterRule(_localctx, 108, RULE_initStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		enterRule(_localctx, 110, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(CONST);
			setState(685);
			mytype();
			setState(686);
			match(ID);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(687);
				arrays();
				}
			}

			}
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(690);
				match(AFFECT);
				setState(691);
				initVariable();
				}
				}
			}

			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(694);
				match(COMMA);
				setState(695);
				match(ID);
				{
				setState(696);
				arrays();
				}
				}
			}

			setState(699);
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
		enterRule(_localctx, 112, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(ENUM);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(702);
				match(ID);
				}
			}

			setState(705);
			match(LBRACE);
			setState(706);
			match(ID);
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					match(ID);
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(714);
			match(RBRACE);
			setState(715);
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
		enterRule(_localctx, 114, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(TYPEDEF);
			setState(718);
			mytype();
			setState(719);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 31:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 32:
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
	private boolean exprG_sempred(ExprGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u02d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\5\2"+
		"y\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5\u0084\n\5\r\5\16\5\u0085"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\6\b\u008f\n\b\r\b\16\b\u0090\3\t\3\t\3\n"+
		"\3\n\5\n\u0097\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c8\n\21\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\5\24\u00d9\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\6\26\u00e1\n\26\r\26\16\26\u00e2\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f4\n\27\3\30\3\30"+
		"\3\30\3\30\5\30\u00fa\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u0103"+
		"\n\32\3\32\3\32\3\32\5\32\u0108\n\32\3\32\3\32\3\32\5\32\u010d\n\32\3"+
		"\32\5\32\u0110\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0119\n\33"+
		"\f\33\16\33\u011c\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0126"+
		"\n\35\f\35\16\35\u0129\13\35\5\35\u012b\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0133\n\35\f\35\16\35\u0136\13\35\5\35\u0138\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35"+
		"\5\35\u0147\n\35\3\35\5\35\u014a\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0155\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0160\n \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \7 \u016b\n \f \16 \u016e\13 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u01a6\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01b4\n!"+
		"\f!\16!\u01b7\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c1\n\"\3\"\3"+
		"\"\3\"\5\"\u01c6\n\"\3\"\3\"\3\"\7\"\u01cb\n\"\f\"\16\"\u01ce\13\"\3#"+
		"\3#\3#\6#\u01d3\n#\r#\16#\u01d4\3#\3#\3#\7#\u01da\n#\f#\16#\u01dd\13#"+
		"\3#\3#\3#\3#\7#\u01e3\n#\f#\16#\u01e6\13#\3#\5#\u01e9\n#\3$\3$\3$\3$\3"+
		"$\3$\7$\u01f1\n$\f$\16$\u01f4\13$\3$\3$\3%\3%\3%\6%\u01fb\n%\r%\16%\u01fc"+
		"\3%\3%\3%\7%\u0202\n%\f%\16%\u0205\13%\3%\3%\3&\3&\3&\5&\u020c\n&\3&\3"+
		"&\3&\3&\5&\u0212\n&\3&\3&\3&\3&\5&\u0218\n&\3&\3&\3&\3&\5&\u021e\n&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u0227\n&\3&\3&\5&\u022b\n&\3\'\3\'\3\'\3\'\3(\3"+
		"(\6(\u0233\n(\r(\16(\u0234\3)\3)\3)\3*\3*\5*\u023c\n*\3+\3+\3,\3,\5,\u0242"+
		"\n,\3,\3,\3,\3,\3,\3-\3-\6-\u024b\n-\r-\16-\u024c\3-\3-\6-\u0251\n-\r"+
		"-\16-\u0252\7-\u0255\n-\f-\16-\u0258\13-\3-\3-\3.\3.\3/\7/\u025f\n/\f"+
		"/\16/\u0262\13/\3\60\3\60\3\60\3\60\7\60\u0268\n\60\f\60\16\60\u026b\13"+
		"\60\3\60\3\60\3\61\3\61\5\61\u0271\n\61\3\62\3\62\3\62\3\62\7\62\u0277"+
		"\n\62\f\62\16\62\u027a\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0282"+
		"\n\63\f\63\16\63\u0285\13\63\3\63\3\63\3\64\3\64\3\64\5\64\u028c\n\64"+
		"\3\65\3\65\3\65\3\65\5\65\u0292\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u02a0\n\66\3\67\3\67\3\67\3\67\7\67\u02a6"+
		"\n\67\f\67\16\67\u02a9\13\67\3\67\3\67\38\38\39\39\39\39\59\u02b3\n9\3"+
		"9\39\59\u02b7\n9\39\39\39\59\u02bc\n9\39\39\3:\3:\5:\u02c2\n:\3:\3:\3"+
		":\3:\7:\u02c8\n:\f:\16:\u02cb\13:\3:\3:\3:\3;\3;\3;\3;\3;\3;\4\u02a7\u02c9"+
		"\5>@B<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\7\3\2EN\3\2!\"\3\2\37 \4\2%%(,\3\2\24"+
		"\26\u031c\2x\3\2\2\2\4z\3\2\2\2\6\177\3\2\2\2\b\u0083\3\2\2\2\n\u0087"+
		"\3\2\2\2\f\u0089\3\2\2\2\16\u008b\3\2\2\2\20\u0092\3\2\2\2\22\u0094\3"+
		"\2\2\2\24\u009b\3\2\2\2\26\u00a3\3\2\2\2\30\u00a6\3\2\2\2\32\u00a9\3\2"+
		"\2\2\34\u00b3\3\2\2\2\36\u00be\3\2\2\2 \u00c7\3\2\2\2\"\u00c9\3\2\2\2"+
		"$\u00d0\3\2\2\2&\u00d6\3\2\2\2(\u00dc\3\2\2\2*\u00e0\3\2\2\2,\u00f3\3"+
		"\2\2\2.\u00f5\3\2\2\2\60\u00fb\3\2\2\2\62\u0102\3\2\2\2\64\u0115\3\2\2"+
		"\2\66\u011d\3\2\2\28\u0149\3\2\2\2:\u014b\3\2\2\2<\u0154\3\2\2\2>\u015f"+
		"\3\2\2\2@\u01a5\3\2\2\2B\u01c5\3\2\2\2D\u01cf\3\2\2\2F\u01ea\3\2\2\2H"+
		"\u01f7\3\2\2\2J\u022a\3\2\2\2L\u022c\3\2\2\2N\u0230\3\2\2\2P\u0236\3\2"+
		"\2\2R\u023b\3\2\2\2T\u023d\3\2\2\2V\u023f\3\2\2\2X\u0248\3\2\2\2Z\u025b"+
		"\3\2\2\2\\\u0260\3\2\2\2^\u0263\3\2\2\2`\u026e\3\2\2\2b\u0272\3\2\2\2"+
		"d\u027d\3\2\2\2f\u0288\3\2\2\2h\u028d\3\2\2\2j\u029f\3\2\2\2l\u02a1\3"+
		"\2\2\2n\u02ac\3\2\2\2p\u02ae\3\2\2\2r\u02bf\3\2\2\2t\u02cf\3\2\2\2vy\5"+
		"\22\n\2wy\5\4\3\2xv\3\2\2\2xw\3\2\2\2y\3\3\2\2\2z{\7A\2\2{|\5\6\4\2|}"+
		"\5\b\5\2}~\7\2\2\3~\5\3\2\2\2\177\u0080\5\n\6\2\u0080\u0081\5\f\7\2\u0081"+
		"\7\3\2\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\t\3\2\2\2\u0087\u0088"+
		"\7\33\2\2\u0088\13\3\2\2\2\u0089\u008a\7\33\2\2\u008a\r\3\2\2\2\u008b"+
		"\u008e\5\20\t\2\u008c\u008f\5\20\t\2\u008d\u008f\7?\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\17\3\2\2\2\u0092\u0093\t\2\2\2\u0093\21\3\2\2\2\u0094"+
		"\u0096\5\24\13\2\u0095\u0097\5\34\17\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7\2\2\3"+
		"\u009a\23\3\2\2\2\u009b\u00a1\5\26\f\2\u009c\u009d\7P\2\2\u009d\u009e"+
		"\5\30\r\2\u009e\u009f\7P\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\7\34\2\2"+
		"\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a4"+
		"\7B\2\2\u00a4\u00a5\7\f\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\5\32\16\2\u00a7"+
		"\u00a8\7D\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7O\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00b2\5b\62\2\u00ac\u00b2\5p9\2\u00ad\u00b2\5Z.\2\u00ae\u00b2\5r:\2\u00af"+
		"\u00b2\5t;\2\u00b0\u00b2\5\62\32\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bd\5b\62\2\u00b7\u00bd"+
		"\5p9\2\u00b8\u00bd\5Z.\2\u00b9\u00bd\5r:\2\u00ba\u00bd\5t;\2\u00bb\u00bd"+
		"\5\62\32\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2"+
		"\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c8\5b\62\2\u00c2\u00c8\5p9\2\u00c3\u00c8\5Z.\2"+
		"\u00c4\u00c8\5r:\2\u00c5\u00c8\5t;\2\u00c6\u00c8\5\62\32\2\u00c7\u00c1"+
		"\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8!\3\2\2\2\u00c9\u00cb\5$\23\2"+
		"\u00ca\u00cc\5 \21\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\5*\26\2\u00ce\u00cf\5&\24\2\u00cf#\3\2\2\2\u00d0"+
		"\u00d1\7\4\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\7-\2\2\u00d3\u00d4\7.\2"+
		"\2\u00d4\u00d5\7/\2\2\u00d5%\3\2\2\2\u00d6\u00d8\5(\25\2\u00d7\u00d9\5"+
		"*\26\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\7\60\2\2\u00db\'\3\2\2\2\u00dc\u00dd\5.\30\2\u00dd\u00de\7\65\2"+
		"\2\u00de)\3\2\2\2\u00df\u00e1\5,\27\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3+\3\2\2\2\u00e4"+
		"\u00e5\5.\30\2\u00e5\u00e6\7\65\2\2\u00e6\u00f4\3\2\2\2\u00e7\u00f4\5"+
		"\60\31\2\u00e8\u00e9\5<\37\2\u00e9\u00ea\7\65\2\2\u00ea\u00f4\3\2\2\2"+
		"\u00eb\u00f4\5:\36\2\u00ec\u00ed\5J&\2\u00ed\u00ee\7\65\2\2\u00ee\u00f4"+
		"\3\2\2\2\u00ef\u00f4\5D#\2\u00f0\u00f4\5F$\2\u00f1\u00f4\5H%\2\u00f2\u00f4"+
		"\5 \21\2\u00f3\u00e4\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3"+
		"\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f9"+
		"\7C\2\2\u00f6\u00fa\5B\"\2\u00f7\u00fa\7\4\2\2\u00f8\u00fa\5<\37\2\u00f9"+
		"\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa/\3\2\2\2"+
		"\u00fb\u00fc\5B\"\2\u00fc\u00fd\7&\2\2\u00fd\u00fe\5<\37\2\u00fe\u00ff"+
		"\7\65\2\2\u00ff\61\3\2\2\2\u0100\u0103\5R*\2\u0101\u0103\7\4\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7O"+
		"\2\2\u0105\u0107\7-\2\2\u0106\u0108\5\64\33\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7.\2\2\u010a\u010c\7/\2"+
		"\2\u010b\u010d\5\36\20\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0110\5*\26\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5.\30\2\u0112\u0113\7\65\2\2\u0113"+
		"\u0114\7\60\2\2\u0114\63\3\2\2\2\u0115\u011a\5\66\34\2\u0116\u0117\7\67"+
		"\2\2\u0117\u0119\5\66\34\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\65\3\2\2\2\u011c\u011a\3\2\2"+
		"\2\u011d\u011e\5R*\2\u011e\u011f\5B\"\2\u011f\67\3\2\2\2\u0120\u0121\7"+
		"O\2\2\u0121\u012a\7-\2\2\u0122\u0127\5<\37\2\u0123\u0124\7\67\2\2\u0124"+
		"\u0126\5<\37\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u014a\7."+
		"\2\2\u012d\u012e\7O\2\2\u012e\u0137\7-\2\2\u012f\u0134\5<\37\2\u0130\u0131"+
		"\7\67\2\2\u0131\u0133\5<\37\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\7.\2\2\u013a\u013b\7.\2\2\u013b\u014a\b\35\1\2\u013c\u013d\7O\2"+
		"\2\u013d\u0146\7-\2\2\u013e\u0143\5<\37\2\u013f\u0140\7\67\2\2\u0140\u0142"+
		"\5<\37\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013e\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\b\35\1\2\u0149"+
		"\u0120\3\2\2\2\u0149\u012d\3\2\2\2\u0149\u013c\3\2\2\2\u014a9\3\2\2\2"+
		"\u014b\u014c\5p9\2\u014c\u014d\7\65\2\2\u014d;\3\2\2\2\u014e\u0155\58"+
		"\35\2\u014f\u0155\5B\"\2\u0150\u0155\5> \2\u0151\u0155\5@!\2\u0152\u0155"+
		"\7\35\2\2\u0153\u0155\7\36\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2\2"+
		"\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155=\3\2\2\2\u0156\u0157\b \1\2\u0157\u0158\7 \2\2\u0158\u0160"+
		"\5> \t\u0159\u0160\5B\"\2\u015a\u0160\7\33\2\2\u015b\u015c\7-\2\2\u015c"+
		"\u015d\5> \2\u015d\u015e\7.\2\2\u015e\u0160\3\2\2\2\u015f\u0156\3\2\2"+
		"\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u0160\u016c"+
		"\3\2\2\2\u0161\u0162\f\6\2\2\u0162\u0163\7#\2\2\u0163\u016b\5> \7\u0164"+
		"\u0165\f\5\2\2\u0165\u0166\t\3\2\2\u0166\u016b\5> \6\u0167\u0168\f\4\2"+
		"\2\u0168\u0169\t\4\2\2\u0169\u016b\5> \5\u016a\u0161\3\2\2\2\u016a\u0164"+
		"\3\2\2\2\u016a\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d?\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\b!\1\2\u0170"+
		"\u01a6\7\n\2\2\u0171\u01a6\7\13\2\2\u0172\u01a6\5B\"\2\u0173\u0174\5B"+
		"\"\2\u0174\u0175\t\5\2\2\u0175\u0176\5B\"\2\u0176\u01a6\3\2\2\2\u0177"+
		"\u0178\5B\"\2\u0178\u0179\t\5\2\2\u0179\u017a\7\36\2\2\u017a\u01a6\3\2"+
		"\2\2\u017b\u017c\5> \2\u017c\u017d\7)\2\2\u017d\u017e\5> \2\u017e\u01a6"+
		"\3\2\2\2\u017f\u0180\5> \2\u0180\u0181\7*\2\2\u0181\u0182\5> \2\u0182"+
		"\u01a6\3\2\2\2\u0183\u0184\5> \2\u0184\u0185\7+\2\2\u0185\u0186\5> \2"+
		"\u0186\u01a6\3\2\2\2\u0187\u0188\5> \2\u0188\u0189\7,\2\2\u0189\u018a"+
		"\5> \2\u018a\u01a6\3\2\2\2\u018b\u018c\5> \2\u018c\u018d\7%\2\2\u018d"+
		"\u018e\5> \2\u018e\u01a6\3\2\2\2\u018f\u0190\5> \2\u0190\u0191\7(\2\2"+
		"\u0191\u0192\5> \2\u0192\u01a6\3\2\2\2\u0193\u0194\7\35\2\2\u0194\u0195"+
		"\7%\2\2\u0195\u01a6\7\35\2\2\u0196\u0197\7\35\2\2\u0197\u0198\7(\2\2\u0198"+
		"\u01a6\7\35\2\2\u0199\u019a\7\36\2\2\u019a\u019b\7%\2\2\u019b\u01a6\7"+
		"\36\2\2\u019c\u019d\7\36\2\2\u019d\u019e\7(\2\2\u019e\u01a6\7\36\2\2\u019f"+
		"\u01a0\7\'\2\2\u01a0\u01a6\5@!\4\u01a1\u01a2\7-\2\2\u01a2\u01a3\5@!\2"+
		"\u01a3\u01a4\7.\2\2\u01a4\u01a6\3\2\2\2\u01a5\u016f\3\2\2\2\u01a5\u0171"+
		"\3\2\2\2\u01a5\u0172\3\2\2\2\u01a5\u0173\3\2\2\2\u01a5\u0177\3\2\2\2\u01a5"+
		"\u017b\3\2\2\2\u01a5\u017f\3\2\2\2\u01a5\u0183\3\2\2\2\u01a5\u0187\3\2"+
		"\2\2\u01a5\u018b\3\2\2\2\u01a5\u018f\3\2\2\2\u01a5\u0193\3\2\2\2\u01a5"+
		"\u0196\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5\u019f\3\2"+
		"\2\2\u01a5\u01a1\3\2\2\2\u01a6\u01b5\3\2\2\2\u01a7\u01a8\f\b\2\2\u01a8"+
		"\u01a9\79\2\2\u01a9\u01b4\5@!\t\u01aa\u01ab\f\7\2\2\u01ab\u01ac\7%\2\2"+
		"\u01ac\u01b4\5@!\b\u01ad\u01ae\f\6\2\2\u01ae\u01af\7(\2\2\u01af\u01b4"+
		"\5@!\7\u01b0\u01b1\f\5\2\2\u01b1\u01b2\7:\2\2\u01b2\u01b4\5@!\6\u01b3"+
		"\u01a7\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"A\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\"\1\2\u01b9\u01c6\58\35\2"+
		"\u01ba\u01c6\7O\2\2\u01bb\u01bc\7O\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01c0"+
		"\5<\37\2\u01be\u01bf\7\67\2\2\u01bf\u01c1\5<\37\2\u01c0\u01be\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\62\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c6\5N(\2\u01c5\u01b8\3\2\2\2\u01c5\u01ba\3\2\2\2\u01c5"+
		"\u01bb\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01cc\3\2\2\2\u01c7\u01c8\f\4"+
		"\2\2\u01c8\u01c9\13\2\2\2\u01c9\u01cb\7O\2\2\u01ca\u01c7\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdC\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\5\2\2\u01d0\u01d2\7-\2\2\u01d1\u01d3"+
		"\5@!\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7.\2\2\u01d7\u01db\7/\2"+
		"\2\u01d8\u01da\5,\27\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e8\7\60\2\2\u01df\u01e0\7\6\2\2\u01e0\u01e4\7/\2\2\u01e1\u01e3\5,"+
		"\27\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\7\60"+
		"\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9E\3\2\2\2\u01ea\u01eb"+
		"\7\b\2\2\u01eb\u01ec\7-\2\2\u01ec\u01ed\5> \2\u01ed\u01ee\7.\2\2\u01ee"+
		"\u01f2\7/\2\2\u01ef\u01f1\5,\27\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\7\60\2\2\u01f6G\3\2\2\2\u01f7\u01f8\7\t\2\2"+
		"\u01f8\u01fa\7-\2\2\u01f9\u01fb\5@!\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\7.\2\2\u01ff\u0203\7/\2\2\u0200\u0202\5,\27\2\u0201\u0200\3\2\2"+
		"\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\60\2\2\u0207I\3\2\2\2\u0208"+
		"\u0209\7\r\2\2\u0209\u020b\7-\2\2\u020a\u020c\5<\37\2\u020b\u020a\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u022b\7.\2\2\u020e"+
		"\u020f\7\16\2\2\u020f\u0211\7-\2\2\u0210\u0212\5<\37\2\u0211\u0210\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u022b\7.\2\2\u0214"+
		"\u0215\7\17\2\2\u0215\u0217\7-\2\2\u0216\u0218\5<\37\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u022b\7.\2\2\u021a"+
		"\u021b\7\20\2\2\u021b\u021d\7-\2\2\u021c\u021e\5<\37\2\u021d\u021c\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u022b\7.\2\2\u0220"+
		"\u0221\7\22\2\2\u0221\u0222\7-\2\2\u0222\u022b\7.\2\2\u0223\u0224\7\21"+
		"\2\2\u0224\u0226\7-\2\2\u0225\u0227\5> \2\u0226\u0225\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\7.\2\2\u0229\u022b\5L\'\2\u022a"+
		"\u0208\3\2\2\2\u022a\u020e\3\2\2\2\u022a\u0214\3\2\2\2\u022a\u021a\3\2"+
		"\2\2\u022a\u0220\3\2\2\2\u022a\u0223\3\2\2\2\u022a\u0229\3\2\2\2\u022b"+
		"K\3\2\2\2\u022c\u022d\7\23\2\2\u022d\u022e\7-\2\2\u022e\u022f\7.\2\2\u022f"+
		"M\3\2\2\2\u0230\u0232\7O\2\2\u0231\u0233\5P)\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235O\3\2\2\2"+
		"\u0236\u0237\13\2\2\2\u0237\u0238\7O\2\2\u0238Q\3\2\2\2\u0239\u023c\5"+
		"T+\2\u023a\u023c\5V,\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023cS"+
		"\3\2\2\2\u023d\u023e\t\6\2\2\u023eU\3\2\2\2\u023f\u0241\7\27\2\2\u0240"+
		"\u0242\7O\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0244\7/\2\2\u0244\u0245\5\\/\2\u0245\u0246\7\60\2\2\u0246"+
		"\u0247\7\65\2\2\u0247W\3\2\2\2\u0248\u024a\7\61\2\2\u0249\u024b\7\33\2"+
		"\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u0256\3\2\2\2\u024e\u0250\7\67\2\2\u024f\u0251\7\33\2\2"+
		"\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u024e\3\2\2\2\u0255\u0258\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0259\u025a\7\62\2\2\u025aY\3\2\2\2\u025b\u025c\5V,\2\u025c[\3\2"+
		"\2\2\u025d\u025f\5^\60\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261]\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0264\5R*\2\u0264\u0269\5`\61\2\u0265\u0266\7\67\2\2\u0266\u0268"+
		"\5`\61\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7\65"+
		"\2\2\u026d_\3\2\2\2\u026e\u0270\7O\2\2\u026f\u0271\5X-\2\u0270\u026f\3"+
		"\2\2\2\u0270\u0271\3\2\2\2\u0271a\3\2\2\2\u0272\u0273\5R*\2\u0273\u0278"+
		"\5f\64\2\u0274\u0275\7\67\2\2\u0275\u0277\5f\64\2\u0276\u0274\3\2\2\2"+
		"\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b"+
		"\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7\65\2\2\u027cc\3\2\2\2\u027d"+
		"\u027e\5R*\2\u027e\u0283\5h\65\2\u027f\u0280\7\67\2\2\u0280\u0282\5h\65"+
		"\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\65\2\2"+
		"\u0287e\3\2\2\2\u0288\u028b\7O\2\2\u0289\u028a\7&\2\2\u028a\u028c\5j\66"+
		"\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028cg\3\2\2\2\u028d\u028e"+
		"\7O\2\2\u028e\u0291\5X-\2\u028f\u0290\7&\2\2\u0290\u0292\5l\67\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292i\3\2\2\2\u0293\u02a0\7\n\2\2"+
		"\u0294\u02a0\7\13\2\2\u0295\u02a0\7\35\2\2\u0296\u02a0\7\36\2\2\u0297"+
		"\u02a0\5> \2\u0298\u02a0\5@!\2\u0299\u02a0\5l\67\2\u029a\u02a0\5n8\2\u029b"+
		"\u029c\7-\2\2\u029c\u029d\5j\66\2\u029d\u029e\7.\2\2\u029e\u02a0\3\2\2"+
		"\2\u029f\u0293\3\2\2\2\u029f\u0294\3\2\2\2\u029f\u0295\3\2\2\2\u029f\u0296"+
		"\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u0298\3\2\2\2\u029f\u0299\3\2\2\2\u029f"+
		"\u029a\3\2\2\2\u029f\u029b\3\2\2\2\u02a0k\3\2\2\2\u02a1\u02a2\7/\2\2\u02a2"+
		"\u02a7\5j\66\2\u02a3\u02a4\7\67\2\2\u02a4\u02a6\5j\66\2\u02a5\u02a3\3"+
		"\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\7\60\2\2\u02abm\3\2\2\2"+
		"\u02ac\u02ad\5Z.\2\u02ado\3\2\2\2\u02ae\u02af\7\30\2\2\u02af\u02b0\5R"+
		"*\2\u02b0\u02b2\7O\2\2\u02b1\u02b3\5X-\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b5\7&\2\2\u02b5\u02b7\5j\66\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bb\3\2\2\2\u02b8\u02b9\7\67"+
		"\2\2\u02b9\u02ba\7O\2\2\u02ba\u02bc\5X-\2\u02bb\u02b8\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7\65\2\2\u02beq\3\2\2\2\u02bf"+
		"\u02c1\7\31\2\2\u02c0\u02c2\7O\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7/\2\2\u02c4\u02c9\7O\2\2\u02c5\u02c6"+
		"\7\67\2\2\u02c6\u02c8\7O\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02cd\7\60\2\2\u02cd\u02ce\7\65\2\2\u02ces\3\2\2\2\u02cf\u02d0"+
		"\7\32\2\2\u02d0\u02d1\5R*\2\u02d1\u02d2\7O\2\2\u02d2\u02d3\7\65\2\2\u02d3"+
		"u\3\2\2\2Ix\u0085\u008e\u0090\u0096\u00a1\u00b1\u00b3\u00bc\u00be\u00c7"+
		"\u00cb\u00d8\u00e2\u00f3\u00f9\u0102\u0107\u010c\u010f\u011a\u0127\u012a"+
		"\u0134\u0137\u0143\u0146\u0149\u0154\u015f\u016a\u016c\u01a5\u01b3\u01b5"+
		"\u01c0\u01c5\u01cc\u01d4\u01db\u01e4\u01e8\u01f2\u01fc\u0203\u020b\u0211"+
		"\u0217\u021d\u0226\u022a\u0234\u023b\u0241\u024c\u0252\u0256\u0260\u0269"+
		"\u0270\u0278\u0283\u028b\u0291\u029f\u02a7\u02b2\u02b6\u02bb\u02c1\u02c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}