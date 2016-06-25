package com.dom.logowanie.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dom.logowanie.model.User;
import com.dom.logowanie.template.UserJDBCTemplate;

public class UserService {

	UserJDBCTemplate userJDBCTemplate;
	public void setUserJDBCTemplate(UserJDBCTemplate userJDBCTemplate) {
		this.userJDBCTemplate = userJDBCTemplate;
	}
	
	public User getUser(Integer id) {
		return userJDBCTemplate.getUser(id);
	}
	
	public List<User> getAllUser() {
		return userJDBCTemplate.getUsers();
	}
}
