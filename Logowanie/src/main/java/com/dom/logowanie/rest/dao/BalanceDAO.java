package com.dom.logowanie.rest.dao;

import java.util.List;

import com.dom.logowanie.rest.model.Balance;
import com.dom.logowanie.rest.model.Expense;
import com.dom.logowanie.rest.model.Salary;

public interface BalanceDAO {

	public Balance getBalance(Integer salaryId);
	public Salary getSalary(Integer salaryId);
	public List<Expense> getExpenses(Integer salaryId);
}
