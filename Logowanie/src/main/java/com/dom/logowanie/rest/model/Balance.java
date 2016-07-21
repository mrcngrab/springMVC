package com.dom.logowanie.rest.model;

import java.util.LinkedList;
import java.util.List;

public class Balance {
	
	private Salary salary;
	private List<Expense> expenses = new LinkedList<Expense>();
	
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public List<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	public void addExpense(Expense expense) {
		expenses.add(expense);
	}
}
