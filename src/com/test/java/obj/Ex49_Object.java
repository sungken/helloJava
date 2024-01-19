package com.test.java.obj;

import java.io.BufferedReader;
import java.util.Scanner;

public class Ex49_Object {

	public static void main(String[] args) {
		
		// Object 클래스
		//- 모든 클래스의 부모 클래스이다.
		//- 업 캐스팅 전용 
		
		
		//m1();
		m2();
		
		
		
		
		
		
		
		
	}// main 

	private static void m2() {
		
		//참조형 = (형변환)참조형
		//부모 클래스 = 자식 클래스
		Object o1 = new AAA();
		
		//불가능 작업
		//눈에 안보이는 작업 > 박싱(Boxing) 발생
		Object o2 = 100;
		Object o3 = new Integer(100); // o2 와 o3이 같은 코드 이다
		
		
		
		int a1 = 100; //값형
		Integer a2 = new Integer(100); //참조형
		System.out.println(a1 == a2); // Integer 클래스는 int 값형이 가끔씩 참조 타입으로 사용해야 하는 경우 대신
									  //   그 역할을 하기 위해 제공 되는 클래스
		//Wrapper Class
		//- byte > Byte
		//- short > Short 등등
		
		Integer a3 = 100;
		System.out.println(a3 * 2); // Unboxing 발생
		
		o2 = 100;
		System.out.println((Integer)o2 * 2); // 언박싱 부분은 꼭 알고있어야 한다.
		System.out.println((int)o2 * 2);  
		
		//박싱(언박싱) > 비용 발생!! >> 무거움 >
		
		
		
		
	}// m2

	private static void m1() {
		AAA a1 = new AAA();
		AAA a2 = new BBB(); // 부모 변수 = 자식 객체 > 업 캐스팅
		AAA a3 = new CCC(); // 할아버지 = 손자 > 업 캐스팅
		
		Object o1 = new AAA(); // 업 캐스팅
		Object o2 = new BBB(); // 업 캐스팅
		Object o3 = new CCC(); // 업 캐스팅
		
		Object o4 = new Scanner(System.in); // 업 캐스팅
		
		Object o6 = new Employee();
		
		Object o7 = "홍길동";
		Object o8 = new int[3];
		
		//값형 <- (형변환 불사능) -> 참조형
		Object o9 = 100;
		Object o10 = true;
		
		//자료형을 신경쓰지 않아고 되는 편리한 집합*************
		//자료형을 신경쓰지 않아고 되는 것이 단점*********
		
		// ***Object배열에는 무엇이든 담을수 있다.
		// 		하지만 처음 담은 방이 자료형이라면 나머지 방에도 자료형을 담아야 한다!!***
		Object[] list = new Object[5];
		
		list[0] = 100;
		list[1] = 200;
		list[2] = 300;
		list[3] = "문자열";
		list[4] = true;
		
		
		for (int i = 0; i < list.length; i++) {
			System.out.println((int)list[i] * 2); 
			// 어디에 뭐가 있는지 예측 불가!!!
			// 패턴이 없어서 출력시 오류(꺼내쓰기 어려움)
			//System.out.println(list[i]); 
		}
	}// m1

}// Ex49_Object

class AAA{ // extends Object 
	
}

class BBB extends AAA{
	
}

class CCC extends BBB{
	
}






