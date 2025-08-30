package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account2;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class Override {

	public static void main(String[] args) {
		//@override para sobrepor funcoes de sub e super classes como o withdraw que na superclasse tem um imposto de 5 reais a mais
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account2 acc1 = new Account2(1001, "Rodrigo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		Account2 acc2 = new SavingsAccount(1002,"Dantas",1000.0,0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		Account2 acc3 = new BusinessAccount(1002,"Dantas",1000.0,0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		sc.close();
	}
	

}
