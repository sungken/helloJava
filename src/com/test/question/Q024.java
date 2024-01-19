package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q024 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		String hour = reader.readLine();		
		int wantHour = Integer.parseInt(hour);
		
		System.out.print("분: ");
		String minute = reader.readLine();		
		int wantMinute = Integer.parseInt(minute);
		
		if( wantHour > 0 && wantHour < 23 && wantMinute > -1 && wantMinute < 61) {
			
			Calendar now = Calendar.getInstance();
			
			now.set(Calendar.HOUR_OF_DAY, wantHour);
			now.set(Calendar.MINUTE, wantMinute);
			
			now.add(Calendar.MINUTE, -10);
			System.out.printf("짜장면: %d시 %d분\n"
					, now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
			
			now.add(Calendar.MINUTE, -8);
			System.out.printf("치킨: %d시 %d분\n"
					, now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
			
			now.add(Calendar.MINUTE, -7);
			System.out.printf("피자: %d시 %d분\n"
					, now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
			
		}else {
			System.out.println("음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.");
		}
		
	}//main

}
