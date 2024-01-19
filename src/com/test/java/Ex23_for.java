package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex23_for {

	public static void main(String[] args) throws IOException {
		
		/*
		 
		 반복문
		 - 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
		 - 생산성 향상 + 유지보수성 향상
		 
		 for (초기식; 조건식; 증감식;) {
		 	구현부;
		 }
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		m11();
		//m12();
		//m13();
		
		
	}//main

	private static void m13() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//숫자 5개 입력(1 ~10 사이) > 사장 큰 수?
		int max = 0; //입력받을 숫자 중 가장 작은 숫자로 초기화
		int min = 10;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num > max) {
				max = num;
			}
			
			if(num < max);
				min = num;
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}//m13

	private static void m12() {
		
		//1 + 2 + 3 = 6
		int sum = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("\b\b= " + sum);
		
	}//m12

	private static void m11() {
		
		//난수(임의의(랜덤수)) 만들기
		
		//1. Math 클래스
		//2. Random 클래스
		
		//System.out.println(Math.random());
		
		for (int i = 0; i < 10; i++) {
			
			//System.out.println(Math.random());
			
			//가공
			//System.out.println((int)(Math.random() * 10));
			
			//주사위
			System.out.println((int)(Math.random() * 6) + 1);

			//5 ~ 8
			System.out.println((int)(Math.random() * 4) + 5);
		}
		
		
	}//m11

	private static void m10() {
		//학교 > 선생님 + 학생 상담(30명)
		for ( int i = 1; i <= 30; i++ ) {
//			if( i >= 16 ) {
//				break;
//			}
			if (i == 10);{
				continue;				
			}
			//System.out.println(i + "번 학생 상담중..");??????????????????????????????????????????
		}
		
		
	}//m10

	private static void m9() {
		
		//break -> 현재 자신이 속한 제어문을 탈출해라!! -> if문 제외
		//continue -> 이번 반복을 중단하고 다시 시작으로 이동해라!!
		
		// break -> 루프 완전 중단
		// continue -> 이번만 건너뛰기
		
		for(int i = 1; i <= 10;  i++) {

			if ( i == 5 ) { //5를 만나면 나가라
				break;				
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = 1; i <= 10;  i++) {

			if ( i == 5 ) { //5를 만나면 5를 건너뛰어라
				continue;				
			}
			System.out.println(i);
		}
		System.out.println();
		
	}//m9

	private static void m8() throws NumberFormatException, IOException {
		
		//무한 루프, Infinite loop
		//1. 사용자의 실수
		//2. 사용자 의도 > 일부러
		
//		int num = Integer.MIN_VALUE;
//		System.out.println(num);
//		
//		num--;
//		System.out.println(num);
		
//		//1. 진짜 무한 루프 생성하기
//		for (int i = 0; true ; i++) {
//			System.out.println("실행문");
//		}
		
//		//2. 진짜 무한 루프 생성하기
//		for (int i = 0; ; i++) {
//			System.out.println("실행문");
//		}
		
//		//3. 진짜 무한 루프 생성하기
//		for (;;) {
//			System.out.println("실행문");
//		}
		
		
		// 회전을 몇번 할지 모를때? -> 무한루프 사용
		// 사용자 숫자 입력 -> 합?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for (;;) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		
		
	}//m8

	private static void m7() throws NumberFormatException, IOException {
		
		//요구사항 - 구구단 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("몇 단? ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %2d\n", num, i, num * i);
		}
		
	}//m7

	private static void m6() throws NumberFormatException, IOException {
		
		//요구사항- 사용자가 입력한 숫자들의 합?(10개)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		System.out.println(sum);
		
		
		
		
	}//m6

	private static void m5() throws IOException {
		
		//요구사항 - 1부터 사용자가 입력한 숫자까지의 합?
		
		int sum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		// 한줄로 바꾸는 방법!!!!
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}//m5

	private static void m4() {
		
		//요구사항 - 1 ~ 10까지의 합 -> 누적 연산
		
		//누적 변수(0으로 초기화)
		int sum = 0;
//		sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
//		System.out.println(sum);
		
		
		//중요 
		for(int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		
		
	}//m4

	private static void m3() {
		
		// 반복문 -> 루프 변수!!(**********) 중요!!!!!!!!!!
		// 활용이너무너무 중요하다.
		
		//요구사항 - 숫자 1~ 10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		int num = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		System.out.println();
		
		//루프 변수 -> 원하는 수열을 제공
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//홀수 출력
		for (int i = 1; i < 11; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//짝수 출력
		for (int i = 2; i < 11; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//7의 배수 출력
		for (int i = 7; i < 101; i+=7) {
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void m2() {
		
		//반복문 -> 회전수 제어?
		//i: 루프변수
		for ( int i = 1; i <= 5; i++ ) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for ( int i = 5; i <= 9; i++ ) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for ( int i = 10; i >= 6; i-- ) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for ( int i = 1; i <= 21; i += 5 ) {
			System.out.println("실행문");
		}
		System.out.println();
		
		//가장 보편적인 형태
		for ( int i = 0; i < 5; i ++ ) {
			System.out.println("실행문");
		}
		System.out.println();
	}//m2

	private static void m1() {
		//요구사항 - "안녕하세요" * 5회 출력
		
		//순서
		//1. int i + 1; -> 초기식
		//2. i <= 5; -> 조건식
		//3. 구현부 실행
		//4. i++ -> 증감식
		//5. i <= 5;
		//6. 구현부 실행
		//7. i++
		//8. i <= 5;
		//9. 반복 -> i가 5가 될때까지
		
		for(int i = 1; i <= 5; i ++) { //(int i = 0; i < 5; i += 1) --> 같은 조건식임
			System.out.println("안녕하세요");
		}
		
		
	}//m1

}
