package com.hcl.training.enums;

 public class Test 
{ 
	 enum WeekDays {
			
			MONDAY,
			TUESDAY,
			WEDNESDAY,
			THURSDAY,
			FRIDAY;
		 
		 

		}
	 
    public static void main(String[] args) 
    { 
    	for (WeekDays fs : WeekDays.values()) {
    	    System.out.println(fs);
    	}
        // Calling values() 
        WeekDays arr[] = WeekDays.values(); 
       
  
        // enum with loop 
        for (WeekDays col : arr) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.println(col + " at index "
                             + col.ordinal()); 
        } 
  
        // Using valueOf(). Returns an object of 
        // Color with given constant. 
        // Uncommenting second line causes exception 
        // IllegalArgumentException 
        System.out.println(WeekDays.valueOf("THURSDAY")); 
        // System.out.println(Color.valueOf("WHITE")); 
    } 
} 
