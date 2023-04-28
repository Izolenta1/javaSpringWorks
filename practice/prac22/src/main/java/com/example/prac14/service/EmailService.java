package com.example.prac14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendGetFootballerEmail(String message_text){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("guadalupe.russel1@ethereal.email");
        message.setTo("geor.novickoff@yandex.ru");
        message.setSubject("Spring Notification");
        message.setText(message_text);

        this.emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}
