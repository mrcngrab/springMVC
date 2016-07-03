package com.dom.logowanie.response;

import com.dom.logowanie.model.Balance;

public class BalanceResponse extends BasicResponse {
	
	private Balance balance;

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}
}
