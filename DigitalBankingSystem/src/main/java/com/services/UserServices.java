package com.services;

import org.springframework.stereotype.Service;

import com.modal.User;

@Service
public interface UserServices {

	void saveUser(User user);

	boolean verifyEmail(String email);

	boolean validateOtp(String email, int otp);

	void SendSuccfullMsgMail(String email);
}
