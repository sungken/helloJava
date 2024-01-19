package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int squareWidth = sc.nextInt();
		int squareHigh = sc.nextInt();
		
		int a = squareWidth * squareHigh;
		int b = (squareWidth * 2) + (squareHigh * 2);
		
		System.out.println("너비(cm): " + squareWidth);
		System.out.println("높이(cm): " + squareHigh);
		System.out.printf("사각형의 넓이는 %d㎠ 입니다.\n ", a );
		System.out.printf("사각형의 둘레는 %d㎠ 입니다. ", b);
		
		
	}

}
