package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExercicioVolta7 {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the price of dollar ? : ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars you will buy ? : ");
		double dollarQty = sc.nextDouble();
		System.out.printf("Price that you have to pay: %.2f ", CurrencyConverter.Converter(dollarPrice, dollarQty));
		sc.close();
	}
}
