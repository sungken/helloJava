package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q040 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		int a = 0;
		int b = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 ==0) {
				System.out.print( i + " + ");
				a -= i;
			} else {
				System.out.print( i + " - ");
				b += i;
			}
		}
		System.out.print("\b\b= " + (a + b));//맞는지 확인해보기
		
	
	}//main

}
