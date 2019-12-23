package com.object;

public class Constructor {
	int marks;
	String id;
	static String college = "VRSEC";           //-----STATIC keyword: memory is created only once

	public Constructor() {
		this.marks = 100; // ---------No arg constructor-----------------
		this.id = "s2";
	}

	public Constructor(int marks) { // ---------------parameterized constructor--------------

		this.marks = marks;
		this.id = "d3";
	}																			//-----Constructor overloading: Having more than one constructors
																				//     with different parameter list

	public Constructor(int marks, String id) {
		this.marks = marks;
		this.id = id;
	}
	
	public Constructor(Constructor c) {    //-------copy of one constructor object values to the another.
		this.id = c.id;
		this.marks = c.marks;
	}

	public void Student() { 
		  System.out.println("Student id: "+id);
		  System.out.println("Student marks: "+marks);
		  System.out.println("College name: "+ college);
	}
	 
	public static void main(String[] args) {
		Constructor con = new Constructor(100, "mouni");
		Constructor con1 = new Constructor(100);
		Constructor con2 = new Constructor(con);   //----copying from to another constructor
		con.Student();
		con1.Student();
		con2.Student();
		
//		System.out.println("marks:" + con.marks);
//		System.out.println("id: " + con.id);
		
		

	}

}
