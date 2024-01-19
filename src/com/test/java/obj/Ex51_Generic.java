package com.test.java.obj;

public class Ex51_Generic {

	public static void main(String[] args) {

		// 제네릭, Generic
		// 1. 제네릭 클래스 >>> Today
		// 2. 제네릭 메서드
		
		//*** 제네릭 클래스
		//- JDK에서 제공되는 기능 중 일부가 제네릭으로 제공 ***
		//- 컬렉션의 기능들
		

		// 요구사항] 클래스 설계 중..
		// 1. 멤버 변수 > int 1개
		// 2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 선언

		// 추가사항 1.] String을 중심으로 하는 클래스를 추가 설계
		// 추가사항 2.] Boolean을 중심으로 하는 클래스를 추가 설계
		// 추가사항 3.] double을 중심으로 하는 클래스를 추가 설계
		// 추가사항 4.] byte을 중심으로 하는 클래스를 추가 설계
		// 추가사항 5.] float을 중심으로 하는 클래스를 추가 설계
		// 추가사항 6.] 등등 무한대~~? 노가다 피하는 방법
		// 7. 제네릭 버전

//		// 기존 (전용 클래스)
//		WrapperInt n1 = new WrapperInt(100);
//		System.out.println(n1);
//		System.out.println(n1.getDate() * 2);
//		System.out.println();

//		// 추가 1.
//		WrapperString s1 = new WrapperString("홍길동");
//		System.out.println(s1);
//		System.out.println(s1.getDate().length());
//		System.out.println();
		
		//7. 제네릭 버전
		Wrapper<Integer> n3 = new Wrapper<>(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 3);
		System.out.println();

//		// 추가. (범용 클래스)
//		WrapperObject s2 = new WrapperObject("아무개");
//		System.out.println(s2);
//		System.out.println(((String) s2.getDate()).length());
//		System.out.println();
		
		//7. 제네릭 버전
		Wrapper<String> s3 = new Wrapper<>("문자열");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
//		// 추가 2.
//		WrapperBoolean b1 = new WrapperBoolean(true);
//		System.out.println(b1);
//		System.out.println(b1.getDate());
//		System.out.println();
//
//		// 추가. (범용 클래스)
//		WrapperObject b2 = new WrapperObject(false);
//		System.out.println(b2);
//		System.out.println((boolean) b2.getDate() ? "참" : " 거짓");
//		System.out.println();
		
		//7. 제네릭 버전
		Wrapper<Boolean> b3 = new Wrapper<>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : " 거짓");
		System.out.println();
		

		
		

	}// main

}// Ex51_Generic

class WrapperInt {

	private int date; // 1. 멤버 변수 (클래스 중심)
	// 2. data 중심 > 메서드

	public WrapperInt(int data) {
		this.setDate(data);
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}
}

class WrapperString {

	private String date; // 1. 멤버 변수 (클래스 중심)
	// 2. data 중심 > 메서드

	public WrapperString(String data) {
		this.setDate(data);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}
}

class WrapperBoolean {

	private boolean date; // 1. 멤버 변수 (클래스 중심)
	// 2. data 중심 > 메서드

	public WrapperBoolean(boolean data) {
		this.setDate(data);
	}

	public boolean getDate() {
		return date;
	}

	public void setDate(boolean date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}
}

class WrapperObject {

	private Object date; // 1. 멤버 변수 (클래스 중심)
	// 2. data 중심 > 메서드

	public WrapperObject(Object data) {
		this.setDate(data);
	}

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}
}

//제네릭 클래스
class Wrapper<T> {

	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}
