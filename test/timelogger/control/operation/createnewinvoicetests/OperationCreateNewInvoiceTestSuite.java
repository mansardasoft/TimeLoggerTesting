package timelogger.control.operation.createnewinvoicetests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import timelogger.control.operation.setprojectdatatests.OperationSetProjDataTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        OperationSetProjDataTestSuite.class,
        InvoicesProjectSavedCorretlyTest.class,
        InvoicesProjectListContains11Item.class,
        EditingInvoicesProjectParameters.class
})
public class OperationCreateNewInvoiceTestSuite {
    //It must be empty
}