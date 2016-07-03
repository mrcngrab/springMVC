package com.dom.logowanie.services;

import com.dom.logowanie.model.Balance;
import com.dom.logowanie.response.BalanceResponse;
import com.dom.logowanie.template.BalanceJDBCTemplate;


public class BalanceService {

	BalanceJDBCTemplate balanceJDBCTemplate;
	public void setBalanceJDBCTemplate(BalanceJDBCTemplate balanceJDBCTemplate) {
		this.balanceJDBCTemplate = balanceJDBCTemplate;
	}
	
	public BalanceResponse getBalance(Integer id) {
	
		Balance balance = new Balance();
		balance.setSalary(balanceJDBCTemplate.getSalary(id));
		balance.setExpenses(balanceJDBCTemplate.getExpenses(id));
		
		BalanceResponse balanceResponse = new BalanceResponse();
		balanceResponse.setStatus(1);
		balanceResponse.setMessage("successful");
		balanceResponse.setBalance(balance);
		
		return balanceResponse;
	}
	
}
