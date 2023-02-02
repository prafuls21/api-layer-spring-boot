package com.apilayer.exceptions;

public class Http5xxException extends RuntimeException {
    public Http5xxException(String message) {
        super(message);
    }
}
