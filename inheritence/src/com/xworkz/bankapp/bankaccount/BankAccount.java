package com.xworkz.bankapp.bankaccount;

public class BankAccount {
	public	String name;
	public 	String iD;
	public	String ifscCode;
	public	long accountNo;
	private	double balance;
		
	public double withDraw(double balance) {
		this.balance = this.balance-balance;
		return balance;
	}

	public double deposite(double balance){
		System.out.println("The amount to be Deposited"+balance);
		this.balance = this.balance+balance;
		return balance;
	}

	public void transfer(double amount, BankAccount friendsAccount) {
		System.out.println("Transferring to Another ");
		withDraw(amount);
		friendsAccount.deposite(amount);
		System.out.println("Transferring Done...Transaction Successfull");
	}

	public double getBalance() {
		return balance;
	}
	}