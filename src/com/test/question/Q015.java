package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q015 {
	public static void main(String[] arg) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("맑은 날: ");
		String weather = reader.readLine();
		int sunnyWeather = Integer.parseInt(weather);
		System.out.print("흐린 날: ");
		String weather2 = reader.readLine();
		int foggyWeather = Integer.parseInt(weather2);
		
		getApple(sunnyWeather, foggyWeather);

	}//main

	private static void getApple(int sunny, int foggy) {
		
		int a = sunny * 5;
		int b = foggy * 2;
		int wood = a + b;
		if (wood > 100) {
			int c = 0;
			c = (wood - 100) / 10;
			System.out.printf("사과는 총 %d개 열렸습니다.", c);
		} else {
			System.out.println("잘못된 입력 입니다. 1이상의 정수만 입력 바랍니다.");
		}		

	}//getApple

}
