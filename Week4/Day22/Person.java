package com.ejson;

import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private Address[] address;
	
	public Person() {}
	public Person(String name, int age, Address[] address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + Arrays.toString(address) + "]";
	}
	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

}
