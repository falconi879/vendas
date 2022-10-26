package com.andrevendas.vendas.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User user){
		user = servico.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		servico.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
