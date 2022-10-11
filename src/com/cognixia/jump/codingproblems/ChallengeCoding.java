//// Main and methods in the same class
//package com.cognixia.jump.codingproblems;
//
//import java.util.HashMap;
//import java.util.InputMismatchException;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ChallengeCoding {
//	
//	public static void main(String[] arge) {
//		Scanner inNum = new Scanner(System.in);
//		String[] name = {"Brad", "Sam", "Jack", "Michel", "Adam"};
//		String str1 = "wow";
//		String str2 = "help";
//		String str3 = "Mom";
//		String str4 = "M";
//		
//		System.out.println("First challenge:"); 
//		System.out.println("Choose from the following options: \n1 = look up students using index \n2 = look up students using name \n3 = add student");
//		int idx = inNum.nextInt();
//		StudentName(name, idx);
//		System.out.println("\nSecond challenge:");
//		swapNum(-2,3);
//		System.out.println("\nThird challenge:");
//		Palindrome(str1);
//		Palindrome(str2);
//		Palindrome(str3);
//		Palindrome(str4);
//	}
//
//	public static void StudentName(String[] name, int idx){
//		Scanner input = new Scanner(System.in);
//		int inNum = 0;
//		boolean invalidInput = true;
//
//		Map<Integer, String> nameStudents = new HashMap<>();
//		for (int i = 0; i < name.length; i++) {
//			nameStudents.put(i+1, name[i]);
//		}
//		System.out.println(nameStudents);
//		optionException(name, idx, input, inNum, invalidInput, nameStudents);
//	}
//
//	private static void optionException(String[] name, int idx, Scanner input, int inNum, boolean invalidInput,
//			Map<Integer, String> nameStudents) {
//		while (invalidInput) {
//			try {
//				if (idx == 1) {
//					tryMultipleCatches(input, inNum, invalidInput, nameStudents);
//					invalidInput = false;
//				} else if (idx == 2) {
//					System.out.println("Enter a name of the student you want to return:");
//					String nam = input.nextLine();
//					System.out.println(nameStudents.keySet());
//					invalidInput = false;
//				} else if (idx == 3) {
//					System.out.println("Enter a name of the student you want to add:");
//					String nam = input.nextLine();
//					nameStudents.put(name.length + 1, nam);
//					System.out.println(nameStudents);
//					invalidInput = false;
//				}
//			} catch (InputMismatchException e) {
//				System.out.println("please enter an integer");
//				input.next();
//			} catch (Exception e) {
//				e.printStackTrace();
//				input.next();
//			}
//		}
//		input.close();
//	}
//	
//	public static void StudentName(String[] name){
//		Scanner input = new Scanner(System.in);
//		int inNum = 0;
//		boolean invalidInput = true;
//
//		Map<Integer, String> nameStudents = new HashMap<>();
//		for (int i = 0; i < name.length; i++) {
//			nameStudents.put(i+1, name[i]);
//		}
//		System.out.println(nameStudents);
//		
//		tryMultipleCatches(input, inNum, invalidInput, nameStudents);
//	}
//	
//	public static void swapNum(int x, int y) {
//		int[] arr = {x,y};
//		System.out.println(x + "\s" + y);
//		System.out.println(Swap(x,y) + "\s" + Swap(y,x));
//
////			arr[0] = arr[0] + arr[1];
////		y = arr[1] = arr[0] - arr[1];
////		x = arr[0] = arr[0] - arr[1];
////		System.out.println(x + "\s" + y);
//
//	}
//
//	public static void Palindrome(String input){
//		String input1 = input.toLowerCase();
//		String reverse = new StringBuilder(input1).reverse().toString();
//		if (reverse.equals(input1)) System.out.println(input + " is a Palindrome.");
//		else System.out.println(input + " is not a Palindrome.");
//		
//	}
//	
//	private static int Swap(int x, int y) {
//		if (x<y) x+=Math.abs(x-y); 
//		else x-=Math.abs(x-y);
//		return x;
//	}
//	
//	private static void tryMultipleCatches(Scanner input, int inNum, boolean invalidInput, Map<Integer, String> name) {
//		while (invalidInput) {
//			try {
//				System.out.println("Enter a index of the student you want to return:");
//				inNum = input.nextInt();
//				if (inNum < 1 || inNum > name.size()) {
//					System.out.println("index is not in the Student list");
//				}
//				else {
//					System.out.println(name.get(inNum) + "\s" + name.get(name.get(inNum)));
//					invalidInput = false;
//				}
//
//			} catch (InputMismatchException e) {
//				System.out.println("please enter an integer");
//				input.next();
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				input.next();
//			}
//		}
//		input.close();
//	}
//
//
//}