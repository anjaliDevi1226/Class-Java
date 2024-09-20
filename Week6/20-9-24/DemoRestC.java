package com.example.demo_rest;
/*
 * Assignment 1
 * It should be possible to get details of any ticket already booked,Based on the Ticket ID
 * Assignment 2
 * It should be possible to delete a ticket based on the ticket id
 */

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestC {
	
	public DemoRestC() {
		System.out.println("constractor DemoRestC()");
	}
	
	@GetMapping("/hello")
	String met() {
		System.out.println("-------------jjjjjjjjjjjjj-------");
		return "hello World1";
		
	}
	
	@GetMapping("/ticket")
	//localhost:8180/ticket?tid=6453
	Ticket getUser(@RequestParam("tid")int ticketid) {
		return new Ticket(ticketid,"person1","south street",3);
	}
	@PostMapping("/booking")
	
	//Request body create java object from request
	Ticket  bookTicket(@RequestBody Ticket ticket) {
		System.out.println("Booking ticket : "+ticket);
		ticket.setId(100);
		return ticket;
		
	}
	
	@DeleteMapping("/cancel")
	//127.0.0.1:8180/cancel?tid=6453
	String cancelTicket(@RequestParam("tid")int ticketid) {
		return "Ticket with id "+ticketid+" is cancelled";
		
	}

}
