package com.dom.logowanie.rest.response;

import java.util.List;

import com.dom.logowanie.rest.model.User;

public class UserResponse extends BasicResponse{
	
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
