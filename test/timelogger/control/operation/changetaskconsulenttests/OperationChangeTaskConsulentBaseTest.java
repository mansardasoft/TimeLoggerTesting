package timelogger.control.operation.changetaskconsulenttests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.control.operation.OperationChangeTaskConsulent;
import timelogger.domain.Consulente;
import timelogger.domain.SottoProgetto;
import timelogger.domain.Task;
import timelogger.presentation.UIFacade;
import timelogger.presentation.ui.manager.taskSubProj;

import javax.swing.*;
import java.util.ArrayList;


public class OperationChangeTaskConsulentBaseTest {

    protected taskSubProj fakeUi = new taskSubProj();

    protected OperationChangeTaskConsulent testingObj = new OperationChangeTaskConsulent();

    protected SottoProgetto fakeSottoprogetto;
    protected Task fakeTask;
    protected Consulente fakeConsulente;

    protected Exception caughtException = null;


    protected SottoProgetto initFakeSottoProgetto() {
        fakeSottoprogetto = new SottoProgetto();
        return fakeSottoprogetto;
    }

    protected Task initFakeTask() {
        fakeTask = new Task();
        return fakeTask;
    }

    protected Consulente initFakeConsulente() {
        fakeConsulente = new Consulente();
        fakeConsulente.setNome("Mario");
        fakeConsulente.setCognome("Rossi " + String.valueOf(Math.random()));
        return fakeConsulente;
    }


    /**
     * Initialization of the use case objects (environment parameters)
     */
    protected void initUseCase() {
        fakeSottoprogetto = initFakeSottoProgetto();
        fakeSottoprogetto.tasks.add(initFakeTask());
        fakeSottoprogetto.tasks.get(0).setConsulenteAssociato(initFakeConsulente());

        /**
         * Creating an empty SottoProgetto in UIFacade data
         */
        UIFacade.getInstance().setAData("SottoProgettoSelezionato", fakeSottoprogetto);


        /**
         * Filling fakeUi combobox
         */

        /**
         * The index of the choosen Task
         */
        fakeUi.getLblTaskNumber().setText("1");

        JComboBox cbx = (JComboBox) fakeUi.getComboConsulente();


        ArrayList<Object> listTemp = new ArrayList<Object>();

        /**
         * A no-Consulente option
         */
        listTemp.add("Nessun consulente assegnato");

        /**
         * The Consulente of the choosen Task
         */
        listTemp.add(fakeSottoprogetto.tasks.get(0).getConsulenteAssociato());

        /**
         * Another Consulente
         */
        listTemp.add(initFakeConsulente());

        DefaultComboBoxModel d = new DefaultComboBoxModel(listTemp.toArray());
        //Finds a string in arrayList and puts the first string as label
        for (int i = 0; i < d.getSize(); i++) {
            Object o = d.getElementAt(i);
            if (o instanceof String) {
                i = d.getSize();
                d.setSelectedItem(o);
            }
        }

        cbx.setModel(d);
    }

    protected void echo(String message) {
        System.out.println("");
        String[] classNameParts = this.getClass().getName().split("\\.");
        System.out.println(classNameParts[classNameParts.length - 1] + ":> " + message);
    }

    @Before
    public void setUp() throws Exception {

        this.initUseCase();

        /**
         * No consulente option
         fakeUi.getComboConsulente().setSelectedIndex(0);
         **/

        /**
         * Consulente 1 option
         */
        fakeUi.getComboConsulente().setSelectedIndex(2);
    }

    @After
    public void tearDown() throws Exception {
        this.echo("----- Test Report -----");

        if (caughtException != null) {
            this.echo("Exception caught in execution ");
            throw caughtException;
        } else {
            this.echo("Il nuovo consulente è " + fakeSottoprogetto.tasks.get(0).getConsulenteAssociato().getCognome());
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