package com.hcl.training.exception;

import java.io.*;
class ThrowsExample { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 
} 

public class ThrowsClause{ 
  public static void main(String args[]){ 
   try{ 
     ThrowsExample obj=new ThrowsExample(); 
     obj.myMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}