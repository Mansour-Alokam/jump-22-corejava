package com.cognixia.jump.enums;

public class Element extends StudentString{

	public static final Element Argon = null;
	public static final String atomicNumber = null;
	public String symbol;

	public Element(String name, String gradeLevel) {
		super(name, gradeLevel);
		
	}

	public void describe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Element [symbol=" + symbol + ", getName()=" + getName() + ", getGradeLevel()=" + getGradeLevel()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
