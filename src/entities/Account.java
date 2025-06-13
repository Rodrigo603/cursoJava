package entities;

public class Account {
	private int accountNumber; 
	private String name;
	private double balance;
	public Account() {	
	}
	public Account(int accountNumber, String name ) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		
	}
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
	public String toString() {
		return "Account: " 
			+ accountNumber
			+ ", Holder: "
			+ name 
			+ ", Balance: $ "
			+ String.format("%.2f%n", balance);	
		}
	public void  Deposit(double deposit) {
		balance += deposit;
	}
	public void Withdraw(double withdraw) {
		balance -= withdraw + 5;
	}
}
