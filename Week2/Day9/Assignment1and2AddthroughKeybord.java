package com.day9;
/*
 * #2.Make changes in above example, to take  input data from Keyboard
   #3. Modify above program by using loop to input details of multiple cities
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CityD{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public CityD(String name, long pincode, String capital_city) {
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

public class Assignment1and2AddthroughKeybord {
	
	public static void main(String[] args) {
		//create List
		List<CityD> cities = new ArrayList<CityD>();
		
		
		//take values from keyboard 
		Scanner scnrs = new Scanner(System.in);
		// Number of cities to be added
        int numberOfCities = 3;

        for (int i = 1; i <= numberOfCities; i++) {
            

            System.out.println("Please enter city name:");
            String icity = scnrs.nextLine();

            System.out.println("Please enter pincode:");
            long ipincode = scnrs.nextLong();
            scnrs.nextLine(); 

            System.out.println("Please enter state name:");
            String istate = scnrs.nextLine();

            // Add city to the list
            cities.add(new CityD(icity, ipincode, istate));
        }

        // Iterate and display the list of cities
        System.out.println("\nCity Details:");
        for (CityD city : cities) {
            System.out.println(city);
        }

        
    }



}



