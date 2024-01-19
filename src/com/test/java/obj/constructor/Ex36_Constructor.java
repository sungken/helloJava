package com.test.java.obj.constructor;

public class Ex36_Constructor {

	public static void main(String[] args) {
		
		//생성자, Constructor
		//- 특수한 목적을 가지는 메서드
		//- 객체의 멤버(변수)를 초기화 하는 역할!!!***!!!
		
		
		//***
		//1.객체의 초기화 > 생성자
		//2.객체의 상태 수정 >  Setter
		
		
		//자료형 참조 변수 = 객체생성연산자 생성자();
//		Box b1 = new Box(); // >> 생성자
		Box b1 = new Box("소형", 2000);
		
		//생겅자는 단독으로 호출이 불가능 하다.
		//- 반드시 new와 함께 호출이 가능하다.
		//Box("소형", 2000); --> 에러
		
		
		//초기화
//		b1.setSize("소형");
//		b1.setPrice(2000);
		
//		b1.setSize("소형");
		b1.setPrice(2500);
		
		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());
		
		
		
	}//main

}//Ex36_Constructor

class Box{
	private String size;
	private int price;
	
	//컴파일러가 컴파일을 할 때 자동으로 생성하는 코드
	//>>생성자(Constructor)
	//- 접근 지정자public
	//- 반환값 존재하지 않음 > void도 생략
	//- 메서드 명 == 클래스명
	
	//기본 생성자  >> 선언만 해도 초기화된 값으로 가져온다.
	public Box(){
//		this.size = null;
//		this.price = 0;
		this("");//생성자간의 호출
	}
	
	//생성자 오버로딩
	public Box(String size) {
		this.size = size;
		this.price = 0;
		//this(size, 0);
		
	}
	
	public Box(String size, int price) {
		this.size = size;
		this.price = price;
		
	}
	
	
	public String getSize() {
		return size;
	}
//	public void setSize(String size) {
//		this.size = size;
//	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Cup{
	
	private String color;
	private int size;

	public Cup(int size) {
		super();
		this.size = size;
	}


	public Cup(String color) {
		super();
		this.color = color;
	}

	
	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}
	

}

class Mouse{
	private int a;
	private int b;
	private static int c;
	
	//객체 생성자 > 객체 내부를 초기화 
	public Mouse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	//정적 생성자 > 정적 멤버만을 초기화
	//- 매개변수 없음
	//- 정적 생성자는 직접 호출이 불가능
	//- 자바가 호출 한다.
	static {
		Mouse.c = 0;
	}
	
	
}



