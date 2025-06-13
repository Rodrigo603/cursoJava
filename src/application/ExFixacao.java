package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		System.out.print("Numero da conta: ");
		int accountNumber = sc.nextInt();
		System.out.println("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Deseja começar com um deposito inicial (y/n) ?");
		char option = sc.next().charAt(0);

		if (option == 'y') {
			System.out.println("valor do deposito: ");
			double balance = sc.nextDouble();
			acc = new Account(accountNumber, name, balance);
		}
		else {
			acc = new Account(accountNumber,name);
		}
		System.out.println("Updated data: ");
		System.out.println(acc);
		System.out.println();
		System.out.println("Digite o valor do deposito: ");
		double deposit = sc.nextDouble();
		acc.Deposit(deposit);
		System.out.println(acc);
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double withdraw = sc.nextDouble();
		acc.Withdraw(withdraw);
		System.out.println();
		System.out.println(acc);		
		sc.close();
		
	}

}
