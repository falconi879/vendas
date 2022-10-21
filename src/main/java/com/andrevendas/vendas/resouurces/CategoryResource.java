package com.andrevendas.vendas.resouurces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.Category;
import com.andrevendas.vendas.services.CategoryService;

@RestController
@RequestMapping(value = "/categorias") 
public class CategoryResource {
	
	@Autowired
	CategoryService servico;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category objeto = servico.findById(id);
		return ResponseEntity.ok().body(objeto);
	}
}
