package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q012 {
	public static void main(String[] arg) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		//BufferedReader 함수로 문자 입력
		String str = reader.readLine();
		//String str을 int num로 변환
		int num = Integer.parseInt(str);
		
		//int num을 2로 나누어서 나머지가 0 이면 "짝수" 출력, 1이상이면 "홀수"출력
		String str2 = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", num, str2);
		
	}//main

}
