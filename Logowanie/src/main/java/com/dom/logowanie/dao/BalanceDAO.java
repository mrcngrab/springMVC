package com.dom.logowanie.dao;

import java.util.List;

import com.dom.logowanie.model.Balance;
import com.dom.logowanie.model.Expense;
import com.dom.logowanie.model.Salary;

public interface BalanceDAO {

	public Balance getBalance(Integer salaryId);
	public Salary getSalary(Integer salaryId);
	public List<Expense> getExpenses(Integer salaryId);
}
