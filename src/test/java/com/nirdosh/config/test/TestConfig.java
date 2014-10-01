package com.nirdosh.config.test;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
@ComponentScan(basePackages={"com.nirdosh"})
public class TestConfig {
	
	@Bean
	MongoOperations mongoOperations() throws UnknownHostException{
		return new MongoTemplate(new Mongo("localhost"), "nirdoshdb");
	}

//	@Override
//	protected String getDatabaseName() {
//		return "nirdoshdb";
//	}
//
//	@Override
//	public Mongo mongo() throws Exception {
//		return new Mongo("localhost");
//	}
}
