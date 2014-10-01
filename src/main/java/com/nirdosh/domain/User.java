package com.nirdosh.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.nirdosh.ftp.FTPAccount;

public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private String surname;
	
	private String spiritualName;
	
	private List<Address> addresses;
	
	private List<FTPAccount> ftpAccounts;
	
	private List<EmailAddress> emails;
	
	private boolean isCommingToAYM;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpiritualName() {
		return spiritualName;
	}

	public void setSpiritualName(String spiritualName) {
		this.spiritualName = spiritualName;
	}

	public List<Address> getAddresses() {
		if(addresses == null){
			this.addresses = new ArrayList<Address>();
		}
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<FTPAccount> getFtpAccounts() {
		if(ftpAccounts == null){
			this.ftpAccounts = new ArrayList<FTPAccount>();
		}
		return ftpAccounts;
	}

	public void setFtpAccounts(List<FTPAccount> ftpAccounts) {
		this.ftpAccounts = ftpAccounts;
	}

	public List<EmailAddress> getEmails() {
		if(emails == null){
			this.emails = new ArrayList<EmailAddress>();
		}
		return emails;
	}

	public void setEmails(List<EmailAddress> emails) {
		this.emails = emails;
	}

	public boolean isCommingToAYM() {
		return isCommingToAYM;
	}

	public void setCommingToAYM(boolean isCommingToAYM) {
		this.isCommingToAYM = isCommingToAYM;
	}
	
	
}
