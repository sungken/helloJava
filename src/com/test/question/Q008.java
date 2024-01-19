package com.test.question;

public class Q008 {

	public static void main(String[] args) {
		
		//안녕하세요 -> 출력
		hello();
		
		//저는 홍길동입니다. -> 출력
		introduce();
		
		//안녕히가세요 -> 출력
		bye();
	
	
	
	}//main

	private static void bye() {
		System.out.println("안녕히가세요.");
	}//bye

	private static void introduce() {
		System.out.println("저는 홍길동입니다.");
	}//introduce

	private static void hello() {
		System.out.println("안녕하세요");
	}//hello

}
