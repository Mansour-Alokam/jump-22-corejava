package com.cognixia.jump.classandobjects;

// This class is intended to uncover some of the unusual behaviors of the String class
// and String objects, compared to primitives and other Class objects.
// Because of some of the general rules of Class / Objects are seemingly broken by String in Java.
public class StringDemoDriver {

	public static void main(String[] args) {
		
		String str1 = "This is a Test";
		
		System.out.println(str1);
		System.out.println(challenge1(str1)+"  -->First  challenge*");
		System.out.println(challenge2(str1)+"  -->Second challenge*");
		System.out.println(challenge3(str1)+"  -->bounus challenge*");

	}
	
	// method to reverse the entire string using StringBuilder
	public static StringBuilder challenge1(String str) {
		
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1.reverse();
            		
		return str1;
	}

	// method to reverse the entire string using own method
	public static String challenge2(String str) {
		String fin = "";
		for (int i=0; i<str.length(); i++) {
			fin = str.charAt(i)+fin;
		}
		return fin;
	}
	
	// method to reverse the entire string word by word
	
	// method to reverse the string word for word
	public static String challenge3(String str) {
		char ch;
		String mid = "";
		String fin = "";
		for (int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if (i==str.length()-1) {
				fin = fin+ch+mid;
				mid = "";
			}
			else if (ch == ' ') {
				fin = fin+mid+" ";
				mid = "";
			}
			else mid = ch+mid;
		}
		return fin;
	}

}
