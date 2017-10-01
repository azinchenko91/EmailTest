package Tests;

import Helpers.App;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    App app = new App();

    @BeforeClass
    public void setSuite() throws Exception {

    }

    @AfterClass
    public void tearDown() throws Exception {
        app.common.appout();
    }
}
