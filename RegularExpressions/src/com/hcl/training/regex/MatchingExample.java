package com.hcl.training.regex;

import java.util.regex.*;  
class MatchingExample{  
   public static void main(String args[]){  
      String content = "This is Dharini shree from salem " ;

      String pattern = ".*shree.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains 'shree'? " + isMatch);
   }
}  
