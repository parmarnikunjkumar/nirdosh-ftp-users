package com.nirdosh.db.service;

import java.util.List;

import com.nirdosh.domain.User;

public interface UserService {

	List<User> getAll();
	
	User get(double id);

	void add(User user);
	
	List<User> getByName(String string);
	
	List<User> getBySurname(String surname);
	
	List<User> getBySpiritualName(String spiritualName);

	void deleteAll();
	
	
}
