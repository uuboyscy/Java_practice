/*
 * 3.	��ƪ��m��-IsPrime
�g�@���boolean isPrime (int n)�ΨӧP�_n�O�_����ơC
*/

import java.util.Scanner;

public class IsPrime {

	static boolean isPrime(int x) { // check if it is a prime number
		if(x == 2) {
			return true;
		}else {
			for(int i = 2 ; i <= (x/2) ; i++) {
				if(x%i == 0)return false;
			}
		return true;
		} //else

	} // end of method
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int p = scanner.nextInt();
		
		boolean check = isPrime(p);
		
		System.out.println(p + " is a prime number?\n" + check);

		scanner.close();
		
	}

}
