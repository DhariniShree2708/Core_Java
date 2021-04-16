package com.hcl.training.thread;

public class ThreadCreation1 extends Thread {
	   public void run(){  
	    System.out.println("Thread is running...");  
	  } 
	   public static void main(String[] args) {
	     ThreadCreation1 obj = new ThreadCreation1();
	     obj.start();
	}
}