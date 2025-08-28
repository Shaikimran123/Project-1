package com.gatedcommunity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gatedcommunity.modal.Admin;
import com.gatedcommunity.modal.User;
import com.gatedcommunity.utils.*;


public class UserDao {

	Connection connection=null;
	public void saveUser(User user) {
	try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_USER);
			statement.setString(1,user.getUserMailId());
			statement.setString(2, user.getPassword());
			statement.executeUpdate();
		} 
	catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();	
		}
	}
	
	public boolean validateUser(User user) {
		   
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_USER);
			statement.setString(1, user.getUserMailId());
			ResultSet rs = statement.executeQuery();
			String email=null, pass=null;
			while(rs.next())
			{
				email = rs.getString("usermail");
				pass = rs.getString("password");
			}
			
			return (user.getUserMailId().equals(email) && user.getPassword().equals(pass));
			
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			
			}
			return false;
	}
	
}
