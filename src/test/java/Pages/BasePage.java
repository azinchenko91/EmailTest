package Pages;

import Driver.MyDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected static WebDriver driver = MyDriver.getDriver();
    protected Logger log = LogManager.getLogger(this.getClass());

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}

