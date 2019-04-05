// Generated from PlayPlus.g4 by ANTLR 4.6

    package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mapfile}.
	 * @param ctx the parse tree
	 */
	void enterMapfile(PlayPlusParser.MapfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mapfile}.
	 * @param ctx the parse tree
	 */
	void exitMapfile(PlayPlusParser.MapfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#monde}.
	 * @param ctx the parse tree
	 */
	void enterMonde(PlayPlusParser.MondeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#monde}.
	 * @param ctx the parse tree
	 */
	void exitMonde(PlayPlusParser.MondeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PlayPlusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PlayPlusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#implDecl}.
	 * @param ctx the parse tree
	 */
	void enterImplDecl(PlayPlusParser.ImplDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#implDecl}.
	 * @param ctx the parse tree
	 */
	void exitImplDecl(PlayPlusParser.ImplDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#impKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterImpKeyWord(PlayPlusParser.ImpKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#impKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitImpKeyWord(PlayPlusParser.ImpKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(PlayPlusParser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(PlayPlusParser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(PlayPlusParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(PlayPlusParser.LocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(PlayPlusParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(PlayPlusParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void enterMainStart(PlayPlusParser.MainStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void exitMainStart(PlayPlusParser.MainStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainEnd}.
	 * @param ctx the parse tree
	 */
	void enterMainEnd(PlayPlusParser.MainEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainEnd}.
	 * @param ctx the parse tree
	 */
	void exitMainEnd(PlayPlusParser.MainEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainDig}.
	 * @param ctx the parse tree
	 */
	void enterMainDig(PlayPlusParser.MainDigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainDig}.
	 * @param ctx the parse tree
	 */
	void exitMainDig(PlayPlusParser.MainDigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mainRet}.
	 * @param ctx the parse tree
	 */
	void enterMainRet(PlayPlusParser.MainRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mainRet}.
	 * @param ctx the parse tree
	 */
	void exitMainRet(PlayPlusParser.MainRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PlayPlusParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PlayPlusParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlayPlusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlayPlusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#returnInstr}.
	 * @param ctx the parse tree
	 */
	void enterReturnInstr(PlayPlusParser.ReturnInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#returnInstr}.
	 * @param ctx the parse tree
	 */
	void exitReturnInstr(PlayPlusParser.ReturnInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#affectInstr}.
	 * @param ctx the parse tree
	 */
	void enterAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#affectInstr}.
	 * @param ctx the parse tree
	 */
	void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PlayPlusParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PlayPlusParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(PlayPlusParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(PlayPlusParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(PlayPlusParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PlayPlusParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PlayPlusParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#dig}.
	 * @param ctx the parse tree
	 */
	void enterDig(PlayPlusParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#dig}.
	 * @param ctx the parse tree
	 */
	void exitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#mytype}.
	 * @param ctx the parse tree
	 */
	void enterMytype(PlayPlusParser.MytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#mytype}.
	 * @param ctx the parse tree
	 */
	void exitMytype(PlayPlusParser.MytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures(PlayPlusParser.StructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures(PlayPlusParser.StructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#arrays}.
	 * @param ctx the parse tree
	 */
	void enterArrays(PlayPlusParser.ArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#arrays}.
	 * @param ctx the parse tree
	 */
	void exitArrays(PlayPlusParser.ArraysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(PlayPlusParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(PlayPlusParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#listStrucName}.
	 * @param ctx the parse tree
	 */
	void enterListStrucName(PlayPlusParser.ListStrucNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#listStrucName}.
	 * @param ctx the parse tree
	 */
	void exitListStrucName(PlayPlusParser.ListStrucNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#listVarName}.
	 * @param ctx the parse tree
	 */
	void enterListVarName(PlayPlusParser.ListVarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#listVarName}.
	 * @param ctx the parse tree
	 */
	void exitListVarName(PlayPlusParser.ListVarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 */
	void enterInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 */
	void exitInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initStruct}.
	 * @param ctx the parse tree
	 */
	void enterInitStruct(PlayPlusParser.InitStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initStruct}.
	 * @param ctx the parse tree
	 */
	void exitInitStruct(PlayPlusParser.InitStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#typedefDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDecl(PlayPlusParser.TypedefDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#typedefDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDecl(PlayPlusParser.TypedefDeclContext ctx);
}