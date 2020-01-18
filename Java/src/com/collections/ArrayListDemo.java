package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListDemo{

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		//Set<String> list = new HashSet<String>();
		Map<Integer, String> list = new HashMap<>();
		//List<String> list = new LinkedList<String>(); //same as Arraylist but memory location is diff
//		list.add("One");
//		list.add("Two");
//		list.add("Three");
//		list.add("Three");
//		list.add("Four");
//		list.add("Five");
//		list.add("Five");
//		System.out.println(list);
//		boolean l= list.contains("Two");
//		System.out.println(l);
//		String g= list.get(3);
//		System.out.println(g);
		list.put(1, "One");
		list.put(2, "Two");
		list.put(3,"Three");
		System.out.println(list);
		System.out.println("-----------------------");
		for (Map.Entry<Integer, String> str : list.entrySet()) {
			System.out.println(str.getKey()+ " "+str.getValue());
		}
		
	}

}
