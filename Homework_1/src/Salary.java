/*
3.選擇性敘述的練習-Salary
輸入便利商店工讀生的工作時數，並計算其薪資。
60小時以內，時薪120元。
61~80小時，以時薪1.25倍計算。
81小時以上，以時薪1.5倍計算。
說明：薪資以累計方式計算。若工時為90小時，則薪資為60*120 + 20*120*1.25 + 10*120*1.5元。
*/

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int wkhour; // work hour
		double salary = 0;
		int HS = 120 ;
		
		System.out.println("Enter your work hour.");
		wkhour = scanner.nextInt();
		
		
		salary = salary + ((wkhour <= 60) ? wkhour : 60) * (HS *1); // <= 60
		wkhour = ((wkhour <= 60) ? 0 : (wkhour - 60)); // 0~60 hr -> domain 60
		
		salary = salary + ((wkhour <= 20) ? wkhour : 20) * (HS *1.25); // 61~80
		wkhour = ((wkhour <= 20) ? 0 : (wkhour - 20)); // 61~80hr -> domain 20
		
		salary = salary + wkhour * (HS *1.5); // >= 81
		
		System.out.println("Your salary : $" + salary);
		
		scanner.close();
		
	} // main
	
} // class
