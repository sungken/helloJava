package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		
		
		// void -> 반환타입
		// hello -> 메서드명 -> ***메서드 명은 캐멀 표기법
		// () -> 인자리스트
		
		//void
		//
		
		int num = test();
		System.out.println(num);
		
		System.out.println(checkNumber(11));
		System.out.println(getNum());
		
		
	}//main
	
	public static void getName() {
		String name = "홍길동";
		return;// 빈 리턴문 -> 강제로 메서드를 종료
	}
	
	public static int getNum() {
		int num = 100;
		return num;
		//System.out.println("메서드 종료"); -> 리턴이 반환되면 그 아래의 코드는 의미가 없다.(에러)
		//return num;
	}
	
	public static String checkNumber(int num) {
		return num % 2 == 0 ? "짝수" : "홀수"; 
	}
	
	public static int test() {//리턴받는 자료값을 반드시 int 자리에 넣어준다***
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;//리턴받는 자료값을 반드시 int 자리에 넣어준다***
		
	}

}
