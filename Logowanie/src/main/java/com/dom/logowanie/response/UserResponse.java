package com.dom.logowanie.response;

import java.util.List;

import com.dom.logowanie.model.User;

public class UserResponse extends BasicResponse{
	
	private User user;
	private List<User> users;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
