package com.bbit;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BBITException extends RuntimeException {
    public BBITException(String message) {
        super(message);
    }

    public BBITException(String message, Throwable cause) {
        super(message, cause);
    }
}