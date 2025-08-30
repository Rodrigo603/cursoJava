package model.entities;

public class Employee2 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public Employee2(){
	}
	public Employee2(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double NetSalary() {
		return  grossSalary - tax;
	}
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	public String toString() {
		return "Employee: "
				+ name
				+" , "
				+ String.format("%.2f", NetSalary());
	}
}

