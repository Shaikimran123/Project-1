package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;


@WebServlet("/complains")
public class ComplainsServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String urgency = request.getParameter("urgency");
		
		
		String raisedby = (String) request.getSession().getAttribute("fullname");
		Complain complain=new Complain(category, description, urgency);
		ComplainDAO dao=new ComplainDAO();
		dao.saveComplain(complain,raisedby);
		
		response.sendRedirect("raise-complaint.jsp");
				
	
	}

}
