package com.andrevendas.vendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevendas.vendas.entities.Category;
import com.andrevendas.vendas.repositories.CategoryRepository;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repositorio;
	
	public List<Category> findAll(){
		
		return repositorio.findAll();
	}	
	public Category findById(Long id) {
		Optional<Category> objeto = repositorio.findById(id);
		return objeto.get();
	}
}
