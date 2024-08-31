package Day14;

import java.util.Comparator;
import java.util.TreeSet;

public class Assignment2 {
	
	/*
	 * #2. Use TreeSet for above application, store Chat objects, and sort based on ascending order of Participant names.
	 */
	
	public static void main(String[]args) {
		
		TreeSet<String>cmsgs=new TreeSet<>(new RComparator());
		
		cmsgs.add("P13 - D");
		cmsgs.add("P2 - S");
		cmsgs.add("P9 - d");
		cmsgs.add("P8 - N");
		cmsgs.add("P13 - e");
		cmsgs.add("P5 - Y");
		cmsgs.add("P8 - I");
		cmsgs.add("P9 - completed");
		
		display(cmsgs);
		
	}
			
	static void display(TreeSet<String>ts) {	
	for(String str:ts) {
		
		System.out.println(str);
	}

}
}
/*
 * 1- implement comparator interface as class
 * 2-anonymous inner class
 * 3-lambda
 */
class RComparator implements Comparator<String>{
	
	@Override
	public int compare(String s1,String s2) {
		return s1.compareTo(s2);
		
	}
	
}
