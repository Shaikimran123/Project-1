package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.modal.User;
import com.services.UserServices;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class UserSignInController {

    private final UserServices userServices;

    public UserSignInController(UserServices userServices) {
        this.userServices = userServices;
    }

    // =================== User Login ===================
    @GetMapping("/signin")
    public String showUserLoginPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public String handleUserLogin(@RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  HttpSession session,
                                  Model model) {
        // Replace this with DB check in real scenario
        if ("user@gmail.com".equals(email) && "user123".equals(password)) {
            session.setAttribute("loggedInUser", email);
            return "userDashboard";
        } else {
            model.addAttribute("error", "Invalid email or password.");
            return "signin";
        }
    }

    @GetMapping("/userDashboard")
    public String homeScreen() {
        return "userDashboard";
    }

}
