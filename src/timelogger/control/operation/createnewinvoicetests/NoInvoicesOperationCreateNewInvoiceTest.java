package timelogger.control.operation.createnewinvoicetests;

import timelogger.control.ControlFacade;

/**
 * Created by daniele on 21/10/14.
 */
public class NoInvoicesOperationCreateNewInvoiceTest extends OperationCreateNewInvoiceTest {

    @Override
    public void initUseCase() {
        super.initUseCase();
        this.fakeInvoiceResumePanel.setCounter(0);
        this.fakeConcurrentHashMap.clear();
        ControlFacade.getInstance().setData("invoicesMap", this.fakeConcurrentHashMap);
    }
}
