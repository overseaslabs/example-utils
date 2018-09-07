package com.overseaslabs.examples.utils.exception;

/**
 * A resource conflicts with another resource
 */
public class ResourceConflictException extends Exception {
    public ResourceConflictException(String message) {
        super(message);
    }

    public ResourceConflictException(String message, Throwable cause) {
        super(message, cause);
    }
}
