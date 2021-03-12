package com.hcl.training.enums;


enum Flowers 
{ 
    LOTUS,
    ROSE,
    JASMINE; 
  
    // enum constructor called separately for each 
    // constant 
    private Flowers() 
    { 
        System.out.println("Constructor called for : " + 
        this.toString()); 
    } 
  
    public void flowersInfo() 
    { 
        System.out.println("Flowers are god's gift!"); 
    } 
} 

public class ConstructorExample {
	
	 public static void main(String[] args) 
	    { 
	        Flowers c1 = Flowers.ROSE; 
	        System.out.println(c1); 
	        c1.flowersInfo(); 
	    } 

}
