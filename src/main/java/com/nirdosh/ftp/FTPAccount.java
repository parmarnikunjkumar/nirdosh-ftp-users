package com.nirdosh.ftp;

public class FTPAccount {
	
	private String userName;
	
	private String password;
	
	private String url;
	
	private FTPAccountType type;

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
