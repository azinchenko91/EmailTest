package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class EmailTest extends BaseTest {
    @Test (priority = 1)
    public void testEmail() throws Exception {
        app.login.loginValidUser();
        String userName = app.mail.gettextUserName();
        Assert.assertEquals(userName, "Anna", "Current username " + userName + " isn't correct");

    }

    @Test (priority = 2)
    public void createEmail() throws Exception {
//        app.login.loginValidUser();
//        String userName = app.mail.gettextUserName();
        app.mail.clickCreateEmailLink();
        app.compose.createValidEmail();
        app.sent.clickSentEmaillink();
        String subjectText2 = app.sent.getSubjectText();
        Assert.assertEquals(subjectText2, "Test Email", "Current " + subjectText2 + "isn't correct");


    }

}
