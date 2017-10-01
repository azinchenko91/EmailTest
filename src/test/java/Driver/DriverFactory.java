package Driver;

import Common.Costants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

class DriverFactory {
     static WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if ("firefox".equals(driverName)) {

            System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if ("ie".equals(driverName)) {
                System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
        else if ("chrome".equals(driverName)) {
            System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if ("edge".equals(driverName)) {
            System.setProperty("webdriver.edge.driver", "Drivers\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Costants.Base_URL);
        return driver;
    }
}
