package com.dom.logowanie.services;

import com.dom.logowanie.response.UserResponse;
import com.dom.logowanie.template.UserJDBCTemplate;

public class UserService {

	UserJDBCTemplate userJDBCTemplate;
	public void setUserJDBCTemplate(UserJDBCTemplate userJDBCTemplate) {
		this.userJDBCTemplate = userJDBCTemplate;
	}
	
	
	public UserResponse getUser(Integer id) {
		UserResponse userResponse = new UserResponse();
		userResponse.setStatus(1);
		userResponse.setMessage("successful");
		userResponse.setUser(userJDBCTemplate.getUser(id));
		
		return userResponse;
	}
	
	public UserResponse getAllUser() {
		UserResponse userResponse = new UserResponse();
		userResponse.setStatus(1);
		userResponse.setMessage("successful");
		userResponse.setUsers(userJDBCTemplate.getUsers());
		
		return userResponse;
	}
}
