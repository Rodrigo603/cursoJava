package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Rectangle;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("Digite a largura e altura :");
		rect.largura = sc.nextDouble();
		rect.altura = sc.nextDouble();
		System.out.println(rect);
		sc.close();
	}

}
