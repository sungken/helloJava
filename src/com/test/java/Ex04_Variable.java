package com.test.java;

public class Ex04_Variable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// 연산자 방향 왼쪽 -> 오른쪽(*, / -> +, -)
		System.out.println(a + " + " + b + " = " + a + b);
		// 연산자의 우선순위를 주려면 괄호를 사용해라
		System.out.println(a + " + " + b + " = " + (a + b));
		
		// 주민등록번호 입력 -> 출력
		int jumin1 = 950105;
		System.out.println("주민번호: " + jumin1);
		
		jumin1 = 030711;
		System.out.println("주민번호: " + jumin1); //8진법으로 적용되어서 출력
		// 자바의 기수법
		// - 10진수
		// - 8진수
		// - 16진수
		// - 2진수
		System.out.println(10); //10진수
		System.out.println(010); //8진수
		System.out.println(0x10); // 16진수
		System.out.println(0b10); // 2진수
		
		// 리터럴 실수
		double d1 = 1200;
		double d2 = 1.2e+3;
		System.out.println(d1);
		System.out.println(d2);
		
		d1 = 0.012;
		d2 = 1.2e-2;
		System.out.println(d1);
		System.out.println(d2);
		
		
		
		
		
		
		
		
		
	}

}
