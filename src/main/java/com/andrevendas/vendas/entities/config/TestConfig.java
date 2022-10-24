package com.andrevendas.vendas.entities.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrevendas.vendas.entities.Category;
import com.andrevendas.vendas.entities.Order;
import com.andrevendas.vendas.entities.Product;
import com.andrevendas.vendas.entities.User;
import com.andrevendas.vendas.repositories.CategoryRepository;
import com.andrevendas.vendas.repositories.OrderRepository;
import com.andrevendas.vendas.repositories.ProductRepositoy;
import com.andrevendas.vendas.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository usuarioRepositorio;
	
	@Autowired
	private CategoryRepository categoriaRepositorio;
	
	@Autowired
	private OrderRepository pedidoRepositorio;
	
	@Autowired
	private ProductRepositoy produtoRepositorio;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		usuarioRepositorio.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		pedidoRepositorio.saveAll(Arrays.asList(o1,o2,o3));
				
		
		Category cat1 = new Category(null, "Informatica");
		Category cat2 = new Category(null, "Escritorio");

		categoriaRepositorio.saveAll(Arrays.asList(cat1,cat2));
		
		Product prod1 = new Product(null, "Monitor 32 polegadas", "da marca Philco", 1200.00, " http:// ",cat1);
		Product prod2 = new Product(null, "Monitor 18 polegadas", "da marca Philco", 900.00, " http:// ", cat1);
		Product prod3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "http:// ",cat2); 
		Product prod4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, " http://",cat2); 
		Product prod5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "http:// ",cat2); 

		produtoRepositorio.saveAll(Arrays.asList(prod1,prod2,prod3,prod4,prod5));
	}

	
}
