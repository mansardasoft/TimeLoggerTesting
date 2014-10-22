package timelogger.control.operation.setprojectdatatests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ProjectSavedCorrectlyOperationSetProjDataTest.class,
        ProjectSavedIsNotNull.class,
        BuffersContainRightParameters.class,
        EditingProjectParameters.class
})
public class OperationSetProjDataTestSuite {
    //Must be empty
}