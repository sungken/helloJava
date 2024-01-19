package com.test.java.obj;

public class Ex52_Generic {

	public static void main(String[] args) {
		
		
		Item<String> s1 = new Item<String>();
		s1.c = "홍길동";
		s1.c = "문자열";
		//s1.c = 100;
		//한번 지정하면 다른 타입의 변수는 사용 불가
		System.out.println(s1.c);
		  
		Item<Integer> s2 = new Item<Integer>();
		s2.c = 100;
		s2.c = 200;
		//s2.c = "홍길동";
		//한번 지정하면 다른 타입의 변수는 사용 불가
		System.out.println(s2.c);
		
		Pen<Boolean> p1 = new Pen();
		Pen<Boolean> p2 = new Pen<Boolean>();
		Pen<Boolean> p3 = new Pen<>(); // 3개가 같은 말 이지만 1번은 쓰지 말자.
		
		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		Desk<String> d1 = new Desk<>();
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		LapTop<String, Integer> macbook = new LapTop<>("맥북", 3000000);
		System.out.println(macbook.getA());
		System.out.println(macbook.getB() + "원");
		
		LapTop<String, String> galaxy = new LapTop<>("갤럭시북", "최고사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
		
		
		
		
	}// main

}// Ex52_Generic

//제네릭 클래스
//- T: 타임 변수(매개 변수역할) > 참조형만 사용 가능
//- <>: 인자 리스트
class Item<T> {
	
	public int a;
	public int b;
	public T c;//클래스 선언시에는 c의 자료형에 결정되지 않음. 객체를 생성할때 결정
	
}

class Pen<T>{
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T>{
	
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
}

class LapTop<T, U> {
	private T a;
	private U b;
	
	public LapTop(T a, U b) {
		this.a = a;
		this.b = b;
		
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
}




























