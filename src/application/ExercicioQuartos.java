package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Rooms2;

public class ExercicioQuartos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rooms will be rented ? ");
		int n = sc.nextInt();
		Rooms2[] vect = new Rooms2[10];
		sc.nextLine();
		for(int i = 0; i < n;i++) {
			System.out.printf("Rent %d: ", i + 1);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: "); 
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Rooms2(name,email);
		}
		System.out.println("Busy rooms: ");
		for(int i = 0;i<vect.length;i++) {
			if(vect[i] != null) {	
				System.out.println(i + ":" + vect[i]);
			}
		}
		sc.close();
	}

}
