package com.hcl.training.thread;

public class ThreadCreation2 implements Runnable {
	   public void run(){  
	     System.out.println("Thread is running..");  
	   }  
	   public static void main(String[] args) {
	     Thread t = new Thread(new ThreadCreation2());
	     t.start();
	}
}