package com.andrevendas.vendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.andrevendas.vendas.entities.Category;
import com.andrevendas.vendas.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

