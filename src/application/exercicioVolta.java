package application;

import java.util.Scanner;
import java.util.Locale;

public class exercicioVolta {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		for (int i = 0;i<mat.length;i++) {
			for (int j = 0;j<mat.length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0;i<mat.length;i++) {
			somaDiagonalPrincipal += mat[i][i];
			somaDiagonalSecundaria += mat[i][n - i - 1];
		}
		System.out.printf("soma das diagonal principal e secundaria(respectivamente): %d %d ", somaDiagonalPrincipal, somaDiagonalSecundaria);
		sc.close();
	}
}

