/*
 * 1.	蝴皚絤策-MaxMin
ㄆ盢10计竚蝴皚いだт10计い程㎝程
*/

import java.util.Scanner;

public class MaxMin {
	
	static double[] maxMin(double[] list) {
		double temMax, temMin;
		temMax = list[0];
		temMin = list[0];
		for(int i = 0 ; i < list.length ; i++) {
			temMax = temMax > list[i] ? temMax : list[i];
		} // for
		for(int j = 0 ; j < list.length ; j++) {
			temMin = temMin < list[j] ? temMin : list[j];
		} // for
		double[] tem = {temMax, temMin};
		return tem;
	} // max min

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to compare?");
		int n = scanner.nextInt();
		double[] list = new double[n];
		
		System.out.println("Enter those numbers you want to compare.");
		for(int i = 0 ; i < n ; i++) list[i] = scanner.nextDouble();
		
		System.out.printf("Max = %f , Min = %f", (maxMin(list))[0], (maxMin(list))[1]);
		
		scanner.close();
		
	}

}
