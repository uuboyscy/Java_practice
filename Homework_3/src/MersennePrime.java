/*
 * 5.	��ƪ��m��-MersennePrime
�g�@���boolean mersennePrime (int n)�ΨӧP�_n�O�_��Mersenne��ơC���g�@�{����X�e8��Mersenne��ơC
���ܡG�Y��ƺ���2^P-1=n (p�������)�A�hn��Mersenne Prime�C
�����G��p=3�ɡA2^3-1=7�A�G7��Mersenne Prime�C
*/

import java.util.Scanner;

public class MersennePrime {
	
	static boolean mersennePrime(int n) { // check if it is a mersenne prime number
		int p = 1;
		if(IsPrime.isPrime(n) == false) {
			//System.out.println(1);
			return false;
		}else {
			while((Math.pow(2, p) - 1) <= n) {
				if((Math.pow(2, p) - 1) == n) return true;
				p++;
			} // while
			//System.out.println(2);
			return false;			
		} // else
	} // method

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int cel;
		int n = 2; // m = 2^n-1
		
		System.out.println("The first N mersenne prime number do you want to find?");
		cel = scanner.nextInt();		
		
		while(count < cel) {
			if(mersennePrime((int)(Math.pow(2, n)-1)) == true) {
				count++;
				System.out.printf("%d\t",((int)(Math.pow(2, n)-1)));
			} // if
			n++;
		} // while
		//System.out.println(mersennePrime(8191));
		
		scanner.close();
		
	}

}
