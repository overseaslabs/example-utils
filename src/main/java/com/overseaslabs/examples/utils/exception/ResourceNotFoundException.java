package com.overseaslabs.examples.utils.exception;

/**
 * The requested resource is not found
 */
public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
