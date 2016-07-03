package com.dom.logowanie.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.dom.logowanie.model.Salary;


public class SalaryMapper implements RowMapper<Salary> {

	@Override
	public Salary mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Salary salary = new Salary();
		salary.setId(rs.getInt("ID"));
		salary.setSalary(rs.getDouble("SALARY"));
		salary.setDate(rs.getString("DATE"));
		return salary;
	} 
	
}
