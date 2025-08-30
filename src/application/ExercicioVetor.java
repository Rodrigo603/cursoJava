package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Heights;

public class ExercicioVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people will be registered ?:  ");
		int n = sc.nextInt();
		Heights[] vect = new Heights[n];
		for (int i = 0; i < vect.length;i++) {
			System.out.printf("data from  %d person: \n", i + 1);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("age: ");
			int age = sc.nextInt();
			System.out.println("height: ");
			double height = sc.nextDouble();
			vect[i] = new Heights(name,age,height);
		}
		System.out.printf("Average height: %.2f\n",Heights.AvgHeight(vect,vect.length));
		System.out.printf("Percentage of people under 16: %.1f%%",Heights.percentageUnder16(vect, vect.length));
		sc.close();

	}

}
