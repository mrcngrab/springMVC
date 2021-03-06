package com.dom.logowanie.rest.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dom.logowanie.rest.dao.UserDAO;
import com.dom.logowanie.rest.mapper.UserMapper;
import com.dom.logowanie.rest.model.User;

public class UserJDBCTemplate implements UserDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public void createUser(String login, String password, String creator) {
	      String SQL = "insert into user (LOGIN, PASSWORD, SYS_CREATED_BY ) values (?, ?, ?)";
	      
	      jdbcTemplateObject.update( SQL, login, password, creator);
	      System.out.println("Created Record Name = " + login + " Password = " + password + " SYS_CREATED_BY= " + creator);
	      return;
		
	}
	   
	@Override
	public List<User> getUser(Integer userId) {
	      String SQL = "select * from user where ID = ?";
	      List <User> user = jdbcTemplateObject.query(SQL, 
	                        new Object[]{userId}, new UserMapper());
	      return user;
	}

	@Override
	public List<User> getUsers() {
	      String SQL = "select * from user";
	      List <User> users = jdbcTemplateObject.query(SQL, 
	                                new UserMapper());
	      return users;
	}





}
