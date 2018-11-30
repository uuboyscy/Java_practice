/*
 * 6.	���j��ƪ��m��-Factorial
�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
���ܡGfactorial (n) = n * factorial(n-1)�Afactorial(1)=1
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
