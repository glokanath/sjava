package com.example.filter.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ContextData {

	private String username;
	private String channel;
	private String cifToken;
	private String authToken;
	private String sessionId;
	
}
