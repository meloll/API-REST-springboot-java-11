package com.apiweb.resources;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiweb.entities.User;

@RestController
@RequestMapping(value = "/users" )
public class UserResource {
	
	@GetMapping
	public  ResponseEntity<User> findAll(){
		User u = new User(1, "Maria", "sdsa@Gmail.com", "988", "34545");
		return ResponseEntity.ok().body(u);
		
		
	
		
	}
	

}
