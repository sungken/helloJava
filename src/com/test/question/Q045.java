package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q045 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//요구사항 - 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		//조건 - 최대 3자리까지만 입력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 숫자: ");
		int maxNum = Integer.parseInt(reader.readLine());
		
		if (maxNum < 1000) {
			for (int i = 1; i <= maxNum; i++) {
				if (i <= 10) {
					
				}
				//System.out.printf(" %d ", i);
			}
		} else {
			System.out.println("최대 3자리정수 만 입력하세요.");
		}
		
		
		
		
		
		
		
	}//main

}
