package com.execption;

public class InsufficientFundsException extends Exception{
	//1. Need to define a class 		//2. Need to extends Exception /Runtime Exception class
	public String getMessage() {	//3. Need to override /Implement new method to give user friendly message. 
		return "Low Balance";
	}
}

/*
 * .............STEPS TO CREATE USER-DEFINED EXCEPTION..........
 * 1. Need to define a class 
 * 2. Need to extends Exception /Runtime Exception class 
 * 3. Need to override /Implement new method to give user friendly message. 
 * 4. Create an User-defined exception in place of the critical code.
 * 5. Bring the Exception into active state using "throw" keyword.
 * 6. Inform the caller about the Exception using "throws" keyword.
 * 7. Caller can handle user defined exception.
 */