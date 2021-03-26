package com.hcl.training.io;

import java.io.File;
import java.io.IOException;
 
public class HiddenCheck
{
 
    public static void main(String[] args) throws IOException, SecurityException
    {	
    	// Provide the complete file path here
    	File file = new File("C:/Java Training/Food.txt");
 
    	if(file.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}
    }
}