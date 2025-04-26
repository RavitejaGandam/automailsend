package com.ravi.automailsend.service;

import com.ravi.automailsend.entity.EmailRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;


    public void sendEmail(EmailRequestEntity emailRequestEntity) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(emailRequestEntity.getRecipient());
        mailMessage.setSubject(emailRequestEntity.getSubject());
        mailMessage.setText(emailRequestEntity.getText());
        javaMailSender.send(mailMessage);
    }
}
