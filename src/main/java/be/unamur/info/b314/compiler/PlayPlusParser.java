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
		T__0=1, T__1=2, T__2=3, VOID=4, IF=5, ELSE=6, THEN=7, REPEAT=8, WHILE=9, 
		TRUE=10, FALSE=11, IMPORT=12, LEFT=13, RIGHT=14, UP=15, DOWN=16, JUMP=17, 
		FIGHT=18, DIG=19, BOOL=20, INT=21, CHAR=22, STRUCT=23, CONST=24, ENUM=25, 
		TYPEDEF=26, ENTIER=27, STRING=28, CHARACTER=29, PLUS=30, MINUS=31, MUL=32, 
		DIV=33, POW=34, EQUAL=35, AFFECT=36, NOT=37, NOTEQUAL=38, SMALLER=39, 
		GREATER=40, EGREATER=41, ESMALLER=42, LPAREN=43, RPAREN=44, LBRACE=45, 
		RBRACE=46, LBRACKET=47, RBRACKET=48, DOUBLEQUOTE=49, SINGLEQUOTE=50, BACKSLASH=51, 
		SEMICOLON=52, COLON=53, COMMA=54, DOT=55, AND=56, OR=57, AMPERSAND=58, 
		COMMENTAIRES=59, BLOCK_COMMENT=60, LINE_COMMENT=61, NEWLINE=62, WS=63, 
		ID=64, CONSTID=65, LETTRE=66, CHIFFRE=67;
	public static final int
		RULE_root = 0, RULE_statements = 1, RULE_statement = 2, RULE_affectInstr = 3, 
		RULE_plusMinusExpr = 4, RULE_constantExpr = 5, RULE_variableExpr = 6, 
		RULE_implDecl = 7, RULE_fileDecl = 8, RULE_exprD = 9, RULE_exprEnt = 10, 
		RULE_exprBool = 11, RULE_exprG = 12, RULE_conditionalStmt = 13, RULE_repeatStmt = 14, 
		RULE_whileStmt = 15, RULE_actionType = 16, RULE_mytype = 17, RULE_scalar = 18, 
		RULE_structures = 19, RULE_arrays = 20, RULE_structDecl = 21, RULE_listVarName = 22, 
		RULE_varDecl = 23, RULE_initVariable = 24, RULE_initArrays = 25, RULE_initStruct = 26, 
		RULE_constDecl = 27, RULE_enumDecl = 28, RULE_typedefDecl = 29;
	public static final String[] ruleNames = {
		"root", "statements", "statement", "affectInstr", "plusMinusExpr", "constantExpr", 
		"variableExpr", "implDecl", "fileDecl", "exprD", "exprEnt", "exprBool", 
		"exprG", "conditionalStmt", "repeatStmt", "whileStmt", "actionType", "mytype", 
		"scalar", "structures", "arrays", "structDecl", "listVarName", "varDecl", 
		"initVariable", "initArrays", "initStruct", "constDecl", "enumDecl", "typedefDecl"
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
		"WS", "ID", "CONSTID", "LETTRE", "CHIFFRE"
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
		public TerminalNode LBRACE() { return getToken(PlayPlusParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAREN() { return getToken(PlayPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayPlusParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(PlayPlusParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			implDecl();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ENUM) | (1L << TYPEDEF))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(61);
					varDecl();
					}
					break;
				case 2:
					{
					setState(62);
					constDecl();
					}
					break;
				case 3:
					{
					setState(63);
					structDecl();
					}
					break;
				case 4:
					{
					setState(64);
					enumDecl();
					}
					break;
				case 5:
					{
					setState(65);
					typedefDecl();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__0);
			setState(72);
			match(LBRACE);
			setState(73);
			statements();
			setState(74);
			match(DIG);
			setState(75);
			match(LPAREN);
			setState(76);
			match(RPAREN);
			setState(77);
			match(SEMICOLON);
			setState(78);
			match(T__1);
			setState(79);
			match(RBRACE);
			setState(80);
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
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public AffectInstrContext affectInstr() {
			return getRuleContext(AffectInstrContext.class,0);
		}
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				affectInstr();
				}
				break;
			case CONSTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				constantExpr();
				}
				break;
			case LEFT:
			case RIGHT:
			case UP:
			case DOWN:
			case FIGHT:
			case DIG:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(89);
				actionType();
				}
				setState(90);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(92);
				conditionalStmt();
				}
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(93);
				repeatStmt();
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(94);
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
		enterRule(_localctx, 6, RULE_affectInstr);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				plusMinusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(98);
				exprG(0);
				setState(99);
				match(AFFECT);
				setState(100);
				exprD();
				}
				setState(102);
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
		enterRule(_localctx, 8, RULE_plusMinusExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			exprG(0);
			setState(107);
			match(AFFECT);
			setState(108);
			exprEnt(0);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			exprEnt(0);
			}
			setState(112);
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
		public TerminalNode CONSTID() { return getToken(PlayPlusParser.CONSTID, 0); }
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
		enterRule(_localctx, 10, RULE_constantExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CONSTID);
			setState(115);
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
		enterRule(_localctx, 12, RULE_variableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
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

	public static class ImplDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public List<TerminalNode> DOUBLEQUOTE() { return getTokens(PlayPlusParser.DOUBLEQUOTE); }
		public TerminalNode DOUBLEQUOTE(int i) {
			return getToken(PlayPlusParser.DOUBLEQUOTE, i);
		}
		public FileDeclContext fileDecl() {
			return getRuleContext(FileDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 14, RULE_implDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IMPORT);
			setState(121);
			match(DOUBLEQUOTE);
			setState(122);
			fileDecl();
			setState(123);
			match(DOUBLEQUOTE);
			setState(124);
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

	public static class FileDeclContext extends ParserRuleContext {
		public List<TerminalNode> LETTRE() { return getTokens(PlayPlusParser.LETTRE); }
		public TerminalNode LETTRE(int i) {
			return getToken(PlayPlusParser.LETTRE, i);
		}
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
		enterRule(_localctx, 16, RULE_fileDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LETTRE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTRE) {
				{
				{
				setState(127);
				match(LETTRE);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_exprD);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				exprEnt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				exprBool(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				exprG(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(ID);
				setState(141);
				match(LPAREN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(142);
					exprD();
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(143);
						match(COMMA);
						setState(144);
						exprD();
						}
						}
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(152);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				match(LPAREN);
				setState(154);
				exprD();
				setState(155);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(160);
				match(MINUS);
				setState(161);
				exprEnt(4);
				}
				break;
			case ENTIER:
				{
				setState(162);
				match(ENTIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						exprEnt(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						exprEnt(3);
						}
						break;
					}
					}
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exprBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(177);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(178);
				match(FALSE);
				}
				break;
			case NOT:
				{
				setState(179);
				match(NOT);
				setState(180);
				exprBool(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						match(AND);
						setState(185);
						exprBool(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						match(OR);
						setState(188);
						exprBool(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(190);
						match(SMALLER);
						setState(191);
						exprBool(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193);
						match(GREATER);
						setState(194);
						exprBool(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(EQUAL);
						setState(197);
						exprBool(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(EGREATER);
						setState(200);
						exprBool(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(ESMALLER);
						setState(203);
						exprBool(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						match(NOTEQUAL);
						setState(206);
						exprBool(2);
						}
						break;
					}
					}
				}
				setState(211);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(213);
				match(ID);
				}
				break;
			case 2:
				{
				setState(214);
				match(ID);
				setState(215);
				match(LBRACKET);
				setState(216);
				exprD();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(217);
					match(COMMA);
					setState(218);
					exprD();
					}
				}

				setState(221);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(226);
					matchWildcard();
					setState(227);
					match(ID);
					}
					}
				}
				setState(232);
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
		enterRule(_localctx, 26, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IF);
			setState(234);
			match(LPAREN);
			setState(235);
			exprD();
			setState(236);
			match(RPAREN);
			setState(237);
			match(LBRACE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IF - 5)) | (1L << (REPEAT - 5)) | (1L << (WHILE - 5)) | (1L << (LEFT - 5)) | (1L << (RIGHT - 5)) | (1L << (UP - 5)) | (1L << (DOWN - 5)) | (1L << (FIGHT - 5)) | (1L << (DIG - 5)) | (1L << (ID - 5)) | (1L << (CONSTID - 5)))) != 0) );
			setState(243);
			match(RBRACE);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(244);
				match(ELSE);
				setState(245);
				match(LBRACE);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IF - 5)) | (1L << (REPEAT - 5)) | (1L << (WHILE - 5)) | (1L << (LEFT - 5)) | (1L << (RIGHT - 5)) | (1L << (UP - 5)) | (1L << (DOWN - 5)) | (1L << (FIGHT - 5)) | (1L << (DIG - 5)) | (1L << (ID - 5)) | (1L << (CONSTID - 5)))) != 0)) {
					{
					{
					setState(246);
					statement();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
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
		enterRule(_localctx, 28, RULE_repeatStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(REPEAT);
			setState(256);
			match(LPAREN);
			setState(257);
			exprD();
			setState(258);
			match(RPAREN);
			setState(259);
			match(LBRACE);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				statement();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IF - 5)) | (1L << (REPEAT - 5)) | (1L << (WHILE - 5)) | (1L << (LEFT - 5)) | (1L << (RIGHT - 5)) | (1L << (UP - 5)) | (1L << (DOWN - 5)) | (1L << (FIGHT - 5)) | (1L << (DIG - 5)) | (1L << (ID - 5)) | (1L << (CONSTID - 5)))) != 0) );
			setState(265);
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
		enterRule(_localctx, 30, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(WHILE);
			setState(268);
			match(LPAREN);
			setState(269);
			exprD();
			setState(270);
			match(RPAREN);
			setState(271);
			match(LBRACE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				statement();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IF - 5)) | (1L << (REPEAT - 5)) | (1L << (WHILE - 5)) | (1L << (LEFT - 5)) | (1L << (RIGHT - 5)) | (1L << (UP - 5)) | (1L << (DOWN - 5)) | (1L << (FIGHT - 5)) | (1L << (DIG - 5)) | (1L << (ID - 5)) | (1L << (CONSTID - 5)))) != 0) );
			setState(277);
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
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
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
		enterRule(_localctx, 32, RULE_actionType);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(LEFT);
				setState(280);
				match(LPAREN);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(281);
					exprD();
					}
				}

				setState(284);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(LEFT);
				setState(286);
				match(LPAREN);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(287);
					exprD();
					}
				}

				setState(290);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(RIGHT);
				setState(292);
				match(LPAREN);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(293);
					exprD();
					}
				}

				setState(296);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(UP);
				setState(298);
				match(LPAREN);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(299);
					exprD();
					}
				}

				setState(302);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(DOWN);
				setState(304);
				match(LPAREN);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (TRUE - 10)) | (1L << (FALSE - 10)) | (1L << (ENTIER - 10)) | (1L << (STRING - 10)) | (1L << (CHARACTER - 10)) | (1L << (MINUS - 10)) | (1L << (NOT - 10)) | (1L << (LPAREN - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					setState(305);
					exprD();
					}
				}

				setState(308);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(FIGHT);
				setState(310);
				match(LPAREN);
				setState(311);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				match(DIG);
				setState(313);
				match(LPAREN);
				setState(314);
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
		enterRule(_localctx, 34, RULE_mytype);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				scalar();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
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
		enterRule(_localctx, 36, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 38, RULE_structures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(STRUCT);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(324);
				match(ID);
				}
			}

			setState(327);
			match(LBRACE);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(328);
				listVarName();
				}
				break;
			}
			setState(331);
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
		public List<TerminalNode> CHIFFRE() { return getTokens(PlayPlusParser.CHIFFRE); }
		public TerminalNode CHIFFRE(int i) {
			return getToken(PlayPlusParser.CHIFFRE, i);
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
		enterRule(_localctx, 40, RULE_arrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LBRACKET);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				match(CHIFFRE);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHIFFRE );
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(339);
				match(COMMA);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					match(CHIFFRE);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHIFFRE );
				}
			}

			setState(347);
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
		enterRule(_localctx, 42, RULE_structDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 44, RULE_listVarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << CHAR) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(351);
				mytype();
				setState(352);
				match(ID);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(353);
					arrays();
					}
				}

				{
				setState(356);
				match(COMMA);
				setState(357);
				match(ID);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(358);
					arrays();
					}
				}

				}
				}
				}
				setState(365);
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
		enterRule(_localctx, 46, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			mytype();
			setState(367);
			match(ID);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(368);
				arrays();
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(371);
				match(AFFECT);
				setState(372);
				initVariable();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375);
				match(COMMA);
				setState(376);
				match(ID);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(377);
					arrays();
					}
				}

				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFFECT) {
					{
					setState(380);
					match(AFFECT);
					setState(381);
					initVariable();
					}
				}

				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
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
		enterRule(_localctx, 48, RULE_initVariable);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(ENTIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				match(CHARACTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				exprD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				initArrays();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(398);
				initStruct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(399);
				match(LPAREN);
				setState(400);
				initVariable();
				setState(401);
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
		enterRule(_localctx, 50, RULE_initArrays);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LBRACE);
			{
			setState(406);
			initVariable();
			}
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(407);
					match(COMMA);
					setState(408);
					initVariable();
					}
					}
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(414);
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
		enterRule(_localctx, 52, RULE_initStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LBRACE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(417);
				match(ID);
				setState(418);
				match(COLON);
				setState(419);
				initVariable();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(420);
					match(COMMA);
					setState(421);
					match(ID);
					setState(422);
					match(COLON);
					setState(423);
					initVariable();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(431);
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
		public TerminalNode CONSTID() { return getToken(PlayPlusParser.CONSTID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
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
		enterRule(_localctx, 54, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(CONST);
			setState(434);
			mytype();
			setState(435);
			match(CONSTID);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(436);
				arrays();
				}
			}

			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				{
				setState(439);
				match(AFFECT);
				setState(440);
				initVariable();
				}
				}
			}

			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(443);
				match(COMMA);
				setState(444);
				match(ID);
				{
				setState(445);
				arrays();
				}
				}
			}

			setState(448);
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
		enterRule(_localctx, 56, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ENUM);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(451);
				match(ID);
				}
			}

			setState(454);
			match(LBRACE);
			setState(455);
			match(ID);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(456);
					match(COMMA);
					setState(457);
					match(ID);
					}
					}
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(463);
			match(RBRACE);
			setState(464);
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
		enterRule(_localctx, 58, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(TYPEDEF);
			setState(467);
			mytype();
			setState(468);
			match(ID);
			setState(469);
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
		case 10:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 11:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 12:
			return exprG_sempred((ExprGContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u01da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\6\3V\n\3\r\3\16\3W\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u0083"+
		"\n\n\f\n\16\n\u0086\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\5\13\u0099\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\5\f\u00a6\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d2\n\r\f\r\16"+
		"\r\u00d5\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00de\n\16\3\16"+
		"\3\16\5\16\u00e2\n\16\3\16\3\16\3\16\7\16\u00e7\n\16\f\16\16\16\u00ea"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00f2\n\17\r\17\16\17\u00f3"+
		"\3\17\3\17\3\17\3\17\7\17\u00fa\n\17\f\17\16\17\u00fd\13\17\3\17\5\17"+
		"\u0100\n\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0108\n\20\r\20\16\20\u0109"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0114\n\21\r\21\16\21\u0115"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u011d\n\22\3\22\3\22\3\22\3\22\5\22\u0123"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0129\n\22\3\22\3\22\3\22\3\22\5\22\u012f"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0135\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u013e\n\22\3\23\3\23\5\23\u0142\n\23\3\24\3\24\3\25\3\25\5"+
		"\25\u0148\n\25\3\25\3\25\5\25\u014c\n\25\3\25\3\25\3\26\3\26\6\26\u0152"+
		"\n\26\r\26\16\26\u0153\3\26\3\26\6\26\u0158\n\26\r\26\16\26\u0159\5\26"+
		"\u015c\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u0165\n\30\3\30\3"+
		"\30\3\30\5\30\u016a\n\30\7\30\u016c\n\30\f\30\16\30\u016f\13\30\3\31\3"+
		"\31\3\31\5\31\u0174\n\31\3\31\3\31\5\31\u0178\n\31\3\31\3\31\3\31\5\31"+
		"\u017d\n\31\3\31\3\31\5\31\u0181\n\31\7\31\u0183\n\31\f\31\16\31\u0186"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0196\n\32\3\33\3\33\3\33\3\33\7\33\u019c\n\33\f\33\16\33\u019f"+
		"\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01ab\n"+
		"\34\f\34\16\34\u01ae\13\34\5\34\u01b0\n\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\5\35\u01b8\n\35\3\35\3\35\5\35\u01bc\n\35\3\35\3\35\3\35\5\35\u01c1"+
		"\n\35\3\35\3\35\3\36\3\36\5\36\u01c7\n\36\3\36\3\36\3\36\3\36\7\36\u01cd"+
		"\n\36\f\36\16\36\u01d0\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\4\u019d\u01ce\5\26\30\32 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<\2\5\3\2 !\3\2\"#\3\2\26\30\u020e\2>\3\2\2\2\4"+
		"U\3\2\2\2\6a\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16w\3\2\2\2\20z"+
		"\3\2\2\2\22\u0080\3\2\2\2\24\u009f\3\2\2\2\26\u00a5\3\2\2\2\30\u00b7\3"+
		"\2\2\2\32\u00e1\3\2\2\2\34\u00eb\3\2\2\2\36\u0101\3\2\2\2 \u010d\3\2\2"+
		"\2\"\u013d\3\2\2\2$\u0141\3\2\2\2&\u0143\3\2\2\2(\u0145\3\2\2\2*\u014f"+
		"\3\2\2\2,\u015f\3\2\2\2.\u016d\3\2\2\2\60\u0170\3\2\2\2\62\u0195\3\2\2"+
		"\2\64\u0197\3\2\2\2\66\u01a2\3\2\2\28\u01b3\3\2\2\2:\u01c4\3\2\2\2<\u01d4"+
		"\3\2\2\2>F\5\20\t\2?E\5\60\31\2@E\58\35\2AE\5,\27\2BE\5:\36\2CE\5<\37"+
		"\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\3\2\2JK\7/\2\2KL\5\4\3\2LM\7\25\2"+
		"\2MN\7-\2\2NO\7.\2\2OP\7\66\2\2PQ\7\4\2\2QR\7\60\2\2RS\7\2\2\3S\3\3\2"+
		"\2\2TV\5\6\4\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2Yb\5"+
		"\b\5\2Zb\5\f\7\2[\\\5\"\22\2\\]\7\66\2\2]b\3\2\2\2^b\5\34\17\2_b\5\36"+
		"\20\2`b\5 \21\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3"+
		"\2\2\2b\7\3\2\2\2ck\5\n\6\2de\5\32\16\2ef\7&\2\2fg\5\24\13\2gh\3\2\2\2"+
		"hi\7\66\2\2ik\3\2\2\2jc\3\2\2\2jd\3\2\2\2k\t\3\2\2\2lm\5\32\16\2mn\7&"+
		"\2\2no\5\26\f\2op\t\2\2\2pq\5\26\f\2qr\3\2\2\2rs\7\66\2\2s\13\3\2\2\2"+
		"tu\7C\2\2uv\7\66\2\2v\r\3\2\2\2wx\7B\2\2xy\7\66\2\2y\17\3\2\2\2z{\7\16"+
		"\2\2{|\7\63\2\2|}\5\22\n\2}~\7\63\2\2~\177\7\66\2\2\177\21\3\2\2\2\u0080"+
		"\u0084\7D\2\2\u0081\u0083\7D\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\5\2\2\u0088\23\3\2\2\2\u0089\u00a0\5\26\f\2\u008a"+
		"\u00a0\5\30\r\2\u008b\u00a0\7\36\2\2\u008c\u00a0\7\37\2\2\u008d\u00a0"+
		"\5\32\16\2\u008e\u008f\7B\2\2\u008f\u0098\7-\2\2\u0090\u0095\5\24\13\2"+
		"\u0091\u0092\78\2\2\u0092\u0094\5\24\13\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u00a0\7.\2\2\u009b\u009c\7-\2\2\u009c\u009d\5\24\13\2\u009d"+
		"\u009e\7.\2\2\u009e\u00a0\3\2\2\2\u009f\u0089\3\2\2\2\u009f\u008a\3\2"+
		"\2\2\u009f\u008b\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u008d\3\2\2\2\u009f"+
		"\u008e\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\b\f\1"+
		"\2\u00a2\u00a3\7!\2\2\u00a3\u00a6\5\26\f\6\u00a4\u00a6\7\35\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\f\5"+
		"\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00ae\5\26\f\6\u00aa\u00ab\f\4\2\2\u00ab"+
		"\u00ac\t\2\2\2\u00ac\u00ae\5\26\f\5\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\27\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\r\1\2\u00b3\u00b8\7\f\2"+
		"\2\u00b4\u00b8\7\r\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b8\5\30\r\t\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00d3\3\2"+
		"\2\2\u00b9\u00ba\f\13\2\2\u00ba\u00bb\7:\2\2\u00bb\u00d2\5\30\r\f\u00bc"+
		"\u00bd\f\n\2\2\u00bd\u00be\7;\2\2\u00be\u00d2\5\30\r\13\u00bf\u00c0\f"+
		"\b\2\2\u00c0\u00c1\7)\2\2\u00c1\u00d2\5\30\r\t\u00c2\u00c3\f\7\2\2\u00c3"+
		"\u00c4\7*\2\2\u00c4\u00d2\5\30\r\b\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7%"+
		"\2\2\u00c7\u00d2\5\30\r\7\u00c8\u00c9\f\5\2\2\u00c9\u00ca\7+\2\2\u00ca"+
		"\u00d2\5\30\r\6\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d2\5\30"+
		"\r\5\u00ce\u00cf\f\3\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d2\5\30\r\4\u00d1"+
		"\u00b9\3\2\2\2\u00d1\u00bc\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c2\3\2"+
		"\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\31\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\16\1\2\u00d7\u00e2"+
		"\7B\2\2\u00d8\u00d9\7B\2\2\u00d9\u00da\7\61\2\2\u00da\u00dd\5\24\13\2"+
		"\u00db\u00dc\78\2\2\u00dc\u00de\5\24\13\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\62\2\2\u00e0\u00e2\3\2\2\2"+
		"\u00e1\u00d6\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4"+
		"\f\3\2\2\u00e4\u00e5\13\2\2\2\u00e5\u00e7\7B\2\2\u00e6\u00e3\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\7-\2\2\u00ed\u00ee"+
		"\5\24\13\2\u00ee\u00ef\7.\2\2\u00ef\u00f1\7/\2\2\u00f0\u00f2\5\6\4\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00ff\7\60\2\2\u00f6\u00f7\7\b\2\2\u00f7"+
		"\u00fb\7/\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0100\7\60\2\2\u00ff\u00f6\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\35\3\2\2\2\u0101\u0102\7\n\2\2\u0102\u0103\7-\2\2\u0103\u0104"+
		"\5\24\13\2\u0104\u0105\7.\2\2\u0105\u0107\7/\2\2\u0106\u0108\5\6\4\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\60\2\2\u010c\37\3\2\2\2\u010d\u010e"+
		"\7\13\2\2\u010e\u010f\7-\2\2\u010f\u0110\5\24\13\2\u0110\u0111\7.\2\2"+
		"\u0111\u0113\7/\2\2\u0112\u0114\5\6\4\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7\60\2\2\u0118!\3\2\2\2\u0119\u011a\7\17\2\2\u011a\u011c\7-\2\2"+
		"\u011b\u011d\5\24\13\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u013e\7.\2\2\u011f\u0120\7\17\2\2\u0120\u0122\7-\2\2\u0121"+
		"\u0123\5\24\13\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u013e\7.\2\2\u0125\u0126\7\20\2\2\u0126\u0128\7-\2\2\u0127"+
		"\u0129\5\24\13\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u013e\7.\2\2\u012b\u012c\7\21\2\2\u012c\u012e\7-\2\2\u012d"+
		"\u012f\5\24\13\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u013e\7.\2\2\u0131\u0132\7\22\2\2\u0132\u0134\7-\2\2\u0133"+
		"\u0135\5\24\13\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u013e\7.\2\2\u0137\u0138\7\24\2\2\u0138\u0139\7-\2\2\u0139"+
		"\u013e\7.\2\2\u013a\u013b\7\25\2\2\u013b\u013c\7-\2\2\u013c\u013e\7.\2"+
		"\2\u013d\u0119\3\2\2\2\u013d\u011f\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u012b"+
		"\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u013a\3\2\2\2\u013e"+
		"#\3\2\2\2\u013f\u0142\5&\24\2\u0140\u0142\5(\25\2\u0141\u013f\3\2\2\2"+
		"\u0141\u0140\3\2\2\2\u0142%\3\2\2\2\u0143\u0144\t\4\2\2\u0144\'\3\2\2"+
		"\2\u0145\u0147\7\31\2\2\u0146\u0148\7B\2\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\7/\2\2\u014a\u014c\5.\30\2\u014b"+
		"\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\60"+
		"\2\2\u014e)\3\2\2\2\u014f\u0151\7\61\2\2\u0150\u0152\7E\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u015b\3\2\2\2\u0155\u0157\78\2\2\u0156\u0158\7E\2\2\u0157\u0156\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\7\62\2\2\u015e+\3\2\2\2\u015f\u0160\5(\25\2\u0160-\3\2\2\2\u0161"+
		"\u0162\5$\23\2\u0162\u0164\7B\2\2\u0163\u0165\5*\26\2\u0164\u0163\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\78\2\2\u0167"+
		"\u0169\7B\2\2\u0168\u016a\5*\26\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016c\3\2\2\2\u016b\u0161\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e/\3\2\2\2\u016f\u016d\3\2\2\2"+
		"\u0170\u0171\5$\23\2\u0171\u0173\7B\2\2\u0172\u0174\5*\26\2\u0173\u0172"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176\7&\2\2\u0176"+
		"\u0178\5\62\32\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0184\3"+
		"\2\2\2\u0179\u017a\78\2\2\u017a\u017c\7B\2\2\u017b\u017d\5*\26\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\7&"+
		"\2\2\u017f\u0181\5\62\32\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0179\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7\66\2\2\u0188\61\3\2\2\2\u0189\u0196\7\f\2\2\u018a\u0196\7\r\2"+
		"\2\u018b\u0196\7\35\2\2\u018c\u0196\7\36\2\2\u018d\u0196\7\37\2\2\u018e"+
		"\u0196\5\24\13\2\u018f\u0196\5\64\33\2\u0190\u0196\5\66\34\2\u0191\u0192"+
		"\7-\2\2\u0192\u0193\5\62\32\2\u0193\u0194\7.\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0189\3\2\2\2\u0195\u018a\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u018c\3\2"+
		"\2\2\u0195\u018d\3\2\2\2\u0195\u018e\3\2\2\2\u0195\u018f\3\2\2\2\u0195"+
		"\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0196\63\3\2\2\2\u0197\u0198\7/\2\2"+
		"\u0198\u019d\5\62\32\2\u0199\u019a\78\2\2\u019a\u019c\5\62\32\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\60\2\2\u01a1"+
		"\65\3\2\2\2\u01a2\u01af\7/\2\2\u01a3\u01a4\7B\2\2\u01a4\u01a5\7\67\2\2"+
		"\u01a5\u01ac\5\62\32\2\u01a6\u01a7\78\2\2\u01a7\u01a8\7B\2\2\u01a8\u01a9"+
		"\7\67\2\2\u01a9\u01ab\5\62\32\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae\3\2\2"+
		"\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\7\60\2\2\u01b2\67\3\2\2\2\u01b3\u01b4\7\32\2\2\u01b4\u01b5\5$\23"+
		"\2\u01b5\u01b7\7C\2\2\u01b6\u01b8\5*\26\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\7&\2\2\u01ba\u01bc\5\62\32\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\3\2\2\2\u01bd\u01be"+
		"\78\2\2\u01be\u01bf\7B\2\2\u01bf\u01c1\5*\26\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\66\2\2\u01c39\3\2\2\2"+
		"\u01c4\u01c6\7\33\2\2\u01c5\u01c7\7B\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7/\2\2\u01c9\u01ce\7B\2\2\u01ca"+
		"\u01cb\78\2\2\u01cb\u01cd\7B\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d2\7\60\2\2\u01d2\u01d3\7\66\2\2\u01d3;\3\2\2\2\u01d4"+
		"\u01d5\7\34\2\2\u01d5\u01d6\5$\23\2\u01d6\u01d7\7B\2\2\u01d7\u01d8\7\66"+
		"\2\2\u01d8=\3\2\2\2\66DFWaj\u0084\u0095\u0098\u009f\u00a5\u00ad\u00af"+
		"\u00b7\u00d1\u00d3\u00dd\u00e1\u00e8\u00f3\u00fb\u00ff\u0109\u0115\u011c"+
		"\u0122\u0128\u012e\u0134\u013d\u0141\u0147\u014b\u0153\u0159\u015b\u0164"+
		"\u0169\u016d\u0173\u0177\u017c\u0180\u0184\u0195\u019d\u01ac\u01af\u01b7"+
		"\u01bb\u01c0\u01c6\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}