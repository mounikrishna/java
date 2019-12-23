package com.object;

public class Statickeyword {
	int marks;
	String name;
	static String college = "VRSEC";
	
	
	public Statickeyword() {
	}

	public Statickeyword(int marks, String name, String college) {
		this.marks = marks;
		this.name = name;
		this.college = college;
	}
	public static void Insert() {
		college = "KLU";					// ---the variables inside the static method must be a static variables.
	}

	void display() {
		System.out.println(name+" "+marks+" "+college);
	}

	public static void main(String[] args) {
		Statickeyword.Insert();				//---------We can access static method directly without needing a object.
		Statickeyword sk = new Statickeyword();
		System.out.println(sk);              //--------returns hash code(memory location reference)
		sk.display();
		Statickeyword snk = new Statickeyword(100,"mouni","dasfg");
		
		snk.display();
//		Statickeyword sk = new Statickeyword();
//		sk.display();
//		sk.Insert();
//		Statickeyword sk1 = new Statickeyword(12,"mouni","DIET");
//		sk.display();
//		sk.Insert();
//		sk1.display();
//		sk1.Insert();
			
	}

}

//output before static keyword: null 0 VRSEC
//							  null 0 VRSEC
//							  mouni 12 DIET
//-----------------------------------------------
//output After static keyword: null 0 VRSEC
//								null 0 DIET
//								mouni 12 DIET