package com.test.java;

public class Ex14_Method {

	public static void main(String[] args) {
		
		//Main 메서드
		//특수 메서드
		//이름이 예약된 메서드(main)
		//프로그램이 시작되면 자동으로 호출되는 메서드 -> main
		//프로그램의 시작점(Entry Point)
		//프로그램의 종착점(End Point)
		
		
		
		// 메서드, Method
		// 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine) -> 라고도 부른다
		//코드의 집합
		//같은 목적을 가진 코드의 집합
		//코드의 재사용의 단위(*****) 중요
		
		
		//메서드 사용 목적?
		//1. 코드의 재사용
		//2. 코드의 관리(가독성)
		
		//메서드 사용 단계
		//1. 메서드 선언
		//2. 메서드 호출(사용)
		
		//ex)
		//요구사항 - "안녕하세요." X 5회 출력
		//가장 단순한 방법
		//- Ctrl + C, V -> 하드 코딩 (별로임, 노가다)
		System.out.println("반갑습니다. ");
		System.out.println("반갑습니다. ");
		System.out.println("반갑습니다. ");
		System.out.println("반갑습니다. ");
		System.out.println("반갑습니다. ");
		System.out.println();
		

		printNumber();

		
		//메서드 호출
		hello();
		hello();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
	
	//메서드의 선언 위치는 클래스 내부이다.
	//메서드의 순서는 무관
	
	//메서드 선언
	//메서드 헤더(header), Signature(서명) -> public void hello()
	//public - 접근지정자
	//static - 정적키워드
	//void - 반환타입
	//hello - 메서드 명
	//() - 인자리스트
	
	//몸통(Body), 구현부 -> {코드;}
	
	//hello 라는 메서드 선언
	public static void hello() {
		//메서드가 하려는 업무
		System.out.println("바보입니다.");
	}
	
	public static void printNumber() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
	

}//Ex14_Method
