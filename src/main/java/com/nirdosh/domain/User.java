package com.nirdosh.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.nirdosh.ftp.FTPAccount;

@Entity
public class User {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String surname;
	
	private String spiritualName;
	
	private List<Address> addresses;
	
	private List<FTPAccount> ftpAccounts;
	
	private List<EmailAddress> emails;
	
	private boolean isCommingToAYM;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
