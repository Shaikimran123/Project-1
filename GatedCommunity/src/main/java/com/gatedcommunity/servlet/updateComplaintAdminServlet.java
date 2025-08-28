package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;


@WebServlet("/updateComplaint")
public class updateComplaintAdminServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ticket = Integer.parseInt(request.getParameter("ticketId"));
		String status = request.getParameter("status");
		String cmts = request.getParameter("comments");
		
		Complain complain=new Complain(ticket, status, cmts);
		ComplainDAO dao=new ComplainDAO();
		
		dao.updateComplainAdminside(complain);
		
		response.sendRedirect("manage-users.jsp");
		
	}

}
