package com.example.LoggingDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.el.MethodNotFoundException;

@RestControllerAdvice
public class GlobalException {
	
	    // Handle ResourceNotFoundException
	    @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
	        return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.NOT_FOUND);
	    }

	    // Handle other exceptions (Optional)
	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGlobalException(Exception ex) {
	        return new ResponseEntity<>("Internal Server Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	    @ExceptionHandler(MethodNotFoundException.class)
	    public ResponseEntity<String> MethodException(MethodNotFoundException exp){
	    	return new ResponseEntity<>("values are not matching:"+exp.getMessage(),HttpStatus.BAD_REQUEST);
	    }
	    @ExceptionHandler(HttpMessageNotReadableException.class)
	    public ResponseEntity<String> HttpException(HttpMessageNotReadableException exc){
	    	return new  ResponseEntity<>("data given in body is not in proper format:"+exc.getMessage(),HttpStatus.BAD_REQUEST);
	    }
	}


