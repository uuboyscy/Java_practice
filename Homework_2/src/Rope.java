/*
 * 6.	迴圏的練習-Rope
若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。
*/
public class Rope {

	public static void main(String[] args) {
		 
		double ropeLength = 3000;
		int cut = 5;
		int day = 0;
		
		while(ropeLength >= cut) {
			ropeLength /= 2;
			day++;
			System.out.println("Day " + day + " : " + ropeLength + "m");
		}
		
		System.out.println("It needs " + day + " days.");

	}

}
