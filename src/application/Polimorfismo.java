package application;

import java.util.Locale;

import model.entities.Account2;
import model.entities.SavingsAccount;

public class Polimorfismo {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Account2 x = new Account2(1001, "Rodrigo",1000.0);
		Account2 y = new SavingsAccount(1001, "Rodrigo",1000.0,0.01);
		x.withdraw(200.0);
		y.withdraw(200.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
}
