/*
 * 10.	迴圈敘述的練習-NineNine
   印出下列九九乘法表：
*/

import java.util.Scanner;

public class NineNine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the hight you need.");
		int width = scanner.nextInt();
		
		System.out.print("\t|\t");
 		for(int i = 1 ; i <= width ; i++)System.out.printf("%2d\t",i);
 		System.out.print("\n");
 		for(int i = 1 ; i < 9*width+6 ; i++)System.out.print("=");
 		System.out.print("\n\t|\n");
 		
 		for(int i = width ; i >= 1 ; i--) { // for i -> number on the left column
 			System.out.printf("%3d\t|",i);
 			for(int j = 1 ; j <= i ; j++) { // for j -> number on the right table
 				System.out.printf("\t%2d",i*j);
 			} // for j -> number on the right table
 			System.out.print("\n");
 			System.out.print("\t|\n");
 		} // for i -> number on the left column		
		
		scanner.close();
 		
	}

}
