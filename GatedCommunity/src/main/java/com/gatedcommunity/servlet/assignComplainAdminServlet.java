package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;


@WebServlet("/assignComplain")
public class assignComplainAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ticket = Integer.parseInt(request.getParameter("ticketId"));		
		String assigned = request.getParameter("assignedTo");
		
		Complain complain=new Complain(ticket,assigned);
		ComplainDAO dao=new ComplainDAO();
		dao.AssignToResource(complain);
		
		response.sendRedirect("manage-users.jsp");
		
		
	}

}
