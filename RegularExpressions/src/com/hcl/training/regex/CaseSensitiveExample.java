package com.hcl.training.regex;

import java.util.regex.*;

public class CaseSensitiveExample {

	public static void main(String args[]) {
		String content = "This is a tutorial Website!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
	}

}
