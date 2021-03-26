package com.hcl.training.innerclass;

public class AnonymousType3 {
	
	 public static void main(String[] args) 
	    { 
	        //Here we are using Anonymous Inner class 
	        //that define inside argument, here constructor argument 
	        Thread t = new Thread(new Runnable() 
	        { 
	            public void run() 
	            { 
	                System.out.println("Child Thread"); 
	            } 
	        }); 
	          
	        t.start(); 
	          
	        System.out.println("Main Thread"); 
	    } 

}
