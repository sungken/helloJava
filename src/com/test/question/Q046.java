package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q046 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//요구사항 - 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		// 조건 - 1~9까지만 입력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			if(num >= 1 && num <= 9) {
				if (num == 1) {
					str += "일";
				} else if (num == 2) {
					str += "이";
				} else if (num == 3) {
					str += "삼";
				} else if (num == 4) {
					str += "사";
				} else if (num == 5) {
					str += "오";
				} else if (num == 6) {
					str += "육";
				} else if (num == 7) {
					str += "칠";
				} else if (num == 8) {
					str += "팔";
				} else if (num == 9) {
					str += "구";
				}
			} else {
				System.out.println("1~9까지만 입력하시오.");
					break;
			}
		}
		System.out.println(str);
		
		
		
		
		
		
		
		
		
//		if(num >= 1 && num <= 9) {
//			for (int i = 1; i >= 10; i++) {
//				System.out.print("숫자: ");
//				if (num == 1) {
//					str += "일";
//				} else if (num == 2) {
//					str += "이";
//				} else if (num == 3) {
//					str += "삼";
//				} else if (num == 4) {
//					str += "사";
//				} else if (num == 5) {
//					str += "오";
//				} else if (num == 6) {
//					str += "육";
//				} else if (num == 7) {
//					str += "칠";
//				} else if (num == 8) {
//					str += "팔";
//				} else if (num == 9) {
//					str += "구";
//				}
//			}
//			System.out.println(str);
		
	}//main

}
