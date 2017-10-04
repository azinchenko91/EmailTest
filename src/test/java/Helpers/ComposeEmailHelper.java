package Helpers;

import Pages.ComposeEmailPage;
import Utils.Email;
import Utils.EmailFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ComposeEmailHelper extends ComposeEmailPage {

    public void create (Email email){
        creatEmail(email.getTo(), email.getSubject(), email.getText());
    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    public void createValidEmail(){
        Email email = EmailFactory.getValidEmail();
        creatEmail(email.getTo(),email.getSubject() +" "+ date,email.getText());
    }
}
