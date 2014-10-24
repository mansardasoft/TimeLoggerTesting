package timelogger.control.operation.subprojecttests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationRemoveSubProj;
import timelogger.domain.Manager;
import timelogger.domain.Progetto;
import timelogger.domain.SottoProgetto;
import timelogger.presentation.ui.admin.subProjResumePanel;

import javax.swing.*;
import java.util.concurrent.ConcurrentHashMap;

public class OperationRemoveSubProjTest {

    private subProjResumePanel invoker = new subProjResumePanel();
    private OperationRemoveSubProj testingObj = new OperationRemoveSubProj();
    private Progetto fakeProgetto = new Progetto();

    @Before
    public void setUp() throws Exception {
        SottoProgetto fakeSottoProgetto;
        Box invokerFather = new Box(BoxLayout.PAGE_AXIS);
        JPanel updatableParent = new JPanel();
        ConcurrentHashMap<String, SottoProgetto> fakeSpMap = new ConcurrentHashMap<String, SottoProgetto>();
        for (int i = 0; i < 10; i++) {
            fakeSottoProgetto = new SottoProgetto();
            fakeSottoProgetto.setBudgetStimato(100 * i);
            fakeSottoProgetto.setDurataStimata(10 * i);
            fakeSottoProgetto.setTitolo("SottoProgetto_" + i);
            fakeSottoProgetto.setManager(((Manager) ControlFacade.getInstance().getData("ManagerSelezionato")));
            ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.add(fakeSottoProgetto);
            this.fakeProgetto.sottoprogetti.add(fakeSottoProgetto);
            invokerFather.add(this.invoker);
            fakeSpMap.put(String.valueOf(i), fakeSottoProgetto);
        }
        this.invoker.setIndex(2);
        this.invoker.setFather(invokerFather);
        this.invoker.setUpdatableParent(updatableParent);
        ControlFacade.getInstance().setData("subProjsMap", fakeSpMap);
    }

    @Test
    public void testDoOpRemoveCorrectlySecondSubProject() throws Exception {
        Assert.assertEquals(
                10,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.size()
        );

        this.testingObj.doOp(ControlFacade.getInstance(), invoker);

        Assert.assertEquals(
                9,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.size()
        );

        Assert.assertNotEquals("we expect an AssertionError. Therefore we want to prove the correctly deleting of the second sub-project in the list of sotto progetti of the project",
                this.fakeProgetto.sottoprogetti.get(2),
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.get(2)
        );
    }

    @After
    public void tearDown() throws Exception {
        /*((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.clear();
        Assert.assertEquals(
                0,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.size()
        );*/

    }
}