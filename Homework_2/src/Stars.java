/*
 * 9.	迴圈敘述的練習-Stars
   畫出下列三種排列的星星圖形。
*/

import java.util.Scanner;

public class Stars {
	
	static void stars1(int x) { // left triangle		
		for(int i = 1 ; i <= x ; i++) {
			for(int j = 1 ; j <= i ; j++)System.out.print("*");
		System.out.print("\n");
		} // for i
	} // end of method stars1
	
	static void stars2(int x) { // right triangle
		for(int i = x ; i >= 1 ; i--) {
			for(int j = 1 ; j <= (-i+x) ; j++) {
				System.out.print(" ");
				} // for j
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
				} // for j
		System.out.print("\n");
		} // for i
	} // end of method stars2
	
	static void stars3(int x) { // normal triangle
		for(int i = 1 ; i <= x ; i++) {
			for(int j = 1 ; j <= (-i+x) ; j++) {
				System.out.print(" ");
				} // for j
			for(int j = 1 ; j <= 2*i-1 ; j++) {
				System.out.print("*");
				} // for j
		System.out.print("\n");
		} // for i
	} // end of method stars3

	public static void main(String[] args) { // main
		
		Scanner scanner = new Scanner(System.in);
		
		int st = scanner.nextInt();
		
		System.out.println("Stars 1 :");
		stars1(st);
		System.out.println("\n");
		
		System.out.println("Stars 2 :");
		stars2(st);
		System.out.println("\n");
		
		System.out.println("Stars 3 :");
		stars3(st);
		System.out.println("");
		
		scanner.close();

	} // end of main

}
