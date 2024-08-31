package Day14;
/*
 * develop an application using Linkedlist ,store chat messages(as object)display,reverse and again display reversed linked list
 *  
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class ChatsM {
    private String sender_name;
    private String msg;
    
    public ChatsM(String sender_name, String msg) {
        this.sender_name = sender_name;
        this.msg = msg;
    }
    
    @Override
    public String toString() {
        return "Chats [sender_name=" + sender_name + ", messages=" + msg + "]";
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        List<ChatsM> msgs = new LinkedList<>();
        
        // Create Chats objects and add to the linked list
        msgs.add(new ChatsM("P13", "D"));
        msgs.add(new ChatsM("P2", "S"));
        msgs.add(new ChatsM("P9", "d"));
        msgs.add(new ChatsM("P8", "N"));
        msgs.add(new ChatsM("P13", "e"));
        msgs.add(new ChatsM("P5", "Y"));
        msgs.add(new ChatsM("P8", "I"));
        msgs.add(new ChatsM("P9", "completed"));
        
        
        System.out.println("Original chat messages:");
        display(msgs);
        
        // Reverse the linked list
        reverseList(msgs);
        
        
        System.out.println("Reversed  messages:");
        display(msgs);
        
        // Reverse the list again to restore original order
        reverseList(msgs);
        
        
        System.out.println("Restored messages:");
        display(msgs);
    }
    
    // Method to display the list of Chats objects
    static void display(List<ChatsM> listMess) {
        for (ChatsM chat : listMess) {
            System.out.println(chat);
        }
    }
    
    // Method to reverse the linked list
    static void reverseList(List<ChatsM> messag) {
        LinkedList<ChatsM> reversedList = new LinkedList<>();
        
       
        ListIterator<ChatsM> iterator = messag.listIterator(messag.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        
		
		  // Clear the original list and add all elements from the reversed list
        messag.clear(); messag.addAll(reversedList);
		 
    }
}