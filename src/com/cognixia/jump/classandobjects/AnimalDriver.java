package com.cognixia.jump.classandobjects;

import com.cognixia.jump.javabasics.Unicorn;

public class AnimalDriver {

	public static void main(String[] args) {

		// data type (class), variable name, instantiation using constructor
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		Animal animal3 = new Animal("alligator", 500.0);
		
		Horse horse1 = new Horse();
		
		Unicorn unicorn1 = new Unicorn();
		
		animal1.makeSound("Meow");
		animal2.makeSound("Woof");
		animal3.makeSound("Groule");

		animal1.setType("Cat");
		animal2.setType("Dog");
		System.out.println(animal1.getType()+'\t'+animal1.getWeight());
		System.out.println(animal2.getType()+'\t'+animal2.getWeight());
		System.out.println(animal3.getType()+'\t'+animal3.getWeight());
		
		horse1.makeSound("Neah");
		
		horse1.setType("horse");
		
		unicorn1.makeSound("Magical!");
		unicorn1.setType("horse");
		unicorn1.setWeight(604.0);
		System.out.println(unicorn1.getType()+'\t'+unicorn1.getWeight());
		
		System.out.println("Animal count is "+Animal.count);
		
		
		
		//9.15.22 Demo		
		Horse horse2 = new Horse();
		
		horse2.makeSound("neigh");
		System.out.println(horse2.makeSound());
		
		horse2.makeSound("whacky", 34);
		
		System.out.println("Animal count is "+Animal.count);

	}

}
