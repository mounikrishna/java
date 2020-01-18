package com.execption;

public class ExceptionExampleBank {
	int acno;
	String name;
	double balance;
	public ExceptionExampleBank(int acno, String name) {
		this.acno = acno;
		this.name = name;
		this.balance = 10000;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
								//6. Inform the caller about the Exception using "throws" keyword.
		if (balance-amount < 6000) {
			//4. Create an User-defined exception in place of the critical code	
			InsufficientFundsException ie = new InsufficientFundsException();
			//5. Bring the Exception into active state using "throw" keyword.
			throw ie;
			
		}
		else {
			balance = balance-amount;
		}
	}
	public void printAccount() {
		System.out.println("Acno ="+acno);
		System.out.println("Name ="+name);
		System.out.println("Balance ="+balance);
	} 
	
}
