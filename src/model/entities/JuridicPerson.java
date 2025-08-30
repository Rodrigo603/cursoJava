package model.entities;

public class JuridicPerson extends Person {
	private int employeesNumber;
	
	public JuridicPerson() {
	}

	public JuridicPerson(String name, Double annualIncome, int employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	@Override
	public Double taxes() {
		if (employeesNumber > 10) {
			return getAnnualIncome() * 0.14; 
		}else {
			return getAnnualIncome() * 0.16; 
		}
	}
	
	
}
