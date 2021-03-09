package com.tes.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> handleEmployeeNotFoundException(EmployeeNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmployeeValidationException.class)
    public ResponseEntity<?> handleEmployeeValidationException(EmployeeValidationException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
