package timelogger.control.operation.setprojectdatatests;

import org.junit.Before;
import timelogger.presentation.UIFacade;

/**
 * Created by daniele on 20/10/14.
 */
public class NoDateOperationSetProjDataTest extends OperationSetProjDataTest {

    @Override
    public void initUseCase(){
        super.initUseCase();
        this.fakeProgetto.setDataInizio(null);
        UIFacade.getInstance().setAData("DataProgetto", this.fakeProgetto.getDataInizio());
    }

    @Before
    public void setUp(){
        this.initUseCase();
    }
}
