package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q031 {

	public static void main(String[] args) throws IOException {
		int even = 0;
		int odd = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		String str1 = reader.readLine();
		int num1 = Integer.parseInt(str1);
		
		System.out.print("숫자 입력: ");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);
		
		System.out.print("숫자 입력: ");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);
		
		System.out.print("숫자 입력: ");
		String str4 = reader.readLine();
		int num4 = Integer.parseInt(str4);
		
		System.out.print("숫자 입력: ");
		String str5 = reader.readLine();
		int num5 = Integer.parseInt(str5);
		
		if(num1 % 2 == 0) {
			even += 1;
		} else {
			odd += 1;
		}
		if(num2 % 2 == 0) {
			even += 1;
		} else {
			odd += 1;
		}
		if(num3 % 2 == 0) {
			even += 1;
		} else {
			odd += 1;
		}
		if(num4 % 2 == 0) {
			even += 1;
		} else {
			odd += 1;
		}
		if(num5 % 2 == 0) {
			even += 1;
		} else {
			odd += 1;
		}
	
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		if (even > odd) {
			String a = "짝수";
			String b = "홀수";	
			int c = even - odd;
			System.out.printf("%s가 %s보다 %d개 더 많습니다.\n", a, b, c);
		} else {
			String d = "홀수";
			String e = "짝수";
			int f = odd - even;
			System.out.printf("%s가 %s보다 %d개 더 많습니다.\n", d, e, f);
		}
		
		
		
		
	}//main

}
