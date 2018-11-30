/*
 * 9.	患癹ㄧ计絤策-RConvert
盢瓃ㄢㄧ计эΘ患癹ㄧ计
*/

import java.util.Scanner;

public class RecursiveConvert {
	
	static String toBinary(int n) {
		
		String result = "";				
		if(n/2 >= 2) {
			result += toBinary(n/2);
		}else {
			result += n/2;
		}
		
		result += n%2;
		
		return result;
	}
	
	static String toHexidecimal(int n) {
		String result = "";
		
		if(n/16 >= 16) {
			result += toHexidecimal(n/16);
		}else {
			result += n/16;
		}
		
		if(n%16 < 10) {
			result += n%16;
		}else {
			result += (char)(n%16 + 55);
		}
		
		return result;
	}
	
	static String reverse(String str) {
		String[] newstr = str.split(""); 
		String str2 = "";
		for(int i = newstr.length-1 ; i >= 0 ; i--) str2 += newstr[i];
		return str2;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number that you want to convert to Binary and Hexidecimal.");
		int numNeedConvert = scanner.nextInt();
		
		//System.out.print(reverse(toBinary(numNeedConvert)));
		System.out.print(numNeedConvert + " convert to Binary and Hexidecimal is \nBinary : ");
		System.out.print(toBinary(numNeedConvert));		
		System.out.print("\nHexidecimal : ");
		System.out.print(toHexidecimal(numNeedConvert));
		
		scanner.close();
		
	}

}
