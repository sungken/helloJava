package com.test.java;

import java.util.Calendar;

public class Ex17_LocalVariable_1 {
	
	int b = 20; // 멤버 변수
	
	
	public static void main(String[] args) {
		
		/*
		 
		 자바 변수의 종류
		 - 선언된 위치와 역할 차이
		 1. 멤버 변수, Member Variable
		 
		 - 클래스 수업때 배움
		 
		 2. 지역 변수, Local Variable
		 - 지금까지 사용한 변수
		 -메소드 내에서 선언한 변수
		 - 변수 스코프 (Scope) : 변수의 사용 영역(범위)***
		 
		 ***지역 변수의 생명주기, Life Cycle
		 - 변수가 언제 태어나서(메모리에서 생성)~ 언제 죽는지 (메모리에서 소멸)
		 -생성 : 변수 선언문이 실행될 때
		 - 소멸 : 변수 선언문이 포함된 블럭을 빠져나갈 때
		 
		 ///main 변수에 만들어두면 변수가 오래 살아남기 땜에 메모리를 많이 차지해서 되도록이면 여기에 잘 안만듦
		 
		 */
		
		int a = 10;//지역 변수
		
		int num = 100;
		checkNumber(num);
		
		aaa();
		
		//바깥 지역변수와 제어문 안에 지역변수가 명칭이 같으면 에러
		int b = 30;
		
		if (num > 0) {
			//int b =10;
			System.out.println("b: " + b); //
		}
		
		if (num > 0) {
			//int b =20;
			System.out.println("b: " + b); //
		}
	}//main
	
public static void aaa() {
	int a =10;
	bbb(a);
}
public static void bbb(int a) {
	
	System.out.println(a);
}
	
	public static void checkNumber(int num) {
		
	}
	
	
	
	public static void tset1() {
		int c =30;
	}
	
public static void tset2() {
		int d = 40;
		int c = 50;// 지역변수라고 불리는 이유: 서로 다른 지역이면 변수 이름이 겹쳐도 괜찮기 때문
	}


}




