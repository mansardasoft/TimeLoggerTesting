package timelogger.control.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.manager.taskSubProj;


public class OperationChangeTaskConsulentTest {

    private taskSubProj fakeUi = new taskSubProj();
    private OperationChangeTaskConsulent testingObj = new OperationChangeTaskConsulent();

    private Exception caughtException = null;

    @Before
    public void setUp() throws Exception {
        /**
         * Creating an empty SottoProgetto in UIFacade data
         */
        UIFacade.getInstance().setAData("SottoProgettoSelezionato", new SottoProgetto());


        /**
         * Selecting a consulente (like the user could do)
         */
        fakeUi.getComboConsulente().setSelectedIndex(1);
    }

    @After
    public void tearDown() throws Exception {
        this.echo("----- Test Report -----");

        if (caughtException != null) {
            this.echo("Exception caught in execution " + caughtException.getLocalizedMessage());
        }

    }

    @Test
    public void testDoOp() throws Exception {
        try {

            testingObj.doOp(ControlFacade.getInstance(), this.fakeUi);

        } catch (Exception e) {

            this.echo("Errors executing doOp");
            this.caughtException = e;
        }

    }

    private void echo(String message) {
        System.out.println("");
        String[] classNameParts = this.getClass().getName().split("operation.");
        System.out.println(classNameParts[1] + ":> " + message);
    }
}