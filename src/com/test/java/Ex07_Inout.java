package com.test.java;

import java.io.IOException;

public class Ex07_Inout {

	public static void main(String[] args) throws IOException {
		
		/*
		 
		 콘솔 입력
		 1. System.in.read();
		  - System.out.print()의 반대 성향
		  
		 2. BufferedReader 클래스
		 
		 3. Scanner 클래스
		 
		 */
		
		//요구사할 - 사용자에게 문자를 1개 이력받아 출력하시오.
		
		//1. 라벨 출력
		//	- 1문자 입력 가능(1byte 읽기)
		//	- 문자 코드값을 반환
		//	- 한글 입력 불가능(2byte 문자 미지원, ASCII 문자만 지원)
		//2. 문자 입력
		//3. 문자를 화면에 출력
		
		System.out.print("문자 입력: ");
		
		//사용자로부터 키보드 입력을 받아서 입력한 문자를 돌려준다.
		// 현재상태 -> 사용자가 키를 입력하기를 대기하고 있는 상태
		// 사용자 입력을 해야 대기 상태가 해제된다.
		int code = System.in.read();
		
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();// 엔터까지 나오기 때문에 \가 출력이 되고
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();// n으로 출력이 되어서 3번 찍힌다(총 1개의 출력값 + \ + n 까지)
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
