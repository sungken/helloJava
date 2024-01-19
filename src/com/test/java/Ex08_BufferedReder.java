package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*; // 모든 클래스를 가져오는것(와일드 카드)
// Ctrl + Shift + O == 관련된 import 전부 가져오기

public class Ex08_BufferedReder {

	public static void main(String[] args) throws IOException {
		
		//사용자로부터 문자 1개를 입력받아 화면에 출력.
		
		BufferedReader reader;
		//콘솔로부터 키보드 값을 입력받을 수 있는 도구
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(57)
		//\r(13)
		//\n(10)
		//스페이스(32)
		//탭(9)
		
		System.out.print("입력: ");
		int code = reader.read();
		System.out.println(code);
		
		
		
//		System.out.print("문자 입력: ");
//		
//		int code = reader.read();
//		
//		System.out.println(code);
//		System.out.printf("%c\n", code);
//		
//		//이름 입력
//		System.out.print("이름 : ");
//		String name = reader.readLine(); //입력된 라인 전체를 읽기
//		
//		System.out.printf("안녕하세요. %s님.\n", name);
//		
//		
//		//나이 입력
//		System.out.println("나이: ");
//		String age = reader.readLine();
//		System.out.printf("%s님의 나이는 %s살 입니다.\n", name, age);
		
		//사용자로 부터 2개의 숫자를 입력받아 두 수를 더하시오.
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		
//		//문자열인 -> 변환 -> 숫자
//		// - Integer.parseInt()
//		int num1 = Integer.parseInt(input1);
//		int num2 = Integer.parseInt(input2);
		
//		System.out.println(num1 + num2);

		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		System.out.println(num1 + num2);
			
		
		
		
		
		
		
		
		
		
	}

}
