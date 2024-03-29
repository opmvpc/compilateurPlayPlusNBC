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
    public void testcomments_actions1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions1.b314", testFolder.newFile(), true, "comments: actions1");
    }

    @Test
    public void testcomments_actions2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions2.b314", testFolder.newFile(), true, "comments: actions2");
    }

    @Test
    public void testcomments_actions3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions3.b314", testFolder.newFile(), true, "comments: actions3");
    }

    @Test
    public void testcomments_actions_move01_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions_move01.b314", testFolder.newFile(), true, "comments: actions_move01");
    }

    @Test
    public void testcomments_affectation0_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affectation0.b314", testFolder.newFile(), true, "comments: affectation0");
    }

    @Test
    public void testcomments_affectation1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affectation1.b314", testFolder.newFile(), true, "comments: affectation1");
    }

    @Test
    public void testcomments_affectation2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affectation2.b314", testFolder.newFile(), true, "comments: affectation2");
    }

    @Test
    public void testcomments_corbutura_code_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/corbutura_code.b314", testFolder.newFile(), true, "comments: corbutura_code");
    }

    @Test
    public void testcomments_corbutura_code_bool_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/corbutura_code_bool.b314", testFolder.newFile(), true, "comments: corbutura_code_bool");
    }

    @Test
    public void testcomments_dig_nbc01_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/dig_nbc01.b314", testFolder.newFile(), true, "comments: dig_nbc01");
    }

    @Test
    public void testcomments_enums1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/enums1.b314", testFolder.newFile(), true, "comments: enums1");
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
    public void testcomments_exprEntiere3_Main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprEntiere3_Main.b314", testFolder.newFile(), true, "comments: exprEntiere3_Main");
    }

    @Test
    public void testcomments_exprEntiere4_Main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprEntiere4_Main.b314", testFolder.newFile(), true, "comments: exprEntiere4_Main");
    }

    @Test
    public void testcomments_exprEntiere5_Main_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/exprEntiere5_Main.b314", testFolder.newFile(), true, "comments: exprEntiere5_Main");
    }

    @Test
    public void testcomments_failed_testfunctions_multiple_global_vars_and_functions_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/failed_testfunctions_multiple_global_vars_and_functions_no_local_var.b314", testFolder.newFile(), true, "comments: failed_testfunctions_multiple_global_vars_and_functions_no_local_var");
    }

    @Test
    public void testcomments_failed_testwhileinstruction_array_tour_while_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/failed_testwhileinstruction_array_tour_while.b314", testFolder.newFile(), true, "comments: failed_testwhileinstruction_array_tour_while");
    }

    @Test
    public void testcomments_function1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function1.b314", testFolder.newFile(), true, "comments: function1");
    }

    @Test
    public void testcomments_function10_bool_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function10_bool_no_local_var.b314", testFolder.newFile(), true, "comments: function10_bool_no_local_var");
    }

    @Test
    public void testcomments_function11_returnvalues_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function11_returnvalues.b314", testFolder.newFile(), true, "comments: function11_returnvalues");
    }

    @Test
    public void testcomments_function12_returnvalues_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function12_returnvalues.b314", testFolder.newFile(), true, "comments: function12_returnvalues");
    }

    @Test
    public void testcomments_function13_returnvalues_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function13_returnvalues.b314", testFolder.newFile(), true, "comments: function13_returnvalues");
    }

    @Test
    public void testcomments_function14_returnvalues_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function14_returnvalues.b314", testFolder.newFile(), true, "comments: function14_returnvalues");
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
    public void testcomments_function5_TypeArgs_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/function5_TypeArgs.b314", testFolder.newFile(), true, "comments: function5_TypeArgs");
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
    public void testcomments_globalvardeclaration1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/globalvardeclaration1.b314", testFolder.newFile(), true, "comments: globalvardeclaration1");
    }

    @Test
    public void testcomments_globalvardeclaration2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/globalvardeclaration2.b314", testFolder.newFile(), true, "comments: globalvardeclaration2");
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
    public void testcomments_if3_conditionBool_nbc_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if3_conditionBool_nbc.b314", testFolder.newFile(), true, "comments: if3_conditionBool_nbc");
    }

    @Test
    public void testcomments_if4_conditionBool2_nbc_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if4_conditionBool2_nbc.b314", testFolder.newFile(), true, "comments: if4_conditionBool2_nbc");
    }

    @Test
    public void testcomments_if5_conditionBool3_nbc_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if5_conditionBool3_nbc.b314", testFolder.newFile(), true, "comments: if5_conditionBool3_nbc");
    }

    @Test
    public void testcomments_if6_conditionBool3_nbc_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/if6_conditionBool3_nbc.b314", testFolder.newFile(), true, "comments: if6_conditionBool3_nbc");
    }

    @Test
    public void testcomments_import1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import1.b314", testFolder.newFile(), true, "comments: import1");
    }

    @Test
    public void testcomments_import2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import2.b314", testFolder.newFile(), true, "comments: import2");
    }

    @Test
    public void testcomments_import3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/import3.b314", testFolder.newFile(), true, "comments: import3");
    }

    @Test
    public void testcomments_j_testboolexpressions_check_global_var_is_initilized_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_check_global_var_is_initilized.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_check_global_var_is_initilized");
    }

    @Test
    public void testcomments_j_testboolexpressions_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_constant_values.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_constant_values");
    }

    @Test
    public void testcomments_j_testboolexpressions_environment_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_environment_var.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_environment_var");
    }

    @Test
    public void testcomments_j_testboolexpressions_operations_only_env_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testboolexpressions_operations_only_env_vars.b314", testFolder.newFile(), true, "comments: j_testboolexpressions_operations_only_env_vars");
    }

    @Test
    public void testcomments_j_testfunctions_factorial_recursive_call_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_factorial_recursive_call.b314", testFolder.newFile(), true, "comments: j_testfunctions_factorial_recursive_call");
    }

    @Test
    public void testcomments_j_testfunctions_one_int_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testfunctions_one_int_function_no_local_var.b314", testFolder.newFile(), true, "comments: j_testfunctions_one_int_function_no_local_var");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_jump_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_jump_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_jump_right");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_with_dig_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_with_dig.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_with_dig");
    }

    @Test
    public void testcomments_j_testnextinstruction_actions_with_only_dig_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_actions_with_only_dig.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_actions_with_only_dig");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_down_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_down.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_down");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_left_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_left.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_left");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_right");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_fight_up_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_fight_up.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_fight_up");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_down_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_down.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_down");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_left_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_left.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_left");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_right.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_right");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_move_up_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_move_up.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_move_up");
    }

    @Test
    public void testcomments_j_testnextinstruction_action_use_jump_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testnextinstruction_action_use_jump.b314", testFolder.newFile(), true, "comments: j_testnextinstruction_action_use_jump");
    }

    @Test
    public void testcomments_j_testwhile_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testwhile.b314", testFolder.newFile(), true, "comments: j_testwhile");
    }

    @Test
    public void testcomments_j_testwhile2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/j_testwhile2.b314", testFolder.newFile(), true, "comments: j_testwhile2");
    }

    @Test
    public void testcomments_last_test_jenkins_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/last_test_jenkins.b314", testFolder.newFile(), true, "comments: last_test_jenkins");
    }

    @Test
    public void testcomments_mainprogram1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram1.b314", testFolder.newFile(), true, "comments: mainprogram1");
    }

    @Test
    public void testcomments_mainprogram2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram2.b314", testFolder.newFile(), true, "comments: mainprogram2");
    }

    @Test
    public void testcomments_mainprogram3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram3.b314", testFolder.newFile(), true, "comments: mainprogram3");
    }

    @Test
    public void testcomments_mainprogram4_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram4.b314", testFolder.newFile(), true, "comments: mainprogram4");
    }

    @Test
    public void testcomments_mainprogram5_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/mainprogram5.b314", testFolder.newFile(), true, "comments: mainprogram5");
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
    public void testcomments_naming9_LocalVarSameNameAsGlobalVar_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/naming9_LocalVarSameNameAsGlobalVar.b314", testFolder.newFile(), true, "comments: naming9_LocalVarSameNameAsGlobalVar");
    }

    @Test
    public void testcomments_null_pointer_functions_one_void_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/null_pointer_functions_one_void_function_no_local_var.b314", testFolder.newFile(), true, "comments: null_pointer_functions_one_void_function_no_local_var");
    }

    @Test
    public void testcomments_repeat1_goodCondition_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/repeat1_goodCondition.b314", testFolder.newFile(), true, "comments: repeat1_goodCondition");
    }

    @Test
    public void testcomments_repeat1_goodIntCondition_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/repeat1_goodIntCondition.b314", testFolder.newFile(), true, "comments: repeat1_goodIntCondition");
    }

    @Test
    public void testcomments_repeat42_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/repeat42.b314", testFolder.newFile(), true, "comments: repeat42");
    }

    @Test
    public void testcomments_structCall1_subArrayCall_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structCall1_subArrayCall.b314", testFolder.newFile(), true, "comments: structCall1_subArrayCall");
    }

    @Test
    public void testcomments_structs1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs1.b314", testFolder.newFile(), true, "comments: structs1");
    }

    @Test
    public void testcomments_structs2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structs2.b314", testFolder.newFile(), true, "comments: structs2");
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
    public void testcomments_structure1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structure1.b314", testFolder.newFile(), true, "comments: structure1");
    }

    @Test
    public void testcomments_testarrays1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays1.b314", testFolder.newFile(), true, "comments: testarrays1");
    }

    @Test
    public void testcomments_testarrays2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays2.b314", testFolder.newFile(), true, "comments: testarrays2");
    }

    @Test
    public void testcomments_testarrays3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays3.b314", testFolder.newFile(), true, "comments: testarrays3");
    }

    @Test
    public void testcomments_testarrays4_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays4.b314", testFolder.newFile(), true, "comments: testarrays4");
    }

    @Test
    public void testcomments_testcarte1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte1.b314", testFolder.newFile(), true, "comments: testcarte1");
    }

    @Test
    public void testcomments_testcarte2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte2.b314", testFolder.newFile(), true, "comments: testcarte2");
    }

    @Test
    public void testcomments_testcarte5_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte5.b314", testFolder.newFile(), true, "comments: testcarte5");
    }

    @Test
    public void testcomments_testcarte6_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte6.b314", testFolder.newFile(), true, "comments: testcarte6");
    }

    @Test
    public void testcomments_testcomments1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments1.b314", testFolder.newFile(), true, "comments: testcomments1");
    }

    @Test
    public void testcomments_testcomments2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments2.b314", testFolder.newFile(), true, "comments: testcomments2");
    }

    @Test
    public void testcomments_testcomments3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments3.b314", testFolder.newFile(), true, "comments: testcomments3");
    }

    @Test
    public void testcomments_testruleprogramme01_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testruleprogramme01.b314", testFolder.newFile(), true, "comments: testruleprogramme01");
    }

    @Test
    public void testcomments_typedef_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/typedef.b314", testFolder.newFile(), true, "comments: typedef");
    }

    @Test
    public void testcomments_types1_multvars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/types1_multvars.b314", testFolder.newFile(), true, "comments: types1_multvars");
    }

    @Test
    public void testcomments_vardeclaration1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/vardeclaration1.b314", testFolder.newFile(), true, "comments: vardeclaration1");
    }

    @Test
    public void testcomments_vardeclaration2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/vardeclaration2.b314", testFolder.newFile(), true, "comments: vardeclaration2");
    }

    @Test
    public void testcomments_varScopes1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes1.b314", testFolder.newFile(), true, "comments: varScopes1");
    }

    @Test
    public void testcomments_varScopes2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes2.b314", testFolder.newFile(), true, "comments: varScopes2");
    }

    @Test
    public void testcomments_varScopes3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/varScopes3.b314", testFolder.newFile(), true, "comments: varScopes3");
    }

    @Test
    public void testcomments_world3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/world3.b314", testFolder.newFile(), true, "comments: world3");
    }

    @Test
    public void testcomments_world4_win_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/world4_win.b314", testFolder.newFile(), true, "comments: world4_win");
    }

    @Test
    public void testcomments_world5_array_tour_while_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/world5_array_tour_while.b314", testFolder.newFile(), true, "comments: world5_array_tour_while");
    }

    @Test
    public void testcomments_world6_testfunctions_multiple_global_vars_and_functions_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/world6_testfunctions_multiple_global_vars_and_functions_no_local_var.b314", testFolder.newFile(), true, "comments: world6_testfunctions_multiple_global_vars_and_functions_no_local_var");
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
    public void testcomments_failed_testwhileinstruction_repeat_wrong_expression_and_condition_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/failed_testwhileinstruction_repeat_wrong_expression_and_condition.b314", testFolder.newFile(), false, "comments: failed_testwhileinstruction_repeat_wrong_expression_and_condition");
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
    public void testcomments_function4_arg_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function4_arg_type.b314", testFolder.newFile(), false, "comments: function4_arg_type");
    }

    @Test
    public void testcomments_function5_return_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/function5_return_type.b314", testFolder.newFile(), false, "comments: function5_return_type");
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