package com.andrevendas.vendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.User;
import com.andrevendas.vendas.services.UserService;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource {
	
	@Autowired
	private UserService servico;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> lista = servico.findAll();
		
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User objeto = servico.findById(id);
		return ResponseEntity.ok().body(objeto);
	}
}
