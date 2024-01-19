package com.test.java.obj;

public class Member {
	
	//멤버 변수
	public String name;
	public int age;
	
	//멤버 메서드
	//- 주의점 !!
	public void hello() {
		System.out.println("안녕하세요.");
		System.out.printf("%s 입니다.\n", name);
		System.out.printf("나이는 %d살 입니다.\n", age);
		
	}//hello

}//Member
//Ex32