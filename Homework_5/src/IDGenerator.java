/*
 * 3.	綜合的練習-IDGenerator
輸入地區和性別，經由亂數產生一個身份証字號。
*/

import java.util.*;
public class IDGenerator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AlphInfo alphInfo = new AlphInfo();
		int r; // for selection of region
		int g; // for selection of gender
		int checkSum; // check the correction
		String[] id = new String[10];
		
		//define the alph
		String[][] region = alphInfo.alph; // list all region
		for(int i = 0 ; i < region.length ; i++) System.out.print(((i+1)<10 ? " " : "") + (i+1) + "." + region[i][2] + ((i+1)%8==0 ? "\n" : "   "));		
		System.out.println("\nSelect a region.");
		r = scanner.nextInt();
		while(r < 1 | r > 26) {
			System.out.println("Please enter 1~26.");
			r = scanner.nextInt();
		}
		id[0] = alphInfo.alph[r-1][0];
		
		//define the second number
		System.out.println("\nSelect a gender.\n1.Male   2.Female");
		g = scanner.nextInt();
		while(g < 1 | g > 2) {
			System.out.println("Please enter 1 or 2.");
			g = scanner.nextInt();
		}
		id[1] = ""+g;
		
		//randomly generate the intirior 7 number
		for(int i = 0 ; i < 7 ; i++) id[i+2] = "" + ((int)(Math.random()*10));
		checkSum = Integer.parseInt(alphInfo.alph[r-1][1]);
		for(int i = 0 ; i < 8 ; i++) checkSum += alphInfo.r[i] * Integer.parseInt(id[i+1]);
		for(int i = 0 ; i < 9 ; i++) {
			id[9] = ""+i;
			if((checkSum + Integer.parseInt(id[9])*alphInfo.r[8])%10 == 0) break;						
			}
		
		System.out.println();
		for(int i = 0 ; i < 10 ; i++)
			System.out.print(id[i]);
			
			scanner.close();
				
		} // main				
		
	} // class


