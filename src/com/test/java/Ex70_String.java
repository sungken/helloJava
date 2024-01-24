package com.test.java;

public class Ex70_String {

	public static void main(String[] args) {

		// 문자열 성질
		// - "자바의 문자열은 불변(immutable)이다."

		//m1();
//		m2();
		
		
		
	}// main

	private static void m2() {
		
//		String txt = "홍길동";
//		txt = txt + "님";
//		System.out.println(txt);
//		
//		String txt2 = "홍길동님";
//		System.out.println(txt2);
		     
		//문자열의 잦은 조작 > 다량의 Garbage를 생성(메모리 낭비)
		
		long begin = 0, end = 0;
		
		begin = System.currentTimeMillis();

		String txt = "홍길동님";
		for (int i = 0; i < 100000; i++) {
			txt += ".";
		}
		
		System.out.println(txt.length());
		end = System.currentTimeMillis();
		
		System.out.printf("길이: %,d \n시간: %d\n", txt.length(), end - begin);
		
		begin = System.currentTimeMillis();

//		String txt = "홍길동님";
		StringBuilder sb = new StringBuilder("홍길동");
		
//		StringBuffer 
		
		for (int i = 0; i < 100000; i++) {
			sb.append(".");
		}
		
		System.out.println(txt.length());
		end = System.currentTimeMillis();
		
		System.out.printf("길이: %,d \n시간: %d\n", sb.length(), end - begin);
		
	}//m2

	private static void m1() {

		// 값형(고정)
		int n1 = 10; // 크기 > 4byte
		int n2 = 10000; // 크기 > 4byte

		// 참조형
		int[] ns1 = { 10, 20, 30 }; //12byte
		int[] ns2 = { 10, 20, 30, 40, 50 }; //20byte
		
		String s1 = "홍길동"; // 6byte
		String s2 = "홍길동 입니다."; // 14byte
		
		String s3 = "문자열";
		String s4 = "문자열";
		String s5 = "문자열";
		s5 += "문자열";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4)); //오버라이딩
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5)); //오버라이딩
		
		//문자열은 같은값이면 주소값이 같다.
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		s4 = s4 + "."; 
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		
		
		
	}// m1

}// Ex70_String



class Item{
	
	private int num;
	private String type;
	
	
	@Override
	public String toString() {
		return String.format("Item [num=%s, type=%s]", num, type);
	}
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Item [num=");
//		builder.append(num);
//		builder.append(", type=");
//		builder.append(type);
//		builder.append("]");
//		return builder.toString();
//	}
	
	
//	@Override
//	public String toString() {
//		return "Item [num=" + num + ", type=" + type + "]";
//	}
	
}









