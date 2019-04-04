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
    public void testcomments_testactions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testactions.b314", testFolder.newFile(), true, "comments: testactions");
    }

    @Test
    public void testcomments_testarrays_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testarrays.b314", testFolder.newFile(), true, "comments: testarrays");
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
    public void testcomments_testcarte3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte3.b314", testFolder.newFile(), true, "comments: testcarte3");
    }

    @Test
    public void testcomments_testcarte4_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte4.b314", testFolder.newFile(), true, "comments: testcarte4");
    }

    @Test
    public void testcomments_testcarte5_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcarte5.b314", testFolder.newFile(), true, "comments: testcarte5");
    }

    @Test
    public void testcomments_testcomments_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testcomments.b314", testFolder.newFile(), true, "comments: testcomments");
    }

    @Test
    public void testcomments_testruleprogramme01_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testruleprogramme01.b314", testFolder.newFile(), true, "comments: testruleprogramme01");
    }

    //
    // Serie comments KO
    //
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

}