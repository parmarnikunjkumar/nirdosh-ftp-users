package com.nirdosh.db.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.nirdosh.db.dao.UserDAO;
import com.nirdosh.domain.User;

@Service
public class UserDAOImpl implements UserDAO {

	private static final String COLLECTION_NAME = "ftp-users";

	private static final String NAME = "name";
	private static final String SURNAME = "surname";
	private static final String SPIRITUAL_NAME = "spiritualName";
	@Inject
	private MongoOperations mongoOperations;

	public User get(double id) {
		return mongoOperations.findById(id, User.class, COLLECTION_NAME);
	}

	public List<User> getAll() {
		return mongoOperations.findAll(User.class, COLLECTION_NAME);
	}

	public void add(User user) {
		mongoOperations.save(user, COLLECTION_NAME);
	}

	public List<User> get(String name, String lastName, String spiritualName) {
		Query query = new Query(Criteria.where(NAME).is(name)
				.and(SPIRITUAL_NAME).is(spiritualName).and(SURNAME)
				.is(lastName));
		return mongoOperations.find(query, User.class,COLLECTION_NAME);
	}

	public void delete(User user) {
		mongoOperations.remove(user, COLLECTION_NAME);
		
	}
}
