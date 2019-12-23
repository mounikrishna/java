package com.object;

public class Initializethroughmethod {
	int id;
	String name;
	void insert(int i,String nm) { //initializing through method
		id = i;
		name= nm;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializethroughmethod im = new Initializethroughmethod();
		Initializethroughmethod im1 = new Initializethroughmethod();
		im.insert(213, "krishna");
		System.out.println(im.id+" "+im.name);
		im1.insert(23, "Atluri");
		System.out.println(im1.id+" "+im1.name);
		im.display();
		im1.display();

	}

}
