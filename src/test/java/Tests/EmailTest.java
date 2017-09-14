package Tests;

import Pages.*;
import Pages.ComposeEmailPage;
import org.junit.Test;
import org.testng.Assert;


public class EmailTest {
    @Test
    public void testEmail() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.login("annazinchenko", "password1");
        MailPage mailPage = new MailPage();
        String userName = mailPage.gettextUserName();
        Assert.assertEquals(userName, "Anna", "Current username "+userName+" isn't correct");
        CreateEmailPage createEmailPage = new CreateEmailPage();
        createEmailPage.createEmail();
        ComposeEmailPage composeEmailPage = new ComposeEmailPage();
        composeEmailPage.composeEmail("annazinchenko@i.ua", "Subject", "Text");
        String composeEmailSubject2 = composeEmailPage.getInputSubject();
        composeEmailPage.clickBtn();
        SendEmailPage sendEmailPage = new SendEmailPage();
        Assert.assertEquals(sendEmailPage.getConfirmationMessage(), "Письмо успешно отправлено адресатам", "Email isn't send");
        sendEmailPage.clickSendLink();
        String sendEmailSubject = sendEmailPage.getSubjectText();
        Assert.assertEquals(sendEmailSubject, composeEmailSubject2, "Email isn't send");


    }
}
