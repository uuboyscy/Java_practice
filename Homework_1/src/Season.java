/*
2.��ܩʱԭz���m��-Season
��J���1~12��A�Q��switch�P�_�۹������u�`�K�B�L�B��B�V�æL�X�C�Y���b���d��h�L�X����J���~���C

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
