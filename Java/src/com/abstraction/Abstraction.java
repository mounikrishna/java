package com.abstraction;

abstract class A{        // abstract class can have abstract and concrete methods
	
	abstract void m1();   //because this is abstract method. So it must in concrete class that which extends this class.
	abstract void m2();
	void m3() {          // this is not a abstract method
		System.out.println("m3 is called in abstract class");
	}
}
class B extends A{
	
	void m1() {
		System.out.println("m1 is called");
	}
	void m2() {
		System.out.println("m2 is called");
	}
}
public class Abstraction{
	public static void main(String[] args) {
		A ref = new B();           // we cannot create objects for abstract class but we can create reference
		ref.m1();
		ref.m3();      // At compile time it looks into A and At run time it looks into B,
						//But there is no m3() method in B, So it looks into Super class which is A class 
	}
}
	
