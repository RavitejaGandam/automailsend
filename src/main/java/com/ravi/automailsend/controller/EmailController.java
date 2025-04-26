package com.ravi.automailsend.controller;

import com.ravi.automailsend.entity.EmailRequestEntity;
import com.ravi.automailsend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequestEntity emailRequestEntity){
        emailService.sendEmail(emailRequestEntity);
        return ResponseEntity.ok("Email sent successfully");
    }

}
