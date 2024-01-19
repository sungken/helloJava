package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q048 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//요구사항 - 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		//조건 - int 양수만 입력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int even = 0;
		int odd = 0;
		
		System.out.print("숫자 입력: ");
		int num = Integer.parseInt(reader.readLine());
		
//		if (num > 0 && num < 1000000000) {
//			for(int i = 1; i <= num; i++) {
//				
//			}
//		}
		
		
		
	}//main

}
