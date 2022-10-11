package com.cognixia.jump.codingproblems;

public class Swap {

	public static void main(String[] args) {
		
		int x = -1, y = 3;
		System.out.println(x + "\s" + y);
		
//		if (x<y) {x+=Math.abs(x-y); y-=Math.abs(x-y);}
//		else {x-=Math.abs(x-y); y+=Math.abs(x-y);}
//		
//		System.out.println(x + "\s" + y);
		System.out.println(Swap(x,y) + "\s" + Swap(y,x));

	}

	private static int Swap(int x, int y) {
		if (x<y) x+=Math.abs(x-y); 
		else x-=Math.abs(x-y);
		return x;
	}

}
