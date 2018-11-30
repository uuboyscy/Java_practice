/*
 * 7.	迴圏的練習-Rabbit
老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
*/

public class Rabbit {

	public static void main(String[] args) {
	
		int rabbits = 1;
		int checkValue = 0;
		
		while(checkValue != 1) {
			if((rabbits%3 == 1) && (rabbits%5 == 1) && (rabbits%7 == 2)) {
				System.out.println("There are " + rabbits + " rabbits.");
				checkValue = 1;
			} // if
		rabbits++;
		} // while

	} // end of main

} // end of class
