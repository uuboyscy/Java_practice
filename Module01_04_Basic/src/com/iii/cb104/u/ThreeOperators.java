package com.iii.cb104.u;

public class ThreeOperators {

	public static void main(String[] args) {
		
		int converge = 200, area = 190, count;
		
		count = area/converge;
		count += (area%converge == 0) ? 0 : 1;
		String unit = (count == 1) ? "can" : "cans";
		System.out.println("Need " + count + " " + unit + " to print.");

	} // main

} // class
