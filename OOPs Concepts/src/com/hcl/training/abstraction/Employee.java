/**
 * 
 */
package com.hcl.training.abstraction;

/**
 * @author dharinishree.k
 *
 */
public abstract class Employee {
	   private String name;
	   private String address;
	   private int number;

	   public Employee(String name, String address, int number) {
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   
	   public abstract double computePay();

	   
	   public abstract void mailCheck();
	     
	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }
	 
	   public String getAddress() {
	      return address;
	   }
	   
	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }
	 
	   public int getNumber() {
	      return number;
	   }
	}
