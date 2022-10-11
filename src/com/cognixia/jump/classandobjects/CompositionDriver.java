package com.cognixia.jump.classandobjects;

public class CompositionDriver {

	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Vehicle();
		Engine engine1 = new Engine();
		Engine engine2 = new Engine();

		// This is not standard or good practice
		// car1.classType("C");
		
		// do this instead
		engine1.setAlignment("straight"); engine1.setNumCylinders(6); engine1.setSize(2.6); engine1.setManufacturor("Honda");
		engine2.setAlignment("inline"); engine2.setNumCylinders(4);	engine2.setSize(2.0); //engine2.setManufacturor("Toyota");
		car1.setClassType("Sedan");	car1.setEngine(engine1);
		car2.setClassType("Coupe");	car2.setEngine(engine2);

		
//		System.out.println("This car is a " + car1.getClassType());
		
		System.out.println(car1);	
		System.out.println(car2);
//		System.out.println(engine1);
//		System.out.println(engine2);

	}

}
