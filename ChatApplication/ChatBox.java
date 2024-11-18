package ChatApplication;

import java.util.*;

public class ChatBox {
    Scanner in = new Scanner(System.in);
    static int rooms = 0;
    static HashMap<String, User> usersDetails = new HashMap<>();
    static HashMap<String,Integer> userRooms = new HashMap<>();
    static HashMap<Integer,ArrayList<String>> chatRooms =  new HashMap<>();

    public void createChatRoom(String sender, String receiver){
        if((userRooms.containsKey(sender) && userRooms.containsKey(receiver)) &&
                (Objects.equals(userRooms.get(sender), userRooms.get(receiver)))){
            int roomNumber  = userRooms.get(sender);
            for(int i=0;i<chatRooms.get(roomNumber).size();i++){
                System.out.println(chatRooms.get(roomNumber).get(i));
            }
            String name  = usersDetails.get(sender).userName;
            int choice  = 0;
            while (choice != 1) {
                System.out.print(name + ": ");
                String message = in.nextLine();
                if (message.equals("exit 5")) {
                    choice = 1;
                    continue;
                }
                    chatRooms.get(roomNumber).add(name+": "+message+".");
            }

        }
        else {
            ++rooms;
            userRooms.put(sender, rooms);
            userRooms.put(receiver, rooms);
            String name = usersDetails.get(sender).userName;
            ArrayList<String> messages = new ArrayList<>();
            System.out.println("START MESSAGING: ");
            int choice = 0;
            while (choice != 1) {
                System.out.print(name + ": ");
                String message = in.nextLine();
                if (message.equals("exit 5")) {
                    choice = 1;
                    continue;
                }
                 messages.add(name+": "+message+".");
            }
            chatRooms.put(rooms, messages);
        }
    }

}
