package com.object;

public class thiskeyword {
	int rollno;
	String name;
//If local variables and instance variables are different then there is no need of using this keyword
//	public thiskeyword(int rno, String ne) {
//		rollno = rno;   	//output: 123
//		name = ne;		//output: dog
//	}
	public thiskeyword(int rollno, String name) {
		this.rollno = rollno;   	//output: 123
		//rollno = rollno;    		//output: 0 
		//name = name;				//output: null
		this.name = name;			//output: dog
	}
	void display() {
		System.out.println("this is display");
		System.out.println("Student details: "+rollno+" "+name);
	}
	void display1() {
		System.out.println("this is display1");
		display(); //(or)this.display(); compiler automatically adds this keyword.
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword tk = new thiskeyword(123, "dog");
		tk.display1();

	}

}
