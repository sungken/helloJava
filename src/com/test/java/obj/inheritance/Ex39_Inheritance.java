package com.test.java.obj.inheritance;

public class Ex39_Inheritance {

	public static void main(String[] args) {

		// 상속, Inheritance
		// - 가장 어려움
		// - 부모가 가지는 재산을 자식에게 물려주는 행동
		// - 부모(Class)가 가지는 재산(멤버 변수, 멤버 메서드)을 자식(Class)에게 물려주는 행동
		//*** 부모 클래스 에서 이미 선언된 코드를 자식 클래스 에서 재구현 없이 코드를 재사용하기 위한 기술
		//    -> 비용 절감 (코드 재사용)
		
		//상속 관계에 있는 클래스 호칭
		//- 부모 클래스 <-> 자식 클래스
		//- 슈퍼 클래스 <-> 확장 클래스
		//- 기본 클래스 <-> 확장 클래스
		//- 기본 클래스 <-> 파생 클래스

		
		//부모 객체
		Parent p1 = new Parent();
		
		p1.a = 10;
		p1.b = 20;
		p1.ccc();
		
		//자식 객체
		Child c1 = new Child();
		
		c1.d = 30;
		c1.e = 40;
		c1.fff();
		c1.ccc();
		
		//다중 상속
		//java는 다중상속이 되지 않는다.
		
		
		
		
	}// main

}// Ex39_Inheritance







//태어나는 시점

//부모 클래스 역할
class Parent {
	public int a;
	public int b;

	public void ccc() {
		System.out.println("ccc");

	}

}

//자식 클래스 역할
class Child extends Parent{ //상속

	public int d;
	public int e;

	public void fff() {
		System.out.println("fff");

	}
}

//사이트 > 유저 계정, 관리자 계정
class Member{
	
	public String id;
	public String pw;
	
	
}



class User extends Member{
	
	public String name;
	public int point;
	
}

class Administrator extends Member{
	
	public int level;
	
}

class AAA {

}

class BBB extends AAA{
		
}

class CCC extends BBB {
	
}

class DDD extends CCC{
	
}
















