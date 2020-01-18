package com.array;

public class Example2 {
	public static void main(String[] args) {

		int x[] = new int[11];
		int sum =0;
		for (int i = 1; i < x.length; i++) {
			x[i] = i * 10;
			System.out.println(i+" * 10 = "+ x[i]);
		}
		for (int i = 1; i < x.length; i++) {
			
			sum = sum + x[i];
		}
		System.out.println("Sum is "+sum);
		
		
	}
}
