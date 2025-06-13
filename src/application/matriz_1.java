package application;

import java.util.Scanner;

public class matriz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] mat = new int [n][m];
		for ( int i = 0; i<mat.length;i++) {
			for ( int j = 0 ; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		int x = sc.nextInt();
		for (int i = 0;i<mat.length;i++) {
			for (int j = 0;j<mat[i].length;j++) {
				if(mat[i][j] == x) {	
					System.out.println("position: " + i +"," + j + ":");
					if (j > 0) {
						System.out.println("left:" + mat[i][j-1]);
						}
					if ( i > 0 ) {
						System.out.println("Up: "+ mat[i-1][j]);
						}
					if (j < mat[i].length -1) { // mat.length para saber se é um valor valido p coluna 0 a 2 no caso de 3 colunas 
						System.out.println("Right:" + mat[i][j+1]);
						}
					if (i < mat.length -1) {
						System.out.println("Down:" + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}

}
