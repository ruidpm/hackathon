package org.academiadecodigo.whiledlings.hackathon.controller;

import org.academiadecodigo.whiledlings.hackathon.exception.ReconnectException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = ReconnectException.class)
    public ResponseEntity handleClientErrors(HttpServletRequest req, ReconnectException ex) {

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity handleServerErrors(HttpServletRequest req, Exception ex) {

        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
