package com.execption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	static int x, y, sum, quotient;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		x = sc.nextInt();
		y = sc.nextInt();
			sum = x+y;
			System.out.println(sum);
			
			quotient = x/y;
			System.out.println(quotient);
		}
		catch(ArithmeticException ae) {
			System.out.println("Y cannot be zero");
		}
		catch (InputMismatchException e) {
			System.out.println("please enter integer value");
		}
		try{				
			
		}
		catch (Exception e) {			// a catch block must be immediately after the try
										//there can be any number of catch block for a single try block
		}
		
	}
}

