package com.server.backendsalesapp.config.exceptions;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ApiExceptionHandler {
    private static final String DESCRIPTION = "description";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> notValid(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        int statusCode = ex.getStatusCode().value();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        ErrorResponse errorResponse = new ErrorResponse("Erreur de validation", errors, statusCode, LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PseudoException.class)
    public ResponseEntity<ErrorResponse> pseudoException(PseudoException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put(DESCRIPTION, ex.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Erreur due au pseudo ou mot de passe", errors, HttpStatus.NOT_FOUND.value(), LocalDateTime.now());

        return new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(errorResponse.getStatusCode()));
    }

    @ExceptionHandler(IncorrectResultSizeDataAccessException.class)
    public ResponseEntity<ErrorResponse> responseStatusException(IncorrectResultSizeDataAccessException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put(DESCRIPTION, ex.getLocalizedMessage());
        ErrorResponse errorResponse = new ErrorResponse("Email existe déjà", errors, HttpStatus.CONFLICT.value(), LocalDateTime.now());

        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }


}
