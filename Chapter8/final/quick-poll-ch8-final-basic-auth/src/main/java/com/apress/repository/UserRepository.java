package com.apress.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUsername(String username);
}
