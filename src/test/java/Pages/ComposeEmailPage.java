package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposeEmailPage extends BasePage {


    @FindBy(xpath = "//textarea[@id='to']")
    private WebElement toField;

    @FindBy(xpath = "//*[@name='subject']")
    private WebElement subjectField;

    @FindBy(xpath = "//*[@id='text']")
    private WebElement textField;

    @FindBy(xpath = "//*[@class='send_container clear']/input[1]")
    private WebElement sendBtn;


    public void creatEmail(String to, String subject, String text) {
        toField.sendKeys(to);
        subjectField.sendKeys(subject);
        textField.sendKeys(text);
    }

    public String getSubjectText (){
        return subjectField.getAttribute("value");
    }

    public void clickSendButton(){
        sendBtn.click();
    }
}
