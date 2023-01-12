package com.xworkz.bankapp.bankaccount.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingAccount extends BankAccount {
	
	
public String name;
	
	public double interestRate;
	
	public SavingAccount() {
		System.out.println(name);
		
	}
	public SavingAccount(double interestRate) {
		this.interestRate=interestRate;
	}


     public void periodicIntrest() {
    	 double newBalance = getBalance() * interestRate/100;
    	 deposite(newBalance);
     }
}
