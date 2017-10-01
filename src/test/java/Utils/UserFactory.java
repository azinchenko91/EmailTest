package Utils;

import java.util.ResourceBundle;

public class UserFactory {
    static ResourceBundle resorce;
    static{
     resorce = ResourceBundle.getBundle("user");
    }
    public static User getValidUser(){
        return new User(resorce.getString("valid.name"),
                resorce.getString("valid.password"));

    }

    public static User getInvalidUser(){
        return new User(resorce.getString("invalid.name"),
                resorce.getString("invalid.password"));

    }
}
