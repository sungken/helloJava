package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q123 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\단일검색.dat"));
		System.out.print("이름: ");
		BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
		String member = name.readLine();
		String line = null;

		try {
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				String num1 = temp[0];
				String num2 = temp[1];
				String num3 = temp[2];
				String num4 = temp[3];
				
				if (num2.equals(member)) {
					System.out.printf("[%s]\n번호: %s\n주소: %s\n전화:%s\n", num2, num1, num3, num4);
					break;
				}
			}
			reader.close();
			
		} catch (Exception e) {
			//예외문 처리하는방법 ?
			System.out.println("요청하신 회원은 없습니다.");
			e.printStackTrace();
		}

	}// main

}// Q123
