package com.micaelps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micaelps.entities.User;
import com.micaelps.repository.UserRepository;


@Service	
public class UserServiceImpl implements UserService{

	
	
	@Autowired
	UserRepository repository;
	
	
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

}