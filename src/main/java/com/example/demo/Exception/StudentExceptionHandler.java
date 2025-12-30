package com.example.demo.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class StudentExceptionHandler {
    
    @ExceptionHandler(StudentNotFoundException.class)
  public ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException  studentNotFoundException){

    // step1:create payload
    StudentException studentException = new StudentException(studentNotFoundException.getMessage(),
        HttpStatus.NOT_FOUND,
        LocalDateTime.now());

    return new ResponseEntity<>(studentException, HttpStatus.NOT_FOUND);
  }
  

}
