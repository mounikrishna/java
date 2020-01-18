package com.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("mouni");
		stack.push(1);
		stack.push("krishna");
		
		System.out.println(stack.pop());
		System.out.println(stack);
		boolean  s= stack.contains("mouni");
		System.out.println(s);
	}

	
	
}
