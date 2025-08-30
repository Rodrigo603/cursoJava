package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ExercicioVolta8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Account holder: ");
		String accountName = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n): ");
		String depositChoice = sc.nextLine(); //sc.next().charAt(0);
		if (depositChoice.equals("y")) {
			System.out.print("Enter a initial value: ");
			double depositValue = sc.nextDouble();
			Account ac = new Account(accountNumber,accountName,depositValue);
			System.out.print("Account: \n");
			System.out.println(ac);
			System.out.print("Enter a deposit value: ");
			double value = sc.nextDouble();
			ac.Deposit(value);
			System.out.print("Updated Account: ");
			System.out.println(ac);
			System.out.print("Enter a withdraw value: ");
			value = sc.nextDouble();
			ac.Withdraw(value);
			System.out.print("Updated Account: ");
			System.out.println(ac);
		}else {
			Account ac = new Account(accountNumber,accountName);
			System.out.print("Account: \n");
			System.out.println(ac);
			System.out.print("Enter a deposit value: ");
			double value = sc.nextDouble();
			ac.Deposit(value);
			System.out.print("Updated Account: ");
			System.out.println(ac);
			System.out.print("Enter a withdraw value: ");
			value = sc.nextDouble();
			ac.Withdraw(value);
			System.out.print("Updated Account: ");
			System.out.println(ac);
		}
		sc.close();
	}

}
