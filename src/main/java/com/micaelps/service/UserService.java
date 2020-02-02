package com.micaelps.service;

import com.micaelps.entities.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User formUser) throws Exception;
}
