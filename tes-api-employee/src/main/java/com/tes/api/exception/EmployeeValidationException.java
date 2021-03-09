package com.tes.api.exception;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter

public class EmployeeValidationException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public EmployeeValidationException(String message) {
        super(message);
    }
}
