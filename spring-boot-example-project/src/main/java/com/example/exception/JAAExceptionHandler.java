package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.model.ErrorDetails;

@RestController
@ControllerAdvice
public class JAAExceptionHandler extends ResponseEntityExceptionHandler{
	
	public ResponseEntity<Object> handleAnyException(Exception e, WebRequest request){
		 var errorDetails = new ErrorDetails();
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
