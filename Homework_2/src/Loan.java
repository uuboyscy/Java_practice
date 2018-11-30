/*
 * 12.	�j��ԭz���m��-Loan
������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C�Y�Ȧ檺�~�Q�v��20%�A��Q��Q�v��10%�M�a�U������Q�v��1%�C�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C
*/

import java.util.Scanner;
public class Loan {
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		
 		final int P = 100000;
 		double r_bank = 0.2; // per year
 		double r_pawn_shop = 0.1; // per month
 		double r_under_bank = 0.01; //per day
 		
        System.out.println("Enter the month number you want to know, after one year.");
 		int n = scanner.nextInt() + 12; // month
 		
 		double final_r_bank = 1 + r_bank * (n/12);
 		double final_r_pawn_shop = 1 + r_pawn_shop * n;
 		double final_r_under_bank = 1 + r_under_bank * n * 30;
 		
 		System.out.println("A year later\nQianBuJing should return :");
 		System.out.printf("$ %f to bank.\n",P*final_r_bank);
 		System.out.printf("$ %f to pawn shop.\n",P*final_r_pawn_shop);
 		System.out.printf("$ %f to underground bank.\n",P*final_r_under_bank);
                
        scanner.close();
 	} // end of main
} // end of class