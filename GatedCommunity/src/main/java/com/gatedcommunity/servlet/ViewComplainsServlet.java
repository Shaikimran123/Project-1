package com.gatedcommunity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.gatedcommunity.dao.ComplainDAO;
import com.gatedcommunity.modal.Complain;
import com.gatedcommunity.modal.User;
import com.mysql.cj.Session;


@WebServlet("/viewcomplains")
public class ViewComplainsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ComplainDAO dao=new ComplainDAO();
	
		
		String raisedby = (String) request.getSession().getAttribute("fullname");
		List<Complain> allComplains = dao.getAllComplains(raisedby);
		
		request.setAttribute("complains",allComplains);
		

       RequestDispatcher rd = request.getRequestDispatcher("view-complaints.jsp");    
        rd.forward(request, response);
	}

}
