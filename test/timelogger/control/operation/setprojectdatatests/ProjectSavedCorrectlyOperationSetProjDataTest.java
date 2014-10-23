package timelogger.control.operation.setprojectdatatests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationSetProjData;
import timelogger.domain.Admin;
import timelogger.domain.Cliente;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiBuilder;
import timelogger.presentation.ui.admin.createProjPanel;

import java.util.Calendar;
import java.util.Date;

public class ProjectSavedCorrectlyOperationSetProjDataTest{

    private createProjPanel fakeUi = new createProjPanel();

    /**
     * Object under testing
     */
    protected OperationSetProjData testingObj = new OperationSetProjData();

    protected Progetto fakeProgetto, fakeProgettoOracle;
    protected Admin fakeAdmin;
    protected Cliente fakeCliente;
    protected Date fakeStartDate, fakeEndDate;


    protected Admin initFakeAdmin(){
        Admin admin = new Admin();
        admin.setNome("Giuseppe");
        admin.setCognome("Verdi");
        return admin;
    }

    protected Progetto intiFakeProgetto(){
        Progetto progetto = new Progetto();

        progetto.setAdmin(this.fakeAdmin);
        progetto.setTitolo("Progetto 1");

        //set the project start in today
        this.fakeStartDate = new Date();
        progetto.setDataInizio(this.fakeStartDate);

        //set the project end in tomorrow
        Calendar c = Calendar.getInstance();
        c.setTime(this.fakeStartDate);
        c.add(Calendar.DATE, 1);
        progetto.setDataFine(c.getTime());

        progetto.setClienteAssociato(this.initFakeCliente());
        return progetto;
    }

    protected Cliente initFakeCliente() {
        Cliente cliente = new Cliente();
        cliente.setCognome("De Gregori");
        cliente.setNome("Francesco "+ String.valueOf(Math.random()));
        return cliente;
    }

    @Before
    public void setUp(){

        GuiBuilder.getInstance().createAdminCommands();

        this.fakeAdmin = this.initFakeAdmin();
        this.fakeProgetto = this.intiFakeProgetto();
        this.fakeCliente = this.initFakeCliente();

        ControlFacade.getInstance().setData("newProject", this.fakeProgetto);
        UIFacade.getInstance().setAData("TitoloProgetto", this.fakeProgetto.getTitolo());
        UIFacade.getInstance().setAData("DataProgetto", this.fakeProgetto.getDataInizio());
        UIFacade.getInstance().setAData("ClienteProgetto", this.fakeCliente);

        this.fakeCliente = this.initFakeCliente();
        this.fakeProgetto.setTitolo("Progetto 2");
        this.fakeProgetto.setClienteAssociato(this.fakeCliente);

        this.fakeProgettoOracle = new Progetto();
        this.fakeProgettoOracle.setTitolo("Progetto 2");
        this.fakeProgettoOracle.setDataInizio(new Date());
    }

    @Test
    public void testDoOpProjectSavedCorrectly() throws Exception {
        testingObj.doOp(ControlFacade.getInstance(), this.fakeUi);

        //Oracle
        Assert.assertEquals(
                this.fakeProgetto.serialize(),
                ((Progetto)UIFacade.getInstance().getAData("Progetto")).serialize()
        );
    }
}