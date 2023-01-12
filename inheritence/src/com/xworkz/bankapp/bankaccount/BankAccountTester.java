package com.xworkz.bankapp.bankaccount;
import com.xworkz.bankapp.bankaccount.current.CurentAccount;
import com.xworkz.bankapp.bankaccount.savings.SavingAccount;
public class BankAccountTester {
public static void main(String[] args) {
	
	BankAccount myAccount = new BankAccount();
	myAccount.deposite(5000);
	System.out.println("My account balance is"+myAccount.getBalance());
	
	BankAccount friendsAccount = new BankAccount();
	friendsAccount.deposite(700);
		
	myAccount.transfer(500.0, friendsAccount);
	System.out.println("My account balance is "+myAccount.getBalance());
	
	System.out.println("Friends account balance is "+friendsAccount.getBalance());
	
	SavingAccount maaSavingsaccount = new SavingAccount();
	maaSavingsaccount.deposite(500);

	SavingAccount savingsaccount = new SavingAccount();
	savingsaccount.deposite(500);
	savingsaccount.transfer(6700, maaSavingsaccount);
	System.out.println("The amount in savings account is : "+savingsaccount.getBalance());
	System.out.println("The amount in my mother's savings account is : "+maaSavingsaccount.getBalance());
	
	CurentAccount currentaccount = new CurentAccount();
	currentaccount.deposite(1000);
	currentaccount.transfer(8000, savingsaccount);
	System.out.println("The amount in current account is : "+currentaccount.getBalance());
	System.out.println("The amount in savings account is : "+savingsaccount.getBalance());

	
	CurentAccount vishalaCurrentAccount = new CurentAccount();
	vishalaCurrentAccount.deposite(465.78);
	vishalaCurrentAccount.transfer(890, myAccount);
	System.out.println("My account balance is"+myAccount.getBalance());
	
	
	SavingAccount savingsAccount2 = new SavingAccount(0.5);
	savingsAccount2.deposite(2000);
	savingsAccount2.periodicIntrest();
	System.out.println(savingsAccount2.getBalance());
}
}

//inheritance : Acquiring properties from one class to another class i.e from parent to child class/Super too Sub class/ Base to derived class.
//it is also called as IS A RELAtionship.
//class level using extends.