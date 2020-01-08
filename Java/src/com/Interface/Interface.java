package com.Interface;
interface interf{
	abstract void m1();    		//interface class contain only abstract methods
	void m2();					//By default any method in interface class is abstract type.
	public abstract void m3();	//By default any method in interface class is public..
}
interface interf1{
	void m4();
}
interface interf2 extends interf1{	//we can extend interface classes
	void m5();
}
class interfaces implements interf,interf2{   //A class can extend multiple interfaces
								// As interf2 is extend interf1 so we can use interf2 to call method m4
	public void m1(){			// Overridden interface methods must be of scope ''public''..
		System.out.println("m1");
	}
	public void m2(){	
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
	}
	public void m5() {
		System.out.println("m5");
	}
}

public class Interface { 
	public static void main(String[] args) {
		interf inf = new  interfaces();   //we cannot create objects for interface but we can create reference 
		inf.m1();
		inf.m2();
		inf.m3();
		//inf.m4();   //error
		interf1 inf1 = new interfaces();
		inf1.m4();
		interf2 inf2 = new interfaces();
		inf2.m4();
		inf2.m5();
		
	}
}
