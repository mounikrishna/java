package com.execption;

import java.util.Scanner;

public class ExceptionBankDemo {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExceptionExampleBank eb = new ExceptionExampleBank(1001,"mouni");
		System.out.println("how much you want to withdraw");
		double amount = sc.nextDouble();
		try {
		eb.withdraw(amount);
		}
		catch (InsufficientFundsException ie) {
			System.out.println(ie.getMessage());
		}
		eb.printAccount();
		sc.close();
	}
}
