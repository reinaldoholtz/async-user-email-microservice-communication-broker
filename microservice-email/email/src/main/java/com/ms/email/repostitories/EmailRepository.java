package com.ms.email.repostitories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository <EmailModel, UUID> {
}
