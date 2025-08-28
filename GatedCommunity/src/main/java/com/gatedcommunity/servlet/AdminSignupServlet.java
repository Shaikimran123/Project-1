package com.gatedcommunity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.AdminDao;
import com.gatedcommunity.modal.Admin;


@WebServlet("/adminsignup")
public class AdminSignupServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String adminemail = request.getParameter("email");
		String adminpassword = request.getParameter("password");
				
		Admin admin=new Admin(adminemail,adminpassword);
		AdminDao adminDao=new AdminDao();
		adminDao.saveAdmin(admin);
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-loggedin.html");
//		requestDispatcher.forward(request, response);
	
		response.sendRedirect("admin-login.html");
		
	}

}
