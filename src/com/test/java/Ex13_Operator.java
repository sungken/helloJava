package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {

	public static void main(String[] args) throws IOException {

		// 사용자로 부터 문자를 입력 - > 영어 소문자 인지 검사?
		// 시나리오
		// 1. BufferedReader 생성
		// 2. 안내 메시지 출력
		// 3. 입력 -> 문자 1개 출력
		// 4. 유효성 검사
		// 5. 결과 처리 + 출력

		// 1.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 2.
		System.out.print("문자 입력: ");
		// 3. read() vs readLine()
		// - read(): 1문자, 문자코드값이 필요한 경우
		// - readLine(): N문자, 문자코드값을 알아내기가 번거롭다.
		int code = reader.read();
		//4. 
		// - 영소문자(a ~ z) -> (97 ~ 122)
		// - ex) 입력: d > 100
		// String result = (code >= 97 && code <= 122) ? "올바른 문자" : "올바르지 않은 문자";
		//String result = (code >= (int)'a' && code <= (int)'z') ? "올바른 문자" : "올바르지 않은 문자";
		String result = (code >= 'a' && code <= 'z') ? "올바른 문자" : "올바르지 않은 문자";
		//5. 
		System.out.printf("'%c'는 %s입니다.\n ", code, result);

	}

}
