package com.hcl.training.exception;

public class FinalException {
	
	 public static void main(String args[])
	   {
	      System.out.println(FinalException.myMethod());  
	   }
	   public static int myMethod()
	   {
	      try {
	        return 112;
	      }
	      finally {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block ran even after return statement");
	      }
	   }

}
