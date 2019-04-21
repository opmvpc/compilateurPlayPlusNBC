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
    public void testcomments_testarrays3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays3.b314", testFolder.newFile(), true, "comments: testarrays3");
    }

    @Test
    public void testcomments_affectation2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affectation2.b314", testFolder.newFile(), true, "comments: affectation2");
    }

    @Test
    public void testcomments_testruleprogramme01_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testruleprogramme01.b314", testFolder.newFile(), true, "comments: testruleprogramme01");
    }

    @Test
    public void testcomments_j_testboolexpressions_equals_mismatching_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_equals_mismatching_type_ko.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_equals_mismatching_type_ko");
    }

    @Test
    public void testcomments_actions3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions3.b314", testFolder.newFile(), true, "comments: actions3");
    }

    @Test
    public void testcomments_import2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import2.b314", testFolder.newFile(), true, "comments: import2");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_left_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_left.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_left");
    }

    @Test
    public void testcomments_testcarte5_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte5.b314", testFolder.newFile(), true, "comments: testcarte5");
    }

    @Test
    public void testcomments_import1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import1.b314", testFolder.newFile(), true, "comments: import1");
    }

    @Test
    public void testcomments_globalvardeclaration1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/globalvardeclaration1.b314", testFolder.newFile(), true, "comments: globalvardeclaration1");
    }

    @Test
    public void testcomments_mainprogram3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram3.b314", testFolder.newFile(), true, "comments: mainprogram3");
    }

    @Test
    public void testcomments_actions2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions2.b314", testFolder.newFile(), true, "comments: actions2");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_constant_wrong_var_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testaffectinstruction_affect_constant_wrong_var_type_ko.b314", testFolder.newFile(), true, "comments: j_testaffectinstruction_affect_constant_wrong_var_type_ko");
    }

    @Test
    public void testcomments_j_testfunctions_multiple_global_vars_and_functions_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_multiple_global_vars_and_functions_no_local_var.b314", testFolder.newFile(), true, "comments: j_testfunctions_multiple_global_vars_and_functions_no_local_var");
    }

    @Test
    public void testcomments_structure1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structure1.b314", testFolder.newFile(), true, "comments: structure1");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_jump_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_jump_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_jump_right");
    }

    @Test
    public void testcomments_j_testcomments_missing_numbers_size_play_card_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testcomments_missing_numbers_size_play_card_ko.b314", testFolder.newFile(), true, "comments: j_testcomments_missing_numbers_size_play_card_ko");
    }

    @Test
    public void testcomments_mainprogram4_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram4.b314", testFolder.newFile(), true, "comments: mainprogram4");
    }

    @Test
    public void testcomments_vardeclaration1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/vardeclaration1.b314", testFolder.newFile(), true, "comments: vardeclaration1");
    }

    @Test
    public void testcomments_j_testboolexpressions_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_constant_values.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_constant_values");
    }

    @Test
    public void testcomments_affectation1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affectation1.b314", testFolder.newFile(), true, "comments: affectation1");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affects_constant_wrong_var_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testaffectinstruction_affects_constant_wrong_var_type_ko.b314", testFolder.newFile(), true, "comments: j_testaffectinstruction_affects_constant_wrong_var_type_ko");
    }

    @Test
    public void testcomments_enums1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/enums1.b314", testFolder.newFile(), true, "comments: enums1");
    }

    @Test
    public void testcomments_testcomments1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments1.b314", testFolder.newFile(), true, "comments: testcomments1");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_use_jump_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_use_jump.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_use_jump");
    }

    @Test
    public void testcomments_testcarte2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte2.b314", testFolder.newFile(), true, "comments: testcarte2");
    }

    @Test
    public void testcomments_testcarte3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte3.b314", testFolder.newFile(), true, "comments: testcarte3");
    }

    @Test
    public void testcomments_mainprogram2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram2.b314", testFolder.newFile(), true, "comments: mainprogram2");
    }

    @Test
    public void testcomments_vardeclaration2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/vardeclaration2.b314", testFolder.newFile(), true, "comments: vardeclaration2");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_right");
    }

    @Test
    public void testcomments_mainprogram1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram1.b314", testFolder.newFile(), true, "comments: mainprogram1");
    }

    @Test
    public void testcomments_testcomments3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments3.b314", testFolder.newFile(), true, "comments: testcomments3");
    }

    @Test
    public void testcomments_j_testwhile_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testwhile.b314", testFolder.newFile(), true, "comments: j_testwhile");
    }

    @Test
    public void testcomments_j_testboolexpressions_check_global_var_is_initilized_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_check_global_var_is_initilized.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_check_global_var_is_initilized");
    }

    @Test
    public void testcomments_typedef_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/typedef.b314", testFolder.newFile(), true, "comments: typedef");
    }

    @Test
    public void testcomments_structs2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs2.b314", testFolder.newFile(), true, "comments: structs2");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_down_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_down_ko.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_down_ko");
    }

    @Test
    public void testcomments_j_testboolexpressions_wrong_type_in_sub_expression_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_wrong_type_in_sub_expression_ko.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_wrong_type_in_sub_expression_ko");
    }

    @Test
    public void testcomments_actions1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions1.b314", testFolder.newFile(), true, "comments: actions1");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_up_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_up.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_up");
    }

    @Test
    public void testcomments_j_testfunctions_one_int_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_one_int_function_no_local_var.b314", testFolder.newFile(), true, "comments: j_testfunctions_one_int_function_no_local_var");
    }

    @Test
    public void testcomments_j_testboolexpressions_lessthan_env_var_wrong_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_lessthan_env_var_wrong_type_ko.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_lessthan_env_var_wrong_type_ko");
    }

    @Test
    public void testcomments_structs1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs1.b314", testFolder.newFile(), true, "comments: structs1");
    }

    @Test
    public void testcomments_j_new_testboolexpressions_and_env_var_wrong_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_new_testboolexpressions_and_env_var_wrong_type_ko.b314", testFolder.newFile(), true, "comments: j_new_testboolexpressions_and_env_var_wrong_type_ko");
    }

    @Test
    public void testcomments_varScopes2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes2.b314", testFolder.newFile(), true, "comments: varScopes2");
    }

    @Test
    public void testcomments_testcomments2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments2.b314", testFolder.newFile(), true, "comments: testcomments2");
    }

    @Test
    public void testcomments_j_testboolexpressions_operations_only_env_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_operations_only_env_vars.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_operations_only_env_vars");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_right");
    }

    @Test
    public void testcomments_globalvardeclaration2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/globalvardeclaration2.b314", testFolder.newFile(), true, "comments: globalvardeclaration2");
    }

    @Test
    public void testcomments_testcarte1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte1.b314", testFolder.newFile(), true, "comments: testcarte1");
    }

    @Test
    public void testcomments_function1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function1.b314", testFolder.newFile(), true, "comments: function1");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_array_right_expressions_no_index_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testaffectinstruction_affect_array_right_expressions_no_index_ko.b314", testFolder.newFile(), true, "comments: j_testaffectinstruction_affect_array_right_expressions_no_index_ko");
    }

    @Test
    public void testcomments_testarrays1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays1.b314", testFolder.newFile(), true, "comments: testarrays1");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_down_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_down.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_down");
    }

    @Test
    public void testcomments_mainprogram5_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram5.b314", testFolder.newFile(), true, "comments: mainprogram5");
    }

    @Test
    public void testcomments_testarrays2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays2.b314", testFolder.newFile(), true, "comments: testarrays2");
    }

    @Test
    public void testcomments_j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko.b314", testFolder.newFile(), true, "comments: j_testaffectinstruction_affect_right_expressions_wrong_var_type_ko");
    }

    @Test
    public void testcomments_testcarte4_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte4.b314", testFolder.newFile(), true, "comments: testcarte4");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_up_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_up.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_up");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_left_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_left.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_left");
    }

    @Test
    public void testcomments_varScopes3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes3.b314", testFolder.newFile(), true, "comments: varScopes3");
    }

    @Test
    public void testcomments_import3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import3.b314", testFolder.newFile(), true, "comments: import3");
    }

    @Test
    public void testcomments_j_testboolexpressions_environment_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_environment_var.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_environment_var");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_down_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_down.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_down");
    }

    @Test
    public void testcomments_varScopes1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes1.b314", testFolder.newFile(), true, "comments: varScopes1");
    }

    @Test
    public void testcomments_j_testfunctions_factorial_recursive_call_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_factorial_recursive_call.b314", testFolder.newFile(), true, "comments: j_testfunctions_factorial_recursive_call");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_with_only_dig_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_with_only_dig.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_with_only_dig");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_with_dig_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_with_dig.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_with_dig");
    }

    //
    // Serie comments KO
    //
    @Test
    public void testcomments_actions3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions3.b314", testFolder.newFile(), false, "comments: actions3");
    }

    @Test
    public void testcomments_import2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import2.b314", testFolder.newFile(), false, "comments: import2");
    }

    @Test
    public void testcomments_testcarte5_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte5.b314", testFolder.newFile(), false, "comments: testcarte5");
    }

    @Test
    public void testcomments_import4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import4.b314", testFolder.newFile(), false, "comments: import4");
    }

    @Test
    public void testcomments_import1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import1.b314", testFolder.newFile(), false, "comments: import1");
    }

    @Test
    public void testcomments_naming6_FunctParamsSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming6_FunctParamsSameName.b314", testFolder.newFile(), false, "comments: naming6_FunctParamsSameName");
    }

    @Test
    public void testcomments_mainprogram3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram3.b314", testFolder.newFile(), false, "comments: mainprogram3");
    }

    @Test
    public void testcomments_actions2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions2.b314", testFolder.newFile(), false, "comments: actions2");
    }

    @Test
    public void testcomments_naming3_localVarNameNotFunctionName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming3_localVarNameNotFunctionName.b314", testFolder.newFile(), false, "comments: naming3_localVarNameNotFunctionName");
    }

    @Test
    public void testcomments_mainprogram4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram4.b314", testFolder.newFile(), false, "comments: mainprogram4");
    }

    @Test
    public void testcomments_naming8_GlobalVarSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming8_GlobalVarSameName.b314", testFolder.newFile(), false, "comments: naming8_GlobalVarSameName");
    }

    @Test
    public void testcomments_test_constante_01_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/test_constante_01.b314", testFolder.newFile(), false, "comments: test_constante_01");
    }

    @Test
    public void testcomments_missing_default_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_default_bloc.b314", testFolder.newFile(), false, "comments: missing_default_bloc");
    }

    @Test
    public void testcomments_tomanyparen_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/tomanyparen.b314", testFolder.newFile(), false, "comments: tomanyparen");
    }

    @Test
    public void testcomments_testcarte6_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte6.b314", testFolder.newFile(), false, "comments: testcarte6");
    }

    @Test
    public void testcomments_missing_declare_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_declare_bloc.b314", testFolder.newFile(), false, "comments: missing_declare_bloc");
    }

    @Test
    public void testcomments_naming2_globalVar_not_a_function_name_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming2_globalVar_not_a_function_name.b314", testFolder.newFile(), false, "comments: naming2_globalVar_not_a_function_name");
    }

    @Test
    public void testcomments_testcomments1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments1.b314", testFolder.newFile(), false, "comments: testcomments1");
    }

    @Test
    public void testcomments_naming5_FunctSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming5_FunctSameName.b314", testFolder.newFile(), false, "comments: naming5_FunctSameName");
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
    public void testcomments_naming1_localVarNameNotInArgs_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming1_localVarNameNotInArgs.b314", testFolder.newFile(), false, "comments: naming1_localVarNameNotInArgs");
    }

    @Test
    public void testcomments_mainprogram2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram2.b314", testFolder.newFile(), false, "comments: mainprogram2");
    }

    @Test
    public void testcomments_naming4_ArgNameNotFunctionName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming4_ArgNameNotFunctionName.b314", testFolder.newFile(), false, "comments: naming4_ArgNameNotFunctionName");
    }

    @Test
    public void testcomments_mainprogram1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram1.b314", testFolder.newFile(), false, "comments: mainprogram1");
    }

    @Test
    public void testcomments_testcomments3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments3.b314", testFolder.newFile(), false, "comments: testcomments3");
    }

    @Test
    public void testcomments_actions1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions1.b314", testFolder.newFile(), false, "comments: actions1");
    }

    @Test
    public void testcomments_naming7_LocalVarSameName_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/naming7_LocalVarSameName.b314", testFolder.newFile(), false, "comments: naming7_LocalVarSameName");
    }

    @Test
    public void testcomments_varScopes2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/varScopes2.b314", testFolder.newFile(), false, "comments: varScopes2");
    }

    @Test
    public void testcomments_testcomments2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcomments2.b314", testFolder.newFile(), false, "comments: testcomments2");
    }

    @Test
    public void testcomments_testcarte1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte1.b314", testFolder.newFile(), false, "comments: testcarte1");
    }

    @Test
    public void testcomments_function1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function1.b314", testFolder.newFile(), false, "comments: function1");
    }

    @Test
    public void testcomments_mainprogram5_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/mainprogram5.b314", testFolder.newFile(), false, "comments: mainprogram5");
    }

    @Test
    public void testcomments_testcarte4_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/testcarte4.b314", testFolder.newFile(), false, "comments: testcarte4");
    }

    @Test
    public void testcomments_import3_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import3.b314", testFolder.newFile(), false, "comments: import3");
    }

    @Test
    public void testcomments_varScopes1_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/varScopes1.b314", testFolder.newFile(), false, "comments: varScopes1");
    }

}