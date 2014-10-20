package timelogger.control.operation.setprojectdatatests;

import org.junit.After;
import org.junit.Before;

/**
 * Created by daniele on 20/10/14.
 */
public class NoClienteOperationSetProjDataTest extends OperationSetProjDataTest {

    @Before
    public void setUp(){
        this.initUseCase();
        this.fakeCliente = null;
    }

    @After
    public void tearDown() throws Exception {
        this.echo("----- Test Report -----");

        if (caughtException != null) {
            this.echo("Exception caught in execution ");
            throw caughtException;
        } else {
            this.echo("Nuovo Progetto Creato " + this.fakeProgetto.toString());
            this.echo("Admin: "+this.fakeAdmin.toString());
            if(this.fakeCliente == null)
                this.echo("Cliente deve essere null");
        }
    }
}
