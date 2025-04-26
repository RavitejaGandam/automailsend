package com.ravi.automailsend.repository;

import com.ravi.automailsend.entity.EmailRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailRequestEntity,Long> {
}
