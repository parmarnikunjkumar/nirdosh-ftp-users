package com.nirdosh.domain;

public class EmailAddress {

	private String name;
	
	private EmailAddressType type;

	public EmailAddress(){
		
	}
	
	public EmailAddress(String name, EmailAddressType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmailAddressType getType() {
		return type;
	}

	public void setType(EmailAddressType type) {
		this.type = type;
	}
	
	
}
