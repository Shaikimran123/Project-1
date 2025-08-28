package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.ComplainDAO;




@WebServlet("/deletecomplain")
public class DeleteComplainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int parameter = Integer.parseInt(request.getParameter("id"));
	
		ComplainDAO  dao=new ComplainDAO();
		dao.deleteComplain(parameter);
		
		response.sendRedirect("viewcomplains");
	
	}

}
