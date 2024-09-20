package com.ms.user.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
public class EmailDto {
    private Long userId;
    private String emailTo;
    private String subject;
    private String text;
}
