package timelogger.control.operation.subprojecttests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.domain.Manager;
import timelogger.domain.Progetto;
import timelogger.domain.SottoProgetto;

/**
 * Created by daniele on 24/10/14.
 */
public class ChangeManagerOfSubProject {

    @Before
    public void setUp() {
    }

    @Test
    public void testDoOp() {
        Manager fakeManager = new Manager();

        fakeManager.setNome("Paolo");
        fakeManager.setCognome("Rossi");

        SottoProgetto fakeSottoProgetto = new SottoProgetto();
        fakeSottoProgetto.setBudgetStimato(
                ((Progetto) ControlFacade.getInstance().getData("newProject"))
                        .sottoprogetti.get(2).getBudgetStimato());

        fakeSottoProgetto.setTitolo(((Progetto) ControlFacade.getInstance().getData("newProject"))
                .sottoprogetti.get(2).getTitolo());

        fakeSottoProgetto.setDurataStimata(((Progetto) ControlFacade.getInstance().getData("newProject"))
                .sottoprogetti.get(2).getDurataStimata());

        fakeSottoProgetto.setManager(fakeManager);

        Assert.assertNotEquals(
                fakeSottoProgetto.getManager(),
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.get(2).getManager()
        );
    }


    @After
    public void tearDown() {
    }
}
