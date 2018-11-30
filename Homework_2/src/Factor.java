/*
 * 2.	迴圏的練習-Factor
輸入一正整數，求其所有的因數。
說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。
*/

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int enter = scanner.nextInt();
		
		for(int i = 1 ; i <= (enter/2) ; i++) {
			if(enter%i == 0) System.out.print(i + ", ");
		}
		
		System.out.print(enter + "\n");
			
		scanner.close();
		
	}

}
