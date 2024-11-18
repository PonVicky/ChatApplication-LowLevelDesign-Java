package ChatApplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("----                             Durdle                                   ----");
        System.out.println("------------------------------------------------------------------------------\n");
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x!=1){
            System.out.println(" 1.Create Account");
            System.out.println(" 2.Login");
            System.out.println(" 3.Exit");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice){
                case 1:{
                    System.out.print("Enter your name: ");
                    String name  = in.next();
                    User user1 =  new User(name);
                    user1.updatePassword(user1, user1.password);
                    User.users.put(user1.userName,user1);
                    ChatBox.usersDetails.put(user1.secretCode, user1);
                    System.out.println("----------------------------------------------");
                    System.out.println("Successfully created account!\nYour secret code: " + user1.secretCode);
                    System.out.println("----------------------------------------------");

                }break;
                case 2:{
                    System.out.println("Enter your userName: ");
                    Authentication authunticate = new Authentication();
                    String userName =  in.next();
                    while(!User.users.containsKey(userName)){
                        System.out.println("User do not exist!");
                        System.out.println("Enter your userName: ");
                        userName = in.next();
                    }
                    authunticate.login(User.users.get(userName));
                }break;
                case 3:{
                    x = 1;
                }break;
            }
        }

    }
}
