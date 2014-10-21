package timelogger.control.operation.createnewinvoicetests;

import timelogger.control.ControlFacade;
import timelogger.domain.FatturaParziale;
import timelogger.domain.Progetto;

import java.util.Date;

/**
 * Created by daniele on 21/10/14.
 */
public class NoDateOperationCreateNewInvoiceTest extends OperationCreateNewInvoiceTest {

    @Override
    public void initUseCase() {
        fakeProjectData.initUseCase();
        this.p = (Progetto) ControlFacade.getInstance().getData("newProject");
        ControlFacade.getInstance().setData("DataFatturaInserita", new Date());
        FatturaParziale fakeFattura = new FatturaParziale();
        for(int i=0; i<10;i++) {
            fakeFattura.setTotale(1 + (int) (Math.random() * ((1000 - 1) + 1)));
            this.fakeConcurrentHashMap.put(String.valueOf(i),fakeFattura);
        }
        this.fakeInvoiceResumePanel.setCounter(10);
        ControlFacade.getInstance().setData("invoicesMap", this.fakeConcurrentHashMap);
    }
}
