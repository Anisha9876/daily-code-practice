package com.Pro.AsyncNotification.Service;

import com.Pro.AsyncNotification.Model.User;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final JavaMailSender mailSender;

    public UserService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(User user) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail()); // send to the user's email
        message.setSubject("Your Details");
        message.setText("Hello " + user.getName() + ",\n\nYour ID is: " + user.getId() +
                "\nEmail: " + user.getEmail() +
                "\n\nThank you!");

        mailSender.send(message);
    }
}
