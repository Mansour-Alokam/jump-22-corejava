package com.cognixia.jump.collectionsgenerics;

public class Calculator {
	
//	public static Double sum(Double input1, Double input2) {
//		return input1 + input2;
//	}
//	
//	public static Integer sum(Integer input1, Integer input2) {
//		return input1 + input2;
//	}
	
//	public static <N extends Number> Double sum(N input1, N input2) {
//		
//		return input1.doubleValue() + input2.doubleValue();
//	}
	
	//varArgs, variable amount of arguments
	public static <N extends Number> Double sum(N...inputs) {
		double sum = 0;
		for (N num : inputs)
		{
			sum += num.doubleValue();
		}
		return sum;
	}

}
