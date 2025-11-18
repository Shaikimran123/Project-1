package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.modal.User;
import com.services.UserServices;

import jakarta.servlet.http.HttpSession;

public class UserSignUpController {
	

    private final UserServices userServices;

    public UserSignUpController(UserServices userServices) {
        this.userServices = userServices;
    }

	
	 // =================== Signup ===================
    @GetMapping("/signup")
    public String signUP() {
        return "signup";
    }

    @PostMapping("/signup")
    public String handleUserSignUp(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            @RequestParam("CPassword") String confirmPassword,
            @RequestParam("dob") String dob,
            HttpSession session,
            Model model
    ) {
        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match.");
            return "signup";
        }

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        user.setDob(dob);

        // Send OTP
        boolean otpSent = userServices.verifyEmail(email);
        if (!otpSent) {
            model.addAttribute("error", "Failed to send OTP. Try again.");
            return "signup";
        }

        session.setAttribute("tempUser", user);
        session.setAttribute("userEmail", email);
        session.setAttribute("userPhone", phone);

        model.addAttribute("success", "OTP sent successfully!");
        return "sendOtp";
    }

    // =================== Send OTP ===================
    @PostMapping("/sendOtp")
    public String sendOtp(HttpSession session, Model model) {
        String email = (String) session.getAttribute("userEmail");

        if (email == null) {
            model.addAttribute("error", "Session expired. Please sign up again.");
            return "signup";
        }

        boolean otpSent = userServices.verifyEmail(email);
        if (otpSent) {
            model.addAttribute("success", "OTP sent successfully!");
        } else {
            model.addAttribute("error", "Failed to send OTP. Try again.");
        }

        return "sendOtp";
    }

    // =================== Verify OTP ===================
    @PostMapping("/verifyOtp")
    public String verifyOtp(@RequestParam("otp") int otp,
                            HttpSession session,
                            Model model) {

        String email = (String) session.getAttribute("userEmail");
        User user = (User) session.getAttribute("tempUser");

        if (email == null || user == null) {
            model.addAttribute("error", "Session expired. Please sign up again.");
            return "signup";
        }

        boolean isValid = userServices.validateOtp(email, otp);

        if (isValid) {
            userServices.saveUser(user);
            userServices.SendSuccfullMsgMail(email);

            session.removeAttribute("tempUser");
            session.removeAttribute("userEmail");
            model.addAttribute("success", "Email verified successfully!");
            return "otpSuccess";
        } else {
            model.addAttribute("error", "Invalid OTP. Try again.");
            return "sendOtp";
        }
    }

    @GetMapping("/verifyOtp")
    public String verifyOtpGetMeth() {
        return "otpSuccess";
    }

}
