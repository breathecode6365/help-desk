package com.aarambh.helpdesk.dto.response;

import org.springframework.http.HttpStatus;

public record BasicResDTO(
        String message,
        HttpStatus status
) {
}
