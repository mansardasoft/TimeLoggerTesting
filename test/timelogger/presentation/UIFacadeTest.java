package timelogger.presentation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class UIFacadeTest {

    @Test(expected = NullPointerException.class)
    public void setADataTestWithNullValue() {
        UIFacade.getInstance().setAData("testingNullValue", null);
    }

    @Before
    public void setUp() {
        UIFacade.getInstance().setAData("labelTest", new Object());
    }

    @Test
    public void testsetAData() throws Exception {
        UIFacade.getInstance().setAData("labelTestData", new Object());
        assertThat(UIFacade.getInstance().getAData("labelTestData"),
                both(notNullValue()).and(instanceOf(Object.class))
        );
    }

    @Test
    public void testgetAData() throws Exception {
        Assert.assertEquals(
                new Object().getClass(),
                UIFacade.getInstance().getAData("labelTest").getClass()
        );

    }

    @After
    public void tearDown() {
        UIFacade.getInstance().getData().remove("labelTest");
        Assert.assertThat(
                UIFacade.getInstance().getData(), not(hasKey("labelTest"))
        );
    }
}