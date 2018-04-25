package com.github.zcmee.newssystem.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR, reason="IOException occured")
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(HttpServletRequest request, Exception ex){
        return "database_error";
    }

}
