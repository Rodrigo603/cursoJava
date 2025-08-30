package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Student;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		System.out.println(stu);
		sc.close();
	}

}
