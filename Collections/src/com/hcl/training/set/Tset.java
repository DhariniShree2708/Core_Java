package com.hcl.training.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tset {

	 public static void main(String args[]) {
         // LinkedHashSet of String Type
         TreeSet<String> tset = new TreeSet<String>();

         // Adding elements to the LinkedHashSet
         
         tset.add("Positive");
         tset.add("God");
         tset.add("Happy");
         tset.add("Apple");
         
         System.out.println("Words set: \n");
         Iterator<String> it = tset.iterator();
 		while (it.hasNext()) {
 			System.out.println(it.next());
 		}

         // LinkedHashSet of Integer Type
         TreeSet<Integer> itset = new TreeSet<Integer>();

         // Adding elements
         itset.add(99);
         itset.add(89);
         itset.add(66);
         
         System.out.println("\nNumbers set: \n");
         Iterator<Integer> itr = itset.iterator();
 		while (itr.hasNext()) {
 			System.out.println(itr.next());
 		}
    }
}
