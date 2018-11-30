package com.iii.cb104.u;

public class NineNine { // class

	public static void main(String[] args) { // main
		
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d*%d=%02d \t", i, j, i*j);
			}
			System.out.print("\n");
		}

	} // end of main

} // end of class
