package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDashboardController {
	
	@GetMapping("/adminDashboard")
    public String adminDashboard() {
        return "adminDashboard";
    }

    @GetMapping("/newAccountRequests")
    public String newAccountRequests() {
        return "adminNewAccountRequests";  
    }

    @GetMapping("/activateBankAccount")
    public String activateBankAccount() {
        return "adminActivateBankAccount"; 
    }

    @GetMapping("/loanApprovals")
    public String loanApprovals() {
        return "adminLoanApprovals"; 
    }

    @GetMapping("/pendingTasks")
    public String pendingTasks() {
        return "adminPendingTasks";
    }



}
