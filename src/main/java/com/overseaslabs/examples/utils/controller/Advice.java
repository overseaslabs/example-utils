package com.overseaslabs.examples.utils.controller;

import com.overseaslabs.examples.utils.exception.ResourceConflictException;
import com.overseaslabs.examples.utils.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Handles the exceptions defined in the package
 * sending the appropriate HTTP status back to the client
 */
@ControllerAdvice
public class Advice {
    @ResponseBody
    @ExceptionHandler(ResourceConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String resourceConflictsHandler(ResourceConflictException e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String resourceNotFoundHandler(ResourceNotFoundException e) {
        return e.getMessage();
    }
}
