/*
 * 8.	ㄧ计絤策-Convert
糶ㄢㄧ计だtoBinary(int n)㎝toHexidecimal(int n)ノㄓ盢n锣传Θ秈㎝せ秈
*/

import java.util.Scanner;

public class Convert {
	
	static int[] toBinary(int n) {
		int cel = n;
		int binSite = 0;
		while(cel >= 2) {
			cel /= 2;
			binSite++;
		}
		cel = n;
		int[] bin = new int[binSite+1];
		for(int i = (bin.length-1) ; i > 0  ; i--) {
			bin[i] = cel%2;
			cel /= 2;
		}
		bin[0] = cel;
		return bin;
	} // toBinary
	
	
	static int[] toHexidecimal(int n) {
		int cel = n;
		int hexSite = 0;
		while(cel >= 16) {
			cel /= 16;
			hexSite++;
		}
		cel = n;
		int[] hex = new int[hexSite+1];
		for(int i = (hex.length-1) ; i > 0  ; i--) {
			hex[i] = cel%16;
			cel /= 16;
		}
		hex[0] = cel;
		return hex;
	} // toHexidecimal

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number that you want to convert to Binary and Hexidecimal.");
		int numNeedConvert = scanner.nextInt();
		
		int[] bin = toBinary(numNeedConvert);
		int[] hex = toHexidecimal(numNeedConvert);
		
		System.out.print(numNeedConvert + " convert to Binary and Hexidecimal is \nBinary : ");
		for(int i = 0 ; i < bin.length ; i++)System.out.printf("%d",bin[i]);
		System.out.print("\nHexidecimal : ");
		for(int j = 0 ; j < hex.length ; j++) {
			if(hex[j] < 10) {
				System.out.printf("%d",hex[j]);
			}else {
				System.out.printf("%c",(hex[j]+55));
			}
		}
		
		
		
		scanner.close();

	}

}
