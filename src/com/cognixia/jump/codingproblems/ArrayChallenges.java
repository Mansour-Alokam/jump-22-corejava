package com.cognixia.jump.codingproblems;

public class ArrayChallenges {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		int[] array2 = {4,1,2,3,6};
		int[] array3 = new int[100];
		
		for (int i=0; i<100; i++) {
			array3[i] = i+1;
		}
		int start = 1;
		int ind = 34;
		if (start==1) {
			array3[ind-1]=0;
		}
		
		for (int i=0; i<100; i++) {
			System.out.println(array3[i]);
		}
		System.out.println("\s");
		
		if (challenge1(array1,array2) == true) 
			System.out.println("The arrays match");
		else System.out.println("The arrays don't match");
		
		int ans = challenge2(array3);
		if (ans!=0) { 
			System.out.println("\nthe missing number is "+ans);
		}else {
			System.out.println("\nno missing numbes");
		}
}
	
	//method with solution
	static boolean challenge1(int[] array1, int[] array2) {
		int count = 0; 
		int length = 0;
		//have 2 arrays to compare
		if (array1.length==array2.length) length = array1.length;
		else return false;
				
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if (array1[i] == array2[j]) {
					count++;
					break;
				}
			}
		}
		if (count==length) return true;
		else return false;
	}

	
	static int challenge2(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[0]!=1) {
				return 1;
			}
			else if ((array[i] - array[i-1])!=1) {
				return i+1;
			}
		}
		return 0;
	}

}
