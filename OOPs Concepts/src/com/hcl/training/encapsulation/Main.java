/**
 * 
 */
package com.hcl.training.encapsulation;

/**
 * @author dharinishree.k
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.setName("Pooja");
        sd.setRollNo(44);
        System.out.println("The Student's Details are: ");
        System.out.println("Name: " +sd.getName());
        System.out.println("Roll Number: " +sd.getRollNo());
	}

}
