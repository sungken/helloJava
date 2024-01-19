package com.test.java.obj;

public class Ex31_Class {

	public static void main(String[] args) {
		
		//클래스 선언하기
		//1. 클래스 선언하기
		//2. 멤버변수 선언하기
			//a. 변수
			//b. 메서그
		
		//클래스 선언할때 권장사항
		//- 클래스 1개당 물리적인 파일을 1개를 만든다.
		//- 관리가 용이하다 ***
		
		//절대규칙***************************************
		//- 파일이름과 클래스의 이름이 동일해야 한다.
		//- 컴파일 에러
		//- 하나의 파일안에 2개 이상의 클리스를 선언
		//	파일내의 모든 클래스 중 public을 가지는 클래스는 유일해야 한다.
		//- public 클래스 > 대표 클래스 > 대표 클래스의 이름이 파일명이 된다.
		
		User u1 = new User();
		
		
	}//main

}//Ex31_Class

//class User{
//	public String name;
//}



