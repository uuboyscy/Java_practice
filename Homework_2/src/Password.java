/*
 * 8.	迴圏的練習-Password
出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
若輸入不正確，再次出現”請輸入密碼”的提示。
若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。
*/

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		final int PASSWORD = 1; 
		final int INPUT_COUNT = 3;		
		
		System.out.println("Enter your password.");
		int input = scanner.nextInt();
		int inputCount = 1; // count the time of input
		
	
		do {
			if(input == PASSWORD) { // correct
				System.out.println("Correct password!\nWelcome to the system.");
			}else { // if wrong password
				System.out.println("Enter your password.");
				input = scanner.nextInt();
				inputCount++;
			} // else
			
			//input = scanner.nextInt();
			if(input == PASSWORD) { // correct
				System.out.println("Correct password!\nWelcome to the system.");
			}
			
			if(inputCount == 3 && input != PASSWORD)break;
		}while(inputCount <= INPUT_COUNT && input != PASSWORD);
		
		scanner.close();

	}

}
