package com.day9;

/*
 * Assignment 1

 * #1. In given City ArrayList, make changes, to iterate using
 b) normal for loop, without iterator
 */
import java.util.ArrayList;
import java.util.List;

class CitySN{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public CitySN(String name, long pincode, String capital_city) {
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

public class Assignment1BNormalForLoop {
	
	public static void main(String[] args) {
		//create List
		List<CitySN> cities = new ArrayList<CitySN>();
				
		//add City objects to List
		cities.add(new CitySN("city1", 1234, "capital1"));
		cities.add(new CitySN("city2", 3456, "capital2"));
		cities.add(new CitySN("city2", 3456, "capital4"));
		
		for (int i = 0; i < cities.size(); i++) {
            CitySN city = cities.get(i);
            System.out.println(city);
		
	}
		
		
	}
}



