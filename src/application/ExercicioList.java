package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.EmployeeList;

public class ExercicioList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<EmployeeList> list = new ArrayList<>();	
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d\n",i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Id already registered !");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Gross salary: ");
			double grossSalary = sc.nextDouble();
			EmployeeList emp = new EmployeeList(id,name,grossSalary);
			list.add(emp);
		}
		System.out.print("Enter the employee id that will be increase salary: ");
		int idSalary = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp != null) {
			System.out.print("what percentage will be increased(15%): ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}else {
			System.out.println("The id is not registered ! ");
		}
		for(EmployeeList employee : list) {
			System.out.println(employee);
		}
		sc.close();	
		}
		public static boolean hasId(List <EmployeeList> list, int id) {
			EmployeeList emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
			return emp != null;
		}
}
