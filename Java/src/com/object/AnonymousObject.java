package com.object;


public class AnonymousObject {
	int power;
	void power(int power) {
		System.out.println(power*power);
	}
	public static void main(String[] args) {
		
		new AnonymousObject().power(33);
		
	}

}
