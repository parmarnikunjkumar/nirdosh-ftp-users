package com.nirdosh.domain;

public class State {

	private String name;
	
	private Country country;
	
	public State(){
		
	}

	public State(String name) {
		this(name,null);
	}

	public State(String name, Country country){
		this.name = name;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
