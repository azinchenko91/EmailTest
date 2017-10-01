package Utils;

import java.util.ResourceBundle;

public class EmailFactory {
static ResourceBundle resource;
static {
    resource = ResourceBundle.getBundle("email");
}

public  static Email getValidEmail(){
    return new Email(resource.getString("valid.to"),
            resource.getString("valid.subject"),
            resource.getString("valid.text"));
}

}
