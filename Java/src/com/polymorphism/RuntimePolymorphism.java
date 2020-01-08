package com.polymorphism;

//-----------Run time polymorphism cannot be acheived with the data members.
class Bike{
	String rpm = "Bike";
	void run() {
		System.out.println("bike running....");
	}
}
class Honda extends Bike{
	String rpm = "Honda";
	void run() {
		System.out.println("honda running....");
	}
}
public class RuntimePolymorphism {
	
	public static void main(String[] args) {
		Bike b =  new Honda();				//reference variable= parent class,,, object = child class
		// Honda h = new Bike();   --this is an error 
		b.run();     //honda running....    because of run time polymorphism..
		System.out.println(b.rpm);   //Bike       because runtime polymorphism does not works with daTa members
	}

}


