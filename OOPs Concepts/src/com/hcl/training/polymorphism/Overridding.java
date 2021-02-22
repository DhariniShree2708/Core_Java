package com.hcl.training.polymorphism;

	class Calculate {
		int sum = 0;
		public void add(int num1, int num2) {
			sum = num1 + num2;
			System.out.println("The Result is: " + sum);
		}
	}

	class Add extends Calculate {
		@Override
		public void add(int num1, int num2) {
			super.add(num1, num2);
			sum = num1 + num2 + 50;
			System.out.println("The Result is: " + sum);
		}
	}

	public class Overridding {
		public static void main(String args[]) {
			Calculate c = new Add();
			c.add(20, 30);
		}
	}