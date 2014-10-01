package com.nirdosh.config;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;

public class DBConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "nirdoshdb";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new Mongo("localhost");
	}

}
