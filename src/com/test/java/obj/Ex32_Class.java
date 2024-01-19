package com.test.java.obj;

public class Ex32_Class {

	public static void main(String[] args) {
		
		//Member 라는 클래스 에서 m1이라는 변수
		Member m1 = new Member();
		
		
		//변수의 집합 + 메서드의 집합
		//객체 = 데이터 + 행동
		m1.name = "홍길동";
		m1.age = 20;
		m1.hello();
		System.out.println();
		
		Member m2 = new Member();
		m2.name = "아무개";
		m2.age = 25;
		m2.hello();
		System.out.println();
		
		Member m3 = new Member();
		m3.name = "강아지";
		m3.age = 5;
		m3.hello();
		
		
	}//main

}//Ex32_Class
