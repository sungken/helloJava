package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//요구사항 - 아래와 같이 출력하시오.
		//조건 - 행의 갯수를 입력받으시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		star(reader);
		

		
	}//main

	private static void star(BufferedReader reader) throws IOException {
		System.out.print("행: ");
		int num = Integer.parseInt(reader.readLine());
		
		
		for (int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = num; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
//		for (int i = num; i > 0; i--) {
//			System.out.print(" ");
//			for (int j = num; j >= 1; j--) {
//				System.out.print("*");
//			}
//			for (int)
//			System.out.println();
//			num -= 1;
//
//		}

	}

}
