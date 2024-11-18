package ChatApplication;

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {
    static HashMap<User ,String> auth = new HashMap<>();
    Scanner in = new Scanner(System.in);
    public void updatePassword(User user, String password){
        auth.put(user,password);
    }

    public void login(User user){
        System.out.print("Enter password: ");
        String pass = in.next();
        while(!auth.get(user).equals(pass)){
            System.out.println("Incorrect password!\nEnter correct password: ");
            pass= in.next();
        }
        System.out.println("\nSuccessfully logged in!");
        System.out.println("--------------------------------------------");
        System.out.println("Wanna chat with a friend?(yes/no)");
        String choice = in.next();
        if(choice.equals("no")||choice.equals("No")){
            return;
        }else if(choice.equals("yes")||choice.equals("Yes")) {
            chatting(user.secretCode);
        }

    }

    public void chatting(String yourCode){
        ChatBox chatt = new ChatBox();
        System.out.print("Enter your friends secret code: ");
        String broCode = in.next();
        while(!ChatBox.usersDetails.containsKey(broCode)){
            System.out.print("Wrong code. Enter the valid secret code: ");
            broCode = in.next();
        }
        chatt.createChatRoom(yourCode,broCode);
    }

    public String createPassword(){
        System.out.print("Enter your password: ");
        String tempPass = in.next();
        System.out.print("Enter your password again: ");
        String tempPass2 = in.next();
        while(!tempPass.equals(tempPass2)){
            System.out.print("Passwords do not match, re-enter your password: ");
            tempPass2 = in.next();
        }
        return tempPass;
    }
}
