package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.gatedcommunity.dao.AdminDao;
import com.gatedcommunity.modal.Admin;

@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String email = request.getParameter("adminmail");
	     String password = request.getParameter("password");

	     Admin admin=new Admin(email,password);
	     AdminDao adminDao = new AdminDao();
	     boolean valid = adminDao.validateAdmin(admin);	
	     if (valid) {
	    	    HttpSession session = request.getSession();
				String name=admin.getAdminMailID().split("@")[0];
				String adminMailID = admin.getAdminMailID();
				session.setAttribute("adminName", name);
				session.setAttribute("adminMail",adminMailID);
	    	    response.sendRedirect("admin-loggedin.jsp");
	     }else {
	    	 HttpSession session = request.getSession();
			 String name=admin.getAdminMailID().split("@")[0];
			 session.setAttribute("email", name);
			 session.setAttribute("role", "Admin");
	    	 response.sendRedirect("AdminOrUserNotFound.jsp");
	    	// response.sendRedirect("admin-login.html");
	     }
		
	}

}
