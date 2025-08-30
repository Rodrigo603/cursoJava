package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Product2;

public class ExercicioVolta2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Product´s data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.println("quantity: ");
		int qty = sc.nextInt();
		System.out.println("price: ");
		double price = sc.nextDouble();
		Product2 prod = new Product2(name,qty,price);
		System.out.println(prod);
		System.out.println("how many unities will be added ?: ");
		qty = sc.nextInt();
		prod.addQty(qty);
		System.out.println(prod);
		System.out.println();
		System.out.println("how many unities will be removed from storage ?: ");
		qty = sc.nextInt();
		prod.removeQty(qty);
		System.out.println(prod);
		sc.close();

	}

}
