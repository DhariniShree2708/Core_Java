package com.hcl.training.polymorphism;

class Calculation {
	public void add(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		System.out.println("The Result is: " + sum);
	}
}

class Addition extends Calculation {
	public void add(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 + num2 + num3;
		System.out.println("The Result is: " + sum);
	}
}

public class Overloading {
	public static void main(String args[]) {
		Calculation c = new Calculation();
		Addition a = new Addition();
		c.add(23, 35);
		a.add(56, 20, 30);
	}
}
