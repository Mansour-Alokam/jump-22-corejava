package com.cognixia.jump.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {

		// This example is for a regex pattern for a Cognixia email
		// Cognixia emails are formatted: [first name].[last name]@cognixia.com 
		
		// regex pattern
		// we use two slashes, because w/o it, the slash will be used as an escape for the double quotes
		// try writing a string like "\", will get an error, need to use "\\"
		//String emailRegex = "[a-zA-Z]+\\.[a-zA-Z]+@cognixia\\.com";
		//String emailRegex = "[A-Z]\\d{4}-[A-Z]+";
		//String emailRegex = "\\w+[^\\w]*";
		String emailRegex = "[a-zA-Z]+";
		
		// regex pattern
		Pattern pattern = Pattern.compile(emailRegex);
		
		// string to be tested against regex
		//String email = "orquidia.moreno@cognixia.com";
		String ex1 = "Hello";
		String ex2 = "HFOWD";
		//String ex3 = "BCD!";
		//String email = "orquidia.moreno@cognixia.com";
		
		// matcher created with pattern and string
		Matcher matcher1 = pattern.matcher(ex1);
		Matcher matcher2 = pattern.matcher(ex2);
		//Matcher matcher3 = pattern.matcher(ex3);


		
		// if-else to check if string matches regex
		if(matcher1.matches()) {
			System.out.println("Example 1 matches");
		}
		else System.out.println("Example 1 doesn't match");
			
		if(matcher2.matches()) {
			System.out.println("Example 2 matches");
		}
		else System.out.println("Example 2 doesn't match");
		
//		if(matcher3.matches() && matcher3.matches()) {
//			System.out.println("Example 3 matches");
//		}
//		else System.out.println("Example 3 doesn't match");
			
		
		// prints the regex pattern used
		System.out.println(matcher1.pattern());
		System.out.println(matcher2.pattern());
		//System.out.println(matcher3.pattern());


	}

}
