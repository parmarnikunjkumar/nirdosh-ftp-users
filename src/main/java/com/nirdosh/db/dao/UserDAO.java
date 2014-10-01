package com.nirdosh.db.dao;

import java.util.List;

import com.nirdosh.domain.User;

public interface UserDAO {
	
	User get(double id);
	
	List<User> getAll();
	
	void add(User user);

	List<User> get(String firstName, String lastName, String spiritualName);

	void delete(User user);
}
