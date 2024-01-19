package com.test.java;

public class Ex03_Variable {

	public static void main(String[] args) {

		// 정수
		byte b1;
		b1 = 100; // 100 -> 상수(=데이터) -> 정수형 상수, 정수형 리터럴
		System.out.println(b1);
		
		//b1 = 128; -> byte의 범위 초과 
		//b1 = -129; -> byte의 범위 초과 
		
		b1 = Byte.MAX_VALUE; //JDK에서 제공하는 상수
		System.out.println(b1);
		b1 = Byte.MIN_VALUE; //JDK에서 제공하는 상수
		System.out.println(b1);
		
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
		
		
		int n1;
		n1 = 100;
		System.out.println(n1);
		n1 = 100_000_000;
		System.out.println(n1);
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		n1 = Integer.MIN_VALUE;
		System.out.println(n1);
		
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		l1 = 100000000;
		System.out.println(l1);
		l1 = 3000000000L;
		System.out.println(l1);
		
		
		//실수
		// - 실수형 상수는 double형이다.
		//단정도형
		float f1;
		f1 = 3.14F;
		System.out.println(f1);
		
		//배정도형
		double d1;
		d1 = 6.28;
		System.out.println(d1);
		
		//float, double의 차이점
		f1 = 123.12345678901234567890123456789012345667890F;
		d1 = 123.12345678901234567890123456789012345667890D;
		System.out.println(f1); // 소수점 의 정밀도가 차이가 난다.
		System.out.println(d1); // double가 더욱 정밀하다.
		
		
		
		f1 = 123123456789012345678901234567890F;
		d1 = 123123456789012345678901234567890D;
		System.out.println(f1); 
		System.out.println(d1); 
		
		double d2 = 0.2;
		double d3 = 0.1;
		System.out.println(d2 + d3);
		
		//문자형
		char c1;
		c1 = 'A'; //홑따옴표 -> 문자형 상수(리터럴)
		System.out.println(c1);
		c1 = '가';
		System.out.println(c1);
		// c1 = '홍길동'; -> char은 한글자만 저장 할수있어서 '홍길동'같은 문자는 기입되지 않는다.
		
		//논리형
		boolean flag;
		
		flag = true; // 논리형 상수(리터럴)
		flag = false;
		
		System.out.println(flag);
		
		//String, 문자열
		// - 문자열 -> 문자들이 열을 지어 있는 형태 -> 문자의 집합
		
		String m2 = "홍길동";
		System.out.println(m2);
		String m3 =""; // 문자열 변수를 초기화 할때 많이 사용
		
		//값형(기본형, 원시형) vs 참조형
		//여기서는 근본적인 (물리적인) 차이점이 있다
		//메모리의 생성되는 규칙이 다르다
		int a = 10; //값형
		String b = "홍길동"; //참조형
		


		
		// 각 자료형 별로 (8+1) -> 변수 1개 생성 -> 값을 대입 -> 출력
		
		int myFingle;
		myFingle = 10;
		System.out.println("나의 손가락은 " + myFingle + " 개 이다.");
		
		int myHand;
		myHand = 2;
		System.out.println("나의 손은 " + myHand + " 개 이다.");
		
		int myHight = 178;
		System.out.println("나의 키는 " + myHight + " 이다");
		
		int myFirends = 10;
		System.out.println("나의 친구들은 " + myFirends + " 명 이다");
		
		int gugudan = 9;
		System.out.println("구구단을 " + gugudan + " 단 까지 외울수 있다.");
		
		int book = 3;
		System.out.println("도서관에서 책을 " + book +  " 권 까지 빌릴수 있다.");
		
		
		double myHight2;
		myHight2 = 178.8;
		System.out.println("나의 키는 소수점까지 " + myHight2 + " 이다");
		
		float myHight3;
		myHight3 = 178.9F;
		System.out.println("나의 키는 소수점까지 " + myHight3 + " 이다");
		
		char a10 = '도';
		char a20 = '서';
		char a30 = '관';
		System.out.println("" + a10 + a20 + a30);
		
		
		
		
	}

}
























