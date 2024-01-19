package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년: ");
		int year = Integer.parseInt(reader.readLine());

		System.out.print("월: ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("일: ");
		int day = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		now.set(year, month -1, day);
		
		if (now.get(Calendar.DAY_OF_WEEK) == 2 || now.get(Calendar.DAY_OF_WEEK) == 3 
				|| now.get(Calendar.DAY_OF_WEEK) == 4 || now.get(Calendar.DAY_OF_WEEK) == 5 || now.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.print("입력하신 날짜는 '평일'입니다.\n");
			System.out.print("해당 주의 토요일로 이동합니다.\n");
			if(now.get(Calendar.DAY_OF_WEEK) == 2) {
				now.set(year, month -1, day + 5);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", now);
			} else if (now.get(Calendar.DAY_OF_WEEK) == 3){
				now.set(year, month -1, day + 4);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", now);	
			} else if (now.get(Calendar.DAY_OF_WEEK) == 4){
				now.set(year, month -1, day + 3);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", now);	
			} else if (now.get(Calendar.DAY_OF_WEEK) == 5){
				now.set(year, month -1, day + 2);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", now);	
			} else if (now.get(Calendar.DAY_OF_WEEK) == 6){
				now.set(year, month -1, day + 1);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", now);	
			}
		} else {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		}
//		System.out.printf("%tF\n", now);
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));//
//		System.out.println(now.get(Calendar.WEEK_OF_YEAR)); // 전체 년도의 몇주차?
//		System.out.println(now.get(Calendar.WEEK_OF_MONTH));// 해달 월의 몇주차?
		

	}//main

}
