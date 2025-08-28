package com.gatedcommunity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.gatedcommunity.modal.Admin;
import com.gatedcommunity.utils.Constants;
import com.gatedcommunity.utils.DBConnections;

public class AdminDao {

	
	Connection connection=null;
	public void saveAdmin(Admin admin) {
			
			
			try {
				connection = DBConnections.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.INSERT_ADMIN);
				statement.setString(1,admin.getAdminMailID());
				statement.setString(2, admin.getAdminPassword());
				statement.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();			
			}
	}
	
	public boolean validateAdmin(Admin admin) {
	   
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ADMIN);
			statement.setString(1, admin.getAdminMailID());
			ResultSet rs = statement.executeQuery();
			String email=null, pass=null;
			while(rs.next())
			{
				email = rs.getString(1);
				pass = rs.getString(2);
			}
			return (admin.getAdminMailID().equals(email) && admin.getAdminPassword().equals(pass));
			
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			
			}
			return false;
	}
	
	
	
}
