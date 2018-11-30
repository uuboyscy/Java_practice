/*
2.選擇性敘述的練習-Season
輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。

*/

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a month.");
		int mon = scanner.nextInt();
		
		if(mon > 12 || mon < 1) {
			System.out.println("Wrong month number!");
		}
		
		switch(mon) {
		case 3:
		case 4:
		case 5:
			System.out.println("It is Spring.");break;
		case 6:
		case 7:
		case 8:
			System.out.println("It is Summer.");break;
		case 9:
		case 10:
		case 11:
			System.out.println("It is Autumn.");break;
		case 12:
		case 1:
		case 2:
			System.out.println("It is Winter.");break;
		}
		
		
		scanner.close();
		
	} // main
	
} // class
