package com.account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	List<Account> list=new ArrayList<Account>(); 
	public void addAccount(Account a) {
		list.add(a);
	}
	
	public void getTotalAccount() {
		for(Account ac : list) {
			ac.print();
		}}
	public void update() {
		
		for(Account ac:list) {
			ac.getBalance();
			System.out.println("This Bank account is not a savings account to apply Interest");
		
		if(ac.getBalance()<0) {
			System.out.println("Overdraft Letter printed & sent!");
		}
	}

		}
	}

