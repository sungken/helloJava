package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q038 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 횟수: ");
		int num = Integer.parseInt(reader.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print("숫자: ");
			int num1 = Integer.parseInt(reader.readLine());
			if( num1 % 2 == 0) {
				a += 1;
				b += num1;
			} else if (num1 % 2 != 0){
				c += 1;
				d += num1;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n", a, b);
		System.out.printf("홀수 %d개의 합: %d\n", c, d);
		
		
	}//main

}
