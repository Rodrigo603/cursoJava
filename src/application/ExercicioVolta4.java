package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee2;

public class ExercicioVolta4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee2 emp = new Employee2();
		System.out.println("Employee´s Data: ");
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println("percentage for raise: ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		System.out.println(emp);
		sc.close();
	}

}
