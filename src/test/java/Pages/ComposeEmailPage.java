package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDateTime;

public class ComposeEmailPage extends BasePage {
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement inputTo;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputSubject;

    @FindBy(xpath = "//textarea[@id='text']")
    private WebElement inputText;

    @FindBy(xpath = "//input[@tabindex='12']")
    private WebElement btnSend;

    public void composeEmail(String to, String subject, String text) {
        inputTo.sendKeys(to);
        String time = LocalDateTime.now().toString();
        inputSubject.sendKeys(subject + " " + time);
        inputText.sendKeys(text);
//        btnSend.click();
    }

    public void clickBtn (){
        btnSend.click();
    }

    public String getInputSubject() {
        return inputSubject.getAttribute("value");
    }


}
