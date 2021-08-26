package com.hrithikt.udemy.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	//Read from property file
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl() {
		return url;
	}
}
