package RevisionDay15;

/*
 * Assignment #2. Create TreeMap to store ChatMessages, both Key and Value are String Type. Store in descending order of names?
 */
import java.util.Set;
import java.util.TreeMap;

class chtmsg{
	
	private String name;
	private String msg;
	public chtmsg(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "chtmsg [name=" + name + ", msg=" + msg + "]";
	}
	
	
	
}

public class Assignment2 {
	
public static void main(String[]args) {
		
	/*
	 * TreeMap<String,String> hmss=new TreeMap<>(
	 * (c1,c2)->c1.getName().compareTo(c2.getMsg));
	 */
		
		TreeMap<String,String> hmss=new TreeMap<>((c1, c2) -> c2.compareTo(c1));
		/*(
				(o1, o2)-> o1.getName().compareTo(o2.getName())
				);*/
		hmss.put("name1", "msg99");
		hmss.put("name3", "msg199");
		hmss.put("name2", "msg499");
		hmss.put("name4", "msg299");
		hmss.put("name5", "msg899");
		
		Set<String>ss=hmss.keySet();
		
		for(String item_key:ss) {
			
			System.out.println(item_key+"-->"+hmss.get(item_key));
		}
	}


}
