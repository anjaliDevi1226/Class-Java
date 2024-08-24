package com.day9;

/*
 * Assignment #1

 * #1. In given City ArrayList, make changes, to iterate using
a) enhanced for loop
 */

import java.util.*;
class CityS{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public CityS(String name, long pincode, String capital_city) {
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

public class Assignment1AListEnhancedForLoop {
	
	public static void main(String[] args) {
		//create List
		List<CityS> cities = new ArrayList<CityS>();
				
		//add City objects to List
		cities.add(new CityS("city1", 1234, "capital1"));
		cities.add(new CityS("city2", 3456, "capital2"));
		
		for (CityS city : cities) {
            System.out.println(city);
		}
		
		}
		
		
	}





