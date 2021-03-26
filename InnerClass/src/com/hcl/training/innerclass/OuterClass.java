package com.hcl.training.innerclass;

class OuterClass {
	   private int x= 1;
	   public void innerInstance()
	   {
	       InnerClass inner = new InnerClass();
	       inner. seeOuter();
	   }
	   public static void main(String args[]){
	       OuterClass outer = new OuterClass();
	       outer.innerInstance();
	   }
	   // inner class definition
	   class InnerClass {
	       public void seeOuter () {
	          System.out.println("Outer Value of x is :" + x);
	       }
	   } // close inner class definition	   
	} // close Top level class definition
