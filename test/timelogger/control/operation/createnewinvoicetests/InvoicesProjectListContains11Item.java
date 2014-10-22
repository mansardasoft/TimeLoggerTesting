package timelogger.control.operation.createnewinvoicetests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationCreateNewInvoice;
import timelogger.domain.Progetto;
import timelogger.presentation.ui.admin.createProjPanel;

/**
 * Created by daniele on 22/10/14.
 */
public class InvoicesProjectListContains11Item {

    private OperationCreateNewInvoice testingObject = new OperationCreateNewInvoice();
    private createProjPanel fakeCreateProjectPanelUi = new createProjPanel();

    @Before
    public void setUp(){}

    @Test
    public void testDoOpInvoicesAddedCorrectly(){
        Assert.assertEquals(
                "Invoices shoud be 10 after first testing",
                11,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.size()
        );
    }
}
