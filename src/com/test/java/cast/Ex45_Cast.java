package com.test.java.cast;

public class Ex45_Cast {

	public static void main(String[] args) {
		
		//형변환, Type Casting
		//1. 값형 형변환
		//- 값형끼리 형변환(boolean 제외)
		//- byte, short, int, long, float, double, char
		//- 문제 발생 > 오버 플로우(Overflow)
		
		
		//2. 참조형 형변환
		//- 클래스끼리의 형변환
		
		//참조형 형변환
		//- 상속 관련
		//- 상속 관계에 있는 클래스 끼리만 형변환이 가능하다.
		//- 직계 > 가능
		//- 방계(ex- 사촌이나 형제) > 불가능
		
		//1. 업캐스팅, Up Casting
		//- 암시적인 형변환
		//- 자식 클래스 > (형변환) > 부모 클래스
		//- 100% 안전
		
		//2. 다운캐스팅, Down Casting
		//- 명시적인 형변환
		//- 부모 클래스 > (형변환) > 자식 클래스
		//- 100% 불가능
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); // 자식 객체 > 원본 역할
		
		//복사
		//Parent = Child
		//암시적 형변환
		//부모 클래스 = 자식 클래스
		//업캐스팅
		//100% 안전
		p1 = c1;
		p1 = (Parent)c1; // 위와 같은 코드
		
		//값형 형변환 검증?
		//- 데이터 복사 후 복사본의 값을 확인
		
		p1.a = 10;
		p1.b = 20;
		
		
		Parent p2;
		Child c2;
		
		p2 =new Parent(); // 부모 클래스 > 원본 역할
		
		//복사
		//Child = Parent
		//자식 클래스 = 부모 클래스
		//다운 캐스팅 == 100% 불가능
//		c2 = (Child)p2; // 
//		
//		
//		// 100% 불가능한 작업
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
		
		Parent p3;
		Child c3;
		
		c3 = new Child();//원본
		
		//업캐스팅
		p3 = c3;
		
		Child c4;
		
		//자식 클래스 = 부모 클래스
		//다운 캐스팅 발생!!! > 100% 불가능, 경우에 따라서 가능!!!!
		//하지만 이 부분은 Child == Child 로 복사해서 가능
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		
		//패키지가 달러서 안보임
		//Point p4 = new Point();
		
		
		
		
	}// main

}// Ex45_Cast

class Parent{
	public int a;
	public int b;

	
}

class Child extends Parent{
	public int c;
	public int d;
	
}





