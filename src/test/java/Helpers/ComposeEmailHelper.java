package Helpers;

import Pages.ComposeEmailPage;
import Utils.Email;
import Utils.EmailFactory;

public class ComposeEmailHelper extends ComposeEmailPage {

    public void create (Email email){
        creatEmail(email.getTo(), email.getSubject(), email.getText());
    }


    public void createValidEmail(){
        Email email = EmailFactory.getValidEmail();
        creatEmail(email.getTo(),email.getSubject(),email.getText());
    }
}
