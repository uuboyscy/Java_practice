/*
6.��ܩʱԭz���m��-Equation
�@���G����{��ax2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC
b2-4ac > 0�A����Ӥ��۵�����ڡC
b2-4ac = 0�A����Ӭ۵�����ڡC
b2-4ac < 0�A�h�L�X���S����ڡ��C
*/

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double root = 0;
		double a = 0, b = 0, c = 0;
		String[] resualt = {"b^2-4ac > 0�A����Ӥ��۵�����ڡC", "b^2-4ac = 0�A����Ӭ۵�����ڡC", "b^2-4ac < 0�A�S����ڡC"};
		
		System.out.println("�@���G����{��ax^2+bx+c=0�C��Ja, b, c�T�ȡC");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		root = b*b - 4*a*c;	
		
		System.out.println(resualt[(root>=0 ? (root!=0 ? 0 : 1) : 2)]);
		
		scanner.close();
		
	} // main
	
} // class
