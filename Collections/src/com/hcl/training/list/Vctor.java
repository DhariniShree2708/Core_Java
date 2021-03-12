package com.hcl.training.list;

import java.util.*;

public class Vctor {
	public static void main(String args[]) {
		/* Vector of initial capacity(size) of 2 */
		Vector<String> vec = new Vector<String>(2, 5);

		/* Adding elements to a vector */
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");

		/* check size and capacityIncrement */
		System.out.println("Size is: " + vec.size());
		System.out.println("Default capacity increment is: " + vec.capacity());

		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");

		/* size and capacityIncrement after two insertions */
		System.out.println("Size after addition: " + vec.size());
		System.out.println("Capacity after increment is: " + vec.capacity());

		/* Display Vector elements */
		Enumeration en = vec.elements();
		System.out.println("\nElements before sorting:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

		Collections.sort(vec);
		System.out.println("\nElements after sorting:");
		 for(int i=0; i < vec.size(); i++){
		       System.out.println(vec.get(i));
		    }

		System.out.println("\nSearch operation:");
		System.out.println(vec.contains("Fig"));

	}

}
