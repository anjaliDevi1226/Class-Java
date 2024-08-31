package Day13;
/*
 * Find maximum and minimum element in Treeset of contries,Criteria can be arranging based on sorting 
 * order of country name
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class CountrN{
	
	private String name;
	private double gdp;
	
	public CountrN(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public double getGdp() {
		return gdp;
	}

	
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}
	
	
}


public class Assignment1 {
	
	
	public static void main(String[]args) {
		
		
		TreeSet<CountrN>tss=new TreeSet<CountrN>((c1, c2) -> c1.getName().compareTo(c2.getName()));
		
		
	    
	
		 tss.add(new CountrN("name9", 2233.56));
	        tss.add(new CountrN("name9", 2233.20)); 
	        tss.add(new CountrN("name1", 2234.73));
	        tss.add(new CountrN("name5", 2237.73));
	        System.out.println("Country list");
        Iterator<CountrN> itrs = tss.iterator();
        while (itrs.hasNext()) {
        	
            System.out.println(itrs.next());
    }
        
	
	
	  CountrN cmin = Collections.min(tss,
	  (c1,c2)->c1.getName().compareTo(c2.getName()));
	  System.out.println("Minimum country element is "+cmin);
	 
	  CountrN cmax = Collections.max(tss,
			  (c1,c2)->c1.getName().compareTo(c2.getName()));
			  System.out.println("Maximum country element is "+cmax); 
        
    }
}

///ABCD

