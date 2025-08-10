package com.cpd.hotel_system.auth_service_api.service.impl;

import com.cpd.hotel_system.auth_service_api.service.EmailService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public boolean sendUserSignupVerificationCode(String toEmail, String subject, String otp, String firstName) throws IOException {
        return false;
    }

    @Override
    public boolean sendHostPassword(String toEmail, String subject, String password, String firstName) throws IOException {
        return false;
    }
}
