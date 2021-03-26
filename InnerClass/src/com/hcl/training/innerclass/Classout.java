package com.hcl.training.innerclass;



public class Classout {
	
	   private String x= "You are in Outer Class";
	   
	   public static void main(String args[]){
	       Classout.Classin inner = new Classout().new Classin();
	       inner.seeOuter();
	   }
	   // inner class definition
	   class Classin {
	       public void seeOuter () {
	          System.out.println(x);
	       }
	   } // close inner class definition

}
