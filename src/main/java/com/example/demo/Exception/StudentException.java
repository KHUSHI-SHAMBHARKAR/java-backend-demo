package com.example.demo.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class StudentException {

    private final String message;
    private final HttpStatus httpStatus;
    private final LocalDateTime timestamp;


    public StudentException( String message,HttpStatus httpStatus, LocalDateTime timestamp) {
        this.message = message;
         this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMessage(){
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


}
