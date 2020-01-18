package com.array;

public class ExampleSArray {
	static void minimum(int arr[]) {
		int minimum = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(minimum > arr[i]) {
			minimum = arr[i];
			}
			
		}
		System.out.println(minimum);
	}
	
	public static void main(String[] args) {
		int a[] = {110,213,23,45};
		minimum(a);
		}
}

