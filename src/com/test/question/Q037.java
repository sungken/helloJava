package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		int num1 = 0;
		for (int i = 1; i <= num; i++) {
			num1 += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, num1);
	}//main

}
