package timelogger.control.operation.subprojecttests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationCreateNewSubProj;
import timelogger.domain.Manager;
import timelogger.domain.Progetto;
import timelogger.domain.SottoProgetto;

import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;

import static org.hamcrest.collection.IsMapContaining.hasKey;

/**
 * Created by daniele on 23/10/14.
 */
public class SubProjectParametersSavedCorrectly {

    private OperationCreateNewSubProj testingObj = new OperationCreateNewSubProj();
    private Container fakeUi = new Container();
    private Manager fakeManager = new Manager();
    private SottoProgetto fakeSottoProgetto = new SottoProgetto();

    private void initFakeManager() {
        this.fakeManager.setCognome("Marrone");
        this.fakeManager.setNome("Valerio");

        ControlFacade.getInstance().setData("ManagerSelezionato", this.fakeManager);
    }

    private void initFakeSottoProgetto() {
        this.fakeSottoProgetto.setTitolo("SottoProgetto");
        this.fakeSottoProgetto.setManager(this.fakeManager);
        this.fakeSottoProgetto.setBudgetStimato(1000);
        this.fakeSottoProgetto.setDurataStimata(100);
        this.fakeSottoProgetto.setProgetto(
                (Progetto) ControlFacade.getInstance().getData("newProject")
        );
    }

    @Before
    public void setUp() {

        initFakeManager();
        initFakeSottoProgetto();
        ControlFacade.getInstance().setData("TitoloSottoProgetto", "SottoProgetto");

        ControlFacade.getInstance().setData("BudgetSottoProgetto", 1000);
        ControlFacade.getInstance().setData("DurataSottoProgetto", 100);

        ControlFacade.getInstance().setData("subProjsMap", new ConcurrentHashMap<String, SottoProgetto>());
    }

    @Test
    public void testDoOpParametersAreEqualsToFakeSubProject(){
        Assert.assertEquals(
                this.fakeSottoProgetto.serialize(),
                ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.get(0).serialize()
        );
        Assert.assertThat(ControlFacade.getInstance().getTempData(),
                hasKey("newProject"));
    }

    @Test
    public void testDoOpManagerIsEqualToFakeManager(){
        Assert.assertEquals(
                this.fakeManager.serialize(),
                ((Progetto)ControlFacade.getInstance().getData("newProject"))
                        .sottoprogetti.get(0).getManager().serialize()
        );
    }

    @After
    public void tearDown(){
        ((Progetto) ControlFacade.getInstance().getData("newProject")).sottoprogetti.clear();
    }
}
