/*
 * 1.	迴圏的練習-Expression
利用for迴圏計算1^2-2^2+3^2-4^2+…+49^2-50^2的值。
*/

import java.util.Scanner;

public class Expression {
	
	static int power(int x, int y) { // method x^y
		int S = x ;
		for(int i = 1 ; i < y ; i++) {
			x *= S ;
		}
		return x;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		int pwr = 2; // power of each number
		System.out.println("Enter a number.");
		int cl = scanner.nextInt(); // 
		
		for(int i = 1 ; i <= cl ; i++) {
			
			result += ((i%2!=0) ? 1 : (-1)) * (power(i, pwr)); 
			
		}
		
		System.out.println(result);
		
		//System.out.print(power(3, 4));
		
		scanner.close();
		
	}

}
