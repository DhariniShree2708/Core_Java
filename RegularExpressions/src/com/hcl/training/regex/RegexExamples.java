package com.hcl.training.regex;

import java.util.regex.*;

class RegexExamples {
	public static void main(String args[]) {
		System.out.println("It would return true if string matches exactly \"tom\"");
		System.out.println(Pattern.matches("tom", "Tom")); // False

		System.out.println("returns true if the string matches exactly \"tom\" or \"Tom\"");

		System.out.println(Pattern.matches("[Tt]om", "Tom")); // True
		System.out.println(Pattern.matches("[^Tt]om", "Tom")); // True

		System.out.println("Returns true if the string matches exactly \"tim\" or \"Tim\" or \"jin\" or \"Jin\"");

		System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim"));// True
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin"));// True

		System.out.println("returns true if the string contains \"abc\" at any place");

		System.out.println(Pattern.matches(".*abc.*", "deabcpq"));// True

		System.out.println("Returns true if the input is in the given range.");

		System.out.println(Pattern.matches("[a-d]", "c")); // true
		System.out.println(Pattern.matches("[a-d]", "r")); // false
		System.out.println(Pattern.matches("[^a-d]", "c")); // false
		System.out.println(Pattern.matches("[^a-d]", "r")); // true
		System.out.println(Pattern.matches("[1-5]", "6")); // false
		System.out.println(Pattern.matches("foo[1-5]", "foo2")); // true
		System.out.println(Pattern.matches("foo[^1-5]", "foo6")); // true

		System.out.println("Union of characters given.i.e., it returns true if it is in the total set.");

		System.out.println(Pattern.matches("[a-d[e-h]]", "c"));// true
		System.out.println(Pattern.matches("[a-d[e-h]]", "r"));// false

		System.out.println("Intersection of characters given.i.e., it returns true if it is common.");

		System.out.println(Pattern.matches("[2-5&&[3-5]]", "3"));// true
		System.out.println(Pattern.matches("[2-9&&[3-9]]", "1"));// false

		System.out.println("Subtraction of characters given.");

		System.out.println(Pattern.matches("[a-d&&[^e-h]]", "f"));// false
		System.out.println(Pattern.matches("[a-d&&[^d-f]]", "c"));// true

		System.out.println("returns true if the string does not have a number at the beginning");

		System.out.println(Pattern.matches("^[^\\d].*", "123abc")); // False
		System.out.println(Pattern.matches("^[^\\d].*", "abc123")); // True

		System.out.println("returns true if the string have any character.");

		System.out.println(Pattern.matches(".", "@")); // true
		System.out.println(Pattern.matches(".", "1")); // True
		System.out.println(Pattern.matches(".", "a")); // true

		System.out.println("returns true if the string have number between 0 and 9.");

		System.out.println(Pattern.matches("\\d", "1")); // True
		System.out.println(Pattern.matches("\\d", "a")); // True

		System.out.println("returns true if the string have alphbetical character.");

		System.out.println(Pattern.matches("\\D", "1")); // False
		System.out.println(Pattern.matches("\\D", "a")); // True
		System.out.println(Pattern.matches("\\D", "A")); // True

		System.out.println("returns true if we give space character.");

		System.out.println(Pattern.matches("\\s", " ")); // True
		System.out.println(Pattern.matches("\\s", "")); // False
		System.out.println(Pattern.matches("\\s", "A")); // False

		System.out.println("returns true if we give non space character.");

		System.out.println(Pattern.matches("\\S", "A")); // True
		System.out.println(Pattern.matches("\\S", "@")); // True
		System.out.println(Pattern.matches("\\S", " ")); // False

		System.out.println("returns true if we give word(a-z/A-Z/0-9) character.");

		System.out.println(Pattern.matches("\\w", "A")); // True
		System.out.println(Pattern.matches("\\w", "1")); // False
		System.out.println(Pattern.matches("\\w", "!")); // False

		System.out.println("returns true if we give non word character.");

		System.out.println(Pattern.matches("\\W", "A")); // False
		System.out.println(Pattern.matches("\\W", "@")); // True
		System.out.println(Pattern.matches("\\W", "a")); // False

		System.out.println("Quantifiers.");

		System.out.println(Pattern.matches("a{2}", "aa")); // TRUE
		System.out.println(Pattern.matches("a{3}", "aa")); // False

		System.out.println(Pattern.matches("(abc){1}", "abc"));
		System.out.println(Pattern.matches("abc{3}", "abcabc"));
		System.out.println("returns true if the string contains of three letters");
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));// False

		System.out.println("returns true if the string contains 0 or more non-digits");
		System.out.println(Pattern.matches("\\D*", "abcde0")); // True
		System.out.println(Pattern.matches("\\D*", "abcde123")); // False

		System.out.println("Boundary Matchers example ^ denotes start of the line $ denotes end of the line");
		System.out.println(Pattern.matches("^This$", "This is Chaitanya")); // False
		System.out.println(Pattern.matches("\\s*This$", "    This")); // True
		System.out.println(Pattern.matches("\\bdog\b", "The dog plays in the yard.")); // TRUE
	}
}