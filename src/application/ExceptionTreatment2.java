package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account3;
import model.exceptions.WithdrawException;

public class ExceptionTreatment2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account3 acc = new Account3(number, name, balance, withdrawLimit);
			System.out.print("Enter amount to withdraw: ");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			System.out.println("Account balance: " + acc.getBalance());
			
		}
		catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid data ! ");
		}
		
	}

}
