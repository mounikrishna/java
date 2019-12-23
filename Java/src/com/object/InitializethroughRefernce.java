package com.object;

public class InitializethroughRefernce {
	String name;
	int id;
	public static void main(String args[]) {
		InitializethroughRefernce i1= new InitializethroughRefernce();
		i1.id = 999;
		i1.name = "mouni";
		System.out.println(i1.id+" "+i1.name);
		}
}
