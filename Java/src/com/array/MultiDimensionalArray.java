package com.array;

public class MultiDimensionalArray {
	public static void main(String[] args) {
	int arr[][] = {{1,2,3},{2,5,5},{2,4,5}};
	
		for(int i=0;i<arr.length;i++) {
		
			for(int j=0;j<arr.length;j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

 