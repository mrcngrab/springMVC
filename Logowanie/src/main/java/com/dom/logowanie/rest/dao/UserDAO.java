package com.dom.logowanie.rest.dao;

import java.util.List;

import com.dom.logowanie.rest.model.User;

public interface UserDAO {

	public void createUser(String login, String password, String creator);
	public List<User> getUser(Integer userId);
	public List<User> getUsers();
}
