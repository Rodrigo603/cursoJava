package application;

import java.util.Locale;

import model.entities.Account2;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class AccHeranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account2 acc = new Account2(1000,"Rodrigo",0.0);
		BusinessAccount bAcc = new BusinessAccount(1001,"Jose",0.0,500.0);
		
		// UPCASTING
		Account2 acc1 = bAcc;
		Account2 acc2 = new BusinessAccount(1003,"Dantas",0.0,200.0);
		Account2 acc3 = new SavingsAccount(1004,"Oliveira",0.0,0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		//BusinessAccount acc5 = (BusinessAccount)acc3; // savingsAccount nnao pode ser convertido para Business
		if (acc3 instanceof BusinessAccount) { // 
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) { // acc3 é instanciado da classe SavingsAccount
			SavingsAccount acc5 = (SavingsAccount)acc3; 
			acc5.updateBalance();
			System.out.println("Update !");
		}
	}

}
