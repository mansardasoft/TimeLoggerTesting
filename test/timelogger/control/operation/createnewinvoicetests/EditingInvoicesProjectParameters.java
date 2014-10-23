package timelogger.control.operation.createnewinvoicetests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.domain.FatturaParziale;
import timelogger.domain.Progetto;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by daniele on 22/10/14.
 */
public class EditingInvoicesProjectParameters {

    @Before
    public void setUp() {
    }

    @Test
    public void testDoOpSetEndingDateFirstInvoiceToday() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = cal.getTime();

        ((FatturaParziale) ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.get(0)).setDataFine(tomorrow);

        Assert.assertNotEquals("the ending date of the first invoice of invoices list of project should be different from today",
                today,
                ((FatturaParziale) ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.get(0)).getDataFine()
        );
    }

    @Test
    public void testDoOpSetEndingDateFirstInvoiceAt1970() {
        Date apoc = new Date(0);

        ((FatturaParziale) ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.get(0)).setDataFine(apoc);

        Assert.assertEquals("the date of first invoice is set on 1-1-1970",
                "Thu Jan 01 01:00:00 CET 1970",
                ((FatturaParziale) ((Progetto) ControlFacade.getInstance().getData("newProject")).fatture.get(0)).getDataFine().toString()
        );
    }
}
