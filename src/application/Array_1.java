package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ArraysProduct;

public class Array_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArraysProduct [] vect = new ArraysProduct[n];
		for ( int i = 0;i < vect.length; i++ ) { //length == tamanho do array
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ArraysProduct(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i< vect.length ; i++) {
			sum += vect[i].getPrice(); //pegar o preco de determinado produto
		}
		double avg = sum/vect.length;
		System.out.printf("%.2f%n"+ avg);
		sc.close();
	}

}
