package com.dom.logowanie.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dom.logowanie.dao.BalanceDAO;
import com.dom.logowanie.mapper.ExpenseMapper;
import com.dom.logowanie.mapper.SalaryMapper;
import com.dom.logowanie.model.Balance;
import com.dom.logowanie.model.Expense;
import com.dom.logowanie.model.Salary;


public class BalanceJDBCTemplate implements BalanceDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public Salary getSalary(Integer salaryId) {
		String SQL = "select * from income where ID = ?";
		Salary salary = jdbcTemplateObject.queryForObject(SQL, 
						new Object[]{salaryId}, new SalaryMapper());
		return salary;
	}

	@Override
	public List<Expense> getExpenses(Integer salaryId) {
		String SQL = "select * from cost_of_living where FK__INCOME = ?";
		List<Expense> expenses = jdbcTemplateObject.query(SQL, 
							new Object[]{salaryId}, new ExpenseMapper());
		return expenses;
	}

	@Override
	public Balance getBalance(Integer salaryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
