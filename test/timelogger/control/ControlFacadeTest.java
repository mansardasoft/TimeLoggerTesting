package timelogger.control;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class ControlFacadeTest {

    @Before
    public void setUp() {
        ControlFacade.getInstance().setData("labelTest", new Object());
    }

    @Test
    public void testSetDataSetCorrectValue() throws Exception {
        ControlFacade.getInstance().setData("labelTestSetData", new Object());
        assertThat(ControlFacade.getInstance().getData("labelTestSetData"),
                both(notNullValue()).and(instanceOf(Object.class))
        );
    }

    @Test
    public void testGetDataReturnCorrectValue() throws Exception {
        Assert.assertEquals(
                new Object().getClass(),
                ControlFacade.getInstance().getData("labelTest").getClass()
        );
    }

    @Test(expected = NullPointerException.class)
    public void setADataTestWithNullValue() {
        ControlFacade.getInstance().setData("testingNullValue", null);
    }

    @After
    public void tearDown() {
        ControlFacade.getInstance().getTempData().remove("labelTest");
        Assert.assertThat(
                ControlFacade.getInstance().getTempData(), not(hasKey("labelTest"))
        );
    }
}