package com.mumsched.cs.exception;


import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleCourseNotFoundException(ResourceNotFoundException ex,HttpServletRequest req){
		
		ErroeMessage m =new ErroeMessage();
		m.setTitle("Course Exception");
		m.setDetail(ex.getMessage());
		m.setStatus(HttpStatus.NOT_FOUND.value());
		m.setDeveloperMessage(ex.getClass().getName());
		
		return new ResponseEntity(m,null,HttpStatus.NOT_FOUND);
	}
		
		
		
		
		
	
}
