package com.hcl.training.innerclass;

public class AnonymousType2 {
	
	  public static void main(String[] args) 
	    { 
	        //Here we are using Anonymous Inner class 
	        //that implements a interface i.e. Here Runnable interface 
	        Runnable r = new Runnable() 
	        { 
	            public void run() 
	            { 
	                System.out.println("Child Thread"); 
	            } 
	        }; 
	        Thread t = new Thread(r); 
	        t.start(); 
	        System.out.println("Main Thread"); 
	    } 

}
