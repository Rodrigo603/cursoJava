package model.entities;

public class PhysicsPerson extends Person{
	
	private Double healthSpending;
	
	public PhysicsPerson() {
	}
	
	public PhysicsPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double taxes() {
		Double income = getAnnualIncome(); 
		if (healthSpending > 0) {
			if (income < 20000.00) {
				return (income * 0.15) - (healthSpending/2);
			}
			else if (income >= 20000.00) {
				return (income * 0.25) - (healthSpending/2);
			}
		}else {
			if (income < 20000.00) {
				return (income * 0.15);
			}
			else if (income >= 20000.00) {
				return (income * 0.25);
			}
		}
		return income;	
	}
	
}
