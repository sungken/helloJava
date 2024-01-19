package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex43_final {

	public static void main(String[] args) {
		
		//final 키워드
		//- 한번 결정하면 바꿀수 없다.
		//- 안정성이 높아진다.
		//- 대신 유연성(유두리)떨어진다
		
		//1. 변수 적용
		//- 초기화 이후에 값을 변경할 수 없다.
		//- 상수
		
		//2. 메서드 적용
		//- 상속 시 오버라이딩 방지
		
		//3. 클래스 적용
		//- 상속을 방지
		
		
		
		
		final int A = 10; //final은 이름을 대문자만 만들것
						  //되도록 선언과 동시에 초기화를 권장한다.(A 처럼)
		final int B;
		B = 20;
		//B = 30;
		
		System.out.println(Calendar.YEAR);
		
		
//		final int MALE = 1;
//		final int FEMALE = 2;
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

		
		
		//난수 생성
		//- 숫자만
		// 문자열 난수? + 배열
		
		String[] color = {"빨강", "노랑", "파랑", "검정", "보라","주황"};
		
		//난수 > 방번호
		System.out.println(color[(int)(Math.random() * color.length)]);
		
		
	} // main

}// Ex43_final



class Gender {
	
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	
}

class Student {
	public String name;
	public int age;
	
	public int gender;//성별 > 남자(1), 여자(2)
	
	
}
//최종 클래스 >> 자식을 갖지 못한다.
final class FinalParent{
	
	final public String test() {
		return "성별";
	}
}


//class FinalChile extends FinalParent{
//	
//	public String test() {
//		return "나이";
//	}
//}




























