package com.dom.logowanie.model;

public class Expense {

	private Double price;
	private String description;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Expense [price=" + price + ", description=" + description + "]";
	}
}
