package com.account;

public class SavingAccount extends Account{
    
	//override
	public SavingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	
	 private double bal;  //The current balance
	 protected double interestRate=0.05;

	 
	 
	 public void deposit(double sum) 
	 {
		 
        bal+=sum;    
			
      }
	 public void withdraw(double sum)
	 { bal-=sum; }   
		
	 public double getAccountNumber()
	    {
		return super.getAccountNumber(); 
		} 
	 
	 public double getBalance() {
	    	bal=bal+(bal+interestRate);
	    	
	    return bal;
	  }
	 public double getInterestRate() {
			return interestRate;
		} 
	 
	 public String toString()
	    {
		return "Acc " + getAccountNumber()+ ": " + "balance = " + bal;    
	    }
	    
	 
	    
} 