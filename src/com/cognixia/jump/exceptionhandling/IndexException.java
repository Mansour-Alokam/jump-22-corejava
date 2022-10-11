package com.cognixia.jump.exceptionhandling;

public class IndexException extends Exception {

	private static final int minIndex = 5;
	
	public IndexException() {
		super("index is not in the Student list.");
	}
	
}
