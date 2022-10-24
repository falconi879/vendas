package com.andrevendas.vendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevendas.vendas.entities.Product;
import com.andrevendas.vendas.repositories.ProductRepositoy;

@Service
public class ProductService {

	@Autowired
	ProductRepositoy repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	public Product findById(Long id) {
		
		Optional<Product> objeto = repository.findById(id);
		return objeto.get();
	}
}
