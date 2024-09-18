package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Make changes in given spring boot app,to create Person class, and a new REST end point to
 * return person object,in JSON format to web format
 */

@RestController
public class MyRestController {
	
	@GetMapping("/hello")
	public String met() {
		return "Hello123";
		
	}
	@GetMapping("/url")
	public Person met2() {
		return new Person(1,"some name");
		
	}

}
