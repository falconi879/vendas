package com.andrevendas.vendas.resouurces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.Category;

@RestController
@RequestMapping(value = "/categorias") 
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<Category> findAll(){
		Category cat1 = new Category(1L,"Informatica");
		return ResponseEntity.ok().body(cat1);
	}
	
	
	

}
