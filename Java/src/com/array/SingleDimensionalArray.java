package com.array;

public class SingleDimensionalArray {
	public static void main(String args[]){  
		/*
		 * int arr[]= new int[4];//declaration and instantiation
		 * arr[0]=10;//initialization 
		 * arr[1]=27; 
		 * arr[2]=15;
		 */
		int arr[] = {10,23,23,45}; //declare,instantiation,initialize
		/*
		 * for(int i=0;i<arr.length;i++)
		 *  { System.out.println(arr[i]); }
		 */
		for(int i:arr) {  //for-each loop...advanced for loop
				//start from index 0 and end at n-1 th index
			System.out.println(i);
		}
		} 
}
