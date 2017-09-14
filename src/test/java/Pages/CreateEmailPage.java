package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage extends BasePage {
	@FindBy(xpath="html/body/div[1]/div[5]/div[1]/div[1]/p/a")
	private WebElement createEmailLink;



	public void createEmail (){
	    createEmailLink.click();
    }

}
