package Pages;

import Utils.SentEmail;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SentEmailPage extends BasePage {

    @FindBy(xpath = "//*[@class = 'new']/a")
    private WebElement sentEmailLink;

    @FindBy(xpath = ".//*[@class='row new']/a/span[3]")
    private List<WebElement> subjectRow;

    @FindBy(xpath = ".//*[@class='tm']")
    private List<WebElement> dateRow;


    public void clickSentEmaillink() {
        sentEmailLink.click();
    }


    public String getFirstSubjectText() {
        ArrayList<String> urls = new ArrayList<>();
        for (WebElement link : subjectRow) {
            urls.add(link.getText());
        }
        String firstElement;
        return firstElement = urls.get(0);
    }

    public String getFirstSubjectText2() throws ParseException {
        ArrayList<SentEmail> listEmail = new ArrayList<>();
        for (int i = 0; i < dateRow.size(); i++) {
            DateFormat format = new SimpleDateFormat("dd.MM.yy, hh:mm");
            Date date = format.parse(dateRow.get(i).getAttribute("title"));
            listEmail.add(new SentEmail(subjectRow.get(i).getText(), date));
            Collections.sort(listEmail, Comparator.comparing(SentEmail::getDate));
        }
        String firstEl;
        return firstEl = subjectRow.get(0).getText();
    }
}





    

