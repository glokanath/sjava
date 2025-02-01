package com.example.model;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorDetails {

	private int statusCode;
	private Date timestamp;
	private String message;
	private String path;
	
	
}
