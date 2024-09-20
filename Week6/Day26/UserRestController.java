package com.example.demo_rest;

/*
 * #3 please create one more class annotated with RestController and expose simple Rest end point.and confirm if
 * we can have multiple RestController in a single Sprint boot application
 */
		
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/hello1")
		
	String met() {
		
		return "hello from userController";
	}

}
