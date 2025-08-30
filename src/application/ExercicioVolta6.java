package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVolta6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int n = sc.nextInt();
		double [] array = new double [n];
		for (int i = 0;i < array.length;i++) {
			array [i] = sc.nextDouble();
		}
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		System.out.print("Array: \n");
		for (int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.print("reverse array: \n");
		for (int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.printf("%.2f", sum);
		sc.close();
		

	}

}
