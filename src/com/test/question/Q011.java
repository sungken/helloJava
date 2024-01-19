package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011 {

	public static void main(String[] args) throws IOException {
		// BufferedReader reader 로 정수 입력 받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 정수 입력
		System.out.print("첫번째 숫자: ");
		// redLine으로 String 입력을 받음
		String firstStr = reader.readLine();
		// String을 int로 변환
		int n1 = Integer.parseInt(firstStr);
		// 위와 동일
		System.out.print("두번째 숫자: ");
		String secondStr = reader.readLine();
		int n2 = Integer.parseInt(secondStr);

		// 위에서 변환한 n1, n2를 아래 만든 method에 출력
		add(n1, n2);
		subtract(n1, n2);
		multiply(n1, n2);
		divide(n1, n2);
		mod(n1, n2);

	}// main

	private static void mod(int n1, int n2) {
		// %를 하나만 넣었을 경우 오류 발생 %%주의
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);

	}// mod

	private static void divide(int n1, int n2) {

		System.out.printf("%d / %d = %.1f\n", n1, n2, (float) n1 / n2);

	}// divide

	private static void multiply(int n1, int n2) {

		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);

	}// multiply

	private static void subtract(int n1, int n2) {

		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);

	}// subtract

	private static void add(int n1, int n2) {

		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);

	}// add

}
