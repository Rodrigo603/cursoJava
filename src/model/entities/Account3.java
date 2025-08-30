package model.entities;

import model.exceptions.WithdrawException;

public class Account3 {
	private Integer number;
	private String name;
	private Double balance;
	private Double withdrawLimit;
	
	public Account3() {
	}

	public Account3(Integer number, String name, Double balance, Double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public Double deposit(Double amount) {
		return balance += amount;
	}
	public Double withdraw(Double amount) {
		validateWithdraw(amount);
		return balance -= amount;
	}
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new WithdrawException("Withdraw error : amount exceeds withdraw limit ");
		} 
		if (amount > getBalance()) {
			throw new WithdrawException("Withdraw error: Not enough balance");
		}
	}
}
