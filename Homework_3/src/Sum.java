/*
 * 7.	���j��ƪ��m��-Sum
�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
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
		
		System.out.println("Calculate 2+4+6�K+2n\nEnter the n you want.");
		int n = scanner.nextInt();
		
		System.out.println("The answer is " + sum(n));
		
		scanner.close();
		
	}

}
