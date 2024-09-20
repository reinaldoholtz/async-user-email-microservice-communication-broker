package com.ms.email.dtos;

import java.util.UUID;

public record EmailRecordDto(Long userId, String emailTo, String subject, String text) {
}
