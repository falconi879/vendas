package com.andrevendas.vendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevendas.vendas.entities.Order;
import com.andrevendas.vendas.services.OrderService;

@RestController
@RequestMapping(value = "/pedidos")
public class OrderResource {

	@Autowired
	OrderService servico;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order objeto = servico.findById(id);
		return ResponseEntity.ok().body(objeto);
	}
}
