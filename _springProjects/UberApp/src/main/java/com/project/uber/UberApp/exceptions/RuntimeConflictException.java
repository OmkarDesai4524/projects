package com.project.uber.UberApp.exceptions;

public class RuntimeConflictException extends RuntimeException {


    private RuntimeConflictException() {
    }

    public RuntimeConflictException (String message) {
        super(message);
    }
}
