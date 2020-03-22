package com.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	
	 private double bal;  //The current balance
	 protected double overdraft=500;

	 
	 
	 public void deposit(double sum) 
	 {
		 
        super.deposit(sum);    
			
      }
	 
	 public void withdraw(double sum)
	 { 
		 if (sum>0) {
			 
			 if(sum<(bal+overdraft)) {
				 
			    bal=(bal+overdraft)-sum; }
			    else {
					System.out.println("You can't withdraw amount it is over then overdraftvalue");
			 }}
			else
			    System.out.println("Account.withdraw(...): "
					       +"cannot withdraw negative amount.");   
	 }   
		
	 public double getAccountNumber()
	    {
		return super.getAccountNumber(); 
		} 
	 
	 public double getBalance() {
	    	
	    	
	    return bal;
	  }
	
	 
	 public String toString()
	    {
		return "Acc " + getAccountNumber()+ ": " + "balance = " + bal;    
	    }
	    
	 
}
