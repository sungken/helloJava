package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_If {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * 
		 * 제어무 - 수많은 명령어들의 집합 -> 명령어들이 실행되는 순서 -> 위 -> 아래 - 제어의 흐름을 통제하는 도구 - 조건 제어, 반복
		 * 제어 , 분기 제어
		 * 
		 * 1. 조건문 - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제러 a. if b. switch
		 * 
		 * 2. 반복문 - 특정 코드를 원하는 횟수만큼 반복 제어 a. for b. while c. do while d. for
		 * 
		 * 3. 분기문 - 코드의 흐름을 원하는 곳으로 이동 a. break b. continue c.goto(JDK 1,5 폐기)
		 * 
		 */

		// m1();
		// m2();
		//m3();
		//m4();
		m5();

	}// main

	private static void m5() throws NumberFormatException, IOException {
		//
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("성적: ");
		int score = Integer.parseInt(reader.readLine());
		
		if(score >= 60 && score <= 100) {
			System.out.println("합격");
		}else if (score >= 0 && score <= 59){
			System.out.println("불합격");
		} else {
			System.out.println("점수는 0 ~ 100점 이내로 입력해주세요.");
		}
		
		if(score >= 0 && score <= 100) {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("점수는 0 ~ 100점 이내로 입력해주세요.");
		}// 가독성과 코드 관리를 위해 더 좋은 코드

	}//m5

	private static void m4() throws NumberFormatException, IOException {
		// 심리 테스트
		int sum = 0; //누적 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. 어떤 개발툴을 선호 합니다?");
		System.out.println("a. 메모장"); //+1
		System.out.println("b. 이클립스"); //+3
		System.out.println("c. 인텔리제이");//+5
		
		System.out.println("선택: "); 
		String seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum = 1;
		}else if (seq.equals("b")) {
			sum = 3;
		}else if (seq.equals("c")) {
			sum = 5;
		}
		
		System.out.println("2. 어떤 언어를 사용 하나요?");
		System.out.println("a. 모름"); 
		System.out.println("b. Python"); 
		System.out.println("c. Java");
		
		System.out.println("선택: "); 
		seq = reader.readLine();
		if (seq.equals("a")) {
			sum += 1;
		}else if (seq.equals("b")) {
			sum += 3;
		}else if (seq.equals("c")) {
			sum += 5;
		}
		
		System.out.println(sum);
		
		
		 
		 
		 
	}//m4

	//
	private static void m3() throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("기상 시간(시): ");

		int hour = Integer.parseInt(reader.readLine());

		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour < 7) {
			System.out.println("버스를 타고 출근한다.");
		} else if (hour < 8) {
			System.out.println("버스를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}

	}// m3

	private static void m2() throws NumberFormatException, IOException {

		// 나이 입력 -> 판단
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이: ");

		int age = Integer.parseInt(reader.readLine());

		String result = (age >= 18) ? "성인" : "미성년자";
		System.out.println(result);

		if (age >= 18) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}

	}// m2

	private static void m1() {

		/*
		 * if문 - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제러 - 조건식 > boolean 값을 가지는 표현식
		 * 
		 * if (조건식){ 문장; } else { 문장; }
		 * 
		 * - 다중 조건문 if (조건식){ 문장; } [else if (조건문) { 문장; }[ x N - 여러번 사용 가능 [else { 문장;
		 * }]
		 * 
		 * 
		 */
		int num = 10;

		if (num > 0) {
			System.out.println("num은 양수입니다.");
		}

		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else {
			System.out.println("num은 음수입니다.");
		}

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("영");
		}

		System.out.println("종료");

	}// m1

}
