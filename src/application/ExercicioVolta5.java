package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Student2;

public class ExercicioVolta5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student2 stud = new Student2();
		System.out.println("Grades: ");
		System.out.print("Grade 1: ");
		stud.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		stud.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		stud.grade3 = sc.nextDouble();
		System.out.println(stud);
		sc.close();

	}

}
