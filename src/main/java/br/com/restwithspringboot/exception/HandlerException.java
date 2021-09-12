package br.com.restwithspringboot.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

        @ExceptionHandler(value = ConstraintViolationException.class)
        protected ResponseEntity<ResponseError> handleConflict(HttpServletRequest req) {
            return ResponseEntity.status(BAD_REQUEST).body(new ResponseError("INVALID REQUEST","4000", req.getRequestURI()));
        }
}