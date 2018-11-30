/*
1.��ܩʱԭz���m��-Electricity
��J��إιq�M�׼ơA�p��X��ú���q�O�C
�q�O���q�ϥβ֭p�覡�ӭp��q�O�A���u�~�ιq�ήa�x�ιq�C
                                               �a�x�ιq        			�u�~�ιq
240��(�t)�H�U		0.15��			0.45��
240~540(�t)��   		0.25��			0.45��
540�ץH�W        		0.45��			0.45��
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
