package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class EmailTest extends BaseTest {
    @Test(priority = 1)
    public void testEmail() throws Exception {
        app.login.loginValidUser();
        String userName = app.mail.gettextUserName();
        Assert.assertEquals(userName, "Anna", "Current username " + userName + " isn't correct");

    }

    @Test(priority = 2)
    public void createEmail() throws Exception {
        app.mail.clickCreateEmailLink();
        app.compose.createValidEmail();
        String subjectText = app.compose.getSubjectText();
        app.compose.clickSendButton();
        app.sent.clickSentEmaillink();
        String firstSubjecttext = app.sent.getFirstSubjectText2();
        Assert.assertEquals(firstSubjecttext, subjectText, "Current " + firstSubjecttext + "isn't valid");

    }

}
