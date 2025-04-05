package com.project.uber.UberApp.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private ResourceNotFoundException() {
    }

    public ResourceNotFoundException (String message) {
        super(message);
    }
}
