package com.cognixia.jump.javabasics;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.Horse;
import com.cognixia.jump.classandobjects.AnimalDriver;

// This class will demo declaring, instantiating, reading, writing, and looping through arrays
// of both primitive values, and objects. 
public class ArrayDemoDriver {

	public static void main(String[] args) {
		
		// Declare an array
		int[] temperatures;
		int grades[] = {90,85,87,70};
		
		//instantiate
		temperatures = new int[5];
		Animal[] animals = {
				new Animal(), 
				new Animal("horse", 500.0), 
				new Animal("cat", 20.0), 
				new Animal("dog", 30.0)};
		Animal[] altAnimals = new Animal[3];
		
		// read from array
		System.out.println(animals[0]);
		System.out.println(altAnimals[0]);
		
		// WARNING! Out of Bounds
		System.out.println(grades[0]);
		
		grades[0] = 100;
		System.out.println(grades[0]);
		
//		System.out.println(animals[1]);
//		animals[1] = null;
//		System.out.println(animals[1]);
		
		//Iterating through an array
		// using a while loop
		int counter = 0;
		while(counter < grades.length) {
			System.out.println(grades[counter++]);
		}
		// use for loops instead
		for(int i=0;i<grades.length;i++) {
			if(i==0) System.out.println('\s');
			System.out.println(grades[i]);
			if(i==grades.length-1) System.out.println('\s');

		}
		
		//for each loop
		for(int grade : grades) {
			System.out.println(grade);
		}
		
		System.out.println("\nfor each loop");
		for(int i=0;i<animals.length;i++) {
			if(animals[i] != null && animals[i].getType().equals("dog")) {
				animals[i].setType("Bear");
				animals[i] = null;
			}
		}
		
		for(Animal animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nNew example");
		Animal[] creatures = new Animal[4];
		creatures[0] = new Animal();
		creatures[1] = new Horse("Clydesale", 500.0);
		creatures[2] = new Unicorn();
		creatures[3] = new Animal("Dog", 40.0);
		
		for (Animal animal : creatures) {
			System.out.println(animal);
		}
		int count = 0;
		char[][] grid = {
				{'a', 'b','c'},
				{'d','e', 'f'},
				{'g','h','i'}
				};
		
		for(int col = 0; col < grid[0].length; col++) {
			for (int row = 0; row < grid.length; row++) {
				System.out.println(grid[row][col]);
			}
		}
	}

}
