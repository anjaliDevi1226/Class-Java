package com.example.demo_rest;

import org.springframework.stereotype.Component;

@Component
public class Ticket {
	private int id;
	private String name;
	private String addr;
	private int number_of_seats;
	public Ticket() {}
	public Ticket(int id, String name, String addr,int number_of_seats) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.number_of_seats=number_of_seats;
	}
	 
	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	 
	public String getAddr() {
		return addr;
	}
	 
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public int getNumber_of_seats() {
		return number_of_seats;
	}
	
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	
	

}
