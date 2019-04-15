// Generated from PlayPlus.g4 by ANTLR 4.6

    package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mapfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapfile(PlayPlusParser.MapfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mapsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapsize(PlayPlusParser.MapsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#monde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonde(PlayPlusParser.MondeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PlayPlusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#implDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplDecl(PlayPlusParser.ImplDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#impKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpKeyWord(PlayPlusParser.ImpKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(PlayPlusParser.GlobalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#localDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecl(PlayPlusParser.LocalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(PlayPlusParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mainStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStart(PlayPlusParser.MainStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mainEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainEnd(PlayPlusParser.MainEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mainRet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainRet(PlayPlusParser.MainRetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PlayPlusParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlayPlusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#returnInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInstr(PlayPlusParser.ReturnInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#affectInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(PlayPlusParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(PlayPlusParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(PlayPlusParser.FuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PlayPlusParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#constantExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(PlayPlusParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#conditionalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#repeatStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PlayPlusParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#dig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(PlayPlusParser.DigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#mytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMytype(PlayPlusParser.MytypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures(PlayPlusParser.StructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrays(PlayPlusParser.ArraysContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#structDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDecl(PlayPlusParser.StructDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#listStrucName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStrucName(PlayPlusParser.ListStrucNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#listVarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVarName(PlayPlusParser.ListVarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitStruct(PlayPlusParser.InitStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#typedefDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDecl(PlayPlusParser.TypedefDeclContext ctx);
}