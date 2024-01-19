package com.test.question;

import java.util.Calendar;

public class Q019 {

	public static void main(String[] args) {
		
		nowTime();
		
	}//main

	private static void nowTime() {
		
		Calendar c1 = Calendar.getInstance();
		
		System.out.printf("현재시각 : %d시 %d분 %d초\n"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		System.out.printf("현재시각 : %s %d시 %d분 %d초\n"
			, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
			, c1.get(Calendar.HOUR)
			, c1.get(Calendar.MINUTE)
			, c1.get(Calendar.SECOND));

	}//nowTime

}
