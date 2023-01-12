package com.xworkz.bankapp.bankaccount.current;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.bankaccount.savings.SavingAccount;

public class CurentAccount extends BankAccount {
	
	public static void main(String[] args) {
		SavingAccount saveAccount = new SavingAccount();
		saveAccount.deposit(4000);
		saveAccount.deposit(500);
		System.out.println("Myaccount balance is"+ saveAccount.balance);	
		
		
		SavingAccount maaSavingsAccount = new SavingAccount();
		maaSavingsAccount.deposit(5000);
		maaSavingsAccount.deposit(3000);
		
		maaSavingsAccount.transfer(2000.00,saveAccount);
		System.out.println("ma savings account balance is" + saveAccount.balance);
		
		System.out.println("my ma account balance is"+ maaSavingsAccount.balance);
		
	}

}
