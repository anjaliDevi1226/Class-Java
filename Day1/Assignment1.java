package Day12;
/*
 * use Strings split() method to split given based on ","
 */
public class Assignment1 {

	
public static void main(String[]args) {
		
		String str="This,is,to,test";
		//int bindex=0,eindex=0;
		
		// Split the string by comma
        String[] substrings = str.split(",");
        
        for (String substring : substrings) {
            System.out.println(substring);
        }
	}

}
