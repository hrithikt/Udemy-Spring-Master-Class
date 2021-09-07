package com.hrithikt.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	public boolean isUserValid(String userName, String password) {
		return(userName.equals("hrithik") && password.contentEquals("pw"));
	}
}
