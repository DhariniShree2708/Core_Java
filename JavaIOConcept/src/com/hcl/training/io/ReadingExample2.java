package com.hcl.training.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingExample2 {
   public static void main(String[] args) {

       BufferedReader br = null;
       BufferedReader br2 = null;
       try{	
           br = new BufferedReader(new FileReader("C:/Java Training/newfile.txt"));		

           //One way of reading the file
	   System.out.println("Reading the file using readLine() method:");
	   String contentLine = br.readLine();
	   while (contentLine != null) {
	      System.out.println(contentLine);
	      contentLine = br.readLine();
	   }

	   br2 = new BufferedReader(new FileReader("C:/Java Training/newfile.txt"));

	   //Second way of reading the file
	   System.out.println("Reading the file using read() method:");
	   int num=0;
	   char ch;
	   while((num=br2.read()) != -1)
	   {	
               ch=(char)num;
	       System.out.print(ch);
	   }

       } 
       catch (IOException ioe) 
       {
	   ioe.printStackTrace();
       } 
       finally 
       {
	   try {
	      if (br != null)
		 br.close();
	      if (br2 != null)
		 br2.close();
	   } 
	   catch (IOException ioe) 
           {
		System.out.println("Error in closing the BufferedReader");
	   }
	}
   }
}