package com.nirdosh.db.service;

import java.util.List;

import com.nirdosh.domain.User;

public interface UserService {

	List<User> getAll();
	
	User get(double id);	
	
}
