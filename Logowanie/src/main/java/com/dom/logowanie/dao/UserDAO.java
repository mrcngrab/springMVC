package com.dom.logowanie.dao;

import java.util.List;

import com.dom.logowanie.model.User;

public interface UserDAO {

	public void createUser(String login, String password, String creator);
	public User getUser(int userId);
	public List<User> getUsers();
}
