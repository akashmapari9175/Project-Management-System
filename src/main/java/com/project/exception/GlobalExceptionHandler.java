package com.project.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@ControllerAdvice
@RestControllerAdvice  //this is must without not working here we can handle error in whole controller
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex) {
	    long userId = ex.getUserId();
	    String errorMessage = "User with ID " + userId + " not present in the database";
	    return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}
	
}
