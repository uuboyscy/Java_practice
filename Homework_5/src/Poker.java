/*
 * 2.	綜合練習-Poker
發撲克牌(52張)，分為四組列印出來。
提示：使用Math.Random() -- 產生大於0.0小於1.0的浮點數
(int)(Math.Random() * 52) -- 會產生0至51的值
 */
import java.util.*;
public class Poker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String[] poker = new String[52];
		int k = 1;
		for(int i = 0 ; i < poker.length ; i++) {
			poker[i] = (i<13 ? "S" : (i<26 ? "H" : (i<39 ? "D" : "C"))) + k;
			k += k==13 ? -12 : 1;
		}
		
		System.out.println("How many players are there?");
		int pl = scanner.nextInt(); // how many player
		int cd = 52/pl+(52%pl==0 ? 0 : 1);
		String[][] player = new String[pl][cd]; // for player
		pl = 0; cd = 0;
		
		int point; // for random point which card
		//int count = 0; // count how many cards are dealed so far
		
		// shuffl and deal
		for(int i = 0 ; i < poker.length ; i++) {
			point = (int)(Math.random()*(-i+52));
			
			player[pl][cd] = poker[point];
			//count++;
			pl += (pl<(player.length-1) ? 1 : (1-player.length));
			cd += (pl==0 ? 1 : 0);
			
			if(point != -i+51) poker[point] = poker[-i+51];
							
		} // for
		
		for(int i = 0 ; i < player.length ; i++) {
			System.out.println("Player" + (i+1) + " : ");
			for(int j = 0 ; j < player[i].length ; j++) {
				if(player[i][j] != null)System.out.print(player[i][j] + " ");
			} // for j
			System.out.println("\n");
		} // for i
		
		scanner.close();
		
	} // end of main

} // end of class
