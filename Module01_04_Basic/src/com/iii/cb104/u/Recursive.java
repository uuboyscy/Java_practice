package com.iii.cb104.u;

public class Recursive {
	
	static void method(int n) {
		System.out.println("level" + n);
		if(n < 4) method(n + 1);
		System.out.println("LEVEL" + n);
	}
	
	static int fa(int x) { // x!
		if(x > 1) x *= fa(x - 1);
		return x;
	}

	public static void main(String[] args) {
		
		method(0) ;
		
		System.out.println(fa(5));
		
	}

}
