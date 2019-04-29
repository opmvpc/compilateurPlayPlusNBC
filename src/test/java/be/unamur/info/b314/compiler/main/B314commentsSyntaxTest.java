package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314commentsSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314commentsSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    //
    // Serie comments OK
    //
    @Test
    public void testcomments_aj_testfunctions_one_void_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/aj_testfunctions_one_void_function_no_local_var.b314", testFolder.newFile(), true, "comments: aj_testfunctions_one_void_function_no_local_var");
    }

    @Test
    public void testcomments_aj_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_main_ok_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/aj_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_main_ok.b314", testFolder.newFile(), true, "comments: aj_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_main_ok");
    }

    @Test
    public void testcomments_exprBool1_main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprBool1_main.b314", testFolder.newFile(), true, "comments: exprBool1_main");
    }

    @Test
    public void testcomments_exprBool2_main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprBool2_main.b314", testFolder.newFile(), true, "comments: exprBool2_main");
    }

    @Test
    public void testcomments_exprBool3_main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprBool3_main.b314", testFolder.newFile(), true, "comments: exprBool3_main");
    }

    @Test
    public void testcomments_exprEntiere1_Main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprEntiere1_Main.b314", testFolder.newFile(), true, "comments: exprEntiere1_Main");
    }

    @Test
    public void testcomments_exprEntiere2_Main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprEntiere2_Main.b314", testFolder.newFile(), true, "comments: exprEntiere2_Main");
    }

    @Test
    public void testcomments_function10_bool_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function10_bool_no_local_var.b314", testFolder.newFile(), true, "comments: function10_bool_no_local_var");
    }

    @Test
    public void testcomments_function2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function2.b314", testFolder.newFile(), true, "comments: function2");
    }

    @Test
    public void testcomments_function3_TypeArgs_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function3_TypeArgs.b314", testFolder.newFile(), true, "comments: function3_TypeArgs");
    }

    @Test
    public void testcomments_function4_TypeArgs_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function4_TypeArgs.b314", testFolder.newFile(), true, "comments: function4_TypeArgs");
    }

    @Test
    public void testcomments_function6_returnType_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function6_returnType.b314", testFolder.newFile(), true, "comments: function6_returnType");
    }

    @Test
    public void testcomments_function7_returnType_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function7_returnType.b314", testFolder.newFile(), true, "comments: function7_returnType");
    }

    @Test
    public void testcomments_function8_affectReturnType_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function8_affectReturnType.b314", testFolder.newFile(), true, "comments: function8_affectReturnType");
    }

    @Test
    public void testcomments_function9_affectReturnType_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function9_affectReturnType.b314", testFolder.newFile(), true, "comments: function9_affectReturnType");
    }

    @Test
    public void testcomments_if1_conditionChar_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if1_conditionChar.b314", testFolder.newFile(), true, "comments: if1_conditionChar");
    }

    @Test
    public void testcomments_if2_conditionChar_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if2_conditionChar.b314", testFolder.newFile(), true, "comments: if2_conditionChar");
    }

    @Test
    public void testcomments_j_testfunctions_one_square_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_one_square_function_no_local_var.b314", testFolder.newFile(), true, "comments: j_testfunctions_one_square_function_no_local_var");
    }

    @Test
    public void testcomments_j_testfunctions_one_void_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_one_void_function_no_local_var.b314", testFolder.newFile(), true, "comments: j_testfunctions_one_void_function_no_local_var");
    }

    @Test
    public void testcomments_j_testlocalvariabledecl_fct_local_variable_diff_names_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testlocalvariabledecl_fct_local_variable_diff_names.b314", testFolder.newFile(), true, "comments: j_testlocalvariabledecl_fct_local_variable_diff_names");
    }

    @Test
    public void testcomments_j_testlocalvariabledecl_fct_local_var_diff_names_than_global_vars_ok_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testlocalvariabledecl_fct_local_var_diff_names_than_global_vars_ok.b314", testFolder.newFile(), true, "comments: j_testlocalvariabledecl_fct_local_var_diff_names_than_global_vars_ok");
    }

    @Test
    public void testcomments_j_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_ok_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_ok.b314", testFolder.newFile(), true, "comments: j_testlocalvariabledecl_while_local_var_same_names_and_different_types_than_global_vars_ok");
    }

    @Test
    public void testcomments_j_testwhile_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testwhile.b314", testFolder.newFile(), true, "comments: j_testwhile");
    }

    @Test
    public void testcomments_naming10_GlobalVarSameNameLocalDiffTypes_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/naming10_GlobalVarSameNameLocalDiffTypes.b314", testFolder.newFile(), true, "comments: naming10_GlobalVarSameNameLocalDiffTypes");
    }

    @Test
    public void testcomments_naming1_mainSameVarAsGlobal_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/naming1_mainSameVarAsGlobal.b314", testFolder.newFile(), true, "comments: naming1_mainSameVarAsGlobal");
    }

    @Test
    public void testcomments_structCall1_subArrayCall_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structCall1_subArrayCall.b314", testFolder.newFile(), true, "comments: structCall1_subArrayCall");
    }

    @Test
    public void testcomments_structs3_SubStructs_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs3_SubStructs.b314", testFolder.newFile(), true, "comments: structs3_SubStructs");
    }

    @Test
    public void testcomments_structs4_SubStructsCall_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs4_SubStructsCall.b314", testFolder.newFile(), true, "comments: structs4_SubStructsCall");
    }

    @Test
    public void testcomments_types1_multvars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/types1_multvars.b314", testFolder.newFile(), true, "comments: types1_multvars");
    }

    //
    // Serie comments KO
    //
    @Test
    public void testcomments_actions1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions1.b314", testFolder.newFile(), false, "comments: actions1");
    }

    @Test
    public void testcomments_actions2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions2.b314", testFolder.newFile(), false, "comments: actions2");
    }

    @Test
    public void testcomments_actions3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions3.b314", testFolder.newFile(), false, "comments: actions3");
    }

    @Test
    public void testcomments_actions4_WrongTypeCharLeftAction_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions4_WrongTypeCharLeftAction.b314", testFolder.newFile(), false, "comments: actions4_WrongTypeCharLeftAction");
    }

    @Test
    public void testcomments_aj_testaffectinstruction_affect_env_var_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/aj_testaffectinstruction_affect_env_var_ko.b314", testFolder.newFile(), false, "comments: aj_testaffectinstruction_affect_env_var_ko");
    }

    @Test
    public void testcomments_array1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/array1.b314", testFolder.newFile(), false, "comments: array1");
    }

    @Test
    public void testcomments_array2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/array2.b314", testFolder.newFile(), false, "comments: array2");
    }

    @Test
    public void testcomments_array3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/array3.b314", testFolder.newFile(), false, "comments: array3");
    }

    @Test
    public void testcomments_bool1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/bool1.b314", testFolder.newFile(), false, "comments: bool1");
    }

    @Test
    public void testcomments_bool2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/bool2.b314", testFolder.newFile(), false, "comments: bool2");
    }

    @Test
    public void testcomments_exprBool1_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool1_main.b314", testFolder.newFile(), false, "comments: exprBool1_main");
    }

    @Test
    public void testcomments_exprBool2_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool2_main.b314", testFolder.newFile(), false, "comments: exprBool2_main");
    }

    @Test
    public void testcomments_exprBool3_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool3_main.b314", testFolder.newFile(), false, "comments: exprBool3_main");
    }

    @Test
    public void testcomments_exprBool4_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool4_main.b314", testFolder.newFile(), false, "comments: exprBool4_main");
    }

    @Test
    public void testcomments_exprBool5_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool5_main.b314", testFolder.newFile(), false, "comments: exprBool5_main");
    }

    @Test
    public void testcomments_exprBool6_main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprBool6_main.b314", testFolder.newFile(), false, "comments: exprBool6_main");
    }

    @Test
    public void testcomments_exprEntiere1_Main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprEntiere1_Main.b314", testFolder.newFile(), false, "comments: exprEntiere1_Main");
    }

    @Test
    public void testcomments_exprEntiere2_Main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprEntiere2_Main.b314", testFolder.newFile(), false, "comments: exprEntiere2_Main");
    }

    @Test
    public void testcomments_exprEntiere3_Main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprEntiere3_Main.b314", testFolder.newFile(), false, "comments: exprEntiere3_Main");
    }

    @Test
    public void testcomments_exprEntiere4_Main_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/exprEntiere4_Main.b314", testFolder.newFile(), false, "comments: exprEntiere4_Main");
    }

    @Test
    public void testcomments_function1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function1.b314", testFolder.newFile(), false, "comments: function1");
    }

    @Test
    public void testcomments_function2_mistake_boolean_function_return_Type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function2_mistake_boolean_function_return_Type.b314", testFolder.newFile(), false, "comments: function2_mistake_boolean_function_return_Type");
    }

    @Test
    public void testcomments_function3_arg_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function3_arg_type.b314", testFolder.newFile(), false, "comments: function3_arg_type");
    }

    @Test
    public void testcomments_function3_wrong_number_args_call_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function3_wrong_number_args_call.b314", testFolder.newFile(), false, "comments: function3_wrong_number_args_call");
    }

    @Test
    public void testcomments_function4_arg_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function4_arg_type.b314", testFolder.newFile(), false, "comments: function4_arg_type");
    }

    @Test
    public void testcomments_function5_return_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function5_return_type.b314", testFolder.newFile(), false, "comments: function5_return_type");
    }

    @Test
    public void testcomments_function5_TypeArgs_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function5_TypeArgs.b314", testFolder.newFile(), false, "comments: function5_TypeArgs");
    }

    @Test
    public void testcomments_function6_return_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function6_return_type.b314", testFolder.newFile(), false, "comments: function6_return_type");
    }

    @Test
    public void testcomments_function7_return_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function7_return_type.b314", testFolder.newFile(), false, "comments: function7_return_type");
    }

    @Test
    public void testcomments_function8_affect_return_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function8_affect_return_type.b314", testFolder.newFile(), false, "comments: function8_affect_return_type");
    }

    @Test
    public void testcomments_if1_wrongCondition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/if1_wrongCondition.b314", testFolder.newFile(), false, "comments: if1_wrongCondition");
    }

    @Test
    public void testcomments_if2_wrongCondition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/if2_wrongCondition.b314", testFolder.newFile(), false, "comments: if2_wrongCondition");
    }

    @Test
    public void testcomments_import1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import1.b314", testFolder.newFile(), false, "comments: import1");
    }

    @Test
    public void testcomments_import2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import2.b314", testFolder.newFile(), false, "comments: import2");
    }

    @Test
    public void testcomments_import3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import3.b314", testFolder.newFile(), false, "comments: import3");
    }

    @Test
    public void testcomments_import4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import4.b314", testFolder.newFile(), false, "comments: import4");
    }

    @Test
    public void testcomments_j_new_testboolexpressions_and_env_var_wrong_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_new_testboolexpressions_and_env_var_wrong_type_ko.b314", testFolder.newFile(), false, "comments: j_new_testboolexpressions_and_env_var_wrong_type_ko");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affects_constant_wrong_var_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testaffectinstruction_affects_constant_wrong_var_type_ko.b314", testFolder.newFile(), false, "comments: j_testaffectinstruction_affects_constant_wrong_var_type_ko");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_array_right_expressions_no_index_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testaffectinstruction_affect_array_right_expressions_no_index_ko.b314", testFolder.newFile(), false, "comments: j_testaffectinstruction_affect_array_right_expressions_no_index_ko");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_constant_wrong_var_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testaffectinstruction_affect_constant_wrong_var_type_ko.b314", testFolder.newFile(), false, "comments: j_testaffectinstruction_affect_constant_wrong_var_type_ko");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko.b314", testFolder.newFile(), false, "comments: j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko");
    }

    @Test
    public void testcomments_j_testboolexpressions_equals_mismatching_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testboolexpressions_equals_mismatching_type_ko.b314", testFolder.newFile(), false, "comments: j_testboolexpressions_equals_mismatching_type_ko");
    }

    @Test
    public void testcomments_j_testboolexpressions_lessthan_env_var_wrong_type_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testboolexpressions_lessthan_env_var_wrong_type_ko.b314", testFolder.newFile(), false, "comments: j_testboolexpressions_lessthan_env_var_wrong_type_ko");
    }

    @Test
    public void testcomments_j_testboolexpressions_wrong_type_in_sub_expression_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testboolexpressions_wrong_type_in_sub_expression_ko.b314", testFolder.newFile(), false, "comments: j_testboolexpressions_wrong_type_in_sub_expression_ko");
    }

    @Test
    public void testcomments_j_testcomments_missing_numbers_size_play_card_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testcomments_missing_numbers_size_play_card_ko.b314", testFolder.newFile(), false, "comments: j_testcomments_missing_numbers_size_play_card_ko");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_down_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testnextinstruction_action_move_down_ko.b314", testFolder.newFile(), false, "comments: j_testnextinstruction_action_move_down_ko");
    }

    @Test
    public void testcomments_j_testwhileinstruction_repeat_wrong_expression_and_condition_ko_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/j_testwhileinstruction_repeat_wrong_expression_and_condition_ko.b314", testFolder.newFile(), false, "comments: j_testwhileinstruction_repeat_wrong_expression_and_condition_ko");
    }

    @Test
    public void testcomments_mainprogram1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram1.b314", testFolder.newFile(), false, "comments: mainprogram1");
    }

    @Test
    public void testcomments_mainprogram2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram2.b314", testFolder.newFile(), false, "comments: mainprogram2");
    }

    @Test
    public void testcomments_mainprogram3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram3.b314", testFolder.newFile(), false, "comments: mainprogram3");
    }

    @Test
    public void testcomments_mainprogram4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram4.b314", testFolder.newFile(), false, "comments: mainprogram4");
    }

    @Test
    public void testcomments_mainprogram5_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram5.b314", testFolder.newFile(), false, "comments: mainprogram5");
    }

    @Test
    public void testcomments_missing_declare_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_declare_bloc.b314", testFolder.newFile(), false, "comments: missing_declare_bloc");
    }

    @Test
    public void testcomments_missing_default_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_default_bloc.b314", testFolder.newFile(), false, "comments: missing_default_bloc");
    }

    @Test
    public void testcomments_naming1_localVarNameNotInArgs_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming1_localVarNameNotInArgs.b314", testFolder.newFile(), false, "comments: naming1_localVarNameNotInArgs");
    }

    @Test
    public void testcomments_naming2_globalVar_not_a_function_name_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming2_globalVar_not_a_function_name.b314", testFolder.newFile(), false, "comments: naming2_globalVar_not_a_function_name");
    }

    @Test
    public void testcomments_naming3_localVarNameNotFunctionName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming3_localVarNameNotFunctionName.b314", testFolder.newFile(), false, "comments: naming3_localVarNameNotFunctionName");
    }

    @Test
    public void testcomments_naming4_ArgNameNotFunctionName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming4_ArgNameNotFunctionName.b314", testFolder.newFile(), false, "comments: naming4_ArgNameNotFunctionName");
    }

    @Test
    public void testcomments_naming5_FunctSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming5_FunctSameName.b314", testFolder.newFile(), false, "comments: naming5_FunctSameName");
    }

    @Test
    public void testcomments_naming6_FunctParamsSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming6_FunctParamsSameName.b314", testFolder.newFile(), false, "comments: naming6_FunctParamsSameName");
    }

    @Test
    public void testcomments_naming7_LocalVarSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming7_LocalVarSameName.b314", testFolder.newFile(), false, "comments: naming7_LocalVarSameName");
    }

    @Test
    public void testcomments_naming8_GlobalVarSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming8_GlobalVarSameName.b314", testFolder.newFile(), false, "comments: naming8_GlobalVarSameName");
    }

    @Test
    public void testcomments_naming9_LocalVarSameNameAsGlobalVar_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming9_LocalVarSameNameAsGlobalVar.b314", testFolder.newFile(), false, "comments: naming9_LocalVarSameNameAsGlobalVar");
    }

    @Test
    public void testcomments_null_pointer_functions_one_void_function_no_local_var_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/null_pointer_functions_one_void_function_no_local_var.b314", testFolder.newFile(), false, "comments: null_pointer_functions_one_void_function_no_local_var");
    }

    @Test
    public void testcomments_repeat1_wrongCondition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/repeat1_wrongCondition.b314", testFolder.newFile(), false, "comments: repeat1_wrongCondition");
    }

    @Test
    public void testcomments_repeat2_wrongCondition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/repeat2_wrongCondition.b314", testFolder.newFile(), false, "comments: repeat2_wrongCondition");
    }

    @Test
    public void testcomments_structs3_WrongSubStructsCall_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/structs3_WrongSubStructsCall.b314", testFolder.newFile(), false, "comments: structs3_WrongSubStructsCall");
    }

    @Test
    public void testcomments_structure1_wrongVarCall_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/structure1_wrongVarCall.b314", testFolder.newFile(), false, "comments: structure1_wrongVarCall");
    }

    @Test
    public void testcomments_structure2_callSubstrucThatDoesntExist_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/structure2_callSubstrucThatDoesntExist.b314", testFolder.newFile(), false, "comments: structure2_callSubstrucThatDoesntExist");
    }

    @Test
    public void testcomments_testcarte1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte1.b314", testFolder.newFile(), false, "comments: testcarte1");
    }

    @Test
    public void testcomments_testcarte2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte2.b314", testFolder.newFile(), false, "comments: testcarte2");
    }

    @Test
    public void testcomments_testcarte3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte3.b314", testFolder.newFile(), false, "comments: testcarte3");
    }

    @Test
    public void testcomments_testcarte3_wrong_param_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte3_wrong_param.b314", testFolder.newFile(), false, "comments: testcarte3_wrong_param");
    }

    @Test
    public void testcomments_testcarte4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte4.b314", testFolder.newFile(), false, "comments: testcarte4");
    }

    @Test
    public void testcomments_testcarte5_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte5.b314", testFolder.newFile(), false, "comments: testcarte5");
    }

    @Test
    public void testcomments_testcarte6_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte6.b314", testFolder.newFile(), false, "comments: testcarte6");
    }

    @Test
    public void testcomments_testcomments1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments1.b314", testFolder.newFile(), false, "comments: testcomments1");
    }

    @Test
    public void testcomments_testcomments2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments2.b314", testFolder.newFile(), false, "comments: testcomments2");
    }

    @Test
    public void testcomments_testcomments3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments3.b314", testFolder.newFile(), false, "comments: testcomments3");
    }

    @Test
    public void testcomments_test_constante_01_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/test_constante_01.b314", testFolder.newFile(), false, "comments: test_constante_01");
    }

    @Test
    public void testcomments_tomanyparen_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/tomanyparen.b314", testFolder.newFile(), false, "comments: tomanyparen");
    }

    @Test
    public void testcomments_varScopes1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/varScopes1.b314", testFolder.newFile(), false, "comments: varScopes1");
    }

    @Test
    public void testcomments_varScopes2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/varScopes2.b314", testFolder.newFile(), false, "comments: varScopes2");
    }

    @Test
    public void testcomments_while1_wrongCondition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/while1_wrongCondition.b314", testFolder.newFile(), false, "comments: while1_wrongCondition");
    }

}