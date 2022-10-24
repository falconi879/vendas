package com.andrevendas.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrevendas.vendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
