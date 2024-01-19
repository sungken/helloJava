package com.test.java;

public class Ex24_for {

	public static void main(String[] args) {

//		 중첩된 for문 - 단일 for문 - 2중 for문 - 3중 for문
//		 
//		 for(){ 
//		 - 단일 
//		 }
//		
//		 for(){ 
//		 	for(){
//		 	 	- 2중 
//		 	 	} 
//		 	 }
//		 
//		 for(){ 
//			for(){ 
//					for(){ 
//						- 3중 
//					} 
//				} 
//			}

		//m1();
		//m2();
		//m3();
		m4();
		

	}// main

	private static void m4() {
		
		//별찍기(5x5)
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");
			}
		}
		
	}//m4

	private static void m3() {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i==5 || j==5) {
					break;
				}
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		
	}//m3

	private static void m2() {
		
		//구구단
		// 2 ~ 9단 까지
		for (int i = 2; i < 10; i++) {
			
			System.out.println("----------");
			System.out.printf("   %d 단\n", i);
			System.out.println("----------");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		
		
	}//m2

	private static void m1() {

		// 단일 for문
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();

		// 2중 for문
		for (int i = 0; i < 10; i++) {// 대회전

			for (int j = 0; j < 10; j++) {// 소회전
				// System.out.println("안녕하세요"); //몇번 실행?
				System.out.printf("i: %d, j: %d\n", i, j);
			}
			System.out.println();
		}
		System.out.println();

		// 3중 for문
		for (int i = 0; i < 24; i++) {// 대회전

			for (int j = 0; j < 60; j++) {// 소회전
				for (int k = 0; k < 60; k++) {
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	// 학교 ex
//	for (학년) {
//		for(반) {
//			for (번호) {
//				
//			}
//		}
//	}

	// 아파트
//	for(단지){
//		for(동) {
//			for (층) {
//				for(호){
//				
//				}
//			}
//		}
//	}

}
