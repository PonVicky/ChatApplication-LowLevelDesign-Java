package ChatApplication;

import java.util.HashMap;

public class User extends Authentication{
    static HashMap<String,User> users = new HashMap<>();
    static int userID = 2020102095;
    String secretCode;
    String userName;
    String password;
    public User(String userName){
        this.userName = userName;
        password = createPassword();
        secretCode = userName+""+userID++;
    }
}
