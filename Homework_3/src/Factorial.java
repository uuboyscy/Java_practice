/*
 * 6.	遞迴函數的練習-Factorial
寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
提示：factorial (n) = n * factorial(n-1)，factorial(1)=1
*/

import java.util.Scanner;

public class Factorial {
	
	static int factorial (int n) {
		if(n > 1) n *= factorial(n-1);
		return n;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("N! = ?\nEnter the N you want to calculate.");
		int n = scanner.nextInt();
		
		System.out.println(n + "! = " + factorial(n));
		
		scanner.close();

	}

}
