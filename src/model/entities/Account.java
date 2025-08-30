package model.entities;

public class Account {
	private int code;
	private String name;
	private double balance;

	public Account() {
	}
	
	public Account(int code,String name) {
		this.code = code;
		this.name = name;
	}
	public Account(int code, String name, double initialDeposit) {
		this.code = code;
		this.name = name;
		Deposit(initialDeposit);
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString() {
		return "Account "
				+ code
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ String.format("%.2f",balance);
	}
	public void Deposit(double value) {
		balance = balance + value;
	}
	public void Withdraw(double value) { 
		 balance = balance - value - 5.0;
	}
}
