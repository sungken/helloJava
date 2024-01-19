package com.test.java;

import java.util.Scanner;

public class Ex28_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		//문자열 입력
//		System.out.print("입력: ");
//		String line = scan.nextLine(); // reader.readLine();
//		System.out.println(line);
//		
//		
//		//단점 - 자료형 별로 입력받는 메서드 제공
//		System.out.print("숫자: ");
//		int num = scan.nextInt();
//		System.out.println(num + 10);
//		
//		scan.nextLine();// 2. 그래서 이부분을 만들어주면서 스킵을 막는다. 
//		
//		//1. 숫자를 입력받고 문자를 입력받으면 스킵이 된다. 
//		System.out.print("입력: ");
//		line = scan.nextLine();
//		System.out.println("마지막: " + line);
//		//3. 숫자를 입력받고 문자를 입력받을때 꼭 주의 할것.
		
//		System.out.print("입력: ");
//		//Finds and returns the next complete token from this scanner
//		// 토큰 > 공백으로 구분되는 단어 (.next()와 .nextLine 비교)
//		String txt = scan.next();
//		System.out.println(txt);
			
		
		//TODO
		String txt = "";
		//.hasNext 일어올게 남았는지 안남았는지 확인해주는 메소드
		while (scan.hasNext()) {
			txt = scan.next();
			
		} 
		System.out.println("종료");


	}//main

}
