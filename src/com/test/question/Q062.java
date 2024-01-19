package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {

		// 요구사항 - 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		// 조건 - 이름을 오름차순 정렬하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수: ");
		int num = sc.nextInt();
		sc.nextLine();

		String[] name = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("학생명: ");
			String num1 = sc.nextLine();
			name[i] = num1;
		}
		Arrays.sort(name);
		System.out.printf("입력하신 학생은 총 %d명 입니다.\n", num);
		//System.out.println(Arrays.toString(name));
		for (int i = 0; i <= num - 1; i++) {
			System.out.printf("%d. %s\n", i + 1, name[i]);
		}

	}// main

}
