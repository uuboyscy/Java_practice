/*
 * 1.	綜合的練習-CheckID
寫一函數boolean isID (String id)用來判斷id是否為正確身份証字號。
 */

import java.util.*;
public class CheckID {
	
	static boolean isID(String id) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean bool = true;
		
		String[] idAry = null; // ??
		int ftnb; // first two number of id , operated
		int checkSum;
		
		// Split id in a array , [0] is alph
		idAry = id.split(""); 
		AlphInfo alphInfo = new AlphInfo();
		ftnb = alphInfo.alphNum(idAry[0]); // get the operated value of the alph
		
		// operator
		checkSum = ftnb;
		for(int i = 1 ; i < 10 ; i++) checkSum += (Integer.parseInt(idAry[i])) * alphInfo.r[i-1];
		if(checkSum%10 == 0) bool = true;
		else bool = false;
		
		scanner.close();
		
		return bool;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String id; // ID num
		
		//input ID
		System.out.println("Input your ID.");
		id = scanner.next();
		//check length , first is alph , second 1 or 2
		while(id.length() != 10 || (id.charAt(0) < 65 || id.charAt(0) > 90) || (id.charAt(1) != 49 && (id.charAt(1) != 50)) ) {
			if(id.length() != 10)System.out.println("Length error, must be 10 elements.");
			if((id.charAt(0) < 65 || id.charAt(0) > 90))System.out.println("Alph error, must be A to Z.");
			if((id.charAt(1) != 49 && (id.charAt(1) != 50)))System.out.println("gender error, the second element must be 1 or 2.");
			System.out.println("\nInput correct ID.");
			id = scanner.next();
		}
	
		if(isID(id) == true) System.out.println("Correct ID.");
		else System.out.println("Wrong ID.");		

		scanner.close();
		
	}

}
