package com.hcl.training.innerclass;

import com.hcl.training.innerclass.Classout.Classin;

public class MethodInnerClass {
	
	private String x= "You are in Outer Class";
	   
	   public static void main(String args[]){
		   MethodInnerClass outer = new  MethodInnerClass();
	       outer.innerMethod();
	       
	   }
	   
	   public void innerMethod() {
		   final String y = "You are in Inner Class";
	   // inner class definition
	   class Classin {
	       public void seeOuter () {
	          System.out.println(x);
	          System.out.println(y);
	       }
	   } // close inner class definition
	   
	   Classin inner= new Classin();
	   inner.seeOuter();
	   


}
}