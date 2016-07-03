package com.dom.logowanie.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.dom.logowanie.model.Expense;


public class ExpenseMapper  implements RowMapper<Expense> {

	@Override
	public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Expense expense = new Expense();
		expense.setPrice(rs.getDouble("EXPENSE"));
		expense.setDescription(rs.getString("DESCRIPTION"));
		return expense;
	} 
	
}
