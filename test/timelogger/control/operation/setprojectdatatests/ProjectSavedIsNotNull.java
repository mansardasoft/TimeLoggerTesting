package timelogger.control.operation.setprojectdatatests;

import org.junit.Assert;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.domain.Progetto;

/**
 * Created by daniele on 22/10/14.
 */
public class ProjectSavedIsNotNull {

    @Test
    public void testDoOp(){
        Progetto p = new Progetto();
        Assert.assertEquals("The saved Project has the right class",
                p.getClass(),
                ControlFacade.getInstance().getData("newProject").getClass()
        );
    }
}
