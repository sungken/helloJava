package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_Swtich {

	public static void main(String[] args) throws IOException {
		
		/*
		 
		 switch문, switch case문
		 - 조건: 값(데이터) -> 정수, 문자열, 열거형
		 
		 
		 
		 switch (조건){
		 	case 값;
		 		구현부;
		 		break;
		 	[case 값;
		 		구현부;
		 		break;] * N
		 	[default;
		 		구현부;
		 		break;] -> default는 생략이 가능하다.
		 	
	
		 }
		 
		 */
		//m1();
		//m2();
		//m3(); // if --> 문제 switch로 풀기
		m4();
		
	}//main

	private static void m4() {
		int num = 10;
		
		if (num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");			
		}
		
//		switch (num > 0) {
//			case true: --> 비교, 제어 연산자 못씀 (잘 안씀)
//				System.out.println("양수");
//			case false:
//				System.out.println("음수");
//		}
	}

	private static void m3() {
		
		//사용자가 월 입력 -> 해당 월의 마지막 일?
		
		int lastDay = 0;//마지막 일
		
		int month = 5;//Buffer로 바꿔서 입력 받기
		
		aaa: //Label -> 코드의 위치를 설명하는 용도 -> 표지판(많이 쓰지 않는다.)
		
		switch (month) {
			case 1: case 3: case 5:
			case 7: case 8: case 10: case 12:
				lastDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
				lastDay = 28;
				break;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
		
		
	}//m3

	private static void m2() throws IOException { // if 와 switch 구문 비교
		//자판기 
		//- 메뉴 출력 -> 음료선택 -> 가격 출력
		//- 가격 변동 -> 앞으로 평생 콜라와 사이다의 가격이 동일하게 판매한다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===================");
		System.out.println("     자판기");
		System.out.println("===================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 바카스");
		System.out.println("-------------------");
		System.out.print("번호선택: ");
		
//		String input = reader.readLine();
//		if ( input.equals("1")) {
//			System.out.println("700원 입니다");
//		} else if (input.equals("2")) {
//			System.out.println("700원 입니다");			
//		}else if (input.equals("3")) {
//			System.out.println("500원 입니다");			
//		} else {
//			System.out.println("1 ~ 3 을 고르세요");
//		}
		
		String input = reader.readLine();
		if ( input.equals("1") || input.equals("2")) {
			System.out.println("700원 입니다");
		} else if (input.equals("3")) {
			System.out.println("500원 입니다");			
		} else {
			System.out.println("1 ~ 3 을 고르세요");
		}
		
		switch (input) {
			case "1", "2":
			//case "2": -->이렇게 하거나 두개를 동시에 써도 같은결과가 나온다.
				System.out.println("700원 입니다");
				break;
			case "3":
				System.out.println("500원 입니다");
				break;
			default:
				System.out.println("1 ~ 3 을 고르세요");
				break;
				
		}
		
		
		
		
	}//m2

	private static void m1() {
		//숫자를 1개 입력받아 한글로 출력하시오.
		//1 -> "하나"
		//2 -> "둘"
		
		int num = 1;
		
		if(num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");		
		} else if (num == 3) {
			System.out.println("셋");		
		}
		
		switch (num) { // 조건: 값(데이터) -> 정수, 문자열, 열거형
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
	}

}
