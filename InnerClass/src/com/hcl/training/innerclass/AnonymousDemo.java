package com.hcl.training.innerclass;

interface Age 
{ 
    int x = 21; 
    String y = "Pooja";
    void getName();
    void getAge(); 
} 
class AnonymousDemo 
{ 
    public static void main(String[] args) { 
  
        // My class is hidden inner class of Age interface 
        // whose name is not written but an object to it  
        // is created. 
        Age oj1 = new Age() { 
        	@Override
			public void getName() {
				System.out.println("Name is : "+y);
			} 
            @Override
            public void getAge() { 
                 // printing  age 
                System.out.print("Age is : "+x); 
            }

			
        }; 
        oj1.getName();
        oj1.getAge(); 
    } 
} 