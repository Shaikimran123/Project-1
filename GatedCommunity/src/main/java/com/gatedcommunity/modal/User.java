package com.gatedcommunity.modal;

public class User {
	
	private String userMailId;
	private String password;
	
	
	public User() {
	}


	public User(String userMailId, String password) {
		super();
		this.userMailId = userMailId;
		this.password = password;
	}


	public String getUserMailId() {
		return userMailId;
	}


	public String getPassword() {
		return password;
	}


	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userMailId=" + userMailId + ", password=" + password + "]";
	}


	
	
	
	
	
	

}
