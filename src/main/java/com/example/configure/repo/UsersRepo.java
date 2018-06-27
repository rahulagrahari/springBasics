package com.example.configure.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.learning.model.User;

public interface UsersRepo extends CrudRepository<User, Integer> {

	Optional<User> findByName(String username);
	
}
