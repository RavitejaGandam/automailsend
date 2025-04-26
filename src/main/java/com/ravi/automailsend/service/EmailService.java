package com.ravi.automailsend.service;

import com.ravi.automailsend.entity.EmailRequestEntity;
import com.ravi.automailsend.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailRequestEntity emailRequestEntity) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(emailRequestEntity.getRecipient());
        mailMessage.setSubject(emailRequestEntity.getSubject());
        mailMessage.setText(emailRequestEntity.getText());
        javaMailSender.send(mailMessage);

        EmailRequestEntity entity = new EmailRequestEntity();
        entity.setRecipient(emailRequestEntity.getRecipient());
        entity.setSubject(emailRequestEntity.getSubject());
        entity.setText(emailRequestEntity.getText());
        emailRepository.save(entity);
    }
}
