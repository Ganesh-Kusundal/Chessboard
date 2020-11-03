package com.chess.validator;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
