package com.test.java.lambda;

public class Ex65_Lambda {

	public static void main(String[] args) {
		
		/*
		 - lambda를 잘쓰면 코드가 짧아진다.
		 
		 람다식, Lambda Expression
		 - 함수형 프로그래밍 방식을 지원하는 표현식
		 - 람다식 사용하면 코드가 간결해진다.(호불호-lambda를 잘쓰면 코드가 짧아진다.)
		 - 자바 > 컬렛션(배열) 조작을 위해서 제공
		 
		 - 자바의 메서드 표현
		 - 람다식은 매개변수를 가지는 코드 블럭이다.
		 - 자바의 람다식은 인터페이스를 사용해서 만든다.
		 - 자바의 람다식은 익명의 객체를 만드는 표현을 간소화시킨 기술이다.
		 
		 람다식 형식
		 - 인터페이스 변수 = 람다식;
		 ex) MyInterface m1 = () -> {};
		 (매개변수) -> {구현부};
		 1. (매개변수): 추상 메서드의 인자리스트
		 2. ->: 화살표(Arrow), 구현부 호출하는 역할(연결)
		 3. {구현부}: 추상 메서드의 구현부
		 
		 
		 */
		
		//요구사항] MyInterface 를 구현한 객체를 생성하시오.
		
		//Case 1. 클래스 선언 + 객체 생성 (가장 FM)
		MyInterface m1 = new MyClass();
		m1.test();
		
		
		//Case 2. 익명 객체 생성
		MyInterface m2 = new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메서드");
			}
		};
		m2.test();
		
		//Case 3. 람다식 --> 이름 없는 메서드가 아닌 익명 메서드 생성
		// 위와 같은 익명객체 Test()메서드를 생성한 것이다.
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 메서드");
		};
		m3.test();
		
		//---------------------------------------------------------------------
		//기본 메소드
		TestInterface t1 = new TestInterface() {
			
			@Override
			public void aaa() {
				
				
			}
			@Override
			public void bbb() {
				
				
			}
			
		};
		
		//람다식 = 람다식을 저장하는 인터페이스는 반드시 유일(1개)여야 한다.
		// 2개 이상이면 구현부 표현이 없어서 에러
//		TestInterface t2 = () -> {
//			
//		};
		
		//추상 메서드의 형식에 따라..
		//- 매개변수 우/무
		//- 반환값 유/무
		
		
		// 1. 익명객체
		NoParmeterNoReturn pr1 = new NoParmeterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		// 1. 람다식
		NoParmeterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//**람다식의 구현부 > 문장 1개 > {} 생략가능
		NoParmeterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		 
		System.out.println();
		
		//----------------------------------------------
		
		// 2. 
		ParmeterNoReturn pr4 = (int n) -> {
			System.out.println(n);
		};
		pr4.call(10);
		pr4.call(20);
		pr4.call(30);
		
		//*** 람다식의 매개변수 자료형을 생략 할수 있다.
		ParmeterNoReturn pr5 = (n) -> {
			System.out.println(n);
		};
		pr5.call(10);
		pr5.call(20);
		
		//*** 람다식의 매개변수()을 생략할 수 있다.
		ParmeterNoReturn pr6 = n -> {
			System.out.println(n);
		};
		pr6.call(10);
		
		//여기까지 문법이 줄어들수 있다. -> 구현부가 하나일때!!!!!!!!!! 가능
		ParmeterNoReturn pr7 = n -> System.out.println(n);
		pr7.call(100);
		
		System.out.println();
		
		//---------------------------------------------------------------
		
		MultiParmeterNoReturn pr8 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr8.call("홍길동", 20);
		
		MultiParmeterNoReturn pr9 = (name, age) -> {
			System.out.println(name + "," + age);
		};
		pr9.call("아무개", 25);
		
		//*** 람다식의()는 매개변수가 1개일때만 생략이 가능하다.
//		MultiParmeterNoReturn pr10 = name, age -> {
//			System.out.println(name + "," + age);
//		};  -> 에러
		
		MultiParmeterNoReturn pr10 = (name, age) -> System.out.println(name + "," + age);
		pr10.call("호호호", 27);
		
		System.out.println();
		
		//---------------------------------------------------------------------
		
		NoParmeterReturn pr11 = () -> {
			return 10;
		};
		System.out.println(pr11.call());
		
		//*** 구현부에 리턴문이 유일하면 {}와 return을 동시에 생략 가능 하다.
		NoParmeterReturn pr12 = () -> 10;
		System.out.println(pr12.call());
		
		System.out.println();
		
		//----------------------------------------------------------------
		
		ParmeterReturn pr13 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(pr13.call(10, 20));
		
		// 람다식
		ParmeterReturn pr14 = (a, b) -> a + b;
		System.out.println(pr14.call(100, 200));
		
	}// main

}// Ex65_Lambda

@FunctionalInterface
//람다식의 경우 문제가 발생시에 찾기 위해 
// @FunctionalInterface 을 붙여주는게 좋다.
interface MyInterface{
	void test();
	
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메서드");
	}
	
}

interface TestInterface{
	void aaa();
	void bbb();
}

interface NoParmeterNoReturn{
	void call();
}

interface ParmeterNoReturn{
	void call(int n);
}

interface MultiParmeterNoReturn{
	void call(String name, int age);
}

interface NoParmeterReturn{
	int call();
}

interface ParmeterReturn{
	int call(int a, int b);
}


