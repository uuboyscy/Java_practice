/*
 * 5.	癹伴絤策-Prime
块タ俱计т┮Τ┪单借计
*/

import java.util.Scanner;

public class Prime {
	
	static int checkPrime(int x) { // check if it is a prime number
		if(x == 2) {
			return 1;
		}else {
			for(int i = 2 ; i <= (x/2) ; i++) {
				if(x%i == 0)return 0;
			}
		return 1;
		} //else

	} // end of method

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Under which number do you want to survey ?");
		int cl = scanner.nextInt();
		int countResult = 0;
		
		for(int i = 2 ; i <= cl ; i++) { // check each number < cl
			if(checkPrime(i) == 1) {
				System.out.printf("%6d",i);
				System.out.print(((countResult+1)%10==0 ? " \n" : " "));
				countResult++;
			}
		}
		
		System.out.print("\n");
		
		if(countResult == 0) {
			System.out.println("No match.");
		}else {
			System.out.print((countResult == 1 ? "is" : "are"));
			System.out.print(" prime number");
			System.out.print((countResult == 1 ? "." : "s."));
		}		
		
		scanner.close();

	}

}
