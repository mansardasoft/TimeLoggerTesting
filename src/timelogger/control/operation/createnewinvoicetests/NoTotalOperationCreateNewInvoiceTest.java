package timelogger.control.operation.createnewinvoicetests;

import timelogger.control.ControlFacade;
import timelogger.domain.FatturaParziale;
import timelogger.domain.Progetto;

import java.util.Date;

/**
 * Created by daniele on 21/10/14.
 */
public class NoTotalOperationCreateNewInvoiceTest extends OperationCreateNewInvoiceTest {
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
            this.fakeConcurrentHashMap.put(String.valueOf(i),fakeFattura);
        }
        this.fakeInvoiceResumePanel.setCounter(10);
        ControlFacade.getInstance().setData("invoicesMap", this.fakeConcurrentHashMap);
    }
}
