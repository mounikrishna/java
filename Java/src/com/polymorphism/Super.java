package com.polymorphism;


class Animal{ 
	String name = "puppy";
	{
		System.out.println("instance initializer block invoked");}  
	public Animal() {
		
		System.out.println("animal");
	}

	void eat() {
		System.out.println("eaTING...");
	}
}  
class Dog extends Animal{  
	String name = "Golden Retriever";
	
	public Dog() {
		super();
		System.out.println("dog");
	}
	void milk() {
		System.out.println("drinking...");
	}
	void bark() {
		super.eat();
		milk();
		
	}
	void display() {
		System.out.println(name);    //Golden Retriever
		System.out.println(super.name);  //puppy
}}
public class Super{  
	public static void main(String args[]){  
		Dog d=new Dog();
		d.display();
		d.bark();
	} 
 }
