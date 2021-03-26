package com.hcl.training.regex;

import java.util.regex.*;  
class DelimiterExample{  
public static void main(String args[]){  
	String text = "Pooja is my best friend";
    // Pattern for delimiter
	String patternString = "is";
	Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
	String[] myStrings = pattern.split(text);
	for(String temp: myStrings){
	    System.out.println(temp);
	}
	System.out.println("Number of split strings: "+myStrings.length);
}}
