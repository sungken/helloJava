package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {

	public static void main(String[] args) {
		
		/*
		 자바 날짜/시간 자료형
		 1. Date Class
		 2. Calender Class
		 ----------------------------------
		 3. java.time package -> 추가 Class

		 - 시각 -> 포인트
		 - 시간 -> 양
		 
		 시각, 시간 -> 연산
		 
		 시각 + 시각 = X
		 시각 - 시각 = O(시간)
		 시간 + 시간 = O(시간)
		 시간 - 시간 = O(시간)
		 
		 시각 + 시간 = O(시각)
		 시각 - 시간 = O(시각)
		 
		 
		 */
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();

		
	}//main

	private static void m7() {
		
		//현재시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용 메서드(현재시각)
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());

	}

	private static void m6() {
		//연산
		//- 시간 + 시간 = 시간
		//- 시간 - 시간 = 시간
		
		//2시간 30분 + 10 분= 2시간 40분
//		int hour = 2;
//		int min = 30;
//		
//		min += 10;
//		System.out.printf("%d시간 %d분\n", hour, min);
		
		//2시간 30분 + 40분 = 3시간 10분
		int hour = 2;
		int min = 30;
		
		min += 40;
		//자리올림
		hour = hour + (min / 60); //2시간 + 1시간 -> 자리올림
		min = min % 60;
		System.out.printf("%d시간 %d분\n", hour, min);
		
		
		
		
		
		
	}

	private static void m5() {
		//연산
		//- 시각 - 시각 = 시간
		//내가 태어나서 살아온 시간 ?
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1997, 5, 20, 12, 0, 0);
		//System.out.println(now - birthday); 안됌
		
		//Epoch Time, Tick
		//- 1970년 1월 1일 0시 0분 0초로부터 몇 밀리초가 흘렀는지 누적값(ms)
		System.out.println(birthday.getTimeInMillis());
		System.out.println(now.getTimeInMillis());
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis();
		System.out.printf("살아온 시간 %d ms\n", gap);
		System.out.printf("살아온 시간 %d시간\n", gap / 1000 / 60 / 60 );
		System.out.printf("살아온 시간 %d일\n", gap / 1000 / 60 / 60 / 24  );
		System.out.printf("살아온 시간 %d년\n", gap / 1000 / 60 / 60 / 24 / 365 );
		
		//수료일까지? 112일
		Calendar end = Calendar.getInstance();
		end.set(2024, 5, 17);
		System.out.printf("수료일까지 남은 일: %d \n", 
				(end.getTimeInMillis() - now.getTimeInMillis()) / 1000 / 60 / 60 / 24);
		
		
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		
		System.out.printf("남은 시간: %.1f \n", (out.getTimeInMillis() - now.getTimeInMillis()) / 1000.0 / 60 / 60);
		
	}

	private static void m4() {
		
		//연산 
		//- 시각 + 시각
		//- 시각 - 시간
		//오늘 만난 커플 -> 100일?
		//오늘(시각) + 100일(시간) = 시념일 (시각)
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차: %tF \n", now);
		
		now.add(Calendar.DATE, 99); // 날짜 자체를 수정한다(now가 수정되는거 조심)
		System.out.printf("100일차: %tF \n", now);
		
		//1주일 전?
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -7);
		System.out.printf("일주일전: %tF \n", now);
		
		
		now = Calendar.getInstance();
		now.add(Calendar.MINUTE, 3);
		System.out.printf("라면 시간: %tT \n", now);
		
	}

	private static void m3() {
		
		//특정 날짜르 생성 하기 > 올해 크리스마스
		Calendar christmas = Calendar.getInstance(); // 현재 시각
		System.out.printf("%tF\n", christmas);
		/*
		 Calender 메서드
		 1. int get(int) : 읽기
		 2. void set(오버로딩) : 쓰기
		 */
		
		//수정
//		christmas.set(Calendar.MONTH, 11);
//		christmas.set(Calendar.DATE, 25);
//		System.out.printf("%tF\n", christmas);
		
//		christmas.set(2024, 11,25);
//		System.out.printf("%tF\n", christmas);
		
		christmas.set(2024, 12, 25, 18, 30, 0);
		System.out.printf("%tF %tT \n",christmas, christmas);

	}

	private static void m2() {
		
		//Calender Class
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		//잡합 데이터 -> 내가 원하는 항목을 추출
		// - int get(int  )
		System.out.println(c1.get(Calendar.YEAR));// 2024 > 년
		System.out.println(c1.get(Calendar.MONTH));// 0 > 월(0~11)
		System.out.println(c1.get(Calendar.DATE));// 5 > 일
		System.out.println(c1.get(Calendar.HOUR));// 11 > 시(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); // 11 > 시(24H)
		System.out.println(c1.get(Calendar.MINUTE)); //9 > 분
		System.out.println(c1.get(Calendar.SECOND)); // 58 > 초
		System.out.println(c1.get(Calendar.MILLISECOND)); // 0.960 > 밀리초
		System.out.println(c1.get(Calendar.AM_PM)); // 0 > 오전(0), 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));// 5 >  일(년)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); // 5 > 일(월)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); // 6 > 요일 일요일(1)~토요일(7)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); // 몇주차
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); // 몇주차

		// 요구사항 - "오늘은 2024년 1월 5일 입니다." 출력하시오.
		System.out.printf("오늘은 %d년 %d월 %s일 입니다.\n", 
				c1.get(Calendar.YEAR), 
				c1.get(Calendar.MONTH) + 1,
				c1.get(Calendar.DATE) < 10 ? "0" + c1.get(Calendar.DATE) : c1.get(Calendar.DATE) + "");
		
		System.out.printf("오늘은 %d년 %d월 %s일 입니다.\n", 
				c1.get(Calendar.YEAR), 
				c1.get(Calendar.MONTH) + 1,
				c1.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다.\n", 
				c1.get(Calendar.YEAR), 
				c1.get(Calendar.MONTH) + 1,
				c1.get(Calendar.DATE));
		
		//요구사항 - "지금은 오전 11시 36분 49초 입니다."
		System.out.printf("지금은 %s %02d시 %02d분 %02d초 입니다.\n"				
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		System.out.println();
		
		//printf() > 형식 문자(날짜시간)
		System.out.printf("%tF\n", c1); // 2024-01-05 
		System.out.printf(c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"); // 2024-01-05 
		System.out.printf(" %tT\n", c1); // 11:31:55
		System.out.printf("%tA\n", c1); // 금요일
		
	}

	private static void m1() {
		
		//Deta Class
		Date now = new Date();//now -> 컴퓨터의 시각을 가져온다.
		System.out.println(now);
		
	}//m1

}



//java.util.GregorianCalendar[time=1704419360797,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
//zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,
//lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,
//DAY_OF_YEAR=5,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=49,SECOND=20,MILLISECOND=797,
//ZONE_OFFSET=32400000,DST_OFFSET=0]

