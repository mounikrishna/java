package com.object;
//example for creating and accessing different classes through a main class
public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainOutsideClass m1 = new MainOutsideClass();
		ObjectandClasses m2 = new ObjectandClasses();
		m1.id = 1234;
		m2.id = 3456;
		System.out.println(m1.id+ " "+ m1.name);  
		System.out.println(m2.id+ " "+ m2.name);
		

	}

}
