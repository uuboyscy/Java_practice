package com.iii.cb104.u;

import java.util.Scanner;

public class LoopPractice {
	
	static void star(int x) {
		for(int i = 1 ; i <= x ; i++) {
			System.out.print("*");
		} //for i
	} //method star
	
	static void space(int x) {
		for(int i = 1 ; i <= x ; i++) {
			System.out.print(" ");
		} //for i
	} //method space
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = 10;// n star
		
		System.out.println("Enter a number.");
		n = scan.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			space(-i+n);
			star(2*i-1);
			
			System.out.print("\n");
			
		} //for i , outside layer
		
		if(n >= 5) {
			for(int i = 1 ; i <= (n-4) ; i++) {
				space(n-1);
				System.out.println("|");
			} //for i
		}else {
			space(n-1);
			System.out.println("|");
		} //if-else
		
		scan.close();
		
	} //main

} //class
