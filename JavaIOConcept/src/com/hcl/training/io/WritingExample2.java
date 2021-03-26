package com.hcl.training.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingExample2 {
   public static void main(String[] args) {
      BufferedWriter bw = null;
      try {
	 String mycontent = "Hello Everyone!!" +
	    " I am Dharini shree Karthigai Kumar.";
         //Specify the file name and path here
	 File file = new File("C:/Java Training/newfile.txt");

	 /* This logic will make sure that the file 
	  * gets created if it is not present at the
	  * specified location*/
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("File written Successfully");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
   }
}