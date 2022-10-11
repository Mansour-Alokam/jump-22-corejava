package com.cognixia.jump.streamapi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemoDriver {

	public static void main(String[] args) {
		int[] primitive = {2,4,6,8,10,12,14,16};
		
		// In need to convert the above array of ints to an array of objects
		Integer[] integer = new Integer[primitive.length];
		for (int i = 0; i < primitive.length; i++) {
			integer[i] = primitive[i];
		}
		
		// let's do the above, but with stream:
		Integer[] intObjects = Arrays.stream(primitive)
				.boxed()
				.toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(primitive));
		System.out.println(Arrays.toString(integer));
		System.out.println(Arrays.toString(intObjects));
		
		List<Integer> numbers = Arrays.asList(integer);
		
		System.out.println("\nFor each example:");
		numbers.forEach(System.out::println);
		
		numbers.forEach(n -> System.out.println(n + " custom message!"));
		
		//use reduce to get the sum 
		int sum = numbers.stream()
				.reduce(0, (num1, num2) -> num1 + num2);
		
		System.out.println(sum);
		
		// use reduce for logical, binary choices, get max value
		int max = numbers.stream()
				.reduce((num1, num2) -> num1 > num2? num1 : num2) // ternary evaluation, which is not specific 
				.get();
		System.out.println(max);
		
		//Let's stream some custom objects
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Patterson", 110_000, "Production"));
		employees.add(new Employee("Mandeep", 200_000, "Director"));
		employees.add(new Employee("Xavier", 150_000, "Script Writing"));
		employees.add(new Employee("Matthew", 0, "IT"));
		employees.add(new Employee("Arun", Integer.MAX_VALUE, "Secret"));
		
		// return the employee with the lowest salary
		Employee lowest = employees.stream()
				.reduce((e1,e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)
				.get();
		Employee highest = employees.stream()
				.reduce((e1,e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2)
				.get();
		
		System.out.println("Employee with lowest salary " + lowest);
		System.out.println("Employee with highest salary " + highest);
		
		//find the max?
		String searchValue = "mandeep";
		Optional<Employee> search = employees.stream()
				.filter(e -> e.getName().equalsIgnoreCase(searchValue))
				.findFirst();
		
		if (search.isPresent())
			System.out.println(search.get());
		else System.out.println(searchValue + " not found.");
		
		//.map applies a custom function to all entries in the stream
		List<Integer> employeesAfterRaise = employees.stream()
				.map(e -> e.getSalary() *2 )
				.collect(Collectors.toList());
		
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		
		System.out.println("\nMap result:");
		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i));
	}

}
