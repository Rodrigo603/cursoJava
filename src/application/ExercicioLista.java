package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee1;

public class ExercicioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee1> list = new ArrayList<>();
		System.out.println("How many employees will be registered ?");
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println();
			System.out.print("id: ");
			Integer id = sc.nextInt();
			while (HasId(list, id)) {
				System.out.println("Id already exist, try again :");
				id = sc.nextInt();
			}
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("salary: ");
			Double salary = sc.nextDouble();
			
			Employee1 emp = new Employee1(id, name, salary);
			list.add(emp);
			
		}
		System.out.println();
		System.out.print("Enter the employee id what will have salary increase: ");
		int idSalary = sc.nextInt();
		Employee1 emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("the id wasn't registered");
			System.out.println();
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println("List of employees:");
		for (Employee1 emp1 : list) {
			System.out.print(emp1);
		}
		sc.close();

	}
	
	    public static boolean HasId(List<Employee1> list, int id) {
	    	Employee1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	    	return emp != null;
	    }
	/* public static Integer position(List<Employee1> list, int id) {
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}	 */
}
