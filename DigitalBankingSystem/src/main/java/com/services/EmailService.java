package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
   
    SimpleMailMessage message = new SimpleMailMessage();

    public void sendOtpEmail(String toEmail, int otp) {

        message.setTo(toEmail);
        message.setSubject("Your OTP Verification Code");
        message.setText("Your OTP is: " + otp + "\nThis OTP is valid for 5 minutes.");
        mailSender.send(message);
        System.out.println("OTP Email Sent Successfully to: " + toEmail);
    }
    
    public void SendSuccfullMsgMail(String toEmail) {
    	
    	String body="Thank you for registering with the Bank of FLM. Your details have been"
    			+ "successfully received. Within the next 24 hours,"
    			+ "your account will be activated by our verification team.\r\n"
    			+ "Once activated, you will be able to access all our services including online"
    			+ "banking, money transfers, and more. We’re excited to have you as a part of our"
    			+ "banking family.\r\n"
    			+ "For any queries, please feel free to contact our support team. Welcome to FLM!\r\n"
    			+ "\r\n"
    			+ "Bank of FLM\r\n"
    			+ "Customer Suppor: bankofflm@flm.com\r\n"
    			+ "&copy; 2025 Bank of FLM. All rights reserved.\r\n"
    			+ "Best Regards"
    			+ "SHAIK IMRAN"
    			+ "FLM BANK- CEO";
    	 message.setTo(toEmail);
         message.setSubject("Welcome to Bank of FLM — Registration Successful");     
         message.setText(body);
         mailSender.send(message);
    	
    }


    
}
