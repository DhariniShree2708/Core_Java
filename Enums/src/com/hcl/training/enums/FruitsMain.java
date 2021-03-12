package com.hcl.training.enums;

public class FruitsMain {
	
	Fruits fs;

	public FruitsMain(Fruits fs) {
		super();
		this.fs = fs;
	}
	
	public void getFruits() {
		
		 switch (fs) {
	       case APPLE:
	          System.out.println("I am Apple!");
	          break;
	                    
	       case ORANGE:
	          System.out.println("I am Orange!");
	          break;
	                         
	       case MANGO: 
	          System.out.println("I am Mango!");
	          break;
	                        
	       default:
	          System.out.println("I am Pineapple!");
	          break;
	     }
	   }
	    
	    public static void main(String[] args) {
	        FruitsMain obj1 = new FruitsMain(Fruits.ORANGE);
	        obj1.getFruits();
	       // FruitsMain obj2 = new FruitsMain(Fruits.PINAPPLE);
	      //  obj2.getFruits();
	    }
		
	}
	

