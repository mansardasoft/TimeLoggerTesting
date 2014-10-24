package timelogger.control.operation.subprojecttests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import timelogger.control.operation.setprojectdatatests.OperationSetProjDataTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        OperationSetProjDataTestSuite.class,
        SubProjectSavedCorretlyTest.class,
        SubProjectParametersSavedCorrectly.class,
        OperationRemoveSubProjTest.class,
        ChangeManagerOfSubProject.class
})
public class OperationOnSubProjTestSuite {
    //must be empty
}