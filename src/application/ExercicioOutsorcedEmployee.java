package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee3;
import model.entities.OutsorcedEmployee;

public class ExercicioOutsorcedEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee3> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.println("Enter the employee #"+ (i + 1) +" Data: ");
			System.out.print("Outsorced? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(option == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee3 emp = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employee3 emp = new Employee3(name,hours,valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee3 emp : list) {
		System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
	}
		sc.close();
  }

}
