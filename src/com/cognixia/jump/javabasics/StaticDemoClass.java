package com.cognixia.jump.javabasics;

// This class will be used to show case static and instance features of a class, to then be loaded
// in the StaticDriver and we can see priority in terms of memory ordering and execution.
public class StaticDemoClass {
	
	// Constructor - Instance Level
	public StaticDemoClass() {
		System.out.println("This is the constructor.");
	}
	
	// Anonymous Code Block - ??
	{
		System.out.println("This is the anonymous code block.");
	}
	
	{
		System.out.println("Anonymous 2.");
	}
	
	// Static Code Block - ??
	{
		System.out.println("This is the static code block.");
	}
	
	// Static Method - Class Level
	public static void staticMethod() {
		System.out.println("This is the static method.");
	}
	
	// Instance Method - Class Level
	public void instanceMethod() {
		System.out.println("This is the instance method.");
	}

}
