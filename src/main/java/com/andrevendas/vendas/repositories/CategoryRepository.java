package com.andrevendas.vendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.andrevendas.vendas.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}

