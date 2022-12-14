package com.andrevendas.vendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.Product;
import com.andrevendas.vendas.services.ProductService;

@RestController
@RequestMapping(value = "produtos")
public class ProductResource {

	@Autowired
	ProductService servico;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product objeto = servico.findById(id);
		return ResponseEntity.ok().body(objeto);
	}
}
