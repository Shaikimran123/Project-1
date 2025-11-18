package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;

@Controller
public class UserDashboardController {
	

	    @GetMapping("/userDashboard")
	    public String userDashboard(HttpSession session, Model model) {
	        return "userDashboard"; 
	    }

	    @GetMapping("/requestAccount")
	    public String requestAccount() {
	        return "requestAccount"; 
	    }

	    @GetMapping("/addAccount")
	    public String addAccount() {
	        return "addAccount"; 
	    }

	    @GetMapping("/myStatus")
	    public String myStatus(HttpSession session, Model model) {
	        return "myStatus";
	    }

	    @GetMapping("/profile")
	    public String profile(HttpSession session, Model model) {
	        return "profile"; 
	    }

	    @GetMapping("/checkBalance")
	    public String checkBalance(HttpSession session, Model model) {
	        return "checkBalance";
	    }

	    @GetMapping("/sendMoney")
	    public String sendMoney(HttpSession session, Model model) {
	        return "sendMoney"; 	    }

	    @GetMapping("/ePassbook")
	    public String ePassbook(HttpSession session, Model model) {
	        return "ePassbook"; 
	    }

	    @GetMapping("/cards")
	    public String cards(HttpSession session, Model model) {
	        return "cards"; 
	    }

	    @GetMapping("/loan")
	    public String loanRequest(HttpSession session, Model model) {
	        return "loan"; 
	    }

	    @GetMapping("/invest")
	    public String invest(HttpSession session, Model model) {
	        return "invest";
	    }
	}


