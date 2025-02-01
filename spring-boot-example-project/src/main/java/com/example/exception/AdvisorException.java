package com.example.exception;

public class AdvisorException extends RuntimeException {

	private int errorCode;
	private String message;
	
	
	public AdvisorException(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	
	
}
