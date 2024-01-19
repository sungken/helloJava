package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q044 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// -요구사항 -> 숫자를 N개 입력받아 아래와 같이 출력하시오.
		// 조건
		// - 누적값이 100을 넘어가는 순간 루프를 종료하시오.
		// - 짝수는 더하고 홀수는 빼시오.

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		int num1 = 0;
		String txt = "";

		for (; ;) {
			System.out.print("숫자: ");
			num = Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				num1 += num;
				txt += " + " + num;
			} else {
				num1 -= num;
				txt += " - " + num;
			}
			if (num1 >= 100) {
				break;
			}
		}
		System.out.printf(txt + " + " + num1);
		//System.out.print(" = " + num1 + num2);
//		for (int i = 1; ;) {
//			System.out.print("숫자: ");
//			int num = Integer.parseInt(reader.readLine());
//			if (num % 2 == 0) {
//				//System.out.println(num + " + ");
//				num1 += num;
//			} else {	
//				num2 -= num;
//				//System.out.println(num + " - ");
//			} if(num1 + num2 > 100) {
//				break;
//			}
//			System.out.print(num + " + ");
//		}
//		System.out.println(num1 + num2);

	}
}// main
