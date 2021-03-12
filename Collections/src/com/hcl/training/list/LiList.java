package com.hcl.training.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LiList {
	public static void main(String args[]){

	     LinkedList<String> list=new LinkedList<String>();

	     
	     list.add("Swathi");
	     list.addFirst("Karthi");
	     list.addLast("Viji");
       
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	     
	     
	     
	     list.removeFirst();

	     System.out.println("After removal operation:");
	     Iterator<String> iterator1=list.iterator();
	     while(iterator1.hasNext()){
	       System.out.println(iterator1.next());
	     }
	     
	   list.set(0, "Karthik");
	   System.out.println("After set operation:");
	     Iterator<String> iterator2=list.iterator();
	     while(iterator2.hasNext()){
	       System.out.println(iterator2.next());
	     }
	     
	    System.out.println("After Get operation:");
	    System.out.println("The first element is: "+list.get(0));
	    
	    System.out.println("After Search Operation:");
	    
	    boolean var2 = list.contains("Viji");
	    System.out.println(var2);
	    
	    boolean var = list.contains("TestString");
	    System.out.println(var);
	    
	    //conversion to arraylist
	    System.out.println("After conversion:");
	    List<String> list1 = new ArrayList<String>(list);

	    for (String str : list1){
	      System.out.println(str);
	    }
	    
	    //conversion to array
	    String[] array = list.toArray(new String[list.size()]);

	    System.out.println("Array Elements:");
	    for (int i = 0; i < array.length; i++)
	    {
	       System.out.println(array[i]);
	    }
	    
	   
}
}
