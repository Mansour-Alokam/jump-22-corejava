package com.cognixia.jump.codingproblems;

public class StringDriver {

	public static void main(String[] args) {
		String test = "Testing this code";
		System.out.println(test);
		StringChallenge challenge = new StringChallenge(test);
		
		String result1 = challenge.method1();
		System.out.println(result1);
		
		String result2 = challenge.method2();
		System.out.println(result2);
		
		String bonus = challenge.bonus();
		System.out.println(bonus);
	}

}