package com.hcl.training.list;

import java.util.*;

public class ArList {
	public static void main(String args[]) {

		ArrayList<Integer> obj = new ArrayList<Integer>();

		obj.add(5);
		obj.add(9);
		obj.add(8);
        obj.add(7);
		System.out.println("Original ArrayList:");
		for (Integer str : obj)
			System.out.println(str);

		System.out.println("Arraylist after Sorting:");
		Collections.sort(obj);
		for (Integer str : obj)
			System.out.println(str);

		obj.set(0, 4);
		obj.set(1, 3);

		System.out.println("ArrayList after set operation:");
		for (Integer str : obj)
			System.out.println(str);

		obj.remove(1);

		System.out.println("ArrayList after remove operation:");
		for (Integer str : obj)
			System.out.println(str);

		System.out.println("ArrayList after Get operation:");
		System.out.println("The second element in the arraylist is: "+obj.get(1));
	}
}
