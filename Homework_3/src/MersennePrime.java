/*
 * 5.	ㄧ计絤策-MersennePrime
糶ㄧ计boolean mersennePrime (int n)ノㄓ耞n琌Mersenne借计级糶祘Αт玡8Mersenne借计
矗ボ璝借计骸ì2^P-1=n (pタ俱计)玥nMersenne Prime
弧讽p=32^3-1=7珿7Mersenne Prime
*/

import java.util.Scanner;

public class MersennePrime {
	
	static boolean mersennePrime(int n) { // check if it is a mersenne prime number
		int p = 1;
		if(IsPrime.isPrime(n) == false) {
			//System.out.println(1);
			return false;
		}else {
			while((Math.pow(2, p) - 1) <= n) {
				if((Math.pow(2, p) - 1) == n) return true;
				p++;
			} // while
			//System.out.println(2);
			return false;			
		} // else
	} // method

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int cel;
		int n = 2; // m = 2^n-1
		
		System.out.println("The first N mersenne prime number do you want to find?");
		cel = scanner.nextInt();		
		
		while(count < cel) {
			if(mersennePrime((int)(Math.pow(2, n)-1)) == true) {
				count++;
				System.out.printf("%d\t",((int)(Math.pow(2, n)-1)));
			} // if
			n++;
		} // while
		//System.out.println(mersennePrime(8191));
		
		scanner.close();
		
	}

}
