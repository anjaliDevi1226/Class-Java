package RevisionDay15;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * #1. Make changes in TreeSet with Chat Messages, to use Streams, and filter messages from specific sender(atleast two senders)?
 */
class MChats {
	private String sender_name;
	private String msg;

	public MChats(String sender_name, String msg) {
		super();
		this.sender_name = sender_name;
		this.msg = msg;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Chats [sender_name=" + sender_name + ", msg=" + msg + "]";
	}
}


public class Assignment1 {
	
	public static void main(String[] args) {
		
		
		TreeSet<ChatS> cmsgs = new TreeSet<>(
				(o1, o2)-> (o1.getSender_name()+o1.getMsg()).compareTo(o2.getSender_name()+o2.getMsg())
				);
		cmsgs.add(new ChatS("name1", "msg1"));
		cmsgs.add(new ChatS("name2", "msg2"));
		cmsgs.add(new ChatS("name1", "msg3"));
		cmsgs.add(new ChatS("name4", "msg4"));

		display(cmsgs);
		
		/* write lambda which sorts based on msg order(ascending)*/
		ChatS c = Collections.min(cmsgs, (c1,c2)->c1.getMsg().compareTo(c2.getMsg()));
		
		System.out.println("Minimum :"+c);

		System.out.println("-------------Filtered messages below------------");
		cmsgs.stream().filter((e)->e.getSender_name().equalsIgnoreCase("name2")|| e.getSender_name().equalsIgnoreCase("name4"))
		.forEach((item)->{System.out.println(item);});
		System.out.println("------------------------------------------------");
		
	}

	static void display(TreeSet<ChatS> cmsgs) {
		for (ChatS cmg : cmsgs) {
			System.out.println(cmg + "\t");
		}
		
		
		
	}

}
