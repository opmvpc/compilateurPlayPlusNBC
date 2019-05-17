// Generated from PlayPlus.g4 by ANTLR 4.6

package be.unamur.info.b314.compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link PlayPlusParser#root}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterRoot(PlayPlusParser.RootContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#root}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitRoot(PlayPlusParser.RootContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mapfile}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMapfile(PlayPlusParser.MapfileContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mapfile}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMapfile(PlayPlusParser.MapfileContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mapsize}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMapsize(PlayPlusParser.MapsizeContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mapsize}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMapsize(PlayPlusParser.MapsizeContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#world}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterWorld(PlayPlusParser.WorldContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#world}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitWorld(PlayPlusParser.WorldContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#coordX}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterCoordX(PlayPlusParser.CoordXContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#coordX}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitCoordX(PlayPlusParser.CoordXContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#coordY}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterCoordY(PlayPlusParser.CoordYContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#coordY}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitCoordY(PlayPlusParser.CoordYContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#line}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterLine(PlayPlusParser.LineContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#line}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitLine(PlayPlusParser.LineContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#element}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterElement(PlayPlusParser.ElementContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#element}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitElement(PlayPlusParser.ElementContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#program}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterProgram(PlayPlusParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#program}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitProgram(PlayPlusParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#implDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterImplDecl(PlayPlusParser.ImplDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#implDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitImplDecl(PlayPlusParser.ImplDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#impKeyWord}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterImpKeyWord(PlayPlusParser.ImpKeyWordContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#impKeyWord}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitImpKeyWord(PlayPlusParser.ImpKeyWordContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#fileDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFileDecl(PlayPlusParser.FileDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#fileDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFileDecl(PlayPlusParser.FileDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#fileName}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFileName(PlayPlusParser.FileNameContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#fileName}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFileName(PlayPlusParser.FileNameContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#globalDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterGlobalDecl(PlayPlusParser.GlobalDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#globalDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitGlobalDecl(PlayPlusParser.GlobalDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#localDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterLocalDecl(PlayPlusParser.LocalDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#localDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitLocalDecl(PlayPlusParser.LocalDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mainDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMainDecl(PlayPlusParser.MainDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mainDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMainDecl(PlayPlusParser.MainDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mainProgram}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMainProgram(PlayPlusParser.MainProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mainProgram}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMainProgram(PlayPlusParser.MainProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mainStart}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMainStart(PlayPlusParser.MainStartContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mainStart}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMainStart(PlayPlusParser.MainStartContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mainEnd}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMainEnd(PlayPlusParser.MainEndContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mainEnd}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMainEnd(PlayPlusParser.MainEndContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mainRet}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMainRet(PlayPlusParser.MainRetContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mainRet}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMainRet(PlayPlusParser.MainRetContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#statements}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStatements(PlayPlusParser.StatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#statements}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStatements(PlayPlusParser.StatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStatement(PlayPlusParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStatement(PlayPlusParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#returnInstr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterReturnInstr(PlayPlusParser.ReturnInstrContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#returnInstr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitReturnInstr(PlayPlusParser.ReturnInstrContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#affectInstr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterAffectInstr(PlayPlusParser.AffectInstrContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#affectInstr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcArgs}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncArgs(PlayPlusParser.FuncArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcArgs}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncArgs(PlayPlusParser.FuncArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcArg}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncArg(PlayPlusParser.FuncArgContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcArg}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncArg(PlayPlusParser.FuncArgContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcCall}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncCall(PlayPlusParser.FuncCallContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcCall}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncCall(PlayPlusParser.FuncCallContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcCallArgs}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncCallArgs(PlayPlusParser.FuncCallArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcCallArgs}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncCallArgs(PlayPlusParser.FuncCallArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#funcCallArg}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFuncCallArg(PlayPlusParser.FuncCallArgContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#funcCallArg}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFuncCallArg(PlayPlusParser.FuncCallArgContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#constantExpr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConstantExpr(PlayPlusParser.ConstantExprContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#constantExpr}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConstantExpr(PlayPlusParser.ConstantExprContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#exprD}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExprD(PlayPlusParser.ExprDContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#exprD}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExprD(PlayPlusParser.ExprDContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#operateurEntier}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperateurEntier(PlayPlusParser.OperateurEntierContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#operateurEntier}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperateurEntier(PlayPlusParser.OperateurEntierContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#exprEnt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExprEnt(PlayPlusParser.ExprEntContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#exprEnt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExprEnt(PlayPlusParser.ExprEntContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#naturel}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterNaturel(PlayPlusParser.NaturelContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#naturel}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitNaturel(PlayPlusParser.NaturelContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#exprBool}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExprBool(PlayPlusParser.ExprBoolContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#exprBool}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExprBool(PlayPlusParser.ExprBoolContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#boolVal}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterBoolVal(PlayPlusParser.BoolValContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#boolVal}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitBoolVal(PlayPlusParser.BoolValContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#boolLiteral}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterBoolLiteral(PlayPlusParser.BoolLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#boolLiteral}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitBoolLiteral(PlayPlusParser.BoolLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#charVal}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterCharVal(PlayPlusParser.CharValContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#charVal}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitCharVal(PlayPlusParser.CharValContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#exprG}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExprG(PlayPlusParser.ExprGContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#exprG}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExprG(PlayPlusParser.ExprGContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#structRef}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStructRef(PlayPlusParser.StructRefContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#structRef}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStructRef(PlayPlusParser.StructRefContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#members}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMembers(PlayPlusParser.MembersContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#members}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMembers(PlayPlusParser.MembersContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#member}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMember(PlayPlusParser.MemberContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#member}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMember(PlayPlusParser.MemberContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#arrayRef}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterArrayRef(PlayPlusParser.ArrayRefContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#arrayRef}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitArrayRef(PlayPlusParser.ArrayRefContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#conditionalStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#conditionalStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#repeatStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterRepeatStmt(PlayPlusParser.RepeatStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#repeatStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#whileStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterWhileStmt(PlayPlusParser.WhileStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#whileStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitWhileStmt(PlayPlusParser.WhileStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#ifStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterIfStmt(PlayPlusParser.IfStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#ifStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitIfStmt(PlayPlusParser.IfStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#elseStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterElseStmt(PlayPlusParser.ElseStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#elseStmt}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitElseStmt(PlayPlusParser.ElseStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#boolCondition}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterBoolCondition(PlayPlusParser.BoolConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#boolCondition}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitBoolCondition(PlayPlusParser.BoolConditionContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#repeatCondition}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterRepeatCondition(PlayPlusParser.RepeatConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#repeatCondition}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitRepeatCondition(PlayPlusParser.RepeatConditionContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#actionType}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterActionType(PlayPlusParser.ActionTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#actionType}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitActionType(PlayPlusParser.ActionTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#dig}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterDig(PlayPlusParser.DigContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#dig}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitDig(PlayPlusParser.DigContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#mytype}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMytype(PlayPlusParser.MytypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#mytype}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMytype(PlayPlusParser.MytypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#scalar}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterScalar(PlayPlusParser.ScalarContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#scalar}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitScalar(PlayPlusParser.ScalarContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#arrays}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterArrays(PlayPlusParser.ArraysContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#arrays}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitArrays(PlayPlusParser.ArraysContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#arrayIndex}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterArrayIndex(PlayPlusParser.ArrayIndexContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#arrayIndex}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitArrayIndex(PlayPlusParser.ArrayIndexContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#firstDimension}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFirstDimension(PlayPlusParser.FirstDimensionContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#firstDimension}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFirstDimension(PlayPlusParser.FirstDimensionContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#secondDimension}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterSecondDimension(PlayPlusParser.SecondDimensionContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#secondDimension}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitSecondDimension(PlayPlusParser.SecondDimensionContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#structDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStructDecl(PlayPlusParser.StructDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#structDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStructDecl(PlayPlusParser.StructDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#structures}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStructures(PlayPlusParser.StructuresContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#structures}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStructures(PlayPlusParser.StructuresContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#listStructFields}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterListStructFields(PlayPlusParser.ListStructFieldsContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#listStructFields}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitListStructFields(PlayPlusParser.ListStructFieldsContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#structField}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStructField(PlayPlusParser.StructFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#structField}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStructField(PlayPlusParser.StructFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#field}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterField(PlayPlusParser.FieldContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#field}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitField(PlayPlusParser.FieldContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#varDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterVarDecl(PlayPlusParser.VarDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#varDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitVarDecl(PlayPlusParser.VarDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#subVarDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterSubVarDecl(PlayPlusParser.SubVarDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#subVarDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitSubVarDecl(PlayPlusParser.SubVarDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#initVariable}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterInitVariable(PlayPlusParser.InitVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#initVariable}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitInitVariable(PlayPlusParser.InitVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#initArrays}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterInitArrays(PlayPlusParser.InitArraysContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#initArrays}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitInitArrays(PlayPlusParser.InitArraysContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#initStruct}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterInitStruct(PlayPlusParser.InitStructContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#initStruct}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitInitStruct(PlayPlusParser.InitStructContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#constDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConstDecl(PlayPlusParser.ConstDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#constDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConstDecl(PlayPlusParser.ConstDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#enumDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterEnumDecl(PlayPlusParser.EnumDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#enumDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitEnumDecl(PlayPlusParser.EnumDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link PlayPlusParser#typedefDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterTypedefDecl(PlayPlusParser.TypedefDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link PlayPlusParser#typedefDecl}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitTypedefDecl(PlayPlusParser.TypedefDeclContext ctx);
}