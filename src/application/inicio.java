package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Triangle;

public class inicio {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("medidas do triangulo Y");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Area do triangulo X : %.2f%n",areax);
		System.out.printf("Area do triangulo Y : %.2f%n",areay);
		if (areax > areay) {
			System.out.println("Maior area: X ");
		}
		else if (areax < areay) {
			System.out.println("Maior area : Y");
		}
		sc.close();
	}

}
