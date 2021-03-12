package com.hcl.training.enums;



public class VegetableDemo {
	
	enum Vegetables{
		  TOMATO ("T"), 
		  POTATO ("P"), 
		  BRINJAL ("B"), 
		  Onoin ("O")
		  ; 
		  /* Important Note: Must have semicolon at
		   * the end when there is a enum field or method
		   */
		  private final String shortCode;
			  
		  Vegetables(String code) {
		      this.shortCode = code;
		  }
			  
		  public String getVegetableCode() {
		      return this.shortCode;
		  }
		}
	
	 public static void main(String[] args) {
		 
		 Vegetables[] veg = Vegetables.values();
		 
		 for (Vegetables vegge : veg) 
	        { 
	            // use getter method to get the value 
	            System.out.println("Name : " + vegge.name() + "  "
	                       + " Action: " + vegge.getVegetableCode() ); 
	        } 
	    }

}
