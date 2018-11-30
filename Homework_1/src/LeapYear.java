/*
4.選擇性敘述的練習-LeapYear
輸入一西元年，如2015。判斷此年份是否為閏年。
提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏。
*/

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year.");
		int y = scanner.nextInt();
		
		if(y%4 == 0) {
			if(y%4000 == 0) {
				System.out.println("It is not leap year.");
			}else if(y%400 == 0) {
				System.out.println("It is leap year.");
			}else if(y%100 == 0) {
				System.out.println("It is not leap year.");
			}else {
				System.out.println("It is leap year.");
			}	
		}else {
			System.out.println("It is not leap year.");
		}
		
		scanner.close();
		
	} // main
	
} // class
