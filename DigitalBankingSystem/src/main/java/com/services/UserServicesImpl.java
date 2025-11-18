package com.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.modal.User;

@Service
public class UserServicesImpl implements UserServices {

    private final UserDao userDao;
    private final EmailService emailService;

    private final Map<String, Integer> otpStorage = new HashMap<>();

    @Autowired
    public UserServicesImpl(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }


    @Override
    public boolean verifyEmail(String email) {
        try {
            int otp = generateOtp();
            otpStorage.put(email, otp);
            emailService.sendOtpEmail(email, otp);
            System.out.println("OTP: " + otp + " generated and sent to: " + email);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean validateOtp(String email, int userOtp) {
        Integer storedOtp = otpStorage.get(email);
        if (storedOtp != null && storedOtp.equals(userOtp)) {
            otpStorage.remove(email); 
            return true;
        }
        return false;
    }

    private int generateOtp() {
        return new Random().nextInt(900000) + 100000; 
    }

	@Override
	public void SendSuccfullMsgMail(String email) {
		emailService.SendSuccfullMsgMail(email);
	}
}
