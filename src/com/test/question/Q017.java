package com.test.question;

public class Q017 {
	public static void main(String[] arg) {
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형동");
		
	}//main

	private static void position(String string, String string2, String string3, String string4) {
		
		System.out.printf("사원: %s\n", string);
		System.out.printf("대리: %s\n", string2);
		System.out.printf("과장: %s\n", string3);
		System.out.printf("부장: %s\n", string4);
		System.out.println();		
		
	}//position(String string, String string2, String string3, String string4)

	private static void position(String string, String string2, String string3) {
		
		System.out.printf("사원: %s\n", string);
		System.out.printf("대리: %s\n", string2);
		System.out.printf("과장: %s\n", string3);
		System.out.println();		
		
	}//position(String string, String string2, String string3)

	private static void position(String string, String string2) {
		
		System.out.printf("사원: %s\n", string);
		System.out.printf("대리: %s\n", string2);
		System.out.println();
		
		
	}//position(String string, String string2)

	private static void position(String str) {
		
		System.out.printf("사원: %s\n", str);
		System.out.println();
		
	}//position(String str)
	
}
