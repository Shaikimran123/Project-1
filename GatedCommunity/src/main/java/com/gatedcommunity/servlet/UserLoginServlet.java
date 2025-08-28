package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.gatedcommunity.dao.AdminDao;
import com.gatedcommunity.dao.UserDao;
import com.gatedcommunity.modal.*;


@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     String usermail = request.getParameter("usermailid");
	     String userpass = request.getParameter("password");
	     
	     User user=new User(usermail, userpass);
	     UserDao dao=new UserDao();
	     boolean valid = dao.validateUser(user);
	     if(valid) {
	    	 HttpSession session = request.getSession();
			 String name=user.getUserMailId().split("@")[0];
			 String fullname=user.getUserMailId();
			 session.setAttribute("email", name);
			 session.setAttribute("fullname", fullname);
	    	 response.sendRedirect("user-loggedin.jsp");
	     }else {
	    	 HttpSession session = request.getSession();
			 String name=user.getUserMailId().split("@")[0];
			 session.setAttribute("email", name);
			 session.setAttribute("role", "User");
	    	 response.sendRedirect("AdminOrUserNotFound.jsp");
	    	 //response.sendRedirect("user-login.html");
	     }
		
	}

}
