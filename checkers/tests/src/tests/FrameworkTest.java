package tests;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import checkers.util.test.*;

/**
 * JUnit tests for the Checker Framework, using the {@link TestChecker}.
 */
public class FrameworkTest extends ParameterizedCheckerTest {

    public FrameworkTest(String testName) {
        super(testName, "checkers.util.test.TestChecker", "framework", "-Anomsgtext");
    }

    @Parameters
    public static Collection<Object[]> data() { return testFiles("framework"); }
}
