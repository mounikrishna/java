package com.polymorphism;

class Bank {
	  public int bankInterest(){
		return 0;
	}
}
class AxisBank extends Bank{
	public int bankInterest() {
		return 1;
	}
}
class Icici extends Bank{
	public int bankInterest() {
		
		return 2;
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Icici mo =  new Icici();
		AxisBank as= new AxisBank();
		System.out.println(mo.bankInterest());
		System.out.println(as.bankInterest());
}}

