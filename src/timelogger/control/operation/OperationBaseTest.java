package timelogger.control.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiBuilder;

/**
 * Created by daniele on 20/10/14.
 */
public class OperationBaseTest {

    protected Exception caughtException;


    protected void echo(String message) {
        System.out.println("");
        String[] classNameParts = this.getClass().getName().split("\\.");
        System.out.println(classNameParts[classNameParts.length - 1] + ":> " + message);
    }

    public void initUseCase(){}

    @Before
    public void setUp() throws Exception {
        this.initUseCase();
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testDoOp() throws Exception {}

}
