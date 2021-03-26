package com.hcl.training.io;

import java.io.File;
import java.io.IOException;
 
public class ReadOnlyChangeExample
{
 
    public static void main(String[] args) throws IOException
    {	
    	File myfile = new File("C:/Java Training/Food.txt");
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
    }
}