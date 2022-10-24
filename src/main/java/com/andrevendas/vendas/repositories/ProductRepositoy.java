package com.andrevendas.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrevendas.vendas.entities.Product;

public interface ProductRepositoy extends JpaRepository<Product, Long> {

}
