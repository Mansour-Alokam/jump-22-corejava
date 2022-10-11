package com.cognixia.jump.codingproblems;

public class StringChallenge {
	
	private String s;
	public StringChallenge() {
		this.s = "default";
	}
	
	public StringChallenge(String s) {
		this.s = s;
	}
	
	public String method1() {
		String reverse = new StringBuilder(s).reverse().toString();
		return reverse;
	}
	
	public String method2() {
		char[] schar = s.toCharArray();
		double middle = Math.floor(schar.length / 2);
		int mid = (int)middle;
		for (int i = 0; i < mid; i++) {
			char temp = schar[i];
			schar[i] = schar[(schar.length-1)-i];
			schar[(schar.length-1)-i] = temp;
		}
		String reverse = String.valueOf(schar);
		return reverse;
	}
	
	public String bonus() {;
        String[] splitString = s.split(" ");
        int counter = 0;
        for (String a : splitString) {
        	char[] schar = a.toCharArray();
    		double middle = Math.floor(schar.length / 2);
    		int mid = (int)middle;
    		for (int i = 0; i < mid; i++) {
    			char temp = schar[i];
    			schar[i] = schar[(schar.length-1)-i];
    			schar[(schar.length-1)-i] = temp;
    		}
    		a = String.valueOf(schar);
    		splitString[counter] = a;
    		counter++;
        }
        String reverse = String.join(" ", splitString);
        return reverse;
	}
}