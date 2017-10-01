package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage extends BasePage{

	@FindBy(xpath="//li[@class = \"ho_menu_item\"]/a/span")
	private WebElement textUserName;

	@FindBy(xpath="//*[@class='make_message']/a")
	private WebElement createEmailLink;


	public String gettextUserName() {
	    return textUserName.getText();
    }

    public void clickCreateEmailLink(){
		createEmailLink.click();
	}

}
