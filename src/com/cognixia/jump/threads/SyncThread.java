package com.cognixia.jump.threads;

public class SyncThread extends Thread {
	
	private static int counter = 0;
	
	public static synchronized void increment() {
		counter++;
	}
	
	public static synchronized void incrementAndPrint() {
		counter++;
		System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
	}
	
	public static void staticBlockIncrement() {
		System.out.println("---------------");
		
		synchronized(SyncThread.class) {
			counter++;
			System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			//Opt1
//			increment();
			
			//Opt2
//			incrementAndPrint();
			
			//Opt3
			staticBlockIncrement();
//			System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
			
		}
	}
	
}
