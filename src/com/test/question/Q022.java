package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q022 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar happyDay = Calendar.getInstance();
		System.out.print("남자 이름: ");
		String man = reader.readLine();
		System.out.print("여자 이름: ");
		String female = reader.readLine();
		System.out.print("만난날(년): ");
		String year = reader.readLine();
		int year2 = Integer.parseInt(year);
		System.out.print("만난날(월): ");
		String month = reader.readLine();
		int month2 = Integer.parseInt(month);
		System.out.print("만난날(일): ");
		String day = reader.readLine();
		int day2 = Integer.parseInt(day);

		happyDay.set(year2, month2 - 1, day2);
		happyDay.add(Calendar.DATE, 100);
		System.out.printf("'%s'과(와) '%s'의 기념일\n", man, female);
		System.out.printf("100일: %tF\n", happyDay);
		happyDay.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", happyDay);
		happyDay.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", happyDay);
		happyDay.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", happyDay);
		happyDay.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", happyDay);

	}// main

}
