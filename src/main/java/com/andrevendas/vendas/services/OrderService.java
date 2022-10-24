package com.andrevendas.vendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevendas.vendas.entities.Order;
import com.andrevendas.vendas.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repositorio;

	public List<Order> findAll() {

		return repositorio.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> objeto = repositorio.findById(id);
		return objeto.get();
	}

}
