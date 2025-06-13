package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dados do produto :");
		System.out.print("Nome :");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		Product product = new Product(name,price,quantity);
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		System.out.println();
		System.out.println("Product data: " + product); //chamo a forma do print da classe Product
		System.out.println();
		System.out.print("Numero de produtos a ser adicionado ao estoque :");
		quantity = sc.nextInt();	
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Numero de produtos a serem retirados do estoque :");
		quantity =sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data : " + product );
		sc.close();
	
	}

}
