package com.nirdosh.ftp;

import javax.print.DocFlavor.STRING;

public class FTPAccount {
	
	private String userName;
	
	private String password;
	
	private String url;
	
	private FTPAccountType type;

	public FTPAccount(){
		
	}
	
	public FTPAccount(String userName, FTPAccountType type) {
		this(userName,type, null);
	}
	
	public FTPAccount(String userName, FTPAccountType type, String password) {
		this.userName = userName;
		this.type = type;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FTPAccountType getType() {
		return type;
	}

	public void setType(FTPAccountType type) {
		this.type = type;
	}
	
	

}
