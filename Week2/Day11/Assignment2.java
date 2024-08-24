package Day10;



import java.util.*;
import static java.lang.System.*;

class City{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public City(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	
	//getter, setter - TBD
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}


}

public class Assignment2 {
public static void main(String[] args) {
	
	List<City> cities = new ArrayList<City>();
	
	cities.add(new City("city1", 1234, "capital1"));
	cities.add(new City("city2", 3456, "capital2"));
	display(cities,"Before reversing");
	Collections.reverse(cities);
	display(cities,"After reversing");
	
	
	}


	static void display(List<City>Icity,String msg) {
		System.out.println(msg);
		Iterator<City>itr=Icity.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println();
	}
}






