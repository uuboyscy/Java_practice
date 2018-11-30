/*
 * 7.	遞迴函數的練習-Sum
寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
*/

import java.util.Scanner;

public class Sum {
	
	static int sum(int n) {
		int cel = 2*n;
		if(n > 1) cel += sum(n-1);
		return cel;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculate 2+4+6…+2n\nEnter the n you want.");
		int n = scanner.nextInt();
		
		System.out.println("The answer is " + sum(n));
		
		scanner.close();
		
	}

}
