package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Array_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double percentage;
		int under_16 = 0;
		People[] vect = new People[n];
		for ( int i = 0; i < vect.length; i++ ) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
			}
		double sum = 0.0;
		for ( int i = 0; i<vect.length; i++) {
			sum += vect[i].getHeight();
		}
		double avgHeight = sum/vect.length;
		System.out.printf("Altura media: %.2f%n", avgHeight);
		for (int i = 0; i < vect.length;i++) {
			if (vect[i].getAge() < 16) {
				under_16 += 1;
			}
		}
		percentage = under_16 / (double)vect.length * 100;
		System.out.printf("porcentagem de pessoas com menos de 16 anos: %.1f%%%n", percentage );
		for (int i = 0; i< vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}
	

}
