package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int oneNum = sc.nextInt();
		int twoNum = sc.nextInt();
		
		double a = oneNum;
		double b = twoNum;
		
		
		
		System.out.printf("%,d + %,d = %,d\n", oneNum, twoNum, oneNum + twoNum);
		System.out.printf("%,d - %,d = %,d\n", oneNum, twoNum, oneNum - twoNum);
		System.out.printf("%,d * %,d = %,d\n", oneNum, twoNum, oneNum * twoNum);
		System.out.printf("%.0f / %.0f = %.1f\n", a, b, a / b);
		//System.out.println(oneNum / twoNum);
		System.out.printf("%,d %% %,d = %,d\n", oneNum, twoNum, oneNum % twoNum);
		
		
		
		
	}

}
