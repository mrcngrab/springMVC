package com.dom.logowanie.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dom.logowanie.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("ID"));
		user.setLogin(rs.getString("LOGIN"));
		user.setPassword(rs.getString("PASSWORD"));
		
		return user;
	}

}
