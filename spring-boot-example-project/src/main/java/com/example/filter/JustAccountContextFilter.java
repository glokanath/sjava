package com.example.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.filter.response.ContextData;

@Component
public class JustAccountContextFilter extends OncePerRequestFilter{
	
	private static final Logger LOG = LoggerFactory.getLogger(JustAccountContextFilter.class);
	
	
	@Autowired
	private JustAccountContextBase justAccountContextBase;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		var sessionId = UUID.randomUUID().toString();
		LOG.debug("Entered into the just account filter with session id :{}",sessionId);
		String authorizationHeader = request.getHeader("Authorization");
		ContextData ctx = justAccountContextBase.getCtx();
		//ctx
		 if(org.apache.commons.lang3.StringUtils.isNotEmpty(authorizationHeader)) {
			 ContextData contextData = new ContextData();
			  //contextData
		 }
		
	}

}
