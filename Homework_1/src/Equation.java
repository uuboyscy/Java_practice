/*
6.選擇性敘述的練習-Equation
一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。
b2-4ac > 0，有兩個不相等的實根。
b2-4ac = 0，有兩個相等的實根。
b2-4ac < 0，則印出”沒有實根”。
*/

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double root = 0;
		double a = 0, b = 0, c = 0;
		String[] resualt = {"b^2-4ac > 0，有兩個不相等的實根。", "b^2-4ac = 0，有兩個相等的實根。", "b^2-4ac < 0，沒有實根。"};
		
		System.out.println("一元二次方程式ax^2+bx+c=0。輸入a, b, c三值。");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		root = b*b - 4*a*c;	
		
		System.out.println(resualt[(root>=0 ? (root!=0 ? 0 : 1) : 2)]);
		
		scanner.close();
		
	} // main
	
} // class
