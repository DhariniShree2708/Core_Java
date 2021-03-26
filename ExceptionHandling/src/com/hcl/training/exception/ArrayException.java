package com.hcl.training.exception;

public class ArrayException {
	
	public static void main(String args[]){
	      try{
	         int arr[]=new int[7];
	         arr[10]=30;
	         System.out.println("Last Statement of try block");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }
	      catch(Exception e){
	         System.out.println("Some Other Exception");
	      }
	      System.out.println("Out of the try-catch block");
	   }

}
