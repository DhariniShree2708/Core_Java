package com.hcl.training.exception;

class MyExample extends Exception{
	   String str1;
	   /* Constructor of custom exception class
	    * here I am copying the message that we are passing while
	    * throwing the exception to a string and then displaying 
	    * that string along with the message.
	    */
	   MyExample(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
	}

	class MyException{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyExample("This is My error Message");
		}
		catch(MyExample exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}