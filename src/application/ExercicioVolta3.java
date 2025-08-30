package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Rectangle2;

public class ExercicioVolta3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("type the dimensions: ");
		System.out.print("width: ");
		double width = sc.nextDouble();
		System.out.print("height: ");
		double height = sc.nextDouble();
		Rectangle2 rect = new Rectangle2(width,height);
		System.out.println(rect);
		sc.close();
		

	}

}
