package com.ddlab.rnd.exception;

public class ApplicationBadRequestException extends RuntimeException {
    public ApplicationBadRequestException(String message) {
        super(message);
    }
}

