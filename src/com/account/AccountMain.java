package com.account;

public class AccountMain {
	
	
	
	public static void main(String[] args) {
		Account a= new Account(4000111);
		SavingAccount sa=new SavingAccount(4000222);
		CurrentAccount ca=new CurrentAccount(1000333);
		Bank b=new Bank();
		
		a.deposit(8000);
		a.withdraw(4000);
		a.getBalance();
		a.getAccountNumber();
		a.print();
		
		sa.deposit(0);
		sa.getInterestRate();
		sa.withdraw(1000);
		sa.getBalance();
		sa.getAccountNumber();
		sa.print();
		
		ca.deposit(0);
		ca.getBalance();
		ca.getAccountNumber();
		ca.withdraw(1600);
		ca.print();
		
		b.addAccount(a);
		b.addAccount(ca);
		b.addAccount(sa);
		b.getTotalAccount();
		b.update();
	}

}
