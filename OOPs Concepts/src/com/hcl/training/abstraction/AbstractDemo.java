/**
 * 
 */
package com.hcl.training.abstraction;

/**
 * @author dharinishree.k
 *
 */
public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Salary s = new Salary("Swathi", "UP", 1, 3600.00);
	      Employee e = new Salary("John", "TN", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();s.computePay();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();e.computePay();
	}

}
