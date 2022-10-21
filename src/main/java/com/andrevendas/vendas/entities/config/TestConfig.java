package com.andrevendas.vendas.entities.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrevendas.vendas.entities.Category;
import com.andrevendas.vendas.entities.User;
import com.andrevendas.vendas.repositories.CategoryRepository;
import com.andrevendas.vendas.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository usuarioRepositorio;
	
	@Autowired
	private CategoryRepository categoriaRepositorio;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		usuarioRepositorio.saveAll(Arrays.asList(u1,u2));
		
		Category cat1 = new Category(null, "Informatica");
		Category cat2 = new Category(null, "Escritorio");

		categoriaRepositorio.saveAll(Arrays.asList(cat1,cat2));
		
	}

	
}
