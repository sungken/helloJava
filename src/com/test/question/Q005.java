package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		Scanner sc = new Scanner(System.in);
		double diameter = sc.nextDouble(); 
		
		double a = diameter * 26 * 3.14159265359 * 2.54 / 100;
		System.out.printf("사용자가 총 %.0f회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", diameter, a);

		
		
		
	}

}
