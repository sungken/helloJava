package com.test.java;

public class Ex17_LocalVariable {
	
	int a = 20; // 멤버변수

	public static void main(String[] args) {
		
//		자바 변수의 종류
//		- 선언된 위치, 역할 차이
//		1. 멤버 변수, Member Variable
//			-클래스 수업
//		
//		2. 지역 변수, Local Variable
//			-여태까지 사용한 변수
//			- 메서드내에서 선언하는 변수
//			- 변수 스코프(Scope) -> 변수의 사용 영역(범위)***
//		지역 변수의 생명주기, Life Cycle *** 면접 주의 ***
//		- 변수가 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에 소멸)
//		- 생성 -> 변수 선언문이 실행 될때
//		- 소멸 -> 변수 선언문이 포함된 블럭을 빠져나갈 때
		
		
		int b = 10; //지역변수
		
		
	}//main
	
	public static void aaa() {
		int a = 10 ;
		bbb();
	}
	public static void bbb() {
		
		
	}
	
	public static void checkNumber(int num) {
		
	}
	
	public static void test1() {
		int c = 30;		
		//int c = 50; -> 같은 변수 에러
	}
	public static void test2() {
		int d = 40;
		int c = 50;
		// 지역변수이므로 변수 c사용 가능
		
	}

}
