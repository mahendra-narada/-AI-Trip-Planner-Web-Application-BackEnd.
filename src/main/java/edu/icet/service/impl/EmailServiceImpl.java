package edu.icet.service.impl;

import edu.icet.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendRegistrationEmail(String toEmail, String userName) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Registration Successful");
        message.setText("Hello " + userName + ",\n\nThank you for registering with our website!\n\nBest regards,\nThe Team");
        message.setFrom("your-email@gmail.com");

        javaMailSender.send(message);
    }
}
