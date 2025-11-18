package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminSignInController {

	
    // =================== Admin ===================
    @GetMapping("/adminLogin")
    public String adminLogin() {
        return "adminLogin";
    }

    @PostMapping("/adminLogin")
    public String handleAdmin(@RequestParam("AdminMail") String adminMail,
                              @RequestParam("password") String password,
                              Model model) {
        if ("admin@gmail.com".equals(adminMail) && "admin123".equals(password)) {
            return "adminDashboard";
        } else {
            model.addAttribute("error", "Invalid admin email or password.");
            return "adminLogin";
        }
    }
}
