package com.test.java;

public class Ex18_Method {
	public static void main(String[] args) {
		/*
		 * 
		 * 메서드 오버로딩, Method Overloading - 같은 이름의 메서드를 여러개 만드는 기술 - 메서드의 인자 리스트를 다양한 형태로
		 * 구성해서, 같은 이름의 메서드를 여러개 만드는 기술 메서드 오버로딩을 하는 이유? 1. 성능 향상 -> X 2. 개발자에세 도움 -> O
		 * 
		 * 메서드 오버로딩 구현 조건 가능 1. 매개변수의 개수 2. 매개변수의 자료형
		 * 
		 * 매서드 오버로딩 구현 조건 불가능 1. 매개변수 이름 2. 반환값의 자료형
		 * 
		 * 메서드 만드는 중... => 예시 1. public static void test() {} -> 가능 2. public static
		 * void test() {} -> 1번때문에 불가능 3. public static void test(int n) {} -> 가능 4.
		 * public static void test(int m) {} -> 3번 때문에 불가능 5. public static void
		 * test(int n, int m) {} -> 가능 6. public static void test(String s) {} -> 가능 7.
		 * public static int test() {} -> 1번 때문에 불가능
		 * 
		 * 
		 */

		// 요청 - 선을 그리는 메서그를 선언 하시오.

		drawLine();
		System.out.println(" 성적표");
		drawLine();
		drawLine();

	}// main

	public static void drawLine() {

		System.out.println("========");

	}

//	
//	public static void drawLine() {
//			
//			System.out.println("--------");
//			
//		}
//	
//	public static void drawLine() {
//		
//		System.out.println("********");
//		
//	}
	public static void drawLine(String c) {

		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
	}
	//K&R 스타일
	public static void m1() {
		
	}
	
	//Allman 스타일
	public static void m2() 
	{
		
	}

}
