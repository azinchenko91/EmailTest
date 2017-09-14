package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	@FindBy(xpath="//input[@name='login']")
	private WebElement InputLogin;

	@FindBy(xpath="//input[@name='pass']")
	private WebElement InputPassword;

	@FindBy(xpath="//input[@value='Войти']")
	private WebElement btnLogin;


	public void login(String name, String password){
		InputLogin.sendKeys(name);
		InputPassword.sendKeys(password);
		btnLogin.click();

	}



}
