package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q029 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		String integer1 = reader.readLine();
		int num1 = Integer.parseInt(integer1);
		
		System.out.print("두번째 숫자: ");
		String integer2 = reader.readLine();
		int num2 = Integer.parseInt(integer2);
		
		System.out.print("연산자: ");
		int operator = reader.read();
		
		if ( operator == 43 ){
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);			
		} else if ( operator == 45 ) {
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
		} else if ( operator == 42 ) {
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
		} else if ( operator == 47 ){
			System.out.printf("%d / %d = %.1f", num1, num2, (float)num1 / num2);			
		} else if ( operator == 37 ){
			System.out.printf("%d %% %d = %d", num1, num2, num1 % num2);			
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		

	}//main

}
