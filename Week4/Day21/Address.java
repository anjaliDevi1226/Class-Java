package com.ejson;

public class Address {
	private String street;
	private String city;
	private long zipcode;
	
	
	
	
	public Address(String street, String city, long zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}


	public long getZipcode() {
		return zipcode;
	}

	
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
