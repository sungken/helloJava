package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력: ");
		String name = reader.readLine();
		System.out.printf("고객: %s님\n", name);
		
		getName("홍길동");
		getName("아무개");
	
	}//main

	private static void getName(String name) {
		System.out.printf("고객: %s님\n", name);
		
	}//getName

}
