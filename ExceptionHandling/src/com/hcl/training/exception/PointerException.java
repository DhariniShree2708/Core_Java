package com.hcl.training.exception;

public class PointerException {
	
	public static void main(String args[])
	   {
		try{
			String str=null;
			System.out.println (str.length());
			System.exit(0);
		}
	        catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
		finally {
			System.out.println("In Final Block!");
		}
	   }

}
