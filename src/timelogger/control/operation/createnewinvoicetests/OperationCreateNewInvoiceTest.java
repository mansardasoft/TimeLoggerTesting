package timelogger.control.operation.createnewinvoicetests;

import org.junit.After;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationBaseTest;
import timelogger.control.operation.OperationCreateNewInvoice;
import timelogger.control.operation.setprojectdatatests.OperationSetProjDataTest;
import timelogger.domain.Fattura;
import timelogger.domain.FatturaParziale;
import timelogger.domain.Progetto;
import timelogger.presentation.ui.admin.createProjPanel;
import timelogger.presentation.ui.admin.invoiceResumePanel;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class OperationCreateNewInvoiceTest extends OperationBaseTest{

    protected OperationCreateNewInvoice testingObj = new OperationCreateNewInvoice();

    protected OperationSetProjDataTest fakeProjectData = new OperationSetProjDataTest();

    private createProjPanel fakeUi = new createProjPanel();
    protected invoiceResumePanel fakeInvoiceResumePanel = new invoiceResumePanel();
    protected ConcurrentHashMap<String, Fattura> fakeConcurrentHashMap = new ConcurrentHashMap<String, Fattura>();
    protected Progetto p;

    @After
    public void tearDown() throws Exception {
        this.echo("----- Test Report -----");

        if (caughtException != null) {
            this.echo("Exception caught in execution ");
            throw caughtException;
        } else {
            this.echo("Fattura aggiunta: " + this.p.toString());
        }
    }

    @Override
    public void initUseCase() {
        //inizializzo ststo sistema per la creazione del progetto
        fakeProjectData.initUseCase();
        this.p = (Progetto) ControlFacade.getInstance().getData("newProject");

        ControlFacade.getInstance().setData("DataFatturaInserita", new Date());
        //metodo updateMap
        FatturaParziale fakeFattura = new FatturaParziale();
        for(int i=0; i<10;i++) {
            fakeFattura.setDataFine(new Date());
            fakeFattura.setTotale(1 + (int) (Math.random() * ((1000 - 1) + 1)));
            this.fakeConcurrentHashMap.put(String.valueOf(i),fakeFattura);
        }
        this.fakeInvoiceResumePanel.setCounter(10);
        ControlFacade.getInstance().setData("invoicesMap", this.fakeConcurrentHashMap);
    }

    @Test
    public void testDoOp() throws Exception {
        try {
            testingObj.doOp(ControlFacade.getInstance(), this.fakeUi.getvBoxInvoices());
        } catch (Exception e) {
            this.echo("Errors executing doOp");
            this.caughtException = e;
        }
    }
}