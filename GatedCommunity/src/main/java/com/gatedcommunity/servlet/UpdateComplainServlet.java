package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;


@WebServlet("/updateComplain")
public class UpdateComplainServlet extends HttpServlet {
	
  	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ticket = Integer.parseInt(request.getParameter("id"));
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String urgency = request.getParameter("urgency");
		
		Complain complain=new Complain(ticket, category, description, urgency);
		ComplainDAO dao=new ComplainDAO();
		dao.updateComplain(complain);
		
		response.sendRedirect("viewcomplains");
		
		
		
	}

}
