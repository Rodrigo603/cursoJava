package model.entities;

public class EmployeeList {
	private String name;
	private Integer id;
	private Double grossSalary;
	
	public EmployeeList() {	
	}
	public EmployeeList(Integer id, String name, Double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	public String toString() {
		return "Id: "
				+ id
				+", Name: "
				+ name
				+", Salary: "
				+ String.format("%.2f",grossSalary);
	}
}
