package com.hcl.training.inheritance;


class Calculation {
	   int sum;
		
	   public void addition(int x, int y) {
	      sum = x + y;
	      System.out.println("The sum of two numbers is: "+sum);
	   }
		
	}

	public class SingleInheritance extends Calculation {
	   public void average(int x, int y) {
	      float avg = (x + y)/2;
	      System.out.println("The Average of two numbers is: "+avg);
	   }
		
	   public static void main(String args[]) {
	      SingleInheritance demo = new SingleInheritance();
	      demo.addition(50,10);
	      demo.average(60, 30);
	   }
	}