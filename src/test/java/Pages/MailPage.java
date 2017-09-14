package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage extends BasePage{

	@FindBy(xpath="//li[@class = \"ho_menu_item\"]/a/span")
	private WebElement textUserName;


	public String gettextUserName() {
	    return textUserName.getText();
    }

}
