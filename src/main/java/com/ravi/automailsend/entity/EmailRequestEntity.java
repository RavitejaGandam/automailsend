package com.ravi.automailsend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity

public class EmailRequestEntity {

    @Id
    private Long id;
    private String recipient;
    private String subject;
    private String text;

    public EmailRequestEntity() {

    }

    public EmailRequestEntity(Long id, String recipient, String subject, String text) {
        this.id = id;
        this.recipient = recipient;
        this.subject = subject;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

