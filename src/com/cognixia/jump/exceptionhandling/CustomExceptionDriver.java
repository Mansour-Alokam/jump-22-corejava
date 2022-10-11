package com.cognixia.jump.exceptionhandling;

import java.util.Scanner;

public class CustomExceptionDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		try {
			System.out.println("Enter age: ");
			age = input.nextInt();
			if(age < 21) {
				throw new AgeException();
			} else System.out.println("Access Granted.");
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
