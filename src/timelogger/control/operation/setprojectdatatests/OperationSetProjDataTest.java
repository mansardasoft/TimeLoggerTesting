package timelogger.control.operation.setprojectdatatests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationBaseTest;
import timelogger.control.operation.OperationSetProjData;
import timelogger.domain.Admin;
import timelogger.domain.Cliente;
import timelogger.domain.Progetto;
import timelogger.presentation.UIFacade;
import timelogger.presentation.graphicCommand.GuiBuilder;
import timelogger.presentation.ui.admin.createProjPanel;

import java.util.Calendar;
import java.util.Date;

public class OperationSetProjDataTest extends OperationBaseTest {

    private createProjPanel fakeUi = new createProjPanel();

    /**
     * Object under testing
     */
    protected OperationSetProjData testingObj = new OperationSetProjData();

    protected Progetto fakeProgetto;
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
        cliente.setNome("Francesco");
        return cliente;
    }

    @Override
    public void initUseCase(){

        GuiBuilder.getInstance().createAdminCommands();

        this.fakeAdmin = this.initFakeAdmin();
        this.fakeProgetto = this.intiFakeProgetto();
        this.fakeCliente = this.initFakeCliente();

        ControlFacade.getInstance().setData("newProject", this.fakeProgetto);
        UIFacade.getInstance().setAData("TitoloProgetto", this.fakeProgetto.getTitolo());
        UIFacade.getInstance().setAData("DataProgetto", this.fakeProgetto.getDataInizio());
        UIFacade.getInstance().setAData("ClienteProgetto", this.fakeCliente);
    }

    @After
    public void tearDown() throws Exception {
        this.echo("----- Test Report -----");

        if (caughtException != null) {
            this.echo("Exception caught in execution ");
            throw caughtException;
        } else {
            this.echo("Nuovo Progetto Creato " + this.fakeProgetto.toString());
            this.echo("Admin: " + this.fakeAdmin.toString());
            this.echo("Cliente: " + this.fakeCliente.toString());
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
}