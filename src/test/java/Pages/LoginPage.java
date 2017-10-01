package Pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement InputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement InputPassword;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement btnLogin;


    public void login(String name, String password) {
        log.info(String.format("Login user name -%s, password -%s", name, password));
//		Function<WebDriver, Boolean> s=(a)->{return  a.findElement(By.xpath("//input[@name='login']"))
//				.getAttribute("href")
//				.endsWith("dff");};
//		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
//		webDriverWait.until(s);



        //name.chars().forEach(s->{InputLogin.sendKeys(Keys.));
        InputLogin.sendKeys(name);
        InputPassword.sendKeys(password);
        btnLogin.click();


    }


}
