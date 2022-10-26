package com.andrevendas.vendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevendas.vendas.entities.User;
import com.andrevendas.vendas.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorio;
	
	public List<User> findAll(){
		
		return repositorio.findAll();
	}
	public User findById(Long id) {
		Optional<User> objeto = repositorio.findById(id);
		return objeto.get();
	}
	
	public User insert(User user) {
		return repositorio.save(user);
	}
	
	public void delete(Long id) {
		repositorio.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity = repositorio.getReferenceById(id);
		updateRegistro(entity, user);
		return repositorio.save(entity);
	}
	private void updateRegistro(User entity, User user) {
		entity.setNome(user.getNome());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
