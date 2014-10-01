package com.nirdosh.db.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.nirdosh.db.dao.UserDAO;
import com.nirdosh.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO userDAO;
	
	public List<User> getAll() {
		return userDAO.getAll();
	}

	public User get(double id) {
		return userDAO.get(id);
	}

	public void add(User user) {
		userDAO.add(user);		
	}

	public List<User> getByName(String name) {
		return userDAO.get(name, null, null);
	}

	public List<User> getBySurname(String surname) {
		return userDAO.get(null, surname, null);
	}

	public List<User> getBySpiritualName(String spiritualName) {
		return userDAO.get(null, null, spiritualName);
	}

	public void deleteAll() {
		for(User user : getAll()){
			userDAO.delete(user);
		}
		
	}

}
