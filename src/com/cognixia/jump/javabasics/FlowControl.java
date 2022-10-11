package com.cognixia.jump.javabasics;

import java.util.Scanner;

// This class will demonstrate Flow Control using:
// Conditionals - if and Switch
// Loops - for, Whole, doWhile
public class FlowControl {

	public static void main(String[] args) {
		// Set up user input, for variable evaluation:
		Scanner input = new Scanner(System.in);

		// prompt input
		System.out.println("Please enter an integer: ");
		
		// collect input
		int readInt = input.nextInt();		
		
		// Conditionals:
			// If
			// check even number
			// % = Modulus, which gets the remainder from division of the 2 numbers
			if (readInt % 2 == 0) {
				System.out.println("Your input of: >> " + readInt + " << was an even number.");
				if(readInt > 0) System.out.println("And it's positive");
				else System.out.println("And it's negative.");
			}
			else if(readInt == 5) {
				System.out.println("You chose my favorite number!");
			}
			else {
				System.out.println("Your input of: >> " + readInt + " << was an odd number.");
				if(readInt > 0) System.out.println("And it's positive");
				else System.out.println("And it's negative.");
			}
			
			System.out.println("Please enter an integer: ");
			
			// collect input
			int readInt2 = input.nextInt();
			// Switch Case - works for checking if the integer in this case, is equal to below
			// options
			switch (readInt2) {
			case 1: System.out.println("You are withdrawing money.");
					break;
			case 2: System.out.println("You are depositing money.");
					break;
			case 3: System.out.println("Your balance is: " + 1_000_000);
			}
		
			
			// The same above logic, but with is statements:
			
			// prompt input
			System.out.println("Hello welcome to this bank, please select and option:");
			int readInt3 = input.nextInt();		
			
			// if logic:
			if(readInt3 == 1){
				System.out.println("You are withdrawing money.");
			}
			else if(readInt3 == 2) {
				System.out.println("You are depositing money.");
			}
			else if(readInt3 == 3) {
				System.out.println("Your balance is: " + 1_000_000);
			}
			else {
				System.out.println("Please choose from the following options:" + '\r' + 
						"1 withdrawing money" + '\r' + "2 depositing money" + '\r' + 
						"3 account balance");
			}
			
			// Example utility of cascading in Switch (no break);
			char in = 'b';
			switch (in) {
			case 'b': //break;
			case 'B': 
				System.out.println("You chose letter B.");
			break;
				
			}
		
		// Loops:
		// While Loop
		System.out.println("While Loop example:");
		int counter = 0;
		while(counter < 11) {
			System.out.println(counter);
			// this is what the below does: counter = counter + 1;
			if(counter == 7) {
				System.out.println("Special number!");
				counter+=2;	
				//break;
			}
			else counter++;
		}
				
		// do while loop
		System.out.println("\ndo While Loop example:");
		counter = 0;
		do {
			System.out.println("int the do while " + counter);
			counter++;
		} while(counter < 11);
		
		// for loop
		// a local variable that defines a starting point, an ending condition
		// and how we traverse the loop (change the counter).
		System.out.println("\nFor Loop example:");
		for(int i=10; i >= 0; i--) {
			System.out.println(i);			
		}
		
		// Nested Loop
		System.out.println("\nNested For Loop example:");
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4; j++) {
				System.out.println("i is = " + i + "\tj = " + j);			
			}
		}

	}

}
