package com.hcl.training.exception;

public class NumberException {

	public static void main(String args[])
	   {
	      try{
		 int num=Integer.parseInt ("Dhari") ;
		 System.out.println(num);
	      }catch(NumberFormatException e){
		  System.out.println("Number format exception occurred");
	       }
	   }
}
