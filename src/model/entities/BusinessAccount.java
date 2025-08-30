package model.entities;

public class BusinessAccount extends Account2{
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {	
			balance += amount - 10.0;
		}
	}
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount); // super pega o metodo da superclasse e pode ser utilizado para metodos que herdam dele e fazem mais alguma funcao
		balance -= 2.0;
	}
}
