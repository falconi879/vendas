package com.andrevendas.vendas.resouurces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.User;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Andre","falconi879@gmail.com","9999999","123456");
		return ResponseEntity.ok().body(u);
	}
	
	
}
