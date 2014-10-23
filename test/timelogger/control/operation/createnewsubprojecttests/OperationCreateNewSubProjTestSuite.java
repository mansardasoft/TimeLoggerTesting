package timelogger.control.operation.createnewsubprojecttests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import timelogger.control.operation.setprojectdatatests.OperationSetProjDataTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        OperationSetProjDataTestSuite.class,
        SubProjectSavedCorretlyTest.class,
        SubProjectParametersSavedCorrectly.class
})
public class OperationCreateNewSubProjTestSuite {
    //must be empty
}