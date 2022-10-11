package com.cognixia.jump.classandobjects;

import java.time.LocalTime;

public interface BallPlayer extends GamePlayer {
	
	// Java 8 allows static and default (not access modifier) modifier
	static void showClock() {
		System.out.println(LocalTime.now());
	}
	
	default boolean gameInPlay() {
		return true;
	}
	
	// abstract, traditional interface methods
	int[] move();
	boolean shoot();
	boolean pass();
	boolean catchBall();	

}
