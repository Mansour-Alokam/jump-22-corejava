package com.cognixia.jump.classandobjects;

import java.io.Serializable;

public class Horse extends Animal implements Serializable{
	

	// Constructor for horse
	public Horse() {
		super();
	}
	
	public Horse(String type, double weight) {
		super(type, weight);
	}
	
//	public void setType(String string) {
//		this.type = string;
//	}
	
	//method overriding
	// need inheritance, and the exact same method signature from the parent
	// the @override is NOT required for overriding, but is helpful
	// is runtime polymorphism
//	@Override
//	public void makeSound(String sound) {
//		
//		System.out.println("Horse is from Animal.");
//		System.out.println("This horse of type " + super.type + " makes a " + sound + " sound.");	
//	}
	
	//method overloading
	// is simply having a method with the same name, but changing the parameter set,
	// and/or the return type
	// complied time polymorphism
	public void makeSound(String sound, int volume) {
		System.out.println("Horse volume " + volume + "db making a " + sound + " sound.");
	}
	
	// also method overloading
	public String makeSound() {
		return "Horse sound";
	}
}
