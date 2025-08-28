package com.gatedcommunity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;


@WebServlet("/viewAdminComplain")
public class ViewAdminComplainServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ComplainDAO dao=new ComplainDAO();
		List<Complain> allComplainsForAdminView = dao.getALLComplainsForAdminView();
		
		request.setAttribute("allComplainsForAdminView", allComplainsForAdminView);
		
		RequestDispatcher rd = request.getRequestDispatcher("view-all-complaints-admin.jsp");    
        rd.forward(request, response);
		
	}

}
