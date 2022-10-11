package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class JavaBasics {
	
	// Java starts here
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		// Java Primitive Variables\
		// When you make a variable, you declare (set's scope) and initialize, either at same time,
		// or you can break these steps up.
		
		// Syntax follows: data type, variable name = value;
		// Numerics:
		short s =1;
		final byte b;	// declaring
		b = 0; // initializing
		int i =5;
		long l = 1000;
		float f = 5.0f;
		double d = 5.9;
		int n = (int) d;
		// Text
		char c = 'c';
		
		// Logical
		boolean bool = true;
		
		System.out.println(d);
		
//		b = 10;
		
		System.out.println(n);
		
		//Logical or
		if(bool == true || b == 1) {
			System.out.println("Condition 1 met.");
		}else {System.out.println("Condition 1 not met.");}
		
		// Logical and
		if(bool == true && b == 0) {
			System.out.println("Condition 2 met.");
		}else {System.out.println("Condition 2 not met.");}
		
		// ! Negates / Opposite Logic
		if(bool != true && b == 0) {
			System.out.println("Condition 3 met.");
		}else {System.out.println("Condition 3 not met.");}
		
		// Same as above
		if(!bool && b == 0) {
			System.out.println("Condition 4 met.");
		}else {System.out.println("Condition 4 not met.");}

		System.out.println("Enter a sentence to be returned back:");
		int i1 = scan.nextInt();
		double d1 = scan.nextDouble();
		String s1 = scan2.nextLine();
		char[] c1 = s1.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char cc : c1) {
			if (Character.isDigit(cc))
				sb.append(cc);
		}
		System.out.print("String: ");
		for(char cc : c1) {
            System.out.print(cc);
        }
		System.out.println("\nDouble: "+d1);
		System.out.println("Int: "+i1);
	}

}
