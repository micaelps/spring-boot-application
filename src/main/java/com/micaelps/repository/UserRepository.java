package com.micaelps.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micaelps.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	
	public Optional<User> findByUserName(String username);

}
