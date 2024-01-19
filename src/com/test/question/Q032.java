package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q032 {

	public static void main(String[] args) throws IOException {
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어오는 시간]");
		System.out.print("시: ");
		String time1 = reader.readLine();
		int inHour = Integer.parseInt(time1);
		
		System.out.print("분: ");
		String time2 = reader.readLine();
		int inMin = Integer.parseInt(time2);
		
		System.out.println("[들어오는 시간]");
		System.out.print("시: ");
		String time3 = reader.readLine();
		int outHour = Integer.parseInt(time3);
		
		System.out.print("분: ");
		String time4 = reader.readLine();
		int outMin = Integer.parseInt(time4);
		
		if ( inHour > 0 && inHour <= 23 ) {
			
			a = outHour - inHour;
			b = outMin - inMin;
			c = (a * 60) + b;
			d = ((c - 30) / 10) * 2000;
			System.out.printf("주차 요금은 %,d원 입니다.", d);
			
			
			
		}
		
		
		
		
	}//main

}
