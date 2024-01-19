package com.test.java;

public class Ex06_Output {
	
	public static void main(String[] args) {
		
		System.out.print(100);
		System.out.print(200);
		System.out.print(300);
		
		System.out.println();
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		// 성적표 출력하기
		
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 98;
		int math2 = 87;
		
		System.out.println("==============================================");
		System.out.println("		성적표");
		System.out.println("==============================================");
		System.out.println("	[이름]\t[국어]\t[영어]\t[수학]\t");
		System.out.println("==============================================");
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\t");
		
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();


		String name = "홍길동";//ex 사용자가 키보드로 입력한 이름
		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("안녕하세요. %s님", name);
		
		System.out.println();
		System.out.println("안녕하세요. " + name + "님. 안녕히가세요." + name + "님.");
		System.out.printf("안녕하세요. %s님. 안녕히가세요. %s님.", name, name);
		
		System.out.println();
		System.out.printf("문자열: %s\n", "문자열");
		System.out.printf("정수: %d\n", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("논리: %b\n", true);
		System.out.println();
		
		
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		System.out.println();
		
		double num2 = 3.14;
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2);
		System.out.printf("%.0f\n", num2);
		System.out.printf("%.3f\n", 3.4567); //반올림 확인 할것!!
		
		System.out.println();
		
		
		long price = 12345678999999L;
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		
		//천단위 + 소수이하(2자리) + 출력너비(20자리, 우측 정렬)
		double num3 = 1234567.7890123;
		System.out.printf("[%,20.2f]\n", num3);
		
		
		//메뉴판 출력 -> 열 정렬
		System.out.println("=================================");
		System.out.println("  음료가격(단위: 원)");
		System.out.println("=================================");
		System.out.printf("콜라: \t\t%,6d\n", 2500);
		System.out.printf("스무디: \t%,6d\n", 3500);
		System.out.printf("사이다: \t%,6d\n", 500);
		System.out.printf("아메리카노: \t%,6d\n", 15000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
