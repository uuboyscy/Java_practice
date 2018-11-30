/*
4.��ܩʱԭz���m��-LeapYear
��J�@�褸�~�A�p2015�C�P�_���~���O�_���|�~�C
���ܡG�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�C�|�d�~���|�C
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
