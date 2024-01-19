package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {

		System.out.print("태어난 년도를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int yearOfBirth = sc.nextInt();
		int myAge = 2024 - yearOfBirth;

		System.out.println(yearOfBirth + "년");
		System.out.println("나이: " + myAge);

	}

}
