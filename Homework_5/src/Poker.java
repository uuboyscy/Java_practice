/*
 * 2.	��X�m��-Poker
�o���J�P(52�i)�A�����|�զC�L�X�ӡC
���ܡG�ϥ�Math.Random() -- ���ͤj��0.0�p��1.0���B�I��
(int)(Math.Random() * 52) -- �|����0��51����
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
