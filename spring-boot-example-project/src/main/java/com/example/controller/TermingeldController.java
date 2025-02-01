package com.example.controller;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.FixedTermDeposit;

import io.swagger.v3.oas.annotations.Parameter;

@RequestMapping(value = "/${api.version}")
public interface TermingeldController {
	
	FixedTermDeposit saveTermingeld(@RequestHeader(name = "Authorization") 
	@NonNull @Parameter(name = "Authorization", required = true) String authorization);

}
