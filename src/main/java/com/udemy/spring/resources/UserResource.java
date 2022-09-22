package com.udemy.spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring.entities.User;

@RestController
@RequestMapping(value= "/User")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindALL() {
		
		User u = new User(1L, "Rogerio Arenas", "rogerioarenas@hotmail.com", "999699992", "122196");				
		return ResponseEntity.ok().body(u);
		
		
	}
	
}
