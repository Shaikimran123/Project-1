package com.gatedcommunity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gatedcommunity.modal.Complain;
import com.gatedcommunity.utils.Constants;
import com.gatedcommunity.utils.DBConnections;

public class ComplainDAO {
	
	Connection connection=null;
	public void saveComplain(Complain complain, String raised) {
		
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_COMPLAIN);
			statement.setString(1, complain.getCategory());
			statement.setString(2, complain.getDescription());
			statement.setString(3, complain.getUrgency());
			statement.setString(4, raised);
			
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();			
		}
	}
	
	
	public List<Complain> getAllComplains(String raisedby)
	{
		List<Complain> allComplains=new ArrayList<>();
		
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_RAISED_BY_USER);
			statement.setString(1, raisedby);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("ticket");
				String cat=rs.getString("category");
				String dis=rs.getString("description");
				String urg=rs.getString("urgency");
				String sts=rs.getString("status");
				String cmt=rs.getString("comments");
				String ass=rs.getString("assignedto");
				Complain complain=new Complain(id, cat, dis, urg,sts,cmt,ass);
				allComplains.add(complain);
			}
			return allComplains;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
		return allComplains;
	}
	
	
	
	public void deleteComplain(int ticket)
	{
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETECOMPLAIN);
			statement.setInt(1, ticket);
			statement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateComplain(Complain complain)
	{
		try {
			connection = DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_COMPLAIN);
			statement.setString(1, complain.getCategory());
			statement.setString(2, complain.getDescription());
			statement.setString(3, complain.getUrgency());
			statement.setInt(4, complain.getComplainID());
			statement.executeLargeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Complain getComplain(int ticketId) {
	    Connection connection;
	    Complain complain = null;
	    try {
	        connection = DBConnections.getConnection();
	        PreparedStatement ps = connection.prepareStatement(Constants.GET_COMPLAIN);
	        ps.setInt(1, ticketId);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            String category = rs.getString("category");
	            String description = rs.getString("description");
	            String urgency = rs.getString("urgency");
	            complain = new Complain(ticketId, category, description, urgency);
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }
	    return complain;
	}
	
	
	public List<Complain> getALLComplainsForAdminView() {
		
		List<Complain> allComplainsForAdmin=new ArrayList<>();

		try {
			 connection = DBConnections.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.GET_COMPLAINS);
			 ResultSet rs = statement.executeQuery();
			 
			 while(rs.next())
			 {
				 int ticket=rs.getInt("ticket");
				  String category = rs.getString("category");
		          String description = rs.getString("description");
		            String urgency = rs.getString("urgency");
		            String status= rs.getString("status");
		            String cmt=rs.getString("comments");
		            String raisedby=rs.getString("raisedby");
		            String Assidnedto=rs.getString("assignedto");
		            
		            Complain complain=new Complain(ticket, category, description, urgency, raisedby, status, cmt, Assidnedto);
		            allComplainsForAdmin.add(complain);
			 }
			 return allComplainsForAdmin;
			 
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allComplainsForAdmin;
		
	}
	
	
	public void updateComplainAdminside(Complain complain)
	{
		try {
			connection= DBConnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_ADMIN_COMPLAINS);
			statement.setString(1,complain.getStatus());
			statement.setString(2, complain.getComments());
			statement.setInt(3, complain.getComplainID());
			statement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void AssignToResource(Complain complain) {
		
		try {
		connection = DBConnections.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constants.ASSIGN_TO_RESOURCE);
		statement.setString(1, complain.getAssidnedto());
		statement.setInt(2, complain.getComplainID());
		statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
