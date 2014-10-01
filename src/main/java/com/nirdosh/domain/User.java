package com.nirdosh.domain;

import java.util.List;

import com.nirdosh.ftp.FTPAccount;

public class User {
	
	private String name;
	
	private String surName;
	
	private String spiritualName;
	
	private List<Address> addresses;
	
	private List<FTPAccount> ftpAccounts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSpiritualName() {
		return spiritualName;
	}

	public void setSpiritualName(String spiritualName) {
		this.spiritualName = spiritualName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<FTPAccount> getFtpAccounts() {
		return ftpAccounts;
	}

	public void setFtpAccounts(List<FTPAccount> ftpAccounts) {
		this.ftpAccounts = ftpAccounts;
	}
	
}
