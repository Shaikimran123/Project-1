package com.gatedcommunity.modal;

public class Admin {
	

	private String adminMailID;
	private String adminPassword;
	
	public Admin() {
	}

	public Admin(String adminMailID, String adminPassword) {
		super();
		this.adminMailID = adminMailID;
		this.adminPassword = adminPassword;
	}

	public String getAdminMailID() {
		return adminMailID;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminMailID(String adminMailID) {
		this.adminMailID = adminMailID;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminMailID=" + adminMailID + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	

}
