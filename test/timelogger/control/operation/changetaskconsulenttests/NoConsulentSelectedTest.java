package timelogger.control.operation.changetaskconsulenttests;

import org.junit.Before;

public class NoConsulentSelectedTest extends OperationChangeTaskConsulentBaseTest {

    @Before
    public void setUp() throws Exception {
        this.initUseCase();

        /**
         * In this test we choose a no-consulente value from panel option
         */
        this.fakeUi.getComboConsulente().setSelectedIndex(0);

    }

}