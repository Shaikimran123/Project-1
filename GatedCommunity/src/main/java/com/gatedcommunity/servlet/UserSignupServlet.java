package com.gatedcommunity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gatedcommunity.dao.UserDao;
import com.gatedcommunity.modal.User;

@WebServlet("/usersignup")
public class UserSignupServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String useremail = request.getParameter("email");
		String userpass = request.getParameter("password");
		
		User user=new User(useremail, userpass);
		UserDao dao=new UserDao();
		dao.saveUser(user);
		
		response.sendRedirect("user-login.html");
		
		
	}

}
