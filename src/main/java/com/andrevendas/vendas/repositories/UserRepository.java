package com.andrevendas.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrevendas.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
