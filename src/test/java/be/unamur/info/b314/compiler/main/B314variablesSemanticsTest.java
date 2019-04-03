package be.unamur.info.b314.compiler.main;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314variablesSemanticsTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314variablesSemanticsTest.class);

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

//    @Test
//    public void testvariables_ko() throws Exception {
//        File pcodeFile = testFolder.newFile();
//        CompilerTestHelper.launchCompilation("/semantics/variables/ko", pcodeFile, true, "variables: ko");
//        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
//        InterpreterResult result;
//        // Turns: 1
//        LOG.debug("Starting interpretation with 1 turn");
//    }
}