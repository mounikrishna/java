package com.polymorphism;

public class MethodOverloading {
	 public int add(int a, int b) {
		 int c = a+b;
		return c;
	 }
	 public int add(int a, int b, int c) {
		 int d= a+b+c;
		 return d;
	 }
	 public static double add(int a, double b, int c) {
		 double d =  a+b+c;
		 return d;
	 }
	 
	 public static void main(String[] args) {
		MethodOverloading  ad = new MethodOverloading();
		System.out.println("Sum of the 4565 and 5456 is :"+ad.add(4565, 5456));
		System.out.println("Sum of the 2345, 23 and 567 is :"+ad.add(2345, 23, 567));
		System.out.println("Sum of the 56, 56.0 and 656 is :"+MethodOverloading.add(56, 56.0, 656));
	}
}
