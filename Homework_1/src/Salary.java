/*
3.��ܩʱԭz���m��-Salary
��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
60�p�ɥH���A���~120���C
61~80�p�ɡA�H���~1.25���p��C
81�p�ɥH�W�A�H���~1.5���p��C
�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ60*120 + 20*120*1.25 + 10*120*1.5���C
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
