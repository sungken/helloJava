package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] arg) {
		
		Calendar now = Calendar.getInstance();
		System.out.printf("오늘: %tF \n", now);
		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DATE, 100);
		System.out.printf("백일: %tF \n", now2);
		Calendar now3 = Calendar.getInstance();
		now3.add(Calendar.DATE, 366);
		System.out.printf("첫돌: %tF \n", now3);
		
	}//main

}
