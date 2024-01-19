package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q036 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		System.out.print("증감치 숫자: ");
		int num3 = Integer.parseInt(reader.readLine());
		
		for (int i = num1; i >= num1 && i <= num2; i += num3) {
			System.out.println(i);
		}
		
		
		
	}//main

}
