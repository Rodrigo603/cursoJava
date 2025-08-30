package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.JuridicPerson;
import model.entities.Person;
import model.entities.PhysicsPerson;

public class ExercicioPerson {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		System.out.print("Enter the numbers of tax payers: ");
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data: " );
			System.out.print("Physics or juridic(p/i): ");
			sc.nextLine();
			char option = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			if (option == 'p') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new PhysicsPerson(name,annualIncome,healthSpending));
			}else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				list.add(new JuridicPerson(name,annualIncome,employeesNumber));
			}
		}
		System.out.println("TAXES PAID");
		double sumTaxes = 0.0;
		for (Person person : list) {
			System.out.println(person.getName() +  ": $" + String.format("%.2f", person.taxes()));
			sumTaxes += person.taxes();
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sumTaxes));	
		sc.close();

	}

}
