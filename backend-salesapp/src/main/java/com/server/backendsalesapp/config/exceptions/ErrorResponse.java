package com.server.backendsalesapp.config.exceptions;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ErrorResponse {

    private String message;
    private Map<String, String> errors;
    private int statusCode;
    private LocalDateTime timestamp;

    public ErrorResponse(String message, Map<String, String> errors, int statusCode, LocalDateTime timestamp) {
        this.message = message;
        this.errors = errors;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
    }


}
