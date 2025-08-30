package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Rooms;

public class Array_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serão alugados? ");
		int nQuartos = sc.nextInt();
		Rooms [] vect = new Rooms[10];
		for (int i = 1; i <= nQuartos; i++) { // 1 por que n existe 0 pessoas alguando
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.next();
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email); //atribuir os nomes e emails aos quartos 
		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10 ;i++)
			if (vect[i] != null) { // se o vetor n tiver nada fica null ent print tudo diferente de null q seriam os quartos alugados
				System.out.println(i + ": " + vect[i]);
			}
			
		sc.close();
	
	}

}
