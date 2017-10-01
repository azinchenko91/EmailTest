package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentEmailPage extends BasePage {
    @FindBy(xpath = "//span [@ class = 'sbj']")
    private WebElement textSubject;

    @FindBy(xpath = "//*[@class = 'new']/a")
    private WebElement sentEmailLink;


    public void clickSentEmaillink() {
        sentEmailLink.click();
    }


    public String getSubjectText() {
        return textSubject.getText();
    }


}
