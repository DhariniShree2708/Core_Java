package com.hcl.training.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hasset {
	public static void main(String args[]) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);

		// Displaying HashSet elements
		System.out.println("Original Hash Set: \n");
		System.out.println(hset);

		// removing a element
		hset.remove(null);
		hset.remove("Orange");
		// Iterating HashSet elements
		System.out.println("\n\nIterating HashSet elements: \n");
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Creating an Array
		String[] array = new String[hset.size()];
		hset.toArray(array);

		// Displaying Array elements
		System.out.println("\n\nArray Implementation: \n");
		for (String temp : array) {
			System.out.println(temp);
		}

		// Creating a TreeSet of HashSet elements
		Set<String> tset = new TreeSet<String>(hset);

		// Displaying TreeSet elements
		System.out.println("\n\nTreeSet Implementation: \n");
		for (String temp : tset) {
			System.out.println(temp);
		}

		// Creating a List of HashSet elements
		List<String> list = new ArrayList<String>(hset);

		// Displaying ArrayList elements
		System.out.println("\nArrayList Implementation: \n\n" + list);
	}

}
