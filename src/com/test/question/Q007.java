package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 입력: ");
		int code = reader.read();
		//- 영대문자(A ~ Z) -> (65 ~ 90)
		//- 영소문자(a ~ z) -> (97 ~ 122)
		int result = (code - 32);
		System.out.printf("소문자 %c의 대문자는 %c입니다.", code, result);
		
	}

}
