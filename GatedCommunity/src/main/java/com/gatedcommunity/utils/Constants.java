package com.gatedcommunity.utils;

public class Constants {

	public static final String url ="jdbc:mysql://localhost:3306/gatedcommunity";
	public static final String username ="root";
	public static final String password="Imran@5a9";
	
	public static final String INSERT_USER = "INSERT INTO USERS VALUES(?,?)";
	public static final String INSERT_ADMIN = "INSERT INTO ADMINS VALUES(?,?)";
	public static final String GET_ADMIN="select * from admins where adminmail=?";
	public static final String GET_USER="select * from users where usermail=?";

	public static final String INSERT_COMPLAIN="insert into allcomplains(category,description,urgency,raisedby) values(?,?,?,?)";
	
	public static final String GET_COMPLAINS="select * from allcomplains";
	
	public static final String GET_RAISED_BY_USER=    "SELECT ticket, category, description, urgency, status, comments, assignedto FROM allcomplains WHERE raisedby=?";;

	public static final String DELETECOMPLAIN="delete from allcomplains where ticket=?";

	public static final String UPDATE_COMPLAIN = "UPDATE allcomplains SET category = ?, description = ?, urgency = ? WHERE ticket = ?";	
	
	public static final String GET_COMPLAIN="SELECT ticket, category, description, urgency FROM allcomplains WHERE ticket = ?";

	public static final String UPDATE_ADMIN_COMPLAINS="update allcomplains set status=?,comments=? where ticket=?";

	public static final String ASSIGN_TO_RESOURCE="update allcomplains set assignedto=? where ticket=?";
	
}
