package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q030 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자: ");
		int alphabet = reader.read();
		
		if(alphabet >= 65 && alphabet <= 90) {
			System.out.printf("'%c'의 소문자는 '%c'입니다.", alphabet, alphabet + 32);
		} else if (alphabet >= 97 && alphabet <= 122){
			System.out.printf("'%c'의 대문자는 '%c'입니다.", alphabet, alphabet - 32);			
		} else {
			System.out.println("영문자만 입력하시오.");
		}

		
	}//main

}
