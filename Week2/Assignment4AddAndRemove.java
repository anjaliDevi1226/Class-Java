package com.day9;

/*
 * Assignment#4. In above ArrayList, make changes to perform below
a) add City objects in between
b) remove City object
 */
import java.util.ArrayList;

import java.util.List;

class CityLL{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public CityLL(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	
		
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}
}
public class Assignment4AddAndRemove {
	
	public static void main(String[] args) {
		//create List
		List<CityLL> cities = new ArrayList<CityLL>();
				
		
		cities.add(new CityLL("city1", 1234, "capital1"));
		cities.add(new CityLL("city2", 3456, "capital2"));
		
		for (CityLL city : cities) {
			System.out.println("List before Change");
            System.out.println(city);
		}
		
		//Add a city between "city1" and "city2"
        cities.add(1, new CityLL("city3", 1456, "state3"));

        
        System.out.println("\nList after adding a city in the middle:");
        for (CityLL city : cities) {
            System.out.println(city);
        }
        

        // Remove a City 
        cities.remove(1);

        
        System.out.println("\nList after removing a city:");
        for (CityLL city : cities) {
            System.out.println(city);
        }
		
		}
	
		
		

}
