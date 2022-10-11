package com.cognixia.jump.classandobjects;

import java.io.Serializable;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class Animal implements Serializable{
	
//	private static final long serialVersion();
	// A basic class is known in Java as a POJO
	// Plain Old Java Object, or also a 
	// Bean (Java Bean).
	
	//Attributes
	// The absence of a modifier, makes a field/method/constructor DEFAULT access.
	private String type;
	private double weight;
	public static int  count = 0;
	
	//Constructors
	public Animal(){
		this.type = "N/A";
		this.weight = 0.0;
		count++;
	}
	
	public Animal(String type, double weight){
		this.type = type;
		this.weight = weight;
		count++;
	}
	// Methods syntax is (method signature):
	// access modifier, return type, name of the method, parameter set()
	public final void makeSound(String sound) {
		System.out.println("Animal makes " + sound);
		
	}
	
	public void move() {
		System.out.println("The animal moves.");
	}

//	public String type() {
//		return type;
//	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + "]";
	}

	public String getType() {
		return type;
	}
	
	public void setType(String string) {
		this.type = string;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
//		return Objects.equals(type, other.type)
//				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
		
}

//Animal rAnimal = Animal.forName("Animal");
//Field fieldList[] = rAnimal.getDeclareFields();
//
//for (int idx=0; idx<fieldList.length; idx++) {
//	Field f = fieldList[idx];
//	System.out.println("Declared Field Name: " + f.getName());
//	
//	int fieldMods = f.getModifiers();
//	System.out.println("Access Modifiers = " + Modifier.toString(fieldMods));
//
//}


