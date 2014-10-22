package timelogger.control.operation.setprojectdatatests;

import org.junit.Assert;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.presentation.UIFacade;

import static org.hamcrest.Matchers.hasKey;

/**
 * Created by daniele on 22/10/14.
 */
public class BuffersContainRightParameters {

    /**
     * UIFACADE BUFFER
     */

    @Test
    public void UIFacadeContainsTitoloProgetto(){
        Assert.assertThat(UIFacade.getInstance().getData(), hasKey("TitoloProgetto"));
    }

    @Test
    public void UIFacadeContainsClienteProgetto(){
        Assert.assertThat(UIFacade.getInstance().getData(), hasKey("ClienteProgetto"));
    }

    @Test
    public void UIFacadeContainsProgetto(){
        Assert.assertThat(UIFacade.getInstance().getData(), hasKey("Progetto"));
    }

    @Test
    public void UIFacadeContainsDataProgetto(){
        Assert.assertThat(UIFacade.getInstance().getData(), hasKey("DataProgetto"));
    }

    /**
     * CONTROLFACADE BUFFER
     */

    @Test
    public void ControlFacadeContainsNewProject(){
        Assert.assertThat(ControlFacade.getInstance().getTempData(), hasKey("newProject"));
    }
}
