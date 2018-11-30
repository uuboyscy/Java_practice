/*
 * 3.	迴圏的練習-PerfectNumber
一個數字若等於其所有因數的總和，則此數為perfect number。
找出100以內所有的完美數。
說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。
*/

import java.util.Scanner;

public class PerfectNumber {
	
	static int sumOrder(int x) { // 1+2+3+...+x
		return (x+1)*x/2;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Under which number do you want to survey ?");
		int cl = scanner.nextInt(); // described above
		int check = 0; // check if the number is what we want
		int countResult = 0; // count the number of results
		
		for(int i = 1 ; sumOrder(i) <= cl ; i++) {
			
			for(int j = 1 ; j <= (sumOrder(i)/2) ; j++) {	// factor			
				if(sumOrder(i)%j == 0) check += j; // if factor -> run this statement
			}			
			if(check == sumOrder(i)) { // check if the number is perfect number
				System.out.print(check + " ");
				countResult++;
			}
			check = 0; // renew	
		}
		
		System.out.print( (countResult==1 ? "is" : "are"));
		System.out.print(" perfect number");
		System.out.printf((countResult==1 ? "" : "s") + " under %d.",cl);
		
		scanner.close();

	}

}
