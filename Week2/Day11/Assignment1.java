package Day10;
/*
 * Use TreeSet to arrange country object in descending order of GDP
 */
import java.util.*;
//import java.util.Iterator;
//import java.util.TreeSet;

class CountryN{
	
	private String name;
	private double gdp;
	
	public CountryN(String name, double gdp) {
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

    public static void main(String[] args) {
    	TreeSet<CountryN> tsCountries = new TreeSet<>(new GdpComparator());

        
        tsCountries.add(new CountryN("Country1", 11000.0));
        tsCountries.add(new CountryN("Country2", 20000.0));
        tsCountries.add(new CountryN("Country3", 10000.0));
        

        
        for (CountryN country : tsCountries) {
            System.out.println(country);
        }
}
    

    static class GdpComparator implements Comparator<CountryN> {
        @Override
        public int compare(CountryN c1, CountryN c2) {
            
        	return (int)(c2.getGdp()-c1.getGdp());
        }
    }
}
