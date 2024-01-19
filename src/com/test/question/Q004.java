package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		
		
		System.out.print("섭씨(℃): ");
		Scanner sc = new Scanner(System.in);
		double sub = sc.nextInt();
		
		double hwe = sub * 1.8 + 32;
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", sub, hwe);

		
		
		
	}

}
