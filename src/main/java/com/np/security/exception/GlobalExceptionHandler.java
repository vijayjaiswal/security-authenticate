package com.np.security.exception;

import org.apache.commons.httpclient.auth.InvalidCredentialsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.DisabledException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({EmailAlreadyExistsException.class, InvalidCredentialsException.class, InvalidTokenException.class})
    public ResponseEntity<Object> handleCustomExceptions(RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DisabledException.class)
    public ResponseEntity<Object> handleDisabledUser(DisabledException ex) {
        return new ResponseEntity<>("User not verified. Please check your email for verification.", HttpStatus.UNAUTHORIZED);
    }
}