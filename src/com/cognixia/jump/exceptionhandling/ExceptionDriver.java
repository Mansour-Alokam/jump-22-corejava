package com.cognixia.jump.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// This class serves to run example of try/catch, finally, try w/resources, propagation
// throws, throw, and custom exceptions
public class ExceptionDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int inNum = 0;
		boolean invalidInput = true;
		String sentence = "";
		double inDouble = 0;

		tryMultipleCatches(input, inNum, invalidInput);
						
		tryWithResource(input, sentence);
		
		tryWithFinally(input, inDouble);
			
		
	}

	private static void tryMultipleCatches(Scanner input, int inNum, boolean invalidInput) {
		//try catch
		while (invalidInput) {
			try {
				System.out.println("Input an integer:");
				inNum = input.nextInt();

				int ans = 10 / inNum;
				
				System.out.println(ans);
				invalidInput = false;

			} catch (InputMismatchException e) {
				System.out.println("please enter an integer");
				input.next();
				//			e.printStackTrace();
			} catch (ArithmeticException e) { // empty catch block is BAD PRACTICE!
				System.out.println("Your input of " + inNum + " cased a " + e.getMessage() + " exception.");
				input.next();

				//			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
				input.next();
			} 
		} 
		input.close();
		System.out.println("Outside try/catch, your input was " + inNum);
	}

	private static void tryWithResource(Scanner input, String sentence) {
		// try with resource
		try (Scanner sc2 = input;){
			System.out.println("Enter a sentence: ");
			sentence = sc2.nextLine();
			System.out.println(sentence);
		} catch (Exception e) {
			e.printStackTrace();
		} // no finally needed because of resources
	}
	
	private static void tryWithFinally(Scanner input, double inDouble) {
		Scanner sc3 = input;
		try {
			System.out.println("Enter a sentence: ");
			inDouble = sc3.nextDouble();
			System.out.println("Finally example: " + inDouble);
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			sc3.close();
		}
	}
	
	public class AgeException extends Exception{
		private final static int min = 21;
		private static int age;
		
		public AgeException(int ages) {
			super("This person must be at least" + (min-ages) + "years older.");
			age = ages;
		}
	}
	
//	public int myIn() throws InputMismatchException {
//	Scanner scan = new Scanner(System.in);
//	int val = scan.nextInt();
//	scan.close();
//	return val;
//}
	
	// Throw Exception
//	Scanner scan = new Scanner(System.in);
//	int num, ans = 0;
//	try {
//		num = scan.nextInt();
//		ans = 10 / num;
//	} catch (InputMismatchException e) {
//		System.out.println("Not an int");
//	}catch (ArithmeticException e) {
//		System.out.println("Divide by Zero");
//	} finally {
//		scan.close();
//	}
//	try {
//		if (person.getAge() < 21) {
//			throw new Exception("Under 21");
//		}
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//	}

}
