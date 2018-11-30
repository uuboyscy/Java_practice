/*
1.選擇性敘述的練習-Electricity
輸入何種用電和度數，計算出需繳之電費。
電力公司使用累計方式來計算電費，分工業用電及家庭用電。
                                               家庭用電        			工業用電
240度(含)以下		0.15元			0.45元
240~540(含)度   		0.25元			0.45元
540度以上        		0.45元			0.45元
*/

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter electricity type.");
		
		System.out.println("1.Family\n2.Industry");
		
		int elvalue;
		int typeNumber = scanner.nextInt();
		double cost = 0;
		
		while((typeNumber != 1) && (typeNumber !=2)) {
			typeNumber = scanner.nextInt();
		} // 1||2 keep on
		
		if(typeNumber == 1 || typeNumber == 2) {
			
			System.out.println("Enter your electricity value.");
			elvalue = scanner.nextInt();
			elvalue = elvalue >= 0 ? elvalue : 0 ; // if wrong value then 0
			
			if(typeNumber == 1) { //Family
				if(elvalue <= 240) { //<=240 $0.15
					cost = elvalue * 0.15;
				}else if((elvalue > 240) && (elvalue <=540)){ // >240 && <=540 $0.25
					cost = elvalue * 0.25;
				}else { // >540 $0.45
					cost = elvalue * 0.45;
				}
			}else { //Industry $0.45
				cost = elvalue * 0.45;
			}
		} // if check
		
		System.out.println("You have to pay $" + cost);
		
		scanner.close();
		
	} // main
	
} // class
