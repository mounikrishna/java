package com.execption;

import java.util.Scanner;


public class Scannr {
	static int x ; 
	static double y;
	static float z;
	static String str;
	public void sum() {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Scannr s =  new Scannr();
		Scanner sc = new Scanner(System.in); //read inputs the keyboard
		x = sc.nextInt();   //accepts the integer value
		y = sc.nextDouble(); // accepts the Double value
		z = sc.nextFloat();	//accepts the float value
		str = sc.next();	//accepts the string value
		s.sum();
		System.out.println(str);
		sc.close();
	 }
}
