package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmailPage extends BasePage {
    @FindBy(xpath = "//div[@class = \"block_confirmation\"]/div [@class = \"content clear\"]")
    private WebElement msgcConfirmation;

    @FindBy(xpath = ".//*[@id='mesgList']/form/div[1]/a/span[3]/span")
    private WebElement txtSubject;

    @FindBy(xpath = "//a[contains(.,'Отправленные')]")
    private WebElement linkSend;


    public String getConfirmationMessage() {
        return msgcConfirmation.getText();
    }

    public String getSubjectText (){
	    return  txtSubject.getText();
}

    public void clickSendLink() {
        linkSend.click();
    }
}
