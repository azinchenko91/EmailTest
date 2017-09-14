package Pages;

import Common.Costants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

 abstract class BasePage {
    static WebDriver driver;
    static {
        System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(Costants.Base_URL);}

     BasePage() {
        PageFactory.initElements(driver, this);
    }
}
