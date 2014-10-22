package timelogger.control.operation.createnewinvoicetests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationCreateNewInvoice;
import timelogger.domain.Fattura;
import timelogger.domain.FatturaParziale;
import timelogger.domain.Progetto;
import timelogger.presentation.ui.admin.createProjPanel;
import timelogger.presentation.ui.admin.invoiceResumePanel;

import javax.naming.ldap.Control;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import static org.hamcrest.Matchers.is;

/**
 * Created by daniele on 22/10/14.
 */
public class InvoicesProjectSavedCorretlyTest {

    private ConcurrentHashMap<String, Fattura> fakeCHashMap = new ConcurrentHashMap<String, Fattura>();
    private FatturaParziale fakeFatturaParziale = new FatturaParziale();
    private invoiceResumePanel fakeUi = new invoiceResumePanel();
    private OperationCreateNewInvoice testingObject = new OperationCreateNewInvoice();
    private createProjPanel fakeCreateProjectPanelUi = new createProjPanel();

    @Before
    public void setUp() {
        ControlFacade.getInstance().setData("DataFatturaInserita", new Date());

        this.fakeUi.setCounter(0);
        ControlFacade.getInstance().setData("invoicesMap", this.fakeCHashMap);
    }

    @Test
    public void testDoOpInvoicesListContainsSingleItem() {
        this.testingObject.doOp(ControlFacade.getInstance(), this.fakeCreateProjectPanelUi.getvBoxInvoices());
        Assert.assertThat(
                ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.isEmpty(),
                is(false)
        );
    }

    @After
    public void tearDown() {
        for (int i = 0; i < 10; i++) {
            this.fakeFatturaParziale = new FatturaParziale();
            this.fakeFatturaParziale.setTotale(100*i);
            this.fakeFatturaParziale.setProgetto(
                    (Progetto)ControlFacade.getInstance().getData("newProject")
            );
            this.fakeCHashMap.put(String.valueOf(i), this.fakeFatturaParziale);
        }
        this.fakeUi.setCounter(10);
    }
}
