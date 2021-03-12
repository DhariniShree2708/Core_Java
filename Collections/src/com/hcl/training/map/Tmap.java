package com.hcl.training.map;

import java.util.TreeMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class Tmap {

   public static void main(String args[]) {

      /* This is how to declare TreeMap */
      TreeMap<Integer, String> tmap = 
             new TreeMap<Integer, String>(/*Collections.reverseOrder()*/);

      /*Adding elements to TreeMap*/
      tmap.put(1, "Dog");
      tmap.put(70, "Cat");
      tmap.put(7, "Ship");
      tmap.put(8, "Cow");
      tmap.put(4, "Ship");
      tmap.put(10, "God");
      tmap.put(18, "Camel");

      /* Display content using Iterator*/
      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
      
      SortedMap<Integer, String> sortedMap = tmap.subMap(7,70);
      System.out.println("SortedMap Contains : " + sortedMap);
      
      System.out.println("\nSize of TreeMap: \n"+tmap.size());
      Object removedElement = tmap.remove(4);
      System.out.println("\nRemoved Element: "+removedElement);
      
      System.out.println("\nAfter removal : \n" +tmap);

   }
}
