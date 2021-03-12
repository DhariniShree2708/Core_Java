package com.hcl.training.set;

import java.util.LinkedHashSet;

public class LiHashSet {
	
	 public static void main(String args[]) {
         // LinkedHashSet of String Type
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();

         // Adding elements to the LinkedHashSet
         lhset.add("God");
         lhset.add("Happy");
         lhset.add("Positive");
         
         System.out.println("Words set: \n");
         for(String str:lhset) {
         System.out.println(str);
         }

         // LinkedHashSet of Integer Type
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         // Adding elements
         lhset2.add(99);
         lhset2.add(89);
         lhset2.add(66);
         
         System.out.println("\nNumbers set: \n");
         for(Integer str:lhset2) {
             System.out.println(str);
             }
    }

}
